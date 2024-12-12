package Academy;

public class Academy {
    private String name;
    private String address;
    private Student[] students;
    private int studentCount;

    public void addStudent(Student student){
        if(studentCount==students.length){
            Student[] newStudent =new Student[students.length+5];
            for(int i=0;i<students.length; i++){
                newStudent[i] = students[i];
            }
            students = newStudent;
        }
        students[studentCount] = student;  //yeni telebe daxill edir
        studentCount++;
        System.out.println(student.getName() + "telebe olaraq elave edildi") ;
    }



    public void displayInfo(){
        System.out.println("Academy : " + name);
        System.out.println("Address : " + address);
    }

    public Academy(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
