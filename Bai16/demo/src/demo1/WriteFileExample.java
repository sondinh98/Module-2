import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("E:\\Project_md2\\Bai16\\demo\\src\\file.txt")) {
            writer.write("This is a text file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}