package lab1_9;

import java.util.Scanner;

public class lab1_9 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); 
        double sum = 0;
        for(int i = 0; i < n; i++){
            double x = kb.nextDouble();
            sum = sum + x; 
        }
        double avg = sum / n;
        System.out.println(avg);
        kb.close();
    }
}
