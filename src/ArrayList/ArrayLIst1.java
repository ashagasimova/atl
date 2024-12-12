package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLIst1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Ayan");
        list.add("Ayxan");
        list.add("Banu");
        list.add("Omer");
        list.add("Inci");

        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(list.get(0).length());
        list1.add(list.get(1).length());
        list1.add(list.get(2).length());
        list1.add(list.get(3).length());
        list1.add(list.get(4).length());

        int max = list1.get(0);
        for (int i = 0; i< list1.size(); i++){
            if (max < list1.get(i)){
                max = list1.get(i);
            }

        }System.out.println(max);

    }
}
