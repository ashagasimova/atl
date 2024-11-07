import java.util.Scanner;

public class lesson2_ {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
//        1.4 rəqəmli ədəd daxil edin
//        2.hər biri artan sıra ilə düzülübmü yoxlayın
//        3.ekrana true,false qaytarın
//        məsələn: 123 true,324 false

      System.out.println("4 reqemli eded daxil edin");
        int a = scanner.nextInt();
        int minlik = a/1000;
        int yuzluk = a%1000/100;
        int onluq = a%100/10;
        int teklik = a%10;
        boolean artanSira = (teklik>onluq && onluq>yuzluk && yuzluk>minlik);
        System.out.println(artanSira);


    }
}
