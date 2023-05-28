import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> sudents = new ArrayList<>();
        sudents.add(new Student(1,"Tran Van A", "Ha Noi"));
        sudents.add(new Student(2,"Nguyen Thi B", "Ha Noi"));
        sudents.add(new Student(3,"Le Thi Kim D", "Ha Noi"));
        sudents.add(new Student(4,"Bui Thi T", "Ha Noi"));
        sudents.add(new Student(5,"Duong Chi T", "Ha Noi"));
        List<Student> students = null;
        writeToFile("E:\\Project_md2\\Bai17\\task2.1\\src\\student.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("student.txt");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }
    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }
}
