package Comp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ayan", 325);
        Student student2 = new Student("Zakhra", 310);
        Student student3 = new Student("Banu", 651);

        List<Student> myList = Arrays.asList(student1, student2, student3);

        System.out.println(myList);
//        Collections.sort(myList);
//        System.out.println(myList);

        Collections.sort(myList, new Comparator());
        System.out.println(myList);
    }
}
