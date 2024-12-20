package StreamLesson2;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        Integer [] arr = {3, 5, 6, 9, 10, 14, 2};

        methodInt(arr);


        String [] arr2 = {"Ayan", "Banu", "Aykhan", "Inci"};

        methodStr(arr2);


        Double [] arr3 = {2.3, 2.0, 2.9, 3.61, 4.1};

        methodDou(arr3);

    }

    public static void methodInt (Integer [] array){

        Arrays.stream(array).filter(n->n%2==0)
                .sorted()
                .forEach(System.out::println);
    }

    public static void methodStr (String [] array){

        Arrays.stream(array).filter(n->n.startsWith("A"))
                .forEach(System.out::println);
    }

    public static void methodDou (Double [] array){

        Arrays.stream(array).filter(n->n>2.0)
                .sorted()
                .forEach(System.out::println);
    }


    public static void myMeth(){

    }


}