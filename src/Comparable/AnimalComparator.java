package Comparable;

import java.util.Comparator;

public class AnimalComparator implements Comparator <Animal> {


    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
