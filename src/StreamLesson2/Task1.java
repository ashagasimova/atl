package StreamLesson2;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {

        Set<String> animals = new HashSet<>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Snake");
        animals.add("Sheep");
        animals.add("Giraffe");

        animals.stream().filter(x -> x.length()>=5)
                .sorted().toList().forEach(System.out::println);


    }
}
