package Cars;

public class MainClass2 {
    public static void main(String[] args) {
        Lexus lexus = new Lexus("ES300H", 2014, "Gray", 60000);
        lexus.printCars();
        lexus.stop();
        lexus.start();
        lexus.selfCharging();

        Audi audi = new Audi("Q7", 2023, "White", 30000);
        audi.printCars();
        audi.start();
        audi.stop();
        audi.headLights();

        Toyota toyota = new Toyota("Camry", 2020, "black" , 90000);
        toyota.printCars();
        toyota.start();
        toyota.stop();
        toyota.safety();

    }
}
