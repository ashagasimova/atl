package Cars;

public class Car {
    private String model;
    private int mile;
    private String color;
    private int year;


    public void start() {
        System.out.println("start");
    }

    public void stop() {
        System.out.println("stop");
    }

    public void printCars(){
        System.out.println(getModel() +" "+ getYear() +" "+ getColor() + " "+getMile());
    }

    public Car(String model, int mile, String color, int year) {
        this.model = model;
        this.mile = mile;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMile() {
        return mile;
    }

    public void setMile(int mile) {
        this.mile = mile;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
