package task_4;

import task_4.entity.Student;
import task_4.entity.Teacher;
import task_4.entity.University;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("Jack");
        Student student2 = new Student("Kate");
        Student student3 = new Student("Erick");

        Teacher teacher1 = new Teacher("Ivan");
        Teacher teacher2 = new Teacher("Petre");
        student1.setTeachers(List.of(teacher1, teacher2));
        student2.setTeachers(List.of(teacher1));
        student3.setTeachers(List.of(teacher2));
        teacher1.setStudents(List.of(student1, student2));
        teacher2.setStudents(List.of(student1, student3));
        List<Student> allStudents = List.of(student1, student2, student3);
        List<Teacher> allTeacher = List.of(teacher1, teacher2);
        Map<Teacher, List<Student>> studentsByTeacher = new HashMap<>();
        for (Teacher teacher : allTeacher) {
            studentsByTeacher.put(teacher, teacher.getStudents());
            University university = new University(allStudents, studentsByTeacher, allTeacher);


            university.makeGo(student1);
            university.makeGo(teacher1);
            university.makeLearn(student3);
            university.makeTeach(teacher2);

        }
    }
}