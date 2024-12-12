package Birds;

public class Eagle extends Birds{

    public Eagle(Boolean canTheyFly, int age, String wingSize){
        super(canTheyFly, age, wingSize);
    }
    public void vision(){
        System.out.println("Eagle can see excellent");
    }
    public void specialEagle(){
        vision();
    }
}
