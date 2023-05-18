import java.util.Map;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        String text = "Lua nep la lua nep lang, lua len lop lop ca lang nang nang";
        String[] words = text.split("\\W+");
        Map<String, Integer> wordCounts = new TreeMap<>();
        for (String word : words) {
            String wordLower = word.toLowerCase();
            Integer count = wordCounts.get(wordLower);
            if (count == null) {
                count = 0;
            }
            wordCounts.put(wordLower, count + 1);
        }
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
