-- Q1
CREATE VIEW V_sale_staff AS
	SELECT* FROM accounts INNER JOIN department ON Accounts.Department_id=department.Department_id WHERE Department_name= "Kinh doanh";
-- Q2
CREATE VIEW V_Max_group_account AS
	SELECT Accounts.*,count(group_account.Account_id) AS Total_group FROM Accounts INNER JOIN group_account ON Accounts.Account_id=group_account.Account_id GROUP BY accounts.Account_id HAVING Total_group = Max(Total_group);
-- Q3
CREATE VIEW V_too_long_question AS
	SELECT* FROM Question WHERE length(Question.content)>300;
DROP VIEW v_too_long_question;
-- Q4
CREATE VIEW V_Max_dept_emp AS
	SELECT Department.*, count(accounts.Account_id) AS Total_emp FROM department INNER JOIN accounts ON department.Department_id= accounts.Account_id GROUP BY Department.Department_id HAVING Total_emp = max(Total_emp);
-- Q5
CREATE VIEW V_Question_by_Nguyen AS
	SELECT question.* FROM question INNER JOIN Accounts ON question.Creator_id=accounts.Account_id WHERE accounts.Fullname LIKE 'Nguyen%';