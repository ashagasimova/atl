package Student2;

import java.util.HashSet;
import java.util.Set;

public class StudentRegister {
    private Set<Student> students;

    public StudentRegister() {
        this.students = new HashSet<>();
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        students.add(student);
        System.out.println(student+" elave olundu");
    }

    public String studentsSearch(int id) throws NotFoundException{
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println(student);
            }
        }
        throw new NotFoundException("Telebe tapilmadi");
    }
}
