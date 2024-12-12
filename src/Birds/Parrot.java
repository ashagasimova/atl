package Birds;

public class Parrot extends Birds {
    public Parrot(Boolean canTheyFly, int age, String  wingSize){
        super(canTheyFly, age, wingSize);
    }
    public void humanSpeech(){
        System.out.println("Parrot can speak");
    }
    public void specialParrot(){
        humanSpeech();
    }

}
