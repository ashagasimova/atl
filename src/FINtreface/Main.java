package FINtreface;
public class Main {
    public static void main(String[] args) {

        CustomConsumer <String> consumer = (t) -> {
            System.out.println(t.toUpperCase());
        };
        consumer.print("Hello");


        CustomPredicate <Integer> predicate = (t) -> t>0;
        System.out.println(predicate.isPositive(10));


        CustomBifunction <Integer, Integer> multi = (a, b) -> a+b;
        System.out.println(multi.multiplaction(8,13));

        CustomFunction <Integer> function  = (t) -> (t/2);
        System.out.println(function.divide(14));


        CustomSupplier supplier = () ->  System.out.println("Hello");
         supplier.info();









    }
}
