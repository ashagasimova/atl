import java.util.Arrays;
import java.util.Scanner;

public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("arrayin elementlerin daxil edin");
        for (var i=0 ; i<arr.length; i++)
                arr[i]= scanner.nextInt();
        System.out.println(Arrays.toString(arr));
}
