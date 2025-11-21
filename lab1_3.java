package lab1_3;

import java.util.Scanner;

public class lab1_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // อ่านค่าบรรทัดเดียวแล้วแปลงเป็นจำนวนเต็ม
        int number = Integer.parseInt(input.nextLine().trim());

        // เช็คว่าเลขคู่หรือคี่
        String result = (number % 2 == 0) ? "Even" : "Odd";

        // แสดงผลลัพธ์
        System.out.println(result);

        input.close();
    }
}
