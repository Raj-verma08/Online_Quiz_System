# 📝 Online Quiz System (Java + MySQL)

An interactive **Online Quiz System** built using **Java, JDBC, and MySQL**.  
This project allows users to take quizzes, stores questions in a database, and evaluates user scores in real-time.  
Perfect for learning **Java, JDBC, Database Connectivity**, and for showcasing in your **resume/placements**.

---

## 🚀 Features
- Take quiz from command-line interface (CLI).
- Questions stored and fetched from **MySQL database**.
- Real-time score calculation.
- Modular structure with **DAO, Service, and UI layers**.
- Easily extendable for Admin features (add/update questions, view results, etc.).

---

## 🏗️ Project Structure
```
Online_Quiz_System/
│── lib/ # MySQL Connector JAR
│── out/ # Compiled .class files
│── src/ # Java Source Code
│ ├── Main.java
│ ├── dao/
│ │ ├── DBConnection.java
│ │ └── QuestionDAO.java
│ ├── model/
│ │ └── Question.java
│ ├── service/
│ │ └── QuizService.java
│ └── ui/
│ └── ConsoleUI.java
│── schema.sql # SQL file to create tables and insert sample data
│── README.md
│── screenshot.png # Demo Screenshot

```
---

## 🛠️ Setup Instructions

### 1️⃣ Prerequisites
- **Java JDK 8+**
- **MySQL** installed and running
- **MySQL Connector JAR** inside `lib/`

---

### 2️⃣ Database Setup
Run the following SQL commands to set up database and table:

```sql
CREATE DATABASE quizdb;
USE quizdb;

CREATE TABLE questions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    question_text VARCHAR(255) NOT NULL,
    option_a VARCHAR(100),
    option_b VARCHAR(100),
    option_c VARCHAR(100),
    option_d VARCHAR(100),
    correct_option CHAR(1)
);
INSERT INTO questions (question_text, option_a, option_b, option_c, option_d, correct_option)
VALUES
('What is the capital of India?', 'Delhi', 'Mumbai', 'Kolkata', 'Chennai', 'A'),
('Which language runs on JVM?', 'C', 'Python', 'Java', 'Go', 'C');
```
----
### 3️⃣ Compile
javac -cp "lib/*" -d out src/**/*.java

### 4️⃣ Run
Run the project:
java -cp "out;lib/*" Main

----
### 📸 Screenshot
![Screenshot](Screenshot%202025-09-17%20234353.png)

----
### 💡 Future Enhancements

- Add Admin Panel (insert/update/delete questions).

- Store user quiz history in DB.

- Create a GUI version using JavaFX/Swing.

- Add authentication (login/signup) for multiple users.
----
### 👨‍💻 Author
Raj (MCA Data Science, UPES)
💼 Open to internship & placement opportunities

