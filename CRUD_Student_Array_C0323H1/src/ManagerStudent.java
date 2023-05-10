import java.util.Scanner;

public class ManagerStudent {
    Student[] students = new Student[2];
    Scanner scanner = new Scanner(System.in);

    ManagerStudent() {
        students[0] = new Student(1, "Tung", 20);
        students[1] = new Student(2, "Vuong", 21);
    }
    public void show() {
        for (Student s: students) {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("           " + s.getId() + " - " + s.getName() + " - " + s.getAge());
        }
    }
    public Student createStudent() {
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap name: ");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.parseInt(scanner.nextLine());

        Student student = new Student(id, name, age);
        return student;
    }
    public void add() {
        Student student = createStudent();
        Student[] newStudents = new Student[students.length + 1];
        newStudents[newStudents.length - 1] = student;
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        students = newStudents;
    }
    public void edit() {
        System.out.println("Nhap id muon sua: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Nhap name: ");
                String name = scanner.nextLine();
                System.out.println("Nhap age: ");
                int age = Integer.parseInt(scanner.nextLine());

                s.setName(name);
                s.setAge(age);
                return;
            }
        }
        System.out.println("      Khong tim thay id can sua");
    }
    public void delete() {
        System.out.println("Nhap id muon xoa: ");
        int id = Integer.parseInt(scanner.nextLine());
        int index = findIndexById(id);
        if (index != -1) {
            Student[] newStudens = new Student[students.length -1];
            for (int i = 0; i < newStudens.length; i++) {
                if (i < index) {
                    newStudens[i] = students[i];
                } else {
                    newStudens[i] = students[i+1];
                }
            }
            students = newStudens;
        } else {
            System.err.println("         Khong tim thay id can xoa");
        }
    }
    public int findIndexById(int id) {
        for (int i = 0; i < students.length; i ++) {
            if (students[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }
    public void findByName() {
        System.out.println("Nhap ten can tim: ");
        String name = scanner.nextLine();
        boolean check = false;
        for (Student s : students) {
            if (s.getName().equals(name)) {
                System.out.println(s.getId() + " - " + s.getName() + " - " + s.getAge());
                check = true;
            }
        }
        if (!check) {
            System.out.println("      Khong tim thay ten tuong tu");
        }
    }
    public void sortByAge() {
        for (int i = 0; i < students.length -1; i ++) {
            for (int j = i+1; j < students.length; j ++) {
                if (students[i].getAge() > students[j].getAge()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] =  temp;
                }
            }
        }
    }
}
