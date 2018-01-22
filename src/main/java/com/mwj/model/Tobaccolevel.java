package com.mwj.model;

import java.math.BigDecimal;

public class Tobaccolevel {
    private BigDecimal levelid;

    private String biglevelcode;

    private String colorcode;

    private String englishcode;

    private String levelcode;

    private String levelname;

    private String partcode;

    private String scalecode;

    private String type;

    public BigDecimal getLevelid() {
        return levelid;
    }

    public void setLevelid(BigDecimal levelid) {
        this.levelid = levelid;
    }

    public String getBiglevelcode() {
        return biglevelcode;
    }

    public void setBiglevelcode(String biglevelcode) {
        this.biglevelcode = biglevelcode == null ? null : biglevelcode.trim();
    }

    public String getColorcode() {
        return colorcode;
    }

    public void setColorcode(String colorcode) {
        this.colorcode = colorcode == null ? null : colorcode.trim();
    }

    public String getEnglishcode() {
        return englishcode;
    }

    public void setEnglishcode(String englishcode) {
        this.englishcode = englishcode == null ? null : englishcode.trim();
    }

    public String getLevelcode() {
        return levelcode;
    }

    public void setLevelcode(String levelcode) {
        this.levelcode = levelcode == null ? null : levelcode.trim();
    }

    public String getLevelname() {
        return levelname;
    }

    public void setLevelname(String levelname) {
        this.levelname = levelname == null ? null : levelname.trim();
    }

    public String getPartcode() {
        return partcode;
    }

    public void setPartcode(String partcode) {
        this.partcode = partcode == null ? null : partcode.trim();
    }

    public String getScalecode() {
        return scalecode;
    }

    public void setScalecode(String scalecode) {
        this.scalecode = scalecode == null ? null : scalecode.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}