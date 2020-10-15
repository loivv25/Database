-- Q1
DELIMITER $$ 
CREATE PROCEDURE get_emp(IN dpm VARCHAR(50))
	BEGIN 
		SELECT Accounts.* FROM accounts INNER JOIN Department ON accounts.Department_id=department.Department_id WHERE department.Department_name =dpm; 
	END$$
DELIMITER ;
-- Q2
DELIMITER $$ 
CREATE PROCEDURE get_total_acc()
	BEGIN 
		SELECT Groupp.*, count(group_account.account_id) AS Total_acc
        FROM Groupp INNER JOIN group_account ON Groupp.group_id= group_account.group_id
        GROUP BY Groupp.Group_id;
	END$$
DELIMITER ;
-- Q3
DELIMITER $$
CREATE PROCEDURE total_question()
	BEGIN
		SELECT Type_question.*, count(type_question.type_id) 
        FROM Type_Question INNER JOIN Question ON Type_question.type_id = Question.Question_id
        WHERE (SELECT DATEPART('YYYY',Question.create_date))= (SELECT DATEPART('YYYY', GETDATE())) AND (SELECT DATEPART('MM',Question.create_date))= (SELECT DATEPART('MM',GETDATE()));
	END$$
DELIMITER ;

-- Q4
DELIMITER $$
CREATE FUNCTION get_max_total_question() RETURNS INT(7)
	READS SQL DATA
	DETERMINISTIC
	BEGIN
		DECLARE Var_type_id INT(7);
		SELECT Type_id 
        INTO Var_type_id FROM (SELECT Type_id AS Type_id, MAX(total_question) FROM (SELECT Type_question.Type_id AS Type_id, count(question.Type_id) AS Total_question
        FROM Type_question INNER JOIN Question ON Type_question.Type_id = Question.Type_id
        GROUP BY Type_question.Type_id) t) tt; 
        RETURN Var_type_id;
	END$$
DELIMITER ;
-- Q5
SELECT get_max_total_question();

-- Q6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa chuỗi của người dùng nhập vào

DROP PROCEDURE IF EXISTS Search_group_user;
DELIMITER $$
CREATE PROCEDURE Search_group_user(IN Keyword VARCHAR(50), OUT Var_user VARCHAR(50), OUT Var_Group VARCHAR(50)) 
	READS SQL DATA
	DETERMINISTIC
	BEGIN
    SELECT Username FROM Accounts WHERE Username LIKE CONCAT('%',Keyword,'%')  LIMIT 1;
	SELECT Group_name INTO Var_group FROM Groupp WHERE Group_name LIKE CONCAT('%',Keyword,'%') LIMIT 1;
    END $$
DELIMITER ;
-- Q7: 
DROP PROCEDURE IF EXISTS Update_infor;
DELIMITER $$
CREATE PROCEDURE Update_infor(IN Var_Fullname VARCHAR(50), IN Var_Email VARCHAR(50), OUT Message VARCHAR(50)) 
	READS SQL DATA
	DETERMINISTIC
	BEGIN
    INSERT INTO accounts(Email, Username, Fullname,Department_id,Position_id)
    VALUES
    (Var_email,(SELECT TRIM(TRAILING '@vti.edu.vn' FROM Var_email)),Var_fullname,NULL,1);
    SET Message='Cap nhat thanh cong';
    END $$
DELIMITER ;

-- Q8: Nhập vào Medium hoặc Hard, hiển thị câu hỏi loại medium hoặc hard có content dài nhất
DELIMITER $$
CREATE PROCEDURE Long_question(IN type_question ENUM('medium','hard'),OUT long_content VARCHAR(200))
BEGIN
	CASE 
		WHEN type_question='medium' THEN (SELECT content INTO long_content FROM (SELECT content, MAX(length_question) AS Max_length FROM (SELECT question.content AS content, length(Question.content) AS length_question FROM Question WHERE Question.Type_id =2) tb) tb1);

        WHEN type_question='hard' THEN (SELECT content INTO long_content FROM (SELECT content, MAX(length_question) AS Max_length FROM (SELECT question.content AS content, length(Question.content) AS length_question FROM Question WHERE Question.Type_id =3) tb) tb1);

	END CASE;
END $$
DELIMITER ;

-- Q9 
DElIMITER $$
CREATE PROCEDURE Del_exam(IN ID_Exam INT)
BEGIN
DELETE Exam.* FROM exam WHERE exam=Exam_id;
END$$
DELIMITER ;
-- Q10

-- Q11

-- Q12
DELIMITER $$
DROP PROCEDURE IF EXISTS Total_question_in_month;
CREATE PROCEDURE  Total_question_in_month()
BEGIN
SELECT (SELECT MONTH(Create_date)) AS Month_Question, count(Question.Question_id) AS Total_question FROM Question WHERE (SELECT YEAR(Question.Create_date))=(SELECT YEAR(now())) GROUP BY Month_Question ORDER BY Month_Question;
END $$
DELIMITER ;

-- Q13
DROP PROCEDURE IF EXISTS Total_question_in_6_month;
DELIMITER $$
CREATE PROCEDURE  Total_question_in_6_month()
BEGIN
DECLARE i INT(1) DEFAULT 0;
Loopp: WHILE i<=6 DO
CASE 
	WHEN  (SELECT (DATE_SUB(CURRENT_DATE(), INTERVAL i MONTH)))  NOT IN  (SELECT MONTH(Question.Create_date) FROM question)
    THEN SELECT (MONTH(DATE_SUB(CURRENT_DATE(), INTERVAL i MONTH))) AS Month_Question, 'Khong co cau hoi nao trong thang' AS Total_question;
ELSE
	SELECT (SELECT MONTH(Question.Create_date)) AS Month_Question, count(Question.Question_id) AS Total_question 
    FROM Question 
    WHERE MONTH(Question.Create_date)=MONTH(DATE_SUB(CURRENT_DATE(), INTERVAL i MONTH)) GROUP BY Month_Question;
END CASE;
SET i=i+1;
END WHILE Loopp;

END $$
DELIMITER ;

