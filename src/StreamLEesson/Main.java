package StreamLEesson;

import Manager.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Customer cust1 = new Customer("Ayan", 560);
        Customer cust2 = new Customer("Aykhan", 460);
        Customer cust3 = new Customer("Banu", 340);
        Customer cust4 = new Customer("Inci", 200);
        Customer cust5 = new Customer("Umid", 880);

        List <Customer> myList = Arrays.asList(cust1, cust2, cust3, cust4, cust5);
        System.out.println(myList);

        //List <Customer> str = myList.stream().filter(x -> x.getDebt()>350).toList();
        List <Customer> str = myList.stream().filter(x -> x.getDebt()>350)
                .peek(x -> x.setDebt(x.getDebt()+50))
                .toList();

        for (Customer c : str){
            System.out.println(c);
        }

    }





}
