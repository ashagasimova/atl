package Generics;

public class Main {
    public static void main(String[] args) {
        Generic <String> myGeneric = new Generic<>("Java");
        Generic <Integer> myGenerics2 = new Generic<>(100);

        System.out.println(myGeneric.getValue1());
        System.out.println(myGenerics2.getValue1());
    }


}
