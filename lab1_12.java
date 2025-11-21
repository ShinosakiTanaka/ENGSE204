package lab1_12;

import java.util.Scanner;

public class lab1_12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1) รับจำนวนสินค้า N
        int N = sc.nextInt();

        // 2) สร้าง Array สำหรับ Product ID และ Stock
        int[] productID = new int[N];
        int[] stockQty = new int[N];

        // 3) รับข้อมูล Product ID และ Stock
        for (int i = 0; i < N; i++) {
            productID[i] = sc.nextInt();
            stockQty[i] = sc.nextInt();
        }

        // 4) รับ ID ที่ต้องการค้นหา
        int searchID = sc.nextInt();

        // 5) ค้นหา Product ID
        int foundIndex = -1;
        for (int i = 0; i < N; i++) {
            if (productID[i] == searchID) {
                foundIndex = i;
                break;
            }
        }

        // 6) แสดงผลลัพธ์
        if (foundIndex == -1) {
            System.out.println("Product " + searchID + " not found");
        } else {
            System.out.println(stockQty[foundIndex]);
        }

        sc.close();
    }
}
