package Enum;

import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Day today = Day.FRIDAY;
        switch (today){
            case MONDAY:
                out.println("Today is Monday");
                break;
            case Day.TUESDAY:
                out.println("Today is Tuesday");
                break;
            case Day.WEDNESDAY:
                out.println("Today is Wednesday");
                break;
            case Day.THURSDAY:
                out.println("Today is Thursday");
                break;
            case Day.FRIDAY:
                out.println("Today is Friday");
                break;
            case Day.SATURDAY:
                out.println("Today is Saturday");
                break;
            case Day.SUNDAY:
                out.println("Today is Sunday");
                break;
        }

    }
}
