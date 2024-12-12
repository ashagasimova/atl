package Family;

public class Human {
   private String fname;
    private String sname;
    private int age;

    private Human father;
    private Human mother;

    private Pet pet;

    public Human(){
    }

    public Human(String fname, String sname, int age){
        this.fname=fname;
        this.sname=sname;
        this.age=age;
    }



    public String getFname() {
        return fname;
    }
    public void setFname(String fname){
        this.fname=fname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }




}


