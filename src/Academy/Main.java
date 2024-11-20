package Academy;

public class Main {
    public static void main(String[] args) {

        Academy academy = new Academy("Atl" , "jalil.m");
        academy.displayInfo();


        Teacher teacher = new Teacher(126548, "math", academy.getName(), academy.getAddress());
        teacher.teach();

        Student student = new Student(125987, "JavaPrg", academy.getName(), academy.getAddress());
        student.study();



    }

}
