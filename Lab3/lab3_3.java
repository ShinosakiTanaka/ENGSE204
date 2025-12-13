import java.util.Scanner;

class User {
    private String PASSWORD;

    public User(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getPassword() {
        return PASSWORD;
    }

    public void setPassword(String NEWPASSWORD) {
        if (NEWPASSWORD.length() >= 8) {
            PASSWORD = NEWPASSWORD;
            System.out.println("Password updated.");
        } else {
            System.out.println("Password is too short.");
        }
    }
}

public class lab3_3 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        String INITIALPASSWORD = SC.nextLine();
        String NEWPASSWORD = SC.nextLine();

        User USER = new User(INITIALPASSWORD);
        USER.setPassword(NEWPASSWORD);
        System.out.println(USER.getPassword());
    }
}
