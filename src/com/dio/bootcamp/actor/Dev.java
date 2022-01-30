package com.dio.bootcamp.actor;

import com.dio.bootcamp.activity.Activity;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

public class Dev extends Actor{
    protected LinkedHashSet<Activity> completedActivities = new LinkedHashSet<>();

    //Constructor
    public Dev(String name, LinkedHashSet<Activity> activities) {
        super(name, activities);
    }

    //Sets the boolean finished to true
    public void finishActivity(String aName){
        for(Activity activity : super.activities){
            if(Objects.equals(activity.getName(), aName)) {
                completedActivities.add(activity);
            }
        }
    }

    //Returns the XP sum of all finished activities
    public int getTotalXP(){
        int sum = 0;
        for(Activity activity : completedActivities) sum += activity.giveXP();
        return sum;
    }

    //Prints out all finished activities
    public void finishedActivities(){
        for(Activity activity : completedActivities) System.out.println(activity.getName());
    }
}
