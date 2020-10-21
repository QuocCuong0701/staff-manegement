package com.zk.service;

import com.zk.entity.Staff;
import com.zk.entity.Unit;

import java.util.List;

public interface StaffService {

    List<Staff> getStaffList();

    List<Unit> getUnitList();

    Staff addStaff(Staff staff);

    Staff updateStaff(Staff staff);

    void deleteStaff(Staff staff);
}
