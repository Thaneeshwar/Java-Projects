import java.util.*;

class Emp {
    int id;
    String name;
    double sal;

    void input(Scanner sc) {
        id = sc.nextInt();
        sc.nextLine();
        name = sc.nextLine();
        sal = sc.nextDouble();
    }

    void display() {
        System.out.println(id + " " + name + " " + sal);
    }
}

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Emp e = new Emp();
        e.input(sc);
        e.display();
    }
}
