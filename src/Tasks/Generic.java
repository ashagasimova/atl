package Tasks;

import java.util.ArrayList;
import java.util.List;

public class Generic <T>{

    private List <T> items;

    public Generic() {
        this.items = new ArrayList<>();
    }

    public void addItem(T product){
        items.add(product);
        System.out.println(product + " Siyahiya elave olundu.");
    }

    public void removeItem(T product){
        items.remove(product);
        System.out.println(product + " Siyahidan silindi");
    }

    public void display(){
        for (T e: items){
            System.out.println(e);
        }
    }

}
