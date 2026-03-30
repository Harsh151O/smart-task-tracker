import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private static final String FILE_NAME = "tasks.txt";

    
  

    
    public static List<Task> loadTasks() {
        List<Task> tasks = new ArrayList<>();
        File file = new File(FILE_NAME);
        
        if (!file.exists()) {
            return tasks; 
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Task task = Task.fromFileFormat(line);
                if (task != null) {
                    tasks.add(task);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading tasks from file: " + e.getMessage());
        }
        return tasks;
    }
}
