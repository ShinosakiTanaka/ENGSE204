package lab1_11;
import java.util.Scanner;
public class lab1_11 {
    public static int sumArray(int[] numbers) {
     int sum = 0;
     for (int i = 0; i < numbers.length; i++) {
        sum = sum + numbers[i];
    }

        return sum;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] data = new int[n];
    for (int i = 0; i < n; i++) {
        data[i] = sc.nextInt();
        }
    int result = sumArray(data);
    System.out.println(result);
    sc.close();
    }
}

