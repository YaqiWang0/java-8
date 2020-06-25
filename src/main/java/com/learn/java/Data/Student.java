package com.learn.java.Data;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;
    List<String> activities = new ArrayList<>();
    private int nodeBooks;

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities, int nodeBooks) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
        this.nodeBooks = nodeBooks;
    }

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
    }

    public Student() {

    }

    public Student(String s) {
        this.name = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public void printListActivities() {
        System.out.println(activities);
    }

    public int getNodeBooks() {
        return nodeBooks;
    }

    public void setNodeBooks(int nodeBooks) {
        this.nodeBooks = nodeBooks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name +'\'' +
                ", gradeLevel=" + gradeLevel +
                ", gpa=" +gpa +
                ", gender=" + gender +'\'' +
                ",activities=" + activities +
                '}';
    }
}
