package QuadraticEquation;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        Pt_bac2 equation = new Pt_bac2(a,b,c);
        double delta = equation.getDiscriminant();
        if (delta > 0) {
            System.out.println("Co 2 nghiem la " + equation.getRoot1() + " va " + equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Pt co 1 nghiem kep la : " + equation.getRoot());
        } else {
            System.out.println("Pt vo nghiem");
        }
    }
}
