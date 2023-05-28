import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) throws IOException {
        File file = new File("scores.txt");
        if (file.exists()) {
            System.out.println("File alredy exists");
            System.exit(1);
        }
        PrintWriter output = new PrintWriter(file);
        output.print("Dinh Van Son ");
        output.println(25);
        output.print("Eric K Jones ");
        output.print(85);
        output.close();
        boolean isDeleted = file.delete();
        System.out.println(isDeleted);
    }
}
