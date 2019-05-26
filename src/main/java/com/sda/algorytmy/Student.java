package com.sda.algorytmy;

import java.util.Objects;

public class Student {
    private String name;
    private String lastname;
    private int id;


    public Student(String name, String lastname, int id) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(name, student.name) &&
                Objects.equals(lastname, student.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, id);
    }
}
