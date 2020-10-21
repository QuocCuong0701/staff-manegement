package com.zk.controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Window;

public class DialogController extends SelectorComposer<Component> {

    @Wire
    private Window modalDialog;

    @Listen("onClick = #closeBtn")
    public void showModal() {
        modalDialog.detach();
    }
}
