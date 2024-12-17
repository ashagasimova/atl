package Comparable;

public class Employee implements Comparable <Employee> {
    private String name;
    private Integer age;
    private Integer salary;

    public Employee(String name, Integer age, Integer salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Employee emp1) {
   // return Integer.compare(this.age, emp1.age);
        return emp1.getName().compareTo(this.name);
    }
}
