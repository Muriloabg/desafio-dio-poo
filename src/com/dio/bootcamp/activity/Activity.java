package com.dio.bootcamp.activity;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Activity implements Cloneable{
    protected static int SERIAL = 1;
    protected static final double BASE_XP = 20d;

    protected String name;
    protected int id;
    protected String desc;

    //Constructor
    public Activity(String name, String desc) {
        this.name = name;
        this.id = SERIAL++;
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

    //Returns the XP value of the activity, it is overridden on all subclasses
    public double giveXP(){
        return BASE_XP;
    }

    //Generic to String, but also prints its subclasses additional values
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

    //Clone method, overridden on its subclasses
    @Override
    public Activity clone() {
        try {
            Activity clone = (Activity) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Activity)) return false;
        Activity activity = (Activity) o;
        return id == activity.id && Objects.equals(name, activity.name) && Objects.equals(desc, activity.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, desc);
    }
}
