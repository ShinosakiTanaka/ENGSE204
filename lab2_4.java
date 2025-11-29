package lab2_4;

import java.util.Scanner;

class Student {

    String name;
    int midtermScore;
    int finalScore;

    // Constructor รับค่าตอนสร้างออบเจ็กต์
    Student(String name, int midtermScore, int finalScore) {
        this.name = name;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }

    // เมทอดคำนวณคะแนนเฉลี่ย
    double calculateAverage() {
        return (midtermScore + finalScore) / 2.0;
    }

    // เมทอดสรุปผล
    void displaySummary() {
        double avg = calculateAverage();
        String status = (avg >= 50.0) ? "Pass" : "Fail";

        System.out.println("Name: " + name);
        System.out.println("Average Score: " + avg);
        System.out.println("Status: " + status);
    }
}

public class lab2_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int mid = sc.nextInt();
        int fin = sc.nextInt();

        Student s = new Student(name, mid, fin);

        s.displaySummary();

        sc.close();
    }
}
