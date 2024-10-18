package task_4.entity;

import task_4.Learnable;
import task_4.Walkable;

import java.util.ArrayList;
import java.util.List;

public class Student implements Walkable, Learnable {
    private List<Teacher> teachers = new ArrayList<>();
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public void learn() {
        System.out.println("Студент " + name + " учится");
    }

    @Override
    public void go() {
        study();
        System.out.println("Я студент и я могу ходить");
    }

    private void study() {          // учиться
        System.out.println("Я студент и я могу ходить учиться в университет");
    }

}
