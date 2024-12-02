package ArrayTasks;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int [] arr = {5, 9, 3, 10};
        int [] reversed = new int[arr.length];

        for (int i = 0 ; i<arr.length; i++){
            reversed[i] = arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(reversed));
    }
}
