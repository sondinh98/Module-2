import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        String sourceFilePath = "E:\\Project_md2\\Bai16\\task3\\src\\source.txt";
        String targetFilePath = "E:\\Project_md2\\Bai16\\task3\\src\\target.txt";

        try {
            FileReader reader = new FileReader(sourceFilePath);
            FileWriter writer = new FileWriter(targetFilePath);

            int character;
            int count = 0;

            while ((character = reader.read()) != -1) {
                writer.write(character);
                count++;
            }

            reader.close();
            writer.close();

            System.out.println("File copied successfully!");
            System.out.println("Number of characters copied: " + count);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}