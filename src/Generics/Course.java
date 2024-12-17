package Generics;

import java.util.ArrayList;
import java.util.List;

public class Course <T> {
    private T courseName;
    private List<Student> students;

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
    public void isExist(Student student) throws AlreadyExist {
        if (students.contains(student)){
        throw  new AlreadyExist("Telebe movcuddur");
    }}

    public void isNotExist(Student student) throws NotFound {
        if (!students.contains(student)){
            throw  new NotFound("Telebe movcud deyil");
        }
    }

    public void addStudents(Student student) throws AlreadyExist {
        isExist(student);
        students.add(student);
        System.out.println("Telebe elave olundu " + student);
    }
    public void removeStudent(Student student) throws NotFound {
        isNotExist(student);
        students.remove(student);
        System.out.println("Telebe silindi " + student);
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
