package com.example.demo.com.example.demo.model;

public class Todo {

    private int id;
    private String user;
    private String desc;
    private String targetData;
    private boolean isDone;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTargetData() {
        return targetData;
    }

    public void setTargetData(String targetData) {
        this.targetData = targetData;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}

