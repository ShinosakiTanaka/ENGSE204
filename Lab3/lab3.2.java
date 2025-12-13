package lab3;

import java.util.Scanner;

class Player {
    private int SCORE;

    public Player(int INITIALSCORE) {
        SCORE = INITIALSCORE;
    }

    public int getScore() {
        return SCORE;
    }

    public void setScore(int NEWSCORE) {
        SCORE = NEWSCORE;
    }
}

public class lab3_2 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        int INITIAL = SC.nextInt();
        int UPDATE = SC.nextInt();

        Player P = new Player(INITIAL);
        P.setScore(UPDATE);

        System.out.println(P.getScore());
    }
}
