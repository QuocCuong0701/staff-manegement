package com.zk.viewmodel;

import com.zk.entity.Staff;
import com.zk.entity.Unit;
import com.zk.service.StaffService;
import com.zk.service.StaffServiceImpl;
import org.zkoss.bind.BindUtils;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.ListModelList;

public class StaffViewModel {

    private StaffService staffService = new StaffServiceImpl();

    private ListModelList<Staff> staffListModel;
    private ListModelList<Unit> unitListModel;
    private Staff selectStaff;

    public ListModelList<Staff> getStaffListModel() {
        return staffListModel;
    }

    public ListModelList<Unit> getUnitListModel() {
        return unitListModel;
    }

    public Staff getSelectStaff() {
        return selectStaff;
    }

    public void setSelectStaff(Staff selectStaff) {
        this.selectStaff = selectStaff;
    }

    @Init
    public void init() {
        staffListModel = new ListModelList<>(staffService.getStaffList());
        unitListModel = new ListModelList<>(staffService.getUnitList());
    }

    // Add staff
    @Command
    @NotifyChange("selectStaff")
    public void addStaff() {
        selectStaff = staffService.addStaff(selectStaff);
        staffListModel.add(selectStaff);
        staffListModel.addToSelection(selectStaff);
        Clients.showNotification("New staff added successful.");
    }

    // Delete staff
    @Command
    public void deleteStaff(@BindingParam("staff") Staff staff) {
        staffService.deleteStaff(staff);
        staffListModel.remove(staff);
        if (staff.equals(selectStaff)) {
            selectStaff = null;
            BindUtils.postNotifyChange(null, null, this, "selectStaff");
        }
    }
}

