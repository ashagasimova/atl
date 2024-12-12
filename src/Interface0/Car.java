package Interface0;

public class Car implements Vehicle{
    private boolean hasFuel = true;


    public void startCar() {
        if (checkFuel()) {
            System.out.println("Avtomobil ishe dusur");
        } else {
            System.out.println("Yanacaq yoxdur");
        }
    }

    @Override
    public void startEngine() {
        System.out.println("The car started");

    }

    @Override
    public void stopEngine() {
        System.out.println("The car stopped");

    }

    @Override
    public String getFuelType() {
        return "Benzin";
    }

    public boolean checkFuel(){
        return hasFuel;

        }

    }
