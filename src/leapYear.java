import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        var year = scanner.nextInt();
        if (year%4==0 && year%100!=0 || year%400==0) {
            System.out.println(year + " is leap year.");
        }else {
            System.out.println(year + " isn't leap year.");
        }
    }
}
