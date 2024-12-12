import java.util.Scanner;

public class task111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int eded = scanner.nextInt();
//        int sum = 0;
//        while(eded!=0){
//            int qaliq = eded%10;
//            sum +=qaliq;
//            eded/=10;
//
//        }
//        System.out.println(sum);
//       int sum = 0;
//       int reverse = 0;
//        while (eded != 0) {
//            int qaliq = eded%10;
//            reverse = reverse*10+qaliq;
//            eded/=10;
//        }System.out.println(reverse);
//        int sum = 0;
//        while (eded!=0){
//            sum+=eded%10;
//            eded/=10;
//        }System.out.println(sum);
//        var enteredNumber = scanner.nextInt();
//        var result = "";
//        while (enteredNumber /10!=0){
//            result = result + enteredNumber%10;
//            enteredNumber = enteredNumber/10;
//        }
//        var response = Integer.valueOf(result + enteredNumber);
//        System.out.println(response + 1);

//        var enteredNumber = scanner.nextInt();
//        var result = "";
//        while (enteredNumber/10!=0){
//            result = result + enteredNumber%10;
//            enteredNumber = enteredNumber/10;
//        }
//        var response = Integer.valueOf(result + enteredNumber);
//        System.out.println(response+1);
        int [] intArr = {1,5,3,7};
        for (int i = intArr.length-1; i>=0; i--) {
            System.out.println(intArr[i]);
        }



    }
}