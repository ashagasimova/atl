package StreamLEesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

      Phone p1 = new Phone(994513654);
        Phone p2 = new Phone(994516921);
        Phone p3 = new Phone(994963247);
        Phone p4 = new Phone(994535496);


        Person person1 = new Person("Ayan" , new ArrayList<>(Arrays.asList(p1)));
        Person person2 = new Person("Aykhan" , new ArrayList<>(Arrays.asList(p2,p3)));
        Person person3 = new Person("Banu" , new ArrayList<>(Arrays.asList(p4)));

         List<Person> mylist = List.of(person1, person2, person3);

         mylist.stream().flatMap(l->l.getNumbers()
                         .stream()).map(l->l.getPhoneNumber())
                         .forEach(System.out::println);

    }
}
