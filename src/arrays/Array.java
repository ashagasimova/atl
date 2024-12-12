package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ilk arrayin uzunlugu: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        System.out.print("Arrayin elementlerini daxil edin: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.print("Ikinci arrayin uzunlugunu ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];

        if (size1 < size2) {
            for (int i = 0; i < size1; i++) {
                arr2[i] = arr1[i];
            }
            for (int i = size1; i < size2; i++) {
                arr2[i]= scanner.nextInt();
            }
        }
        else {
            for(int i = 0; i<size2; i++){
                arr2[i]=arr1[i];
            }
        }
        System.out.println(Arrays.toString(arr2));

    }
}

