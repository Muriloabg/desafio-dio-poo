package com.dio.bootcamp;

import com.dio.bootcamp.BootInfo.Bootcamp;
import com.dio.bootcamp.activity.Activity;
import com.dio.bootcamp.activity.Course;
import com.dio.bootcamp.activity.Mentorship;
import com.dio.bootcamp.actor.Dev;
import com.dio.bootcamp.actor.Instructor;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Boot {

    //This Class main is purely for testing purposes, it does not represent any part of the actual idea of a Bootcamp
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp("Bootiest Bootcamp", "The most booty of all bootcamps");
        Activity mentorship = new Mentorship("Mentorshiping Mentorship", "A very long description", LocalDate.of(2077, 7, 7));
        Activity course = new Course("How to Course", "A short description", 5);
        LinkedHashSet<Activity> activityLinkedHashSet = new LinkedHashSet<>();
        activityLinkedHashSet.add(mentorship);
        activityLinkedHashSet.add(course);
        Dev dev = new Dev("Devy Devidson", activityLinkedHashSet);
        Instructor instructor = new Instructor("Intrunilson Instrucson", activityLinkedHashSet);

        bootcamp.getDevs().add(dev);
        bootcamp.getInstructors().add(instructor);
        dev.finishActivity(course.getName());
        dev.finishActivity(mentorship.getName());

        System.out.println(mentorship.toString());
        System.out.println(course.toString());

        System.out.println("XP: " + dev.getTotalXP());//Prints Dev XP

        dev.finishedActivities();//Prints concluded courses



    }

}
