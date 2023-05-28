import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadATextFile {
    public static void main(String[] args) {
        try {
            File inFile = new File("E:\\Project_md2\\Bai16\\demo\\src\\Hello.txt");
            FileReader fileReader = new FileReader(inFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
