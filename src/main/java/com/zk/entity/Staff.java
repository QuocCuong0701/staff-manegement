package com.zk.entity;

import java.util.Date;
import java.util.Objects;

public class Staff {

    private String staffId;
    private String fullName;
    private String password;
    private String email;
    private Date birthday;
    private String address;
    private String phone;
    private Unit unit;

    public Staff() {
    }

    public Staff(String staffId, String fullName, String password, String email, Date birthday, String address, String phone, Unit unit) {
        this.staffId = staffId;
        this.fullName = fullName;
        this.password = password;
        this.email = email;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.unit = unit;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return Objects.equals(staffId, staff.staffId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffId);
    }
}
