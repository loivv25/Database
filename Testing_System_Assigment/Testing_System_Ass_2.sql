INSERT INTO Department
(Department_id, Department_name)
VALUES
(1, 'Kinh doanh'),
(2, 'Marketing'),
(3, 'Công nghệ'),
(4, 'Nhân sự'),
(5, 'Tuyển sinh'),
(6, 'Đào tạo');

INSERT INTO Position
(Position_id, Position_name)
VALUES
(1, 'Thực tập sinh'),
(2, 'Lập trình viên'),
(3, 'Chuyên viên'),
(4, 'Quản lý'),
(5, 'Giám đốc');

INSERT INTO Accounts
(Account_id, Email, Username, Fullname, Department_id, Position_id, Create_date)
VALUES
(1, 'vangvanloi97@gmail.com', 'loi.vangvan', 'Vàng Văn Lợi',6, 1, '2020-10-1'),
(2, 'vuthithao@gmail.com', 'thao.vuthi', 'Vũ Thị Thảo',6,1,'2020-10-2'),
(3, 'trannam@gmail.com', 'nam.tran', 'Trần Văn Nam',3,2, '2020-10-1'),
(4, 'nguyenhung@gmal.com','hung.nguyen', 'Nguyễn Mạnh Hùng',5,3,'2020-10-3'),
(5, 'hoamaipham@gmail.com','hoa.maipham', 'Phạm Mai Hoa',1,5,'2020-10-5'),
(6, 'longpham@gmail.com','long.pham', 'Phạm Văn Long',3,1,'2020-10-5'),
(7, 'minhnguyen@gmail.com','minh.nguyen', 'Nguyễn Đức Minh',4,4,'2020-10-1'),
(8, 'ducle@gmail.com','duc.le', 'Lê Văn Đức',6,3,'2020-10-2'),
(9, 'lethanhmai@gmail.com','mai.lethanh', 'Lê Thanh Mai',3,2,'2020-10-3');

INSERT INTO Groupp
(group_id, Group_name, Creator_id, Create_date)
VALUES
(1, 'N1', 7, '2020-10-5'),
(2, 'N2', 7, '2020-10-4'),
(3, 'N3', 5, '2020-10-6'),
(4, 'N4', 5, '2020-10-3'),
(5, 'N5', 9, '2020-10-1');

INSERT INTO Group_Account
(Group_id, Account_id, Join_date)
VALUES
(1,1,'2020-10-1'),
(2,2,'2020-10-2'),
(3,3,'2020-10-1'),
(4,9,'2020-10-3'),
(5,6,'2020-10-5');

INSERT INTO Category_question
(Category_id, Category_name)
VALUES
(1, 'CSDL'),
(2, 'Java Basic'),
(3, 'Java Advance'),
(4, 'Front-end'),
(5, 'Angular');

INSERT INTO Type_question
(Type_id, Type_name)
VALUES
(1, 'Essay'),
(2, 'medium'),
(3, 'hard');

INSERT INTO Question
(question_id, content, category_id, type_id, creator_id)
VALUES
(1, 'Khóa chính là gì?',1,1,7),
(2, 'Khóa ngoại là gì?',1,1,8),
(3, 'Các đặc trưng của OOP?',2,3,3),
(4, 'Font-end là gì?',2,4,3),
(5, 'HTML là gì?',3,2,3);

INSERT INTO Answer
(Answer_id, content, Question_id,is_correct)
VALUES
(1,'Khóa chính là một cột xác định các bản ghi trong bảng',1,false),
(2,'Khóa chính là một hoặc tập hợp các cột xác định các bản ghi trong bảng',1,true),
(3,'Khóa ngoại cột có ở hai hay nhiều bảng',2,false),
(4,'Khóa ngoại của một bảng là một cột của bảng này đồng thời là khóa chính của một bảng khác',2,true),
(5,'HTML là ngôn ngữ đánh dấu siêu văn bản',5,true);

INSERT INTO Exam
(Exam_id,Code,Title,Category_id,Duration,Creator_id,Create_date)
VALUES
(1,'E01','Bài kiểm tra số 1',3,15,7,'2020-10-5'),
(2,'E02','Bài kiểm tra số 2',1,15,7,'2020-10-5'),
(3,'E03','Bài kiểm tra số 3',2,15,8,'2020-10-5'),
(4,'E04','Bài kiểm tra số 4',1,30,8,'2020-10-6'),
(5,'E05','Bài kiểm tra số 5',4,30,7,'2020-10-6');

INSERT INTO Exam_question
(Exam_id, Question_id)
VALUES
(1,1),
(1,2),
(2,3),
(2,4),
(3,4),
(3,5),
(4,1),
(4,2),
(4,5),
(5,3),
(5,4),
(5,5);




