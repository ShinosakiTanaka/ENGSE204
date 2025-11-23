import java.util.Scanner;
public class lab1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if (m == 1)
            System.out.println("Americano");
        else if (m == 2)
            System.out.println("Latte");
        else if (m == 3)
            System.out.println("Espresso");
        else if (m == 4)
            System.out.println("Mocha");
        else
            System.out.println("Invalid Menu");
        sc.close();
 }
}
