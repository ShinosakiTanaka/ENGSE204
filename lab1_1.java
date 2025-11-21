package lab1;

import java.util.Scanner;

public class lab1_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับความกว้าง
        double width = sc.nextDouble();
        // รับความสูง
        double height = sc.nextDouble();

        // คำนวณพื้นที่
        double area = width * height;

        // แสดงผล
        System.out.println(area);

        sc.close();   // <- เพิ่มบรรทัดนี้ เพื่อลด Warning
    }
}
