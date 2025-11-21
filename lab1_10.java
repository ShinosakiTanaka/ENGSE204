package lab1_10;

import java.util.Scanner;

public class lab1_10 {

    public static double calculateArea(double width, double height) {
        double area = width * height;
        return area;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double width = sc.nextDouble();
        double height = sc.nextDouble();

        double result = calculateArea(width, height);

        System.out.println(result);

        sc.close();
    }
}
