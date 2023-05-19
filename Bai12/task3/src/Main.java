import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        Student student = new Student("Nam", 10, "HN");
        Student student1 = new Student("Anh", 20, "ND");
        Student student3 = new Student("Manh", 15, "ND");
        Student student2 = new Student("Duy", 25, "ND");

        List<Student> lists = new ArrayList<>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        System.out.println("-------------------------------------------------");
        for (Student st: lists) {
            System.out.println(st.toString());
        }
        System.out.println("-------------------------------------------------");
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sanh theo tuoi:");
        for (Student st : lists) {
            System.out.println(st.toString());
        }

    }
}
