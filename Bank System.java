import java.util.*;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bal = 1000, ch;

        do {
            System.out.println("1.Deposit 2.Withdraw 3.Balance 4.Exit");
            ch = sc.nextInt();

            if (ch == 1) bal += sc.nextInt();
            else if (ch == 2) bal -= sc.nextInt();
            else if (ch == 3) System.out.println(bal);

        } while (ch != 4);
    }
}
