package com.dio.bootcamp;

import com.dio.bootcamp.activity.Activity;
import com.dio.bootcamp.activity.Course;
import com.dio.bootcamp.activity.Mentorship;
import com.dio.bootcamp.actor.Actor;
import com.dio.bootcamp.actor.Dev;
import com.dio.bootcamp.actor.Instructor;

import java.time.LocalDate;

public class Boot {

    public static void main(String[] args) {
        Actor dev = new Dev("Devy Devidson");
        Actor instructor = new Instructor("Intra Instrucson");
        Activity mentorship = new Mentorship("Mentorshiping Mentorship", "A very long description", LocalDate.of(2077, 7, 7));
        Activity course = new Course("How to Course", "A short description", 5);

        dev.addActivity(mentorship);
        dev.addActivity(course);
        instructor.addActivity(mentorship);
        instructor.addActivity(course);

        System.out.println(mentorship.toString());
        System.out.println(course.toString());

    }

}
