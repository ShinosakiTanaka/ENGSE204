package lab2_9;

class TempConverter {

    // แปลงจากองศาเซลเซียสเป็นฟาเรนไฮต์
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    // แปลงจากองศาฟาเรนไฮต์เป็นเซลเซียส
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}

public class lab2_9 {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        // รับโหมด และอุณหภูมิ
        String mode = sc.nextLine().trim();   // "C_TO_F" หรือ "F_TO_C"
        double temp = sc.nextDouble();

        double result;

        if (mode.equals("C_TO_F")) {
            // C -> F
            result = TempConverter.celsiusToFahrenheit(temp);
        } else if (mode.equals("F_TO_C")) {
            // F -> C
            result = TempConverter.fahrenheitToCelsius(temp);
        } else {
            // เผื่อกรณีโหมดไม่ตรง (ปกติในข้อสอบไม่มีใช้)
            result = 0.0;
        }

        // แสดงผลลัพธ์
        System.out.println(result);

        sc.close();
    }
}
