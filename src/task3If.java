import java.util.Scanner;

public class task3If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Imtahan balinizi daxil edin.");
        int bal = scanner.nextInt();
        if (bal>=91 && bal<=100){
            System.out.println("Sizin neticeniz A ");
        } else if(bal>=81 && bal<91){
            System.out.println("Sizin neticeniz B ");
        } else if (bal>=71 && bal<81) {
            System.out.println("Sizin neticeniz C ");
        } else if (bal>=61 && bal<71) {
            System.out.println("Sizin neiceniz D ");
        } else if (bal>=51 && bal<61) {
            System.out.println("Sizin neticeniz E ");
        }else {
            System.out.println("Siz imtahandan kesilmisiniz!");
        }

    }
}
