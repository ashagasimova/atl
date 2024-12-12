package FINtreface;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

//        Calculatornterface sum = (a, b) -> a+b;
//        Calculatornterface dec = (a, b) -> a-b;
//        Calculatornterface multip = (a, b) -> a*b;
//
//        System.out.println(sum.operation(2, 9));
//        System.out.println(dec.operation(10, 1));
//        System.out.println(multip.operation(10, 9));

//        Calculatornterface exce = () -> {
//            System.out.println("Functional interfeys");
//        };
//
//        exce.excecute();

//        ArrayList<Integer> arrL = new ArrayList<>();
//        arrL.add(1);
//        arrL.add(2);
//        arrL.add(3);
//        arrL.add(4);
//
//        arrL.forEach((z) -> {
//            System.out.println(z);
//        });

//        Consumer<String> con = (s)->{
//            System.out.println(s.toUpperCase());
//        };
//        con.accept("Hello");
//        Predicate<Integer> ab = (a) -> a>0;
//        System.out.println(ab.test(1));

        BiFunction<Integer, Integer, Integer> mybi = Integer::sum;
        System.out.println(mybi.apply(8,15));

    }
}
