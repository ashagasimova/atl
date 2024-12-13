package Generics;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Ayan", 10);
        Student student2 = new Student("Aykhan", 11);
        Student student3 = new Student("Banu", 12);
        Student student4 = new Student("Omer", 13);


        Course course1 = new Course<>("ATL");
        course1.addStudent(student1);
        course1.addStudent(student2);
        course1.addStudent(student3);
        course1.addStudent(student4);

        course1.showStudents();}



    }
