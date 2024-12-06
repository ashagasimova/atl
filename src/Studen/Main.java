package Studen;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");
        Student student3 = new Student(3,"Charlie");

        StudentRegister student = new StudentRegister();
        student.addStudents(student1);
        student.addStudents(student2);
        student.addStudents(student3);
        System.out.println();
        student.showStudents();

        student.removeStudents(2);
        student.showStudents();

        student.getId(1);


    }
}
