import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        int option = 0;

        while (option != 5) {
            System.out.println("\n --- TO-DO LIST ---");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. Remove Task");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter task description: ");
                    String desc = scanner.nextLine();
                    manager.addTask(desc);
                    break;
                case 2:
                    manager.listAll();
                    break;
                case 3:
                    System.out.println("Enter task ID to complete: ");
                    int idComplete = scanner.nextInt();
                    manager.markAsDoneById(idComplete);
                    break;
                case 4:
                    System.out.println("Enter task ID to remove: ");
                    int idRemove = scanner.nextInt();
                    manager.deleteTask(idRemove);
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}