package com.zk.entity;

public class Unit {

    private String unitName;
    private String abbr;
    private String parentUnit;

    public Unit() {
    }

    public Unit(String unitName, String abbr, String parentUnit) {
        this.unitName = unitName;
        this.abbr = abbr;
        this.parentUnit = parentUnit;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public String getParentUnit() {
        return parentUnit;
    }

    public void setParentUnit(String parentUnit) {
        this.parentUnit = parentUnit;
    }
}
