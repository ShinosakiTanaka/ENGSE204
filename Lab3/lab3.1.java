import java.util.Scanner;

class User {
    private String USERNAME;

    User(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getUsername() {
        return USERNAME;
    }
}

public class lab3_1 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        String USERNAME = SC.nextLine();

        User USER = new User(USERNAME);

        System.out.println(USER.getUsername());
    }
}
