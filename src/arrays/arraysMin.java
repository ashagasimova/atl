package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arraysMin {
    public static void main(String[] args) {

        int[] arr = new int[5];

        Scanner scanner = new Scanner(System.in);
        for (var i=0 ; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for (var i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if (arr[i]>max){
                max=arr[i];
            }

        }System.out.println("max=" + max);
        System.out.println("min=" + min);

    }
}
