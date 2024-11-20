package Cars;

public class Toyota extends Car{

    public Toyota(String model, int mile, String color, int year) {
        super(model, mile, color, year);
    }

    public void safety(){
        System.out.println("Safety Sense");
    }
}
