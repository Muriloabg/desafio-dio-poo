package com.dio.bootcamp.activity;

import java.time.LocalDate;

public class Mentorship extends Activity implements Cloneable{
    private LocalDate date;

    //Constructor
    public Mentorship(String name, String desc, LocalDate date) {
        super(name, desc);
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return super.toString(date);
    }

    @Override
    public double giveXP(){
        return BASE_XP + 10d;
    }

    @Override
    public Mentorship clone() {
        Mentorship clone = (Mentorship) super.clone();
        clone.date = this.date;
        clone.id = super.id;
        clone.name = super.name;
        clone.desc = super.desc;
        return clone;
    }
}
