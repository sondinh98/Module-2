import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProductManager {
    private List<Product> productList;
    private Scanner scanner;
    private BufferedWriter writer;
    private BufferedReader reader;

    public ProductManager() {
        productList = new ArrayList<>();
        scanner = new Scanner(System.in);
//        productList.add(new Product("123456", "Quần Jean", 190000, 100, "Quần Jean nam nữ cao cấp"));
//        productList.add(new Product("123455", "Áo T-Shirt", 150000, 150, "Áo T-shirt mát mẻ"));
//        productList.add(new Product("123454", "Áo Thun Nam", 99000, 200, "Áo Thun giữ nhiệt"));
//        productList.add(new Product("123443", "Áo Sơ Mi", 199000, 50, "Áo sơ mi cổ tàu"));
//        productList.add(new Product("123452", "Áo Polo Nam", 100000, 150, "Áo Polo bassic"));
//        productList.add(new Product("123451", "Quần Tây", 149000, 250, "Quần nam lịch sự và sang trọng"));
//        productList.add(new Product("123450", "Quần Kaki", 179000, 150, "Quần nam được ưa chuộng "));

    }


    public void run() {
        while (true) {
            System.out.println("Menu: ");
            System.out.println("1.Xem danh sách sản phẩm");
            System.out.println("2.Thêm sản phẩm mới");
            System.out.println("3.Sửa thông tin sản phẩm");
            System.out.println("4.Xóa sản phẩm ");
            System.out.println("5.Sắp xếp sản phẩm");
            System.out.println("6.Tìm sản phẩm có giá trị đắt nhất");
            System.out.println("7.Đọc từ file");
            System.out.println("8.Ghi vào file");
            System.out.println("0.Thoát");
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.err.println("Nhập sai định dạng. Vui lòng nhập lại");
                continue;
            }
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    showProductList();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    editProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    sortProduct();
                    break;
                case 6:
                    searchProductMax();
                    break;
                case 7:
                    readProductsFromFile();
                    break;
                case 8:
                    writeProductsToFile();
                    break;
            }
        }
    }

    private void showProductList() {
        if (productList.isEmpty()) {
            System.out.println("Danh sách sản phẩm rỗng");
            return;
        }
        int startIndex = 0;
        while (startIndex < productList.size()) {
            int endIndex = Math.min(startIndex + 5, productList.size());
            System.out.printf("%-20s%-20s%-20s%-20s%-25s", "ID", "Tên Sản Phẩm", "Giá Sản Phẩm", "Số Lượng", "Mô tả\n");
            System.out.println();
//            for (Product product : productList) {
//                System.out.println(product);
//            }
            for (int i = startIndex; i < endIndex; i++) {
                System.out.printf(
                        "%-20s%-20s%-20.0f%-20d%-25s", productList.get(i).getId(),
                        productList.get(i).getName(),
                        productList.get(i).getPrice(),
                        productList.get(i).getQuantity(),
                        productList.get(i).getDescription()
                );
                System.out.println();
            }
            if (endIndex == productList.size()) {
                break;
            }
            System.out.println("Nhấn Enter để xem tiếp hoặc nhập 0 để quay lại menu");
            String choice = scanner.nextLine();
            if ("0".equals(choice)) {
                return;
            }
            startIndex += 5;
        }
    }

    private void addProduct() {
        String nameRegex = "^[A-Z][a-zA-Z]*([ ][a-zA-Z]*)*$";
        String priceRegex = "^\\d+(\\.\\d+)?$";
        String quantityRegex = "^\\d+$";
        Pattern namePattern = Pattern.compile(nameRegex);
        Pattern pricePattern = Pattern.compile(priceRegex);
        Pattern quantityPattern = Pattern.compile(quantityRegex);
        String productId;
        boolean isProductIdValid = false;
        boolean isProductIdUnique = true;
        do {
            System.out.print("Nhập ID sản phẩm (6 chữ số): ");
            productId = scanner.nextLine();
            if (productId.matches("^\\d{6}$")) {
                isProductIdValid = true;
                // Kiểm tra xem ID đã tồn tại trong danh sách hay chưa
                for (Product product : productList) {
                    if (product.getId().equals(productId)) {
                        isProductIdUnique = false;
                        System.err.println("ID đã tồn tại trong danh sách. Vui lòng nhập lại.");
                        break;
                    }
                }
            } else {
                System.err.println("ID không đúng định dạng. Vui lòng nhập lại.");
            }
        } while (!isProductIdValid || !isProductIdUnique);

        System.out.println("Nhập tên sản phẩm: ");
        String productName;
        while (true) {
            productName = scanner.nextLine();
            Matcher matcher = namePattern.matcher(productName);
            if (matcher.matches()) {
                break;
            } else {
                System.err.println("Tên sản phẩm không hợp lệ! Hãy nhập lại (chỉ chứa chữ cái, viết thường hoặc viết hoa, và khoảng trắng).");
            }
        }
        System.out.println("Nhập giá sản phẩm: ");
        double productPrice;
        while (true) {
            String input = scanner.nextLine();
            Matcher matcher = pricePattern.matcher(input);
            if (matcher.matches()) {
                productPrice = Double.parseDouble(input);
                if (productPrice >= 0) {
                    break;
                } else {
                    System.err.println("Giá sản phẩm không hợp lệ! Hãy nhập lại (số thập phân không âm).");
                }
            } else {
                System.err.println("Giá sản phẩm không hợp lệ! Hãy nhập lại (số thập phân không âm).");
            }
        }

        System.out.println("Nhập số lượng sản phẩm: ");
        int productQuantity;
        while (true) {
            String input = scanner.nextLine();
            Matcher matcher = quantityPattern.matcher(input);
            if (matcher.matches()) {
                productQuantity = Integer.parseInt(input);
                if (productQuantity >= 0) {
                    break;
                } else {
                    System.err.println("Số lượng sản phẩm không hợp lệ! Hãy nhập lại (số nguyên không âm).");
                }
            } else {
                System.err.println("Số lượng sản phẩm không hợp lệ! Hãy nhập lại (số nguyên không âm).");
            }
        }

        System.out.println("Mô tả sản phẩm: ");
        String productDescription = scanner.nextLine();
        Product product = new Product(productId, productName, productPrice, productQuantity, productDescription);
        productList.add(product);
        System.out.println("Thêm sản phẩm thành công");
    }

    private void editProduct() {
        System.out.println("Nhập mã sản phẩm cần sửa: ");
        String id = scanner.nextLine();

        for (Product product : productList) {
            if (product.getId().equals(id)) {
                System.out.println("Nhập tên sản phẩm mới: ");
                String name = scanner.nextLine();
                product.setName(name);
                System.out.println("Nhập giá sản phẩm mới: ");
                double price = Double.parseDouble(scanner.nextLine());
                product.setPrice(price);
                System.out.println("Nhập số lượng sản phẩm mới: ");
                int quantity = Integer.parseInt(scanner.nextLine());
                product.setQuantity(quantity);
                System.out.println("Nhập mô tả sản phẩm mới: ");
                String description = scanner.nextLine();
                product.setDescription(description);
                System.out.println("Sửa thông tin sản phẩm thành công");
                return;
            }
        }

        System.out.println("Không tìm thấy sản phẩm");
    }

    private void deleteProduct() {
        System.out.println("Nhập mã sản phẩm cần xóa: ");
        String id = scanner.nextLine();

        for (Product product : productList) {
            if (product.getId().equals(id)) {
                productList.remove(product);
                System.out.println("Xóa sản phẩm thành công");
                return;
            }
        }

        System.out.println("Không tìm thấy sản phẩm");
    }

    private void sortByPriceAscending() {
        Comparator<Product> productComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        };
        Collections.sort(productList, productComparator);
        System.out.println("Các sản phẩm đang sắp xếp theo giá tăng dần");
        showProductList();
    }

    public void sortByPriceDescending() {
        Comparator<Product> priceDes = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o2.getPrice(), o1.getPrice());
            }
        };
        Collections.sort(productList, priceDes);
        System.out.println("Các sản phẩm đang sắp xếp theo giá giảm dần");
        showProductList();
    }
    public void sortProduct() {
        while (true) {
            System.out.println("1.Sắp xếp theo giá tăng dần");
            System.out.println("2.Sắp xếp theo giá nhỏ dần");
            System.out.println("3.Quay lại");
            System.out.println("Lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    sortByPriceAscending();
                    break;
                case 2:
                    sortByPriceDescending();
                    break;
                case 3:
                    return;
            }
        }
    }

    private void searchProductMax() {
        Product productMaxPrice = productList.get(0);
        for (int i = 1; i < productList.size(); i++) {
            if (productList.get(i).getPrice() > productMaxPrice.getPrice()) {
                productMaxPrice = productList.get(i);
            }
        }
        System.out.println("Sản phẩm có giá trị đắt nhất trong cửa hàng là: ");
        System.out.printf("%-20s%-20s%-20s%-20s%-25s", "ID", "Tên Sản Phẩm", "Giá Sản Phẩm", "Số Lượng", "Mô tả\n");
        System.out.println();
        System.out.println(productMaxPrice);;
    }

    public void readProductsFromFile() {
        try {
            reader = new BufferedReader(new FileReader("product.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                String id = fields[0];
                String name = fields[1];
                double price = Double.parseDouble(fields[2]);
                int quantity = Integer.parseInt(fields[3]);
                String description = fields[4];
                productList.add(new Product(id, name, price, quantity, description));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    public void writeProductsToFile( ) {
        try {
            writer = new BufferedWriter(new FileWriter("product.txt"));
            for (Product product : productList) {
                String line = String.format("%s,%s,%.2f,%d,%s", product.getId(), product.getName(), product.getPrice(), product.getQuantity(), product.getDescription());
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

