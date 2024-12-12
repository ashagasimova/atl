package Name;

public class Main {
    public static void main(String[] args) {
        DayofWeek today = DayofWeek.TUESDAY;

       switch (today){
           case DayofWeek.MONDAY:
                   System.out.println("Today is monday");
           break;
       }
        switch (today) {
            case DayofWeek.TUESDAY:
                System.out.println("Today is tuesday");
                break;
        }


    }

}
