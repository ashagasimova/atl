package Comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Monkey", 120, 160);
        Animal animal2 = new Animal("Donkey", 190, 110);
        Animal animal3 = new Animal("Giraffe", 130, 260);


        List<Animal> animalList = Arrays.asList(animal1, animal2, animal3);
        System.out.println(animalList);
        Collections.sort(animalList, new AnimalComparator());
        System.out.println(animalList);


    }
}
