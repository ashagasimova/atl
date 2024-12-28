package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(1 , "kinder", 5.2);
        Product p2 = new Product(2 , "nutella", 7.10);
        Product p3 = new Product(3 , "bread", 2.2);
        Product p4 = new Product(4 , "water", 1.3);

        Generic<Product> products = new Generic<>();
        products.addItem(p1);
        products.addItem(p2);
        products.addItem(p3);
        products.addItem(p4);

        products.removeItem(p2);

        System.out.println();

        products.display();

        System.out.println();

        List <Product> myProducts = List.of(p1, p2, p3, p4);

        myProducts.stream().filter(l->l.getPrice()>2.5)
                .forEach(System.out::println);





    }
}
