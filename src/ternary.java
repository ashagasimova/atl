import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        while (true){
//            int eded = scanner.nextInt();
//            if (eded%eded==0 && eded%2!=0){
//                System.out.println("bu eded sadedir");
//            }else {
//                System.out.println("eded sade deyil");
//            }
//        }
        int eded = scanner.nextInt();
        Boolean sadedir = true;
        for (int n = 2; n < eded; n++) {
            if(eded%n==0){
                sadedir=false;
                break;
            }
        }if ( sadedir ) {
            System.out.println("eded sadedir");
        }else {
            System.out.println("eded sade deyil");
        }
    }
}