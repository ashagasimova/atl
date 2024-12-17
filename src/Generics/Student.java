package Generics;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentName;
    private int studentId;
    private List<Course> courses;

    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public void isExist(Course course) throws AlreadyExist {
        if (courses.contains(course)) {
           // System.out.println("Kurs movcuddur " + course);
            throw new AlreadyExist("Kurs movcuddur");
        }
    }

    public void isNotExist(Course course) throws NotFound {
        if (!courses.contains(course)){
            //System.out.println("Kurs movcud deyil " + course);
            throw new NotFound("Kurs movcud deyil");
        }
    }
    public void addCourse(Course course) throws AlreadyExist {
        isExist(course);
        courses.add(course);
        System.out.println("Course alave olundu " + course);
    }

    public void removeCourse(Course course) throws NotFound {
        isNotExist(course);
        courses.remove(course);
        System.out.println("Course silindi " + course);
        }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void studentInfo(){
        System.out.println("Student{" +
                "studentName='" + studentName + '\'' +
                ", studentId=" + studentId +
                '}');
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}
