package com.mwj.model;

public class RawentryDetailSheet {

    private int id;

    private int entryinfo;

    private String rawcheck;

    private int amount;

    private String standard;

    private String weight;

    private  String leaveName;

    private  String tobaccoGory;
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

    public String getRawcheck() {
        return rawcheck;
    }

    public void setRawcheck(String rawcheck) {
        this.rawcheck = rawcheck;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getLeaveName() {
        return leaveName;
    }

    public void setLeaveName(String leaveName) {
        this.leaveName = leaveName;
    }

    public String getTobaccoGory() {
        return tobaccoGory;
    }

    public void setTobaccoGory(String tobaccoGory) {
        this.tobaccoGory = tobaccoGory;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public RawentryDetailSheet() {
    }

    @Override
    public String toString() {
        return "RawentryDetailSheet{" +
                "id=" + id +
                ", entryinfo=" + entryinfo +
                ", rawcheck=" + rawcheck +
                ", amount=" + amount +
                ", standard='" + standard + '\'' +
                ", weight='" + weight + '\'' +
                ", leaveName='" + leaveName + '\'' +
                ", tobaccoGory='" + tobaccoGory + '\'' +
                ", location=" + location +
                '}';
    }
}
