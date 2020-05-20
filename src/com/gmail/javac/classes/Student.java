package com.gmail.javac.classes;

import java.util.ArrayList;

public class Student {
    private int id;
    private String lastname;
    private String firstname;
    private String birthday;
    private String street;
    private String numberPhone;
    private String department;
    private int course;
    private String nameGroup;

    public Student() {
    }
    
    public Student(String lastname, String firstname) {
        super();
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;

    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
