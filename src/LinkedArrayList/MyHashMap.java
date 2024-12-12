package LinkedArrayList;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        Map<String, Integer> listH = new HashMap<>();
        listH.put("Baki", 90);
        listH.put("Ismayilli", 31);
        listH.put("Goychay", 23);

        System.out.println(listH.get("Ismayilli"));
        System.out.println(listH.get(23));


        boolean varmi = listH.containsKey("Baki");
        System.out.println(varmi);

        boolean varmi1 = listH.containsValue(23);
        System.out.println(varmi1);


        for (String key: listH.keySet()){
            System.out.println(key);
        }

        for (Integer val: listH.values()){
            System.out.println(val);
        }
    }
}
