package task_4.entity;

import task_4.Learnable;
import task_4.Teachable;
import task_4.Walkable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class University {
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    private Map<Teacher, List<Student>> studentsByTeachers = new HashMap<>();

    public University(List<Student> students, Map<Teacher, List<Student>> studentsByTeachers, List<Teacher> teachers) {
        this.students = students;
        this.studentsByTeachers = studentsByTeachers;
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Map<Teacher, List<Student>> getStudentsByTeachers() {
        return studentsByTeachers;
    }

    public void setStudentsByTeachers(Map<Teacher, List<Student>> studentsByTeachers) {
        this.studentsByTeachers = studentsByTeachers;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void makeGo(Walkable walkable) {
        walkable.go();
    }

    public void makeLearn(Learnable learnable) {
        learnable.learn();
    }

    public void makeTeach(Teachable teachable) {
        teachable.teach();
    }
}
