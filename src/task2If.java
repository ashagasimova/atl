import java.util.Scanner;

public class task2If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("eded daxil edin");
        var a = scanner.nextInt();
        if (a%3==0 && a%4==0){
            System.out.println("eded 3-e ve ya 4-e bolunur.");
        }else {
            System.out.println("eded 3-e ve 4-e bolunmur");
        }
    }
}
