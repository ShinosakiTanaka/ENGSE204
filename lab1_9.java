package lab1_9;
import java.util.Scanner;
public class lab1_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            double number = input.nextDouble();
            total += number;
        }
        double average = total / n;
        System.out.println(average);
        input.close();
    }
}
