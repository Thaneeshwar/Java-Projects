import java.util.*;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 1234, bal = 5000;

        if (sc.nextInt() == pin) {
            int ch = sc.nextInt();
            if (ch == 1) bal += sc.nextInt();
            else if (ch == 2) bal -= sc.nextInt();
            System.out.println(bal);
        } else System.out.println("Wrong PIN");
    }
}
