public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        int ilk = 0;
        int son=arr.length-1;
        int mid;
        int number = 3;

        while (ilk<=son){
            mid = (ilk+son)/2;
            if (number>arr[mid]){
                ilk=mid+1;
            }
            else if (number<arr[mid]){
                son=mid-1;
            }
            else {
                System.out.println("eded tapildi " + mid);
                break;
            }
        }
    }
}
