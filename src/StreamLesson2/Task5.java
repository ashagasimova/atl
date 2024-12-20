package StreamLesson2;

import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List <String> myList = List.of("Apple", "Banana", "Cherry", "Apricot", "Grapefruit");

        myList.stream().map(n->n.split(""))
                .toList()
               .forEach(a -> System.out.println(Arrays.toString(a)));


    }
}
