package Birds;

public class Birds {
    private Boolean canTheyFly;
    private int age;
    private String wingSize;

    public Birds(Boolean canTheyFly, int age, String  wingSize) {
        this.canTheyFly = canTheyFly;
        this.age = age;
        this.wingSize = wingSize;
    }

    public Birds() {
    }

    public void birdsInfo(){
        System.out.println("Can they fly? : " + getCanTheyFly() + " age is "
                + getAge() + "wing size is  "+ getWingSize());
    }

    public void birdEating(){
        System.out.println("birds can eat");
    }

    public Boolean getCanTheyFly() {
        return canTheyFly;
    }

    public void setCanTheyFly(Boolean canTheyFly) {
        this.canTheyFly = canTheyFly;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String  getWingSize() {
        return wingSize;
    }

    public void setWingSize(String wingSize) {
        this.wingSize = wingSize;
    }
}
