import java.util.Scanner;

public class StudentApp{
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Student Attendance System =====");
            System.out.println("Add Student");
            System.out.println("Check-In Student");
            System.out.println("Check-Out Student");
            System.out.println("Show Attendance Report");
            System.out.println("Exit");
            System.out.print("Enter Choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Roll No: ");
                    int rollNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    manager.addStudent(name, rollNo, course);
                    break;

                case 2:
                System.out.print("Enter Roll No: ");
                int rollIn = sc.nextInt();
                manager.checkInStudent(rollIn);
                    break;

                case 3:
                System.out.print("Enter Roll No: ");
                int rollOut = sc.nextInt();
                manager.checkOutStudent(rollOut);
                    break;

                case 4:
                    manager.showAttendance();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    return;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
