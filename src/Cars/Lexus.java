package Cars;

public class Lexus extends Car{

    public void selfCharging(){
        System.out.println("Self-Charging Hybrid System");
    }


    public Lexus (String model, int year, String color, int mile){
        super(model, mile, color, year);

    }



}
