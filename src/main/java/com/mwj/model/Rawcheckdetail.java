package com.mwj.model;

import java.math.BigDecimal;

public class Rawcheckdetail {
    private int id;

    private int checkinfo;

    private int sequence;

    private String checkweight;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCheckinfo() {
        return checkinfo;
    }

    public void setCheckinfo(int checkinfo) {
        this.checkinfo = checkinfo;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getCheckweight() {
        return checkweight;
    }

    public void setCheckweight(String checkweight) {
        this.checkweight = checkweight == null ? null : checkweight.trim();
    }
}