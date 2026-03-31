import java.util.List;

public class TaskManager {
    private List<Task> tasks;
    private int nextId;

    public TaskManager() {
        
        tasks = FileHandler.loadTasks();
        nextId = calculateNextId();
    }

    
    private int calculateNextId() {
        int maxId = 0;
        for (Task task : tasks) {
            if (task.getId() > maxId) {
                maxId = task.getId();
            }
        }
        return maxId + 1;
    }

    public void addTask(String name, String deadline, String priority) {
        Task newTask = new Task(nextId++, name, deadline, priority, false);
        tasks.add(newTask);
        saveChanges();
        System.out.println("Task added successfully with ID: " + newTask.getId());
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found. Your list is empty!");
            return;
        }
        System.out.println("\n--- Your Tasks ---");
        for (Task task : tasks) {
            System.out.println(task.toString());
        }
        System.out.println("------------------");
    }

    public void markTaskCompleted(int id) {
        Task task = findTaskById(id);
        if (task != null) {
            if (task.isCompleted()) {
                System.out.println("Task is already marked as completed.");
            } else {
                task.setCompleted(true);
                saveChanges();
                System.out.println("Task ID " + id + " marked as completed!");
            }
        } else {
            System.out.println("Task with ID " + id + " not found.");
        }
    }

    public void deleteTask(int id) {
        Task task = findTaskById(id);
        if (task != null) {
            tasks.remove(task);
            saveChanges();
            System.out.println("Task ID " + id + " deleted successfully.");
        } else {
            System.out.println("Task with ID " + id + " not found.");
        }
    }

    public void showProductivityReport() {
        int totalTasks = tasks.size();
        if (totalTasks == 0) {
            System.out.println("\nNo tasks available to generate a report.");
            return;
        }

        int completedTasks = 0;
        for (Task task : tasks) {
            if (task.isCompleted()) {
                completedTasks++;
            }
        }

        double productivity = ((double) completedTasks / totalTasks) * 100;

        System.out.println("\n--- Productivity Report ---");
        System.out.println("Total Tasks:     " + totalTasks);
        System.out.println("Completed Tasks: " + completedTasks);
        System.out.println("Pending Tasks:   " + (totalTasks - completedTasks));
        System.out.printf("Productivity:    %.2f%%\n", productivity);
        System.out.println("---------------------------");
    }
 private Task findTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    
   
    
    private void saveChanges() {
        FileHandler.saveTasks(tasks);
    }
}
