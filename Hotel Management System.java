import java.util.*;

class Customer {
    int roomNo;
    String name;
    int days;
    double bill;

    void input(Scanner sc) {
        System.out.print("Enter Room Number: ");
        roomNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Days Stayed: ");
        days = sc.nextInt();

        bill = days * 1000; // per day cost
    }

    void display() {
        System.out.println("Room: " + roomNo + " Name: " + name +
                           " Days: " + days + " Bill: " + bill);
    }
}

public class HotelManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Customer> list = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n1.Book Room");
            System.out.println("2.Display Customers");
            System.out.println("3.Search Customer");
            System.out.println("4.Check Available Rooms");
            System.out.println("5.Checkout");
            System.out.println("6.Exit");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    Customer c = new Customer();
                    c.input(sc);
                    list.add(c);
                    System.out.println("Room Booked!");
                    break;

                case 2:
                    if (list.isEmpty())
                        System.out.println("No Records");
                    else
                        for (Customer x : list)
                            x.display();
                    break;

                case 3:
                    System.out.print("Enter Room No: ");
                    int r = sc.nextInt();
                    boolean found = false;

                    for (Customer x : list) {
                        if (x.roomNo == r) {
                            x.display();
                            found = true;
                        }
                    }

                    if (!found)
                        System.out.println("Not Found");
                    break;

                case 4:
                    System.out.print("Enter Room No to check: ");
                    int rn = sc.nextInt();
                    boolean occupied = false;

                    for (Customer x : list) {
                        if (x.roomNo == rn)
                            occupied = true;
                    }

                    System.out.println(occupied ? "Occupied" : "Available");
                    break;

                case 5:
                    System.out.print("Enter Room No to checkout: ");
                    int del = sc.nextInt();

                    Iterator<Customer> it = list.iterator();
                    boolean removed = false;

                    while (it.hasNext()) {
                        if (it.next().roomNo == del) {
                            it.remove();
                            removed = true;
                            System.out.println("Checked out!");
                            break;
                        }
                    }

                    if (!removed)
                        System.out.println("Room not found");
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
    }
}
