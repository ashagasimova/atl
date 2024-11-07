import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String username = "admin";
        if (name.equals(username) ) {
            System.out.println("welcome");
        } else {
            System.out.println("fail");
        }
    }
}
