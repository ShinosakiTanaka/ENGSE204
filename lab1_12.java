package lab1_12;
import java.util.Scanner;
public class lab1_12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] productID = new int[N];
        int[] stockQty = new int[N];

        for (int i = 0; i < N; i++) {
            productID[i] = sc.nextInt();
            stockQty[i] = sc.nextInt();
        }
        int searchID = sc.nextInt();
        
        int foundIndex = -1;
        for (int i = 0; i < N; i++) {
            if (productID[i] == searchID) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex == -1) {
            System.out.println("Product " + searchID + " not found");
        } else {
            System.out.println(stockQty[foundIndex]);
        }

        sc.close();
    }
}


