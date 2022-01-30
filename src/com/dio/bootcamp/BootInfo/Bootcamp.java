package com.dio.bootcamp.BootInfo;

import com.dio.bootcamp.actor.Dev;
import com.dio.bootcamp.actor.Instructor;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String desc;
    private final LocalDate dateStart = LocalDate.now();
    private final LocalDate dateEnd = LocalDate.now();
    private Set<Instructor> instructors = new LinkedHashSet<>();
    private Set<Dev> devs = new LinkedHashSet<>();

    public Bootcamp(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public Set<Instructor> getInstructors() {
        return instructors;
    }

    public Set<Dev> getDevs() {
        return devs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(desc, bootcamp.desc) && Objects.equals(dateStart, bootcamp.dateStart) && Objects.equals(dateEnd, bootcamp.dateEnd) && Objects.equals(instructors, bootcamp.instructors) && Objects.equals(devs, bootcamp.devs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, desc, dateStart, dateEnd, instructors, devs);
    }
}
