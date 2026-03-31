public class Task {
    private int id;
    private String name;
    private String deadline;
    private String priority; 
    private boolean isCompleted;

    public Task(int id, String name, String deadline, String priority, boolean isCompleted) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
        this.priority = priority;
        this.isCompleted = isCompleted;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDeadline() { return deadline; }
    public String getPriority() { return priority; }
    public boolean isCompleted() { return isCompleted; }

    public void setCompleted(boolean completed) { isCompleted = completed; }

    
    @Override
    public String toString() {
        String status = isCompleted ? "Completed" : "Pending";
        return String.format("ID: %-3d | Task: %-20s | Deadline: %-10s | Priority: %-8s | Status: %s", 
                              id, name, deadline, priority, status);
    }

    
    public String toFileFormat() {
        return id + "|" + name + "|" + deadline + "|" + priority + "|" + isCompleted;
    }

    
    public static Task fromFileFormat(String line) {
        String[] parts = line.split("\\|");
        if (parts.length == 5) {
            int id = Integer.parseInt(parts[0]);
            String name = parts[1];
            String deadline = parts[2];
            String priority = parts[3];
            boolean isCompleted = Boolean.parseBoolean(parts[4]);
            return new Task(id, name, deadline, priority, isCompleted);
        }
        return null; 
    }
}
