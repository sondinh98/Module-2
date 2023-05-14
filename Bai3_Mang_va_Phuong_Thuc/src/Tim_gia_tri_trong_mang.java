import java.util.Scanner;

public class Tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Enter a name's student:");
        String input_name = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Not found " + input_name + " in the list.");
        }
    }
}
