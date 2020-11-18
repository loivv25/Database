DROP DATABASE IF EXISTS UserManager;
CREATE DATABASE UserManager;
USE UserManager;

-- Tạo các bảng User, Manager, Employee, Project

CREATE TABLE User(
	UserID 		INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	FullName 	VARCHAR(50) UNIQUE KEY NOT NULL,
    Email 		VARCHAR(50) UNIQUE KEY NOT NULL,
    `Password`	VARCHAR(50) NOT NULL CHECK(length(`Password`) >= 6),
    `Role`		ENUM('User', 'Admin')
);

CREATE TABLE Manager(
ManagerID INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
ExpInYear INT(2),
FOREIGN KEY (ManagerID) REFERENCES User (UserID) ON DELETE CASCADE
);

CREATE TABLE Project(
ProjectID INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
ProjectName VARCHAR(50),
ManagerID INT(6) UNSIGNED, -- Mỗi Project chỉ có 1 Manager, một Manager có thể quản lý nhiều project
FOREIGN KEY (ManagerID) REFERENCES Manager (ManagerID) ON DELETE CASCADE
);

DROP DATABASE IF EXISTS UserManager;
CREATE DATABASE UserManager;
USE UserManager;

-- Tạo các bảng User, Manager, Employee, Project
-- Mỗi Project chỉ có 1 Manager, một Manager có thể quản lý nhiều project
-- Mỗi Employee chỉ tham gia 1 Project, 1 project có thể có nhiều employee

CREATE TABLE User(
	UserID 		INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	FullName 	VARCHAR(50) UNIQUE KEY NOT NULL,
    Email 		VARCHAR(50) UNIQUE KEY NOT NULL,
    `Password`	VARCHAR(50) NOT NULL CHECK(length(`Password`) >= 6),
    `Role`		ENUM('User', 'Admin')
    
);
drop table employee;
drop table manager;
drop table project;

CREATE TABLE Manager(
ManagerID INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
ExpInYear INT(2),
FOREIGN KEY (ManagerID) REFERENCES User (UserID) ON UPDATE CASCADE
);

CREATE TABLE Project(
ProjectID INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
ProjectName VARCHAR(50),
ManagerID INT(6) UNSIGNED, -- Mỗi Project chỉ có 1 Manager, một Manager có thể quản lý nhiều project
FOREIGN KEY (ManagerID) REFERENCES Manager (ManagerID) 
);

CREATE TABLE Employee(
EmployeeID INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
ProjectID INT(6) UNSIGNED,-- Mỗi Employee chỉ tham gia 1 Project, 1 project có thể có nhiều employee
ProSkill VARCHAR(200),
FOREIGN KEY (EmployeeID) REFERENCES User (UserID) ON UPDATE CASCADE,
FOREIGN KEY (ProjectID) REFERENCES Project (ProjectID) 
);

-- Insert data


INSERT INTO `User`  (UserID   , FullName, 			Email,				 `Password`,			`Role`		) 
VALUES
					(1,			N'Nguyễn Thị Mỵ',	'mynt2407@gmail.com', 'Mynguyen123',		'User'	),
					(2,			N'Nguyễn Ngọc Duy',	'duynn03@gmail.com', 'duyNguyen',			'Admin'	),
                    (3,			N'Nguyễn Hùng Mạnh','hungmanh@gmail.com', 'hunGmanh1',			'User'	),
                    (4,			N'Tống Thị Nhung',	'nhung@gmail.com', 		'nhungtOng',		'User'	),
                    (5,			N'Trần Thị Kim Anh','kimoanh.tran@gmail.com', 'tran.kim',		'User'	),
					(6,			N'Nguyễn Văn Thái','thaing@gmail.com', 'hunGmanh1',			'User'	),
                    (7,			N'Tống Thị Mai',	'mai@gmail.com', 		'maitOng',		'User'	),-- Manager
                    (8,			N'Trần Thu Hiền','hien.tran@gmail.com', 'tran.hien',		'User'	),-- Manager
                     (9,			N'Trần Mai Hiền','hien.tranmai@gmail.com', 'tran.hien',		'User'	),-- Manager
                     (10, N'Vàng Văn Lợi', 'loivv@gmail.com', 'LoiVV123', 'User');


            
INSERT INTO Manager (ManagerID, ExpInYear) 
VALUES
(7,5),
(8,2),
(9,1);

INSERT INTO Project(ProjectID, ProjectName, ManagerID)
VALUES
(1,"Website VTI",7),
(2,"Website ABC",8);

INSERT INTO Employee (EmployeeID, ProjectID, ProSkill) 
VALUES
(1,1,"Java"),
(3,1,"Test"),
(4,2,"SQL"),
(5,2,"Frontend"),
(6,2,"SQL");

-- Question 2:
SELECT userID, FullName, Email FROM User INNER JOIN Manager  
ON User.UserID=manager.ManagerID 
INNER JOIN project
ON manager.ManagerID = project.ManagerID 
WHERE Project.ProjectName="Website VTI"
UNION
SELECT userID, FullName,Email FROM User INNER JOIN Employee 
ON user.UserID=employee.EmployeeID INNER JOIN project ON employee.ProjectID = project.ProjectID 
WHERE Project.ProjectName="Website VTI";

-- Question 3:
SELECT  User.userID, User.FullName, User.Email, manager.expInYear, project.ProjectID, project.ProjectName FROM User INNER JOIN Manager  
ON User.UserID=manager.ManagerID INNER JOIN project
ON manager.ManagerID = project.ManagerID;
