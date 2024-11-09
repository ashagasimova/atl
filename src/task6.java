import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Odeyeceyiniz meblegi daxil edin: ");
        var umumiMebleg = scanner.nextDouble();
        if (100 <= umumiMebleg && 300 >= umumiMebleg) {
            System.out.println("5% endirim qazandiniz! Sizin odeyeceyiniz mebleg:  "
                    + (umumiMebleg - (0.05 * umumiMebleg))+"AZN");
        } else if (300 < umumiMebleg && 500 >= umumiMebleg) {
            System.out.println("10% endirim qazandiniz! Sizin odeyeceyiniz mebleg:  "
                    + (umumiMebleg - (0.1 * umumiMebleg))+"AZN");
        }else if (500 < umumiMebleg && 800 >= umumiMebleg) {
            System.out.println("15% endirim qazandiniz! Sizin odeyeceyiniz mebleg:   " +
                    + (umumiMebleg - (0.15 * umumiMebleg)) + "AZN");
        } else if (800 < umumiMebleg && 1000 >= umumiMebleg) {
            System.out.println("20% endirim qazandiniz! Sizin odeyeceyiniz mebleg:  "
                    + (umumiMebleg - (0.2 * umumiMebleg))+"AZN");
        }else {
            System.out.println("Sevh secim");
        }
    }
}
