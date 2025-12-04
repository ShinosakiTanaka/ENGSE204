package lab2_10;

import java.util.Scanner;


class Product {
    String name;
    double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}


class ShoppingCart {
    Product[] items = new Product[10];
    int itemCount = 0;

    // เมธอดเพิ่มสินค้า
    public void addProduct(Product p) {
        items[itemCount] = p;
        itemCount++;
    }


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

        int N = sc.nextInt();
        sc.nextLine();

        ShoppingCart cart = new ShoppingCart();

        for (int i = 0; i < N; i++) {
            String name = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            
            Product p = new Product(name, price);
            cart.addProduct(p);
        }


        System.out.println(cart.calculateTotalPrice());

        sc.close();
    }
}
