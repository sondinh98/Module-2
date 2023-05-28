import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\Project_md2\\Bai16\\demo\\src\\file.txt"))){
            writer.write("Toi ten la Dinh Van Son");
            writer.newLine();
            writer.write("This is the second line");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
