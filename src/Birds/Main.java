package Birds;

public class Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot(true, 10 , "large");
        parrot.birdsInfo();
        parrot.specialParrot();

        Penguin penguin = new Penguin(false, 5, "small");
        penguin.birdsInfo();
        penguin.specialPenguin();
        penguin.birdEating();


        Eagle eagle = new Eagle(true, 6 , "medium");
        eagle.birdsInfo();
        eagle.specialEagle();




    }
}
