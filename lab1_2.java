package lab1;
import java.util.Scanner;
public class lab1_2 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      double width = input.nextDouble();
      double height = input.nextDouble();

      double rectangleArea = width * height;

     System.out.println(rectangleArea);
     input.close();
  }
}
