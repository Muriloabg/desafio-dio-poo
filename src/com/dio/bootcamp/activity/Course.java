package com.dio.bootcamp.activity;

public class Course extends Activity implements Cloneable{
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

    @Override
    public double giveXP(){
        return BASE_XP * credits;
    }
    @Override
    public Course clone() {
        Course clone = (Course) super.clone();
        clone.credits = this.credits;
        clone.id = super.id;
        clone.name = super.name;
        clone.desc = super.desc;
        return clone;
    }


}
