package Generics;

import java.util.ArrayList;
import java.util.List;

public class Course <T> {
    private T courseName;
    List<Student> students;

    public Course(T courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
        System.out.println(student + " elave olundu");
    }

    public void showStudents(){
        for (Student student: students){
        }
        System.out.println(" Movcud telebeler: " + students );
    }

    public T getCourseName() {
        return courseName;
    }

    public void setCourseName(T courseName) {
        this.courseName = courseName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName=" + courseName +
                ", students=" + students +
                '}';
    }
}
