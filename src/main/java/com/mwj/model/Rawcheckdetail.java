package com.mwj.model;

import java.math.BigDecimal;

public class Rawcheckdetail {
    private BigDecimal id;

    private BigDecimal checkinfo;

    private BigDecimal sequence;

    private String checkweight;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getCheckinfo() {
        return checkinfo;
    }

    public void setCheckinfo(BigDecimal checkinfo) {
        this.checkinfo = checkinfo;
    }

    public BigDecimal getSequence() {
        return sequence;
    }

    public void setSequence(BigDecimal sequence) {
        this.sequence = sequence;
    }

    public String getCheckweight() {
        return checkweight;
    }

    public void setCheckweight(String checkweight) {
        this.checkweight = checkweight == null ? null : checkweight.trim();
    }
}