package org.discover.demo;

public class Student {
    private int studentID;
    private String firstName;
    private String lastName;
    private float gpa;

    public Student(int studentID, String firstName, String lastName, float gpa) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public float getGpa() {
        return gpa;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}