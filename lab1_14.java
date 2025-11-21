package lab1_14;

import java.util.Scanner;

public class lab1_14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // อ่านขนาดกระดาน R x C
        int R = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine();   // เคลียร์บรรทัด

        // สร้างแผนที่
        char[][] map = new char[R][C];

        // อ่านแผนที่ทีละบรรทัด
        for (int i = 0; i < R; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        // อ่านตำแหน่งที่คลิก
        int targetR = sc.nextInt();
        int targetC = sc.nextInt();

        // ถ้าจุดที่คลิกเป็นระเบิด
        if (map[targetR][targetC] == '*') {
            System.out.println("Mine");
            sc.close();
            return;
        }

        // นับระเบิดรอบ ๆ 8 ทิศ
        int count = 0;

        // บน ซ้าย ขวา ล่าง และทแยงทั้ง 4 มุม
        int[] dR = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dC = {-1,  0,  1,-1, 1,-1, 0, 1};

        for (int k = 0; k < 8; k++) {
            int nr = targetR + dR[k];
            int nc = targetC + dC[k];

            // เช็คไม่ให้ออกนอกขอบกระดาน
            if (nr >= 0 && nr < R && nc >= 0 && nc < C) {
                if (map[nr][nc] == '*') {
                    count++;
                }
            }
        }

        // แสดงจำนวนระเบิดรอบจุดที่คลิก
        System.out.println(count);

        sc.close();
    }
}
