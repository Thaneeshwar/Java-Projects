import java.util.*;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("2+2?");
        if (sc.nextInt() == 4) score++;

        System.out.println("3+3?");
        if (sc.nextInt() == 6) score++;

        System.out.println("Score: " + score);
    }
}
