import java.util.Scanner;

public class tinh_chi_so_can_nang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Your weight (Kg):");
        weight = scanner.nextDouble();

        System.out.println("You height(m):");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.println("Chi so la : " + bmi);

        if (bmi < 18)
            System.out.println("Underwight!");
        else if (bmi < 25.0)
            System.out.println("Normal");
        else if (bmi < 30.0)
            System.out.println("Overwight");
        else
            System.out.println("Obese");
    }
}
