import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerStudent managerStudent = new ManagerStudent();
        while (true) {
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Quan Ly Sinh Vien");
            System.out.println("0. Thoat");
            System.out.println("1. Hien thi");
            System.out.println("2. Them sinh vien");
            System.out.println("3. Sua sinh vien");
            System.out.println("4. Xoa sinh vien");
            System.out.println("5. Tim kiem sinh vien");
            System.out.println("6. Sap xep theo tuoi");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    managerStudent.show();
                    break;
                case 2:
                    managerStudent.add();
                    break;
                case 3:
                    managerStudent.edit();
                    break;
                case 4:
                    managerStudent.delete();
                    break;
                case 5:
                    managerStudent.findByName();
                    break;
                case 6:
                    managerStudent.sortByAge();
                    break;
                case 0:
                    System.exit(0);
            }
        }

    }
}