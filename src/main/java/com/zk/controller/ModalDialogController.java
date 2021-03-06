package com.zk.controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zul.Window;

public class ModalDialogController extends SelectorComposer<Component> {

    @Listen("onClick = #addStaff")
    public void showAddStaffModal() {
        Window window = (Window) Executions.createComponents("/modal/add-staff.zul", null, null);
        window.doModal();
    }

    @Listen("onClick = .editStaff")
    public void showEditStaffModal() {
        Window window = (Window) Executions.createComponents("/modal/edit-staff.zul", null, null);
        window.doModal();
    }

    @Listen("onClick = .infoStaff")
    public void showInfoStaffModal() {
        Window window = (Window) Executions.createComponents("", null, null);
        window.doModal();
    }
}
