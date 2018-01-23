package com.mwj.model;

import java.util.Date;

public class Rawcheck {
    private int id;

    private String code;

    private int deliverycompany;

    private int client;

    private String carnum;

    private int rawtobacco;

    private String checknum;

    private Date checkdate;

    private int operator;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public int getDeliverycompany() {
        return deliverycompany;
    }

    public void setDeliverycompany(int deliverycompany) {
        this.deliverycompany = deliverycompany;
    }

    public int getClient() {
        return client;
    }

    public void setClient(int client) {
        this.client = client;
    }

    public String getCarnum() {
        return carnum;
    }

    public void setCarnum(String carnum) {
        this.carnum = carnum == null ? null : carnum.trim();
    }

    public int getRawtobacco() {
        return rawtobacco;
    }

    public void setRawtobacco(int rawtobacco) {
        this.rawtobacco = rawtobacco;
    }

    public String getChecknum() {
        return checknum;
    }

    public void setChecknum(String checknum) {
        this.checknum = checknum == null ? null : checknum.trim();
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }
}