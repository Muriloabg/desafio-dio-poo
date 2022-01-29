package com.dio.bootcamp.actor;

import com.dio.bootcamp.activity.Activity;

import java.util.Iterator;

public class Dev extends Actor{

    public Dev(String name) {
        super(name);
    }

    public int getTotalXP(){
        Iterator<Activity> pointer = super.activities.iterator();
        int sum = 0;

        while (pointer.hasNext()){
            sum += pointer.next().giveXP();
        }

        return sum;
    }
}
