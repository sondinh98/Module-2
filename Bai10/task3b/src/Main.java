public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list.get(2));
        list.remove(3);
        System.out.println(list.size());
        list.add(25);
        System.out.println(list.get(2));
        System.out.println(list.contains(30));
        list.clear();
        System.out.println(list.isEmpty());
    }
}
