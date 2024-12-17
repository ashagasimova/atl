package Comparable;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Aytac", 22, 4000);
        Employee emp2 = new Employee("Huseyn", 21, 4001);
        Employee emp3 = new Employee("Ulker", 28, 5000);

        List<Employee> myList = Arrays.asList(emp1, emp2, emp3);
        System.out.println(myList);
        Collections.sort(myList);
        System.out.println(myList);



    }
}
