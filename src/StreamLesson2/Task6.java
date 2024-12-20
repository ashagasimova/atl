package StreamLesson2;

import java.util.Arrays;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        /*List daxilinde list integer tipinde
        icerisin doldur ve map et ekrana yazdir*/

        List<List<Integer>> myList = Arrays.asList(List.of(10,12,8,9,4,3,7,22),
                List.of(10,15,8,9,3),
                List.of(5,12,8,9,7),
                List.of(8,14,6,9,7,10));

        myList.stream().map(n->n.stream().toList())
                .forEach(System.out::println);
    }
}
