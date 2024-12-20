package StreamLesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(5, -23, 14, -11, -1, 15, 6, 8);

        streamMethod(myList);
    }



    public static <T extends List<Integer>> void streamMethod(T list){
        list.stream()
                .filter(x -> x > 0)
                .map(x -> x * 2)
                .filter(x -> x > 10)
                .sorted()
                .toList()
                .forEach(System.out::println);
    }

    }


