package Birds;

public class Penguin extends Birds {
    public Penguin(Boolean canTheyFly, int age, String wingSize){
        super(canTheyFly, age, wingSize);
    }

    public void swimmers(){
        System.out.println("Penguin can swim");
    }

    public void specialPenguin(){
        swimmers();
    }
    public Penguin(){
        super.birdEating();
    }
}
