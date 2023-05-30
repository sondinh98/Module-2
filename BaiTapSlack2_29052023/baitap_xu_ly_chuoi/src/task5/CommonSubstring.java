package task5;

import java.util.*;

public class CommonSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] strings = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }

        Map<String, Integer> substringCounts = new HashMap<>();
        for (String s : strings) {
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j <= s.length(); j++) {
                    String substring = s.substring(i, j);
                    int count = substringCounts.getOrDefault(substring, 0);
                    substringCounts.put(substring, count + 1);
                }
            }
        }

        String mostCommonSubstring = "";
        int mostCommonSubstringCount = 0;
        for (Map.Entry<String, Integer> entry : substringCounts.entrySet()) {
            if (entry.getValue() > mostCommonSubstringCount) {
                mostCommonSubstring = entry.getKey();
                mostCommonSubstringCount = entry.getValue();
            }
        }

        System.out.println("The most common substring is \"" + mostCommonSubstring + "\" with " + mostCommonSubstringCount + " occurrences.");
    }
}
