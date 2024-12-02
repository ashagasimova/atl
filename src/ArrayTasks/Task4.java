package ArrayTasks;

public class Task4 {
    public static void main(String[] args) {
        int [] arr = { 5,9,3,12,6};
        int sum = 0;
        int hasil = 1;
        int edediOrta = 1;
        for (int i =0; i< arr.length; i++){
            sum+=arr[i];
            edediOrta = sum/ arr.length;
        }
        System.out.println("Cem:" + sum);
        System.out.println("Ededi orta: " + edediOrta);
    }
}
