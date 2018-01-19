package com.mwj.model;


public class Company {
    private int id;

    private String code;

    private String name;

    private String type;

    private String available;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available == null ? null : available.trim();
    }

    public Company() {
    }

    public Company(int id, String code, String name, String type, String available) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.type = type;
        this.available = available;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", available='" + available + '\'' +
                '}';
    }
}