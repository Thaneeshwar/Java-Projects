import java.util.*;

class TodoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n1.Add Task");
            System.out.println("2.Remove Task");
            System.out.println("3.View Tasks");
            System.out.println("4.Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    list.add(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter task to remove: ");
                    String task = sc.nextLine();
                    if (list.remove(task))
                        System.out.println("Removed");
                    else
                        System.out.println("Not Found");
                    break;

                case 3:
                    System.out.println("Tasks:");
                    for (String s : list)
                        System.out.println(s);
                    break;

                case 4:
                    System.out.println("Exit");
            }

        } while (choice != 4);

        sc.close();
    }
}
