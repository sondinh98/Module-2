package fruit;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ManageFruit {
    Scanner scanner = new Scanner(System.in);
    private static ArrayList<Fruit> fruits = loadFruits();

    public void addFruit() {
        String nameRegex = "^[A-Z][a-zA-Z]*([ ][a-zA-Z]*)*$";
        String priceRegex = "^\\d+(\\.\\d+)?$";
        String quantityRegex = "^\\d+$";
        Pattern namePattern = Pattern.compile(nameRegex);
        Pattern pricePattern = Pattern.compile(priceRegex);
        Pattern quantityPattern = Pattern.compile(quantityRegex);

        System.out.println("Nhập tên sản phẩm: ");
        String name;
        while (true) {
            name = scanner.nextLine();
            Matcher matcher = namePattern.matcher(name);
            if (matcher.matches()) {
                break;
            } else {
                System.err.println("Tên sản phẩm không hợp lệ! Hãy nhập lại (chỉ chứa chữ cái, viết thường hoặc viết hoa, và khoảng trắng).");
            }
        }

        System.out.println("Nhập giá sản phẩm: ");
        double price;
        while (true) {
            String input = scanner.nextLine();
            Matcher matcher = pricePattern.matcher(input);
            if (matcher.matches()) {
                price = Double.parseDouble(input);
                if (price >= 0) {
                    break;
                } else {
                    System.err.println("Giá sản phẩm không hợp lệ! Hãy nhập lại (số thập phân không âm).");
                }
            } else {
                System.err.println("Giá sản phẩm không hợp lệ! Hãy nhập lại (số thập phân không âm).");
            }
        }

        System.out.println("Nhập số lượng sản phẩm: ");
        int quantity;
        while (true) {
            String input = scanner.nextLine();
            Matcher matcher = quantityPattern.matcher(input);
            if (matcher.matches()) {
                quantity = Integer.parseInt(input);
                if (quantity >= 0) {
                    break;
                } else {
                    System.err.println("Số lượng sản phẩm không hợp lệ! Hãy nhập lại (số nguyên không âm).");
                }
            } else {
                System.err.println("Số lượng sản phẩm không hợp lệ! Hãy nhập lại (số nguyên không âm).");
            }
        }

        System.out.println("Mô tả sản phẩm: ");
        String description = scanner.nextLine();

        Fruit fruit = new Fruit(name, price, quantity, description);
        fruits.add(fruit);

        System.out.println("Thêm sản phẩm thành công");

        sortByName();
        saveFruit(fruits);
        showFruit();
    }

    public void showFruit() {
        System.out.printf("%3s%25s%25s%25s%35s", "ID", "Tên sản phẩm", "Giá cả", "Số lượng", "Mô tả\n");
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }

    }

    public void editFruit() {
        System.out.println("Nhập tên sản phẩm bạn muốn thay đổi: ");
        String name = scanner.nextLine();
        for (Fruit fruit : fruits) {
            if (fruit.getName().equalsIgnoreCase(name)) {
                System.out.println("Nhập giá mới của sản phẩm: ");
                double price = Double.parseDouble(scanner.nextLine());
                fruit.setPrice(price);
                System.out.println("Nhập số lượng mới của sản phẩm: ");
                int quantity = Integer.parseInt(scanner.nextLine());
                fruit.setQuantity(quantity);
                System.out.println("Nhập mô tả mới của sản phẩm: ");
                String descreiption = scanner.nextLine();
                fruit.setDescription(descreiption);
                System.out.println("Cập nhập sản phầm thành công");
                break;
            }
        }

        sortByName();
        saveFruit(fruits);
        showFruit();
    }

    public void deleteFruit() {
        System.out.println("Nhập tên sản phẩm bạn muốn xóa: ");
        String name = scanner.nextLine();
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).getName().equalsIgnoreCase(name)) {
                fruits.remove(i);
                System.out.println("Xóa sản phẩm thành công");
                break;
            }
        }

        sortByName();
        saveFruit(fruits);
        showFruit();
    }

    public void sortByPriceAscending() {
        Comparator<Fruit> priceAsc = new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        };
        Collections.sort(fruits, priceAsc);
        showFruit();
    }

    public void sortByPriceDescending() {
        Comparator<Fruit> priceDes = new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return Double.compare(o2.getPrice(), o1.getPrice());
            }
        };
        Collections.sort(fruits, priceDes);
        showFruit();
    }

    public void searchByName() {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm: ");
        String name = scanner.nextLine();
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).getName().equalsIgnoreCase(name)) {
                System.out.printf("%3s%25s%25s%25s%35s", "ID", "Tên sản phẩm", "Giá cả", "Số lượng", "Mô tả\n");
                System.out.println(fruits.get(i));
                break;
            }
        }
    }
    public void searchById() {
        System.out.println("Nhập id sản phẩm muốn tìm: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < fruits.size(); i ++) {
            if (fruits.get(i).getId() == id) {
                System.out.printf("%3s%25s%25s%25s%35s", "ID", "Tên sản phẩm", "Giá cả", "Số lượng", "Mô tả\n");
                System.out.println(fruits.get(i));
                break;
            }
        }
    }

    public static ArrayList<Fruit> loadFruits() {
        ArrayList<Fruit> fruitsList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader("fruit.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                int id = Integer.parseInt(strings[0]);
                String name = strings[1];
                double price = Double.parseDouble(strings[2]);
                int quantity = Integer.parseInt(strings[3]);
                String description = strings[4];
                Fruit fruit = new Fruit(name, price, quantity, description);
                fruitsList.add(fruit);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fruitsList;
    }

    public static void saveFruit(ArrayList<Fruit> fruits) {
        File file = new File("fruit.txt");
        if (file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Fruit fruit : fruits) {
                bufferedWriter.write(fruit.getId() + "," + fruit.getName() + "," + fruit.getPrice() + "," + fruit.getQuantity() + "," + fruit.getDescription());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void sortByName() {
        Comparator<Fruit> nameComparator = new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Collections.sort(fruits, nameComparator);
    }
    public void buyFruit() {
        while (true) {
            System.out.println("Nhập tên sản phẩm muốn mua: ");
            String name = scanner.nextLine();
            for (int i = 0; i < fruits.size(); i++) {
                if (fruits.get(i).getName().equalsIgnoreCase(name)) {
                    while (true) {
                        System.out.println("Nhập số lượng muốn mua: ");
                        int quantity = Integer.parseInt(scanner.nextLine());
                        if (quantity > fruits.get(i).getQuantity()) {
                            System.err.println("Số lượng sản phẩm không đủ để bán!");
                            continue;
                        }
                        double totalPrice = fruits.get(i).getPrice() * quantity;
                        fruits.get(i).setQuantity(fruits.get(i).getQuantity() - quantity);
                        System.out.println("Bạn đã mua thành công " + quantity + " " + fruits.get(i).getName() + " với tổng giá là " + totalPrice);
                        saveFruit(fruits);
                        return;
                    }
                }
            }
            System.err.println("Không tìm thấy sản phẩm cần mua!");
        }
    }

}
