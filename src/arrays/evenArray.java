package arrays;

import java.util.Scanner;

public class evenArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (var i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (var i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

    }

}