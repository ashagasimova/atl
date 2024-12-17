package Tasks;

import LibraryApp.Book;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(foo());

    }


    public static boolean foo(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();//
        boolean b = true;// salam
        for (int i =0; i<str.length(); i++){
            char sol = str.charAt(i);
            char sag = str.charAt(str.length() -1 - i);

            if (sol==sag){
                return b;
            } else {
                return false;
            }
        } return false;
    }
}
