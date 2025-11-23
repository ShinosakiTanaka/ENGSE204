package lab1;

import java.util.Scanner;

public class lab1_2 {

    public static double readDimension(Scanner sc) {
        double value = sc.nextDouble(); 
        return value;                    
    }

    public static double calculateRectangleArea(double width, double height) {
        double area = width * height;   
        return area;                    
    }

    public static void printArea(double area) {
        System.out.println(area);  
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double width  = readDimension(input);
        double height = readDimension(input); 

        double rectangleArea = calculateRectangleArea(width, height);

        printArea(rectangleArea);

        input.close();
    }
}
