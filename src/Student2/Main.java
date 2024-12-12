package Student2;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ilkin" , 1);
        Student student2 = new Student("Xan", 2);
        Student student3 = new Student("Emin", 3);
        Student student4 = new Student("Uker", 4);

        StudentRegister studentRegister = new StudentRegister();

        studentRegister.addStudent(student1);
        studentRegister.addStudent(student2);
        studentRegister.addStudent(student3);
        studentRegister.addStudent(student4);
        studentRegister.addStudent(student4);
        System.out.println();

        try {
            studentRegister.studentsSearch(2);
            studentRegister.studentsSearch(7);
        } catch (NotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
