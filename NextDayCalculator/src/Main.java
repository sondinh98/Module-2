import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nextDay = NextDayCalculator.getNextDay(31, 12, 2021);
        System.out.println("Next day: " + nextDay);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day: ");
        int day = scanner.nextInt();
        System.out.println("Enter month: ");
        int month = scanner.nextInt();
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        String nextDay1 = NextDayCalculator.getNextDay(day,month,year);
        System.out.println("Next day: " + nextDay1);
    }
}
