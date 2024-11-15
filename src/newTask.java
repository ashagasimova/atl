import java.util.Scanner;

public class newTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Eded daxil edin, dayandirmaq ucun -1 yazin");
            int eded1 = scanner.nextInt();
            if(eded1==-1){
                System.out.println("program bitdi");
                break;
            }
            int f = 1;
            for (var n = eded1; n > 0; n--) {
                f *= n;
            } System.out.println(f);
        }
    }
}
