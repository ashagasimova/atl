package ArrayTasks;

public class Task1 {
    public static void main(String[] args) {
        int [] arr = {5,9,2,14,3};
        int max = arr[0];
        int min = arr[0];

        for (int i=0; i< arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }

            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Max = " + max + ", Min = " + min );
    }
}
