package lab2_1;
import java.util.Scanner;

public class lab2_1 {
   public static void main(String[] args) {

      Scanner s = new Scanner(System.in);

      String id = s.nextLine();
      String n = s.nextLine();

      Student st = new Student();
      st.studentId = id;
      st.name = n;

      System.out.println(st.studentId);
      System.out.println(st.name);

      s.close();
   }
}
