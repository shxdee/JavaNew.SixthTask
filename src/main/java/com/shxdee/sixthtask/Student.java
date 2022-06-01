package com.shxdee.sixthtask;

public class Student extends Human {
    private String faculty;

    public Student(String lastName, String firstName, String patronymic, int old, String faculty) {
        super(lastName, firstName, patronymic, old);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
