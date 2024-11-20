package Academy;

public class Student extends Academy{
    private int  studentID;
    private String course;


    public void study(){
        System.out.println(studentID + " with ID student is taking " + course);
    }

    public Student(int studentID, String course, String name, String address) {
       super(name, address);
       this.studentID=studentID;
       this.course=course;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
