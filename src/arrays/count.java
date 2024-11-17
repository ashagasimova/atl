package arrays;

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("arrayin elementlerin daxil edin:");
        int [] arr = new int[5];

        for (var i=0; i< arr.length; i++ ){
            arr[i] = scanner.nextInt();
        }

        System.out.println("eded daxil edin: ");
        int eded = scanner.nextInt();
        int count = 0;
        for (var i=0; i<arr.length; i++){
            if(eded==arr[i]){
                count++;
            }
        }
        System.out.println("tekrar sayi=" + count);

    }
}
