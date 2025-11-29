package lab2_5;

import java.util.Scanner;

class Rectangle {

    // Attributes
    double width;
    double height;

    // Constructor
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method คำนวณพื้นที่
    double getArea() {
        return width * height;
    }

    // Method คำนวณเส้นรอบรูป
    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class lab2_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double width = input.nextDouble();
        double height = input.nextDouble();

        Rectangle box = new Rectangle(width, height);

        System.out.println(box.getArea());
        System.out.println(box.getPerimeter());

        input.close();
    }
}
