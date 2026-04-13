import java.util.*;

class Student {
    int studentId;
    String name;
    int age;
    String course;
    double marks;

    // Method to input details
    void inputDetails(Scanner sc) {
        System.out.print("Enter Student ID: ");
        studentId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        course = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
    }

    // Method to display details
    void displayDetails() {
        System.out.println("--------------------------------");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Display Students with Marks Above X");
            System.out.println("5. Calculate Average Marks");
            System.out.println("6. Sort Students by Marks");
            System.out.println("7. Update Student");
            System.out.println("8. Delete Student");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    Student s = new Student();
                    s.inputDetails(sc);
                    students.add(s);
                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students available.");
                    } else {
                        for (Student st : students) {
                            st.displayDetails();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Student st : students) {
                        if (st.studentId == searchId) {
                            st.displayDetails();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter minimum marks: ");
                    double minMarks = sc.nextDouble();
                    boolean any = false;

                    for (Student st : students) {
                        if (st.marks > minMarks) {
                            st.displayDetails();
                            any = true;
                        }
                    }

                    if (!any) {
                        System.out.println("No students found above given marks.");
                    }
                    break;

                case 5:
                    if (students.isEmpty()) {
                        System.out.println("No students to calculate average.");
                    } else {
                        double total = 0;
                        for (Student st : students) {
                            total += st.marks;
                        }
                        double avg = total / students.size();
                        System.out.println("Average Marks: " + avg);
                    }
                    break;

                case 6:
                    if (students.isEmpty()) {
                        System.out.println("No students to sort.");
                    } else {
                        students.sort((a, b) -> Double.compare(b.marks, a.marks));
                        System.out.println("Students sorted by marks (Descending):");
                        for (Student st : students) {
                            st.displayDetails();
                        }
                    }
                    break;

                case 7:
                    System.out.print("Enter Student ID to update: ");
                    int updateId = sc.nextInt();
                    boolean updated = false;

                    for (Student st : students) {
                        if (st.studentId == updateId) {
                            System.out.println("Enter new details:");
                            st.inputDetails(sc);
                            updated = true;
                            System.out.println("Student updated successfully!");
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 8:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = sc.nextInt();
                    Iterator<Student> iterator = students.iterator();
                    boolean deleted = false;

                    while (iterator.hasNext()) {
                        Student st = iterator.next();
                        if (st.studentId == deleteId) {
                            iterator.remove();
                            deleted = true;
                            System.out.println("Student deleted successfully!");
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 9:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 9);

        sc.close();
    }
}
