package lab2_10;

import java.util.Scanner;

// คลาส Product
class Product {
    String name;
    double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

// คลาส ShoppingCart
class ShoppingCart {
    Product[] items = new Product[10];   // เก็บสินค้าได้มากสุด 10 ชิ้น
    int itemCount = 0;                   // จำนวนสินค้าที่มีอยู่จริง

    // เมธอดเพิ่มสินค้า
    public void addProduct(Product p) {
        items[itemCount] = p;
        itemCount++;
    }

    // เมธอดรวมราคารวมทั้งหมด
    public double calculateTotalPrice() {
        double sum = 0.0;
        for (int i = 0; i < itemCount; i++) {
            sum += items[i].price;
        }
        return sum;
    }
}

public class lab2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // จำนวนสินค้าที่ต้องการเพิ่มลงตะกร้า
        sc.nextLine();

        ShoppingCart cart = new ShoppingCart();

        for (int i = 0; i < N; i++) {
            String name = sc.nextLine();     // ชื่อสินค้า
            double price = sc.nextDouble();  // ราคา
            sc.nextLine();
            
            Product p = new Product(name, price);
            cart.addProduct(p);
        }

        // แสดงผลรวมราคาทั้งหมด
        System.out.println(cart.calculateTotalPrice());

        sc.close();
    }
}
