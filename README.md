# smart-task-tracker
# Smart Student Task & Productivity Tracker 

## Student Details
- Name: Harsh Vardhan Raj( 24BAI10851 )
- Course: Open Source Software
- Project Title: smart-task-tracker

A complete Java-based productivity tool designed to help students manage academic deadlines and track their daily efficiency.

## Project Overview
This project solves the real-world problem of student "task-overload." It allows users to digitize their to-do lists, assign priorities, and see a calculated productivity score to stay motivated.

## Course Concepts Applied (Evaluation Criteria)
To meet the course requirements, this project implements the following Core Java concepts:
* **Object-Oriented Programming (OOP):** Uses encapsulation with private attributes and public getters/setters in the `Task` class.
* **Collections Framework:** Utilizes `ArrayList` to manage a dynamic list of tasks efficiently.
* **File Handling (I/O):** Implements `BufferedReader` and `BufferedWriter` to ensure data persistence in a `tasks.txt` file.
* **Exception Handling:** Uses `try-catch` blocks to handle invalid user inputs and file-reading errors safely.
* **Modular Logic:** Separates concerns into Model (`Task`), Logic (`TaskManager`), Utility (`FileHandler`), and Driver (`Main`) classes.

##  Features
* **Add Tasks:** Set names, deadlines, and priorities (High/Medium/Low).
* **Track Status:** Mark tasks as "Completed" by their unique ID.
* **Persistence:** Tasks remain saved even after closing the program.
* **Productivity Report:** Automatic calculation of your task completion percentage.

##  How to Set Up and Run
*Someone who has never seen this project can run it by following these steps:*

1. **Prerequisites:** Ensure you have the Java Development Kit (JDK) installed.
2. **Download:** Clone this repository or download the `.java` files.
3. **Compile:** Open your terminal/command prompt in the project folder and type:
   ```bash
   javac *.java
   git clone [https://github.com/Harsh1510/smart-task-tracker.git](https://github.com/Harsh1510/smart-task-tracker.git)
