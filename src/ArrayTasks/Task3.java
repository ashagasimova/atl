package ArrayTasks;

public class Task3 {
    public static void main(String[] args) {
        int [] arr = {5, 6, 12 , 9, 14};
        int a = 1;
        Boolean found = false;
        for (int i=0; i< arr.length; i++){
            if (arr[i] == a) {
                found=true;
                break;
            }
        }
        if (found){
            System.out.println("Daxil etdiyimiz element arrayda movcuddur");
        } else {
            System.out.println("yoxdur");
        }

        }
    }
