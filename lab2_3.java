package lab2_3;

import java.util.Scanner;

class Student {
    String studentId;
    String name;
    static int studentCount = 0;

    Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        studentCount++;
    }
}

public class lab2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            new Student(id, name);
        }

        System.out.println(Student.studentCount);

        sc.close();
    }
}
