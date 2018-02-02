package com.mwj.model;


import java.util.Date;

public class Verifyinfo {
    private int id;

    private String comment;

    private Date date;

    private String flag;

    private int verifier;

    private int rawEntryId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public int getVerifier() {
        return verifier;
    }

    public void setVerifier(int verifier) {
        this.verifier = verifier;
    }

    public int getRawEntryId() {
        return rawEntryId;
    }

    public void setRawEntryId(int rawEntryId) {
        this.rawEntryId = rawEntryId;
    }
}