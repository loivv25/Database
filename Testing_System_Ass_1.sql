CREATE DATABASE Entry_Tests_Management;
USE Entry_Tests_Management;

CREATE TABLE Department
	(Department_id	INT(10) AUTO_INCREMENT PRIMARY KEY,
     Department_name VARCHAR(50)
    );
    
CREATE TABLE Position
	 (Position_id	INT(10) AUTO_INCREMENT PRIMARY KEY,
      Position_name	VARCHAR(50)
      );

CREATE TABLE Accounts
	(Account_id		INT(10) AUTO_INCREMENT PRIMARY KEY,
	Email			VARCHAR(50),
    Username		VARCHAR(50),
    Fullname		VARCHAR(50),
    Department_id	INT(10),
    Position_id		INT(10),
    Create_date	 	TIMESTAMP,
    FOREIGN KEY (Department_id) REFERENCES Department (Department_id) ON DELETE CASCADE,
    FOREIGN KEY (Position_id) REFERENCES Position (Position_id) ON DELETE CASCADE
    );
    
CREATE TABLE Groupp
	(Group_id	INT(10) AUTO_INCREMENT PRIMARY KEY,
    Group_name	VARCHAR(50),
    Creator_id	INT(10),
    Create_date TIMESTAMP,
    FOREIGN KEY (Creator_id) REFERENCES Accounts (Account_id) ON DELETE CASCADE
    );
    
CREATE TABLE Group_Account
	(Group_id	INT(10) AUTO_INCREMENT PRIMARY KEY,
    Account_id	INT(10),
    Join_date	TIMESTAMP,
    FOREIGN KEY (Account_id) REFERENCES Accounts (Account_id) ON DELETE CASCADE
    );
    
CREATE TABLE Type_question
	(Type_id	INT(10) AUTO_INCREMENT PRIMARY KEY,
	Type_name	VARCHAR(50)
    );
    
CREATE TABLE Category_question
	(Category_id	INT(10) AUTO_INCREMENT PRIMARY KEY,
    Category_name 	VARCHAR(50)
    );
    
CREATE TABLE Question
	(Question_id	INT(10) AUTO_INCREMENT PRIMARY KEY,
    Content			VARCHAR(1000),
    Category_id		INT(10),
    Type_id			INT(10),
    Creator_id		INT(10),
    Create_date		TIMESTAMP,
    FOREIGN KEY (Category_id) REFERENCES Category_question (Category_id) ON DELETE CASCADE,
    FOREIGN KEY (Creator_id) REFERENCES Accounts (Account_id) ON DELETE CASCADE
    );
    
CREATE TABLE Answer
	(Answer_id	INT(10) AUTO_INCREMENT PRIMARY KEY,
    Content 	VARCHAR(1000),
    Question_id	INT(10),
    Is_correct	BOOL,
    FOREIGN KEY (Question_id) REFERENCES Question (Question_id) ON DELETE CASCADE
    );
    
CREATE TABLE Exam
	(Exam_id	INT(10) AUTO_INCREMENT PRIMARY KEY,
    Code		VARCHAR(10) UNIQUE,
    Title		VARCHAR(100),
    Category_id	INT(10),
    Duration	INT(5),
    Creator_id	INT(10),
    Create_date TIMESTAMP
    );

CREATE TABLE Exam_Question
	(Exam_id	INT(10) AUTO_INCREMENT PRIMARY KEY,
    Question_id	INT(10),
    FOREIGN KEY (Question_id) REFERENCES Question (Question_id) ON DELETE CASCADE
    );

    
    
    

    
    




