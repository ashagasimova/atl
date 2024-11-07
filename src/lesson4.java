import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int yuzluk = a/100;
        int onluq = a%100/10;
        int teklik = a%10;
        boolean b=(yuzluk==teklik);
        System.out.println(b);

        String s5 = "34";
        int v = Integer.parseInt(s5);
        int num=v+5;

    }
}
