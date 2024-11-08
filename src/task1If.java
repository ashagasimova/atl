import java.util.Scanner;

public class task1If {
    public static void main(String[] args) {
        System.out.println("eded daxil edin");
        Scanner scanner = new Scanner(System.in);
        var eded = scanner.nextInt();
        if (eded%4==0 && eded%6==0)
        {
            System.out.println("eded 4-e ve 6-ya bolunur");
        }else{
            System.out.println("eded 4-e ve 6-ya bolunmur");
        }
    }
}
