package Interface0;

public class Bike implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("The bike started");

    }

    @Override
    public void stopEngine() {
        System.out.println("The bike stopped");

    }

    @Override
    public String getFuelType() {
        return "Elektrik";

    }
}
