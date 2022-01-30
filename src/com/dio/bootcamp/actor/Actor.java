package com.dio.bootcamp.actor;

import com.dio.bootcamp.activity.Activity;

import java.util.*;

public class Actor {
    private static int SERIAL = 1;

    protected String name;
    protected int id;
    protected LinkedHashSet<Activity> activities = new LinkedHashSet<>();

    public Actor(String name, LinkedHashSet<Activity> activitiesIn){
        this.name = name;
        this.id = SERIAL++;
        for(Activity activity : activitiesIn){
            activities.add(activity.clone());
        }
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public LinkedHashSet<Activity> getActivities() {
        return activities;
    }

    public void setActivities(LinkedHashSet<Activity> activities) {
        this.activities = activities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return id == actor.id && Objects.equals(name, actor.name) && Objects.equals(activities, actor.activities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, activities);
    }
}

/* Old Code
    //Constructor
    public Actor(String name) {
        this.name = name;
        this.id = SERIAL++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Activities List manipulation
    public void addActivity(Activity course){
        activities.add(course.clone());
    }

    public void rmActivity(int activityId){
        if (activityId == -1){
            System.out.println("Activity ID equal to -1. If findActivity() was used then there was no such" +
                    "name in the Activity list of this Actor");
        }
        this.activities.removeIf(activity -> activity.getId() == activityId);
    }

    public int findActivity(String name){
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
 */
