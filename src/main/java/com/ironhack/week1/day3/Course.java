package com.ironhack.week1.day3;

public class Course {
    private String classId;
    private int capacity;
    private int studentCount;
    private String title;

    public Course(String classId, int capacity, int studentCount, String title) {
        this.classId = classId;
        this.capacity = capacity;
        this.studentCount = studentCount;
        this.title = title;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
