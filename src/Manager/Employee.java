package Manager;

public class Employee {
    public int number;
    public String name;
    public int year;
    public static final int BASE_SALARY = 500;

    public Employee(int number, String name, int year) {
        this.number = number;
        this.name = name;
        this.year = year;
    }

    public double salary(){
       return (2024-year)*BASE_SALARY;
    }

    public void printInfo(){
        System.out.println(name + " " + year + "-ci ilden calisir. " + "Maas: " + salary());
    }
}
