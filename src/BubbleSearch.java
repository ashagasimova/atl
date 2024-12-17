public class BubbleSearch {
    public static void main(String[] args) {
        int [] arr = {6,2,14,8,5,29,21,32};
        int eded;

        for (int i =0; i< arr.length-1; i++){
            for (int j=0; j<arr.length-i-1; j++){
                if (arr[j]>arr[j+1]){
                    eded=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = eded;
                }
            }
        } for (int e:arr){
            System.out.println(e);
        }
    }
}
