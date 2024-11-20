package Academy;

public class Teacher extends Academy{
    private int teacherID;
    private String subject;


    public void teach(){
        System.out.println(teacherID + " with ID is teaching " + subject);
    }

    public Teacher(int teacherID, String subject, String name, String address) {
        super(name, address);
        this.teacherID=teacherID;
        this.subject=subject;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
