package Metods;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("kinder", 25.5, "Chocolate", 25634);
        Product product2 = new Product("mms", 12.6, "chocolate" , 56348);
        Product product3 = new Product("kinder", 25.5, "Chocolate", 25634);

        System.out.println(product1.equals(product2));
        System.out.println(product1.equals(product3));



    }


}
