import java.util.Scanner;
public class simmetrik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("4 reqemli eded daxil edin");
        int a = scanner.nextInt();
        int ilk = a/100;
        int onluq = a%100/10;
        int teklik = a%10;
         int son = 10*teklik+onluq;
         boolean simmetrik =(ilk==son);
        System.out.println(simmetrik);
    }
}
