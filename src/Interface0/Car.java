package Interface0;

public class Car implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("The car started");

    }

    @Override
    public void stopEngine() {
        System.out.println("The car stopped");

    }
}
