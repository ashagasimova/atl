package Manager;

public class Director extends Manager {
    public static final int DIRECTOR_PAYMENT = 8000;
    public double directorBonus;

    public Director(int number, String name, int year, String departmentManaged, double bonus) {
        super(number, name, year, departmentManaged, bonus);
    }


    @Override
    public double salary() {
        double employeeSalary = super.salary();
        return employeeSalary + DIRECTOR_PAYMENT + directorBonus;
    }


    @Override
    public void printInfo() {
        System.out.println(departmentManaged + " departamentin direktorun aldigi maas: " + salary());
    }
}


