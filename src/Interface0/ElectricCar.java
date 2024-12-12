package Interface0;

public class ElectricCar implements Vehicle{

    @Override
    public void startEngine() {
        System.out.println("Started");

    }

    @Override
    public void stopEngine() {
        System.out.println("Stopped");

    }

    @Override
    public String getFuelType() {
        return "Elektrik";

    }
}
