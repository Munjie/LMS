package com.mwj.model;


public class Rawentrydetail {
    private int id;

    private int entryinfo;

    private int rawcheck;

    private Double amount;

    private String standard;

    private String weight;

    private int location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEntryinfo() {
        return entryinfo;
    }

    public void setEntryinfo(int entryinfo) {
        this.entryinfo = entryinfo;
    }

    public int getRawcheck() {
        return rawcheck;
    }

    public void setRawcheck(int rawcheck) {
        this.rawcheck = rawcheck;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }
}