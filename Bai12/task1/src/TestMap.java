import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Dung", 18);
        hashMap.put("Linh", 16);
        hashMap.put("Ngoc", 25);
        hashMap.put("Anh", 21);
//        hashMap.put(23, "Duy");
//        hashMap.put(16, "Long");
//        hashMap.put(21, "Tai");
//        hashMap.put(20, "Tuan");
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Long", 15);
        linkedHashMap.put("Quan", 20);
        linkedHashMap.put("Toan", 11);
        linkedHashMap.put("Trang", 18);
        linkedHashMap.put("Tuan", 32);
        System.out.println("\nThe age for " + "Trang ís " + linkedHashMap.get("Trang"));
    }
}
