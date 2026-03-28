import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
        boolean running = true;

        System.out.println("==========================================");
        System.out.println("  Smart Student Task & Productivity Tracker ");
        System.out.println("==========================================");

        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Productivity Report");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine()); 
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter Task Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Deadline (e.g., YYYY-MM-DD or 'Tomorrow'): ");
                    String deadline = scanner.nextLine();
                    System.out.print("Enter Priority (High/Medium/Low): ");
                    String priority = scanner.nextLine();
                    taskManager.addTask(name, deadline, priority);
                    break;
                case 2:
                    taskManager.viewTasks();
                    break;
                case 3:
                    System.out.print("Enter the Task ID to mark as completed: ");
                    try {
                        int compId = Integer.parseInt(scanner.nextLine());
                        taskManager.markTaskCompleted(compId);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID. Please enter a valid number.");
                    }
                    break;
                case 4:
                    System.out.print("Enter the Task ID to delete: ");
                    try {
                        int delId = Integer.parseInt(scanner.nextLine());
                        taskManager.deleteTask(delId);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID. Please enter a valid number.");
                    }
                    break;
                case 5:
                    taskManager.showProductivityReport();
                    break;
                case 6:
                    System.out.println("Exiting tracker. Have a productive day!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please select an option from 1 to 6.");
            }
        }
        scanner.close();
    }
}
