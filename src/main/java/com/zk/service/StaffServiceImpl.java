package com.zk.service;

import com.zk.entity.Staff;
import com.zk.entity.Unit;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class StaffServiceImpl implements StaffService {

    private static List<Unit> unitList = new ArrayList<>();
    private static List<Staff> staffList = new ArrayList<>();

    static {
        unitList.add(new Unit("Thu ngân", "TN", "Phòng Hành chính"));
        unitList.add(new Unit("Tuyển dụng", "TD", "Phòng Nhân sự"));
        unitList.add(new Unit("CNTT", "IT", "Phòng CNTT"));
        staffList.add(new Staff("S1", "Jonh Wick", "1234", "john@gmail.com", null, "USA", "0123456789", unitList.get(0)));
        staffList.add(new Staff("S2", "Emma Watson", "1234", "emma@gmail.com", dayAfter(-12000), "UK", "0123456789", unitList.get(1)));
        staffList.add(new Staff("S3", "Putin", "1234", "putin@gmail.com", dayAfter(-10000), "Russia", "0123456789", unitList.get(2)));
    }

    private static Date dayAfter(int d) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, d);
        return calendar.getTime();
    }

    // Get all staff
    @Override
    public List<Staff> getStaffList() {
        return new ArrayList<>(staffList);
    }

    @Override
    public List<Unit> getUnitList() {
        return new ArrayList<>(unitList);
    }


    // Add new staff
    @Override
    public Staff addStaff(Staff staff) {
        staffList.add(staff);
        return staff;
    }

    // Edit staff
    @Override
    public Staff updateStaff(Staff staff) {
        if (staff.getStaffId() == null) {
            throw new IllegalArgumentException("Staff id must not be null.");
        } else {
            for (int i = 0; i < staffList.size(); i++) {
                Staff s = staffList.get(i);
                if (s.getStaffId().equals(staff.getStaffId())) {
                    staffList.set(i, staff);
                    return staff;
                }
            }
            throw new RuntimeException("Staff not found " + staff.getStaffId() + ".");
        }
    }

    // Delete staff
    @Override
    public void deleteStaff(Staff staff) {
        if (staff.getStaffId() != null) {
            for (int i = 0; i < staffList.size(); i++) {
                Staff s = staffList.get(i);
                if (s.getStaffId().equals(staff.getStaffId())) {
                    staffList.remove(staff);
                    return;
                }
            }
        }
    }
}
