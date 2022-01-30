package com.dio.bootcamp.actor;

import com.dio.bootcamp.activity.Activity;

import java.util.LinkedHashSet;

public class Instructor extends Actor{
    //Constructor
    public Instructor(String name, LinkedHashSet<Activity> activities) {
        super(name, activities);
    }
}
