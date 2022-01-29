package com.dio.bootcamp.activity;

import java.time.LocalDate;

public class Activity {
    private static int SERIAL = 1;

    private String name;
    private int id;
    private String desc;

    public Activity(String name, String desc) {
        this.name = name;
        id = SERIAL++;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    //int id setter will not be added

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int giveXP(){
        int XP = 1;

        return XP;
    }

    //
    @Override
    public String toString() {
        return "Activity{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", desc='" + desc + '\'' +
                '}';
    }

    protected String toString(LocalDate date) {
        return "Activity{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", desc='" + desc + '\'' +
                ", date=" + date +
                '}';
    }

    protected String toString(int credits) {
        return "Activity{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", desc='" + desc + '\'' +
                ", credits=" + credits +
                '}';
    }
}
