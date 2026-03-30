# smart-task-tracker
# Smart Student Task & Productivity Tracker 

A robust, console-based Java application designed to help students manage their daily academic tasks, track deadlines, and monitor their overall productivity.

##  Features

* **Task Management:** Add, View, Mark as Completed, and Delete tasks.
* **Priority System:** Categorize tasks by High, Medium, or Low priority.
* **Data Persistence:** All tasks are saved to a `tasks.txt` file, so your data is never lost when the program closes.
* **Productivity Analytics:** Generates a real-time report showing your completion percentage and pending workload.
* **OOP Design:** Built using clean Object-Oriented Programming principles.

##  Technical Stack

* **Language:** Java (Core Java)
* **Data Structures:** ArrayList for dynamic task management.
* **File I/O:** Java File Handling (`BufferedWriter`, `BufferedReader`) for data storage.
* **Architecture:** Modular design with separate Model, Logic, and Utility classes.

##  Project Structure

* `Main.java`: The entry point containing the interactive menu.
* `Task.java`: The model class representing a Task object.
* `TaskManager.java`: Handles the business logic (adding, deleting, and calculating productivity).
* `FileHandler.java`: Manages saving and loading data from the local text file.

##  How to Run

### Option 1: Run Online (Replit)
1. Import this repository into [Replit](https://replit.com).
2. Click the **Run** button.
3. Use the **Console** tab on the right to interact with the menu.

### Option 2: Run Locally (Terminal/CMD)
1. Ensure you have **JDK** installed.
2. Clone this repository:
   ```bash
   git clone [https://github.com/Harsh1510/smart-task-tracker.git](https://github.com/Harsh1510/smart-task-tracker.git)
