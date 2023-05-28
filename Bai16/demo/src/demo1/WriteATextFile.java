import java.io.FileWriter;
import java.io.IOException;

public class WriteATextFile {
    public static void main(String[] args) {
        try {
            FileWriter witer = new FileWriter("E:\\Project_md2\\Bai16\\demo\\src\\Hello.txt");
            witer.write("Hello!");
            witer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
