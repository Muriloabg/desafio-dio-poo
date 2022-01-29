package com.dio.bootcamp.actor;

import com.dio.bootcamp.activity.Activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Actor {
    private static int SERIAL = 1;

    protected String name;
    protected int id;
    protected List<Activity> activities = new ArrayList<>();


    public Actor(String name) {
        this.name = name;
        this.id = SERIAL++;
    }
    //############Generic Gets and Sets############

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //############Other Methods############
    //Activities List manipulation
    public void addActivity(Activity activity){
        activities.add(activity);
    }

    public void rmActivity(int activityId){
        if (activityId == -1){
            System.out.println("Activity ID equal to -1. If findActivity() was used then there was no such" +
                    "name in the Activity list of this Actor");
        }
        this.activities.removeIf(activity -> activity.getId() == activityId);
    }

    public int findActivityCaller(String name){
        Iterator<Activity> finder = activities.iterator();
        Activity tempActivity;
        String aName;
        while (finder.hasNext()){
            tempActivity = finder.next();
            if (Objects.equals(tempActivity.getName(), name)){
                return tempActivity.getId();
            }
        }
        return -1;
    }
}
