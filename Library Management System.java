import java.util.*;

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books = {"Java", "Python", "C++"};
        boolean[] issued = new boolean[3];

        int ch;
        do {
            System.out.println("1.View 2.Issue 3.Return 4.Exit");
            ch = sc.nextInt();

            if (ch == 1) {
                for (int i = 0; i < books.length; i++)
                    System.out.println(books[i] + (issued[i] ? " Issued" : " Available"));
            } else if (ch == 2) {
                int i = sc.nextInt();
                if (!issued[i]) issued[i] = true;
            } else if (ch == 3) {
                int i = sc.nextInt();
                issued[i] = false;
            }
        } while (ch != 4);
    }
}
