# smart-task-tracker
# Smart Student Task & Productivity Tracker 

## Student Details
- Name: Harsh Vardhan Raj( 24BAI10851 )
- Course: Open Source Software
- Project Title: smart-task-tracker



A professional Core Java console application designed to help students manage academic deadlines, categorize tasks by priority, and track their overall productivity through real-time analytics.

##  Problem Statement (Why this matters)
Students often face "information overload" with multiple assignments and deadlines. This project solves that by providing a centralized system to digitize tasks and monitor completion rates, which is a real-world necessity for academic success.

## Core Course Concepts Applied
This project demonstrates proficiency in the following Java areas:
* **Object-Oriented Programming (OOP):** Uses a modular class structure (Model-Logic-Utility) with encapsulation.
* **Collections Framework:** Implements `ArrayList` for dynamic data management.
* **File I/O Handling:** Uses `BufferedReader` and `BufferedWriter` to ensure data persists in `tasks.txt` after the program exits.
* **Exception Handling:** Robust `try-catch` blocks to manage user input errors and file processing.
* **Control Flow:** Complex menu-driven logic using `while` loops and `switch-case` statements.

##  Key Features
* **Task Management:** Create, view, and delete tasks with unique IDs.
* **Status Tracking:** Mark tasks as "Completed" to update the database.
* **Priority Levels:** Assign High, Medium, or Low priority to stay organized.
* **Productivity Analytics:** Displays a report showing total tasks vs. completed tasks with a percentage score.

##  Project Organization
* `Task.java` - **Model Class:** Defines attributes like ID, Name, and Priority.
* `TaskManager.java` - **Business Logic:** Handles all calculations and list modifications.
* `FileHandler.java` - **Utility Class:** Manages permanent data storage and loading.
* `Main.java` - **Driver Class:** The entry point and interactive menu.

##  Setup & Execution (Usability)
*Follow these steps to run the project in any terminal:*

1. **Download/Clone:** Ensure all four `.java` files are in the same folder.
2. **Compile:** Run the following command:
   ```bash
   javac *.java
