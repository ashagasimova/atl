package Human;

public class Star {
    public static void main(String[] args) {
        String s = "*";
        for (int i =1; i<=5; i++) {
            for (int j=0; j<i; j++){
                System.out.print(s);
                } for (int k=1; k<i; k++){
                System.out.print(" ");
            }
            System.out.println();
        }

        }
    }
