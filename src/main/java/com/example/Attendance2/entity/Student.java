package com.example.Attendance2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id
    private int rollNumber;
    private String name;
    private String mobileNumber;

    // Constructors
    public Student() {}

    public Student(int rollNumber, String name, String mobileNumber) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    // Getters and Setters
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}