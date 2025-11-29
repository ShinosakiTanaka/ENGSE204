package lab2;

import java.util.Scanner;

class Student {

    String studentId;
    String name;

    void displayInfo() {
        System.out.println(studentId);
        System.out.println(name);
    }
}

public class lab2_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student std = new Student();

        std.studentId = sc.nextLine();
        std.name = sc.nextLine();

        std.displayInfo();

        sc.close();
    }
}
