package Comp;

import java.util.Comparator;

public class StudentComparator {

    public static Comparator <Student> comparatorForId(){
        return (a1,a2) -> Integer.compare(a1.getId(), a2.getId());
    }

    public static Comparator <Student> comparatorForName(){
        return (a1,a2) -> a1.getName().compareTo(a2.getName());
    }
}
