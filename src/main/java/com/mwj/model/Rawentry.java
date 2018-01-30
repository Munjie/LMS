package com.mwj.model;


import java.util.Date;

public class Rawentry {
    private int id;

    private String entrynum;

    private Date entrydate;

    private int deliverycompany;

    private int client;

    private String carnum;

    private int operator;

    private int storagelocationid;

    private int producingyear;

    private int producingarea;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntrynum() {
        return entrynum;
    }

    public void setEntrynum(String entrynum) {
        this.entrynum = entrynum == null ? null : entrynum.trim();
    }

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
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

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    public int getStoragelocationid() {
        return storagelocationid;
    }

    public void setStoragelocationid(int storagelocationid) {
        this.storagelocationid = storagelocationid;
    }

    public int getProducingyear() {
        return producingyear;
    }

    public void setProducingyear(int producingyear) {
        this.producingyear = producingyear;
    }

    public int getProducingarea() {
        return producingarea;
    }

    public void setProducingarea(int producingarea) {
        this.producingarea = producingarea;
    }
}