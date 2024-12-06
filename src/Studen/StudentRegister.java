package Studen;

import java.util.HashMap;
import java.util.Map;

public class StudentRegister {
    private Map<Integer, Student> students;

    public StudentRegister() {
        this.students = new HashMap<>();
    }

    public void addStudents(Student student){
        students.put(student.getId(), student);
        System.out.println("'" + student + "' adli telebe elave olundu");
    }

    public void removeStudents(int id){
        students.remove(id);
        System.out.println("'" + id + "' adli telebe silindi");
    }
    public Student getId(int id){
        return students.get(id);
    }

    public void showStudents(){
        for (Student item: students.values()){
            System.out.println("Movcud telebeler: " + item );
        }
    }

}
