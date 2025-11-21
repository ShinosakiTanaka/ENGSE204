package lab1_13;

import java.util.Scanner;

public class lab1_13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();   // จำนวนแถว
        int C = sc.nextInt();   // จำนวนคอลัมน์

        int[][] grid = new int[R][C];

        // อ่านค่า 0/1 ทั้งหมดใส่ลงใน array 2 มิติ
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int count = 0;

        // นับจำนวนเซิร์ฟเวอร์ที่เป็น 1 (Online)
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid[i][j] == 1) {
                    count++;
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}
