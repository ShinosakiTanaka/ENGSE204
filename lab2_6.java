package lab2_6;

import java.util.Scanner;

class BankAccount {
    // Attributes
    private String ownerName;
    private double balance;

    // Constructor
    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    // Method: ฝากเงิน (ไม่ต้อง return ค่า)
    public void deposit(double amount) {
        balance += amount;
    }

    // Method: แสดงสรุปผล
    public void displaySummary() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: " + balance);
    }
}

public class lab2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับชื่อเจ้าของบัญชี (มีช่องว่าง ใช้ nextLine)
        String ownerName = sc.nextLine();
        // รับยอดเริ่มต้น
        double initialBalance = sc.nextDouble();
        // รับจำนวนเงินที่จะฝากเพิ่ม
        double depositAmount = sc.nextDouble();

        // สร้างอ็อบเจ็กต์ BankAccount
        BankAccount account = new BankAccount(ownerName, initialBalance);

        // ฝากเงิน
        account.deposit(depositAmount);

        // แสดงผลลัพธ์
        account.displaySummary();

        sc.close();
    }
}
