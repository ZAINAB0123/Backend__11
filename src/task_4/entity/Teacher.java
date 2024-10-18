package task_4.entity;

import task_4.Teachable;
import task_4.Walkable;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements Walkable, Teachable {
    private String name;
    private List<Student> students = new ArrayList<>();

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public void teach() {
        System.out.println("Преподаватель " + name + " учит");
    }

    @Override
    public void go() {
        teach();
        System.out.println("Я преподаватель и я могу ходить");
    }

}
