package Generics;

public class StudentRegister {


    public void registerStudent(Course <String> course, Student student) throws AlreadyExist {
        student.addCourse(course);
        course.addStudent(student);
        System.out.println("Qeydiyyat ugurlu oldu " + student.getStudentId() );
    }

    public void removeStudent(Course <String> course, Student student) throws NotFound {
        student.removeCourse(course);
        course.removeStudent(student);
        System.out.println("Silindi " + student.getStudentId() );
    }

}
