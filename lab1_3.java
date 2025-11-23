package lab1_3;
import java.util.Scanner;
public class lab1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        String result;
        if (number % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }
        System.out.println(result);
        sc.close();
    }
}

