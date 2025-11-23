package lab1_6;
import java.util.Scanner;
public class lab1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 12; i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
        sc.close();
    }
}


