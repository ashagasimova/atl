package Human;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Human human1  = new Human("Ayan", LocalDate.of(2008, 10, 8), 16);
        Human human2 = new Human("Ayxan", LocalDate.of(2001, 11, 9), 23);
        Human human3 = new Human("Inci", LocalDate.of(1998,01,01), 26) ;

        List<Human> arrL = new ArrayList<>();

        arrL.add(human1);
        arrL.add(human2);
        arrL.add(human3);

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put(human1.getName(), human1.getAge());
        myMap.put(human2.getName(), human2.getAge());
        myMap.put(human3.getName(), human3.getAge());


        for(Human human : arrL){
            myMap.put(human.getName(),human.getAge());
        } System.out.println(myMap);



//        for (Human human: arrL) {
//            if (human.getAge() > 20) {
//                System.out.println(human);
//            }
//        }




    }
}
