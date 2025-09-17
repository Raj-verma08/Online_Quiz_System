CREATE DATABASE quizdb;
USE quizdb;

CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(50) UNIQUE,
  password VARCHAR(255),
  role ENUM('admin','student') DEFAULT 'student'
);

CREATE TABLE questions (
  id INT AUTO_INCREMENT PRIMARY KEY,
  question_text VARCHAR(255),
  option_a VARCHAR(100),
  option_b VARCHAR(100),
  option_c VARCHAR(100),
  option_d VARCHAR(100),
  correct_option CHAR(1)
);

CREATE TABLE results (
  id INT AUTO_INCREMENT PRIMARY KEY,
  user_id INT,
  score INT,
  taken_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE USER 'quizuser'@'localhost' IDENTIFIED BY 'quizpass';
GRANT ALL PRIVILEGES ON quizdb.* TO 'quizuser'@'localhost';
FLUSH PRIVILEGES;
