package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("research.txt");
        writer.write("Asha Gasimova");
        writer.close();

        FileReader reader = new FileReader("research.txt");
        int data;
        while ((data = reader.read())!=-1){
            System.out.print((char)data);
        }
        reader.close();
    }
}
