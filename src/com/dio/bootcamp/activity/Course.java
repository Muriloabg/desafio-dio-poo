package com.dio.bootcamp.activity;

public class Course extends Activity{
    private int credits;

    public Course(String name, String desc, int credits) {
        super(name, desc);
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return super.toString(credits);
    }
}
