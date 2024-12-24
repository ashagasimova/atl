package Resource;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileR {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("C:\\Users\\ashag\\IdeaProjects\\Atl Project\\src\\Resource\\resource");
        writer.write("Asha Gasimova");
        writer.close();

        FileReader reader = new FileReader("C:\\Users\\ashag\\IdeaProjects\\Atl Project\\src\\Resource\\resource");
        int data;
        while ((data = reader.read())!=-1){
            System.out.print((char)data);
        }
        reader.close();
    }

}
