package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class sumArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (var i=0; i< arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        double average = 1;
        for (var i = 0;i<arr.length; i++){
            sum+=arr[i];
            average=sum/arr.length;
        }
        System.out.println("sum=" + sum);
        System.out.println("average=" + average);

    }
}
