package Manager;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(23654, "Ayan" , 2021);
        employee.salary();
        employee.printInfo();

        Manager manager = new Manager(3624, "Ayxan", 2023, "IT", 300);
        manager.salary();
        manager.printInfo();

        Director director = new Director(6, "Banu", 2020, "Marketing", 200);
        director.salary();
        director.printInfo();


    }



}
