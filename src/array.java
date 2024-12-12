import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
       String[][] sinif = new String[2][5];
       sinif[0][0]= "Banu";
       sinif[0][1]= "Omer";
       sinif[0][2] = "Ismail";
       sinif[0][3]= "inci";
       sinif[0][4] = "Umid";

       sinif[1][0] = "Aykhan";
       sinif[1][1] = "Ayan";
       sinif[1][2] = "Asha";
       sinif[1][3] = "Khan";
       sinif[1][4]= "Leila";

        System.out.println(Arrays.toString(sinif[1]));



    }
}
