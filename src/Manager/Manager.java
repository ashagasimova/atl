package Manager;

public class Manager extends Employee{
    public String departmentManaged;
    public static final int MANAGEMENT_PAYMENT =5000;
    public double bonus;

    public Manager(int number, String name, int year, String departmentManaged, double bonus) {
        super(number, name, year);
        this.departmentManaged = departmentManaged;
        this.bonus = bonus;
    }


    @Override
    public double salary() {
        double employeeSalary = super.salary();
        return employeeSalary + MANAGEMENT_PAYMENT + bonus;

    }

    @Override
    public void printInfo() {
        System.out.println("Meneger " + departmentManaged + " departamentini idare edir. Aldigi mmas: " + salary() );
    }
}

