package Resource;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileR {
    public static void main(String[] args) throws IOException {
        final String filePath = "C:\\Users\\ashag\\IdeaProjects\\Atl Project\\src\\Resource\\resource.txt";
        FileWriter writer = new FileWriter(filePath);
        writer.write("Asha Gasimova");
        writer.close();

        FileReader reader = new FileReader(filePath);
        int data;
        while ((data = reader.read())!=-1){
            System.out.print((char)data);
        }
        reader.close();
    }

}
