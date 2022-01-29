package com.dio.bootcamp.activity;

import java.time.LocalDate;

public class Mentorship extends Activity{
    private LocalDate date;

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
}
