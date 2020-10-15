-- Q2
SELECT* FROM department;
-- Q3
SELECT department_id FROM department WHERE Department_name='Kinh doanh';
-- Q4
SELECT MAX(Fullname) FROM accounts;
-- Q5
SELECT MAX(Fullname) FROM accounts WHERE accounts.Department_id=3;
-- Q6
SELECT group_name FROM groupp WHERE Create_date < '2020-10-5';
-- Q7
SELECT question_id FROM answer HAVING COUNT(Question_id)>=2;
-- Q8
SELECT Exam_id FROM exam WHERE Duration>=15 and Create_date<'2020-10-10';
-- Q9
SELECT* FROM groupp groupp GROUP BY Create_date ORDER BY Create_date DESC LIMIT 5;
-- Q10
SELECT COUNT(department_id) FROM department WHERE Department_id=2;
-- Q11
SELECT* FROM Accounts WHERE LEFT(Fullname,1)='D' AND RIGHT(Fullname,1)='o';
-- Q12
DELETE FROM Exam WHERE create_date < '2020-10-2';
-- Q13
DELETE FROM question WHERE LEFT(Content,7)='Câu hỏi';
-- Q14
UPDATE accounts SET Fullname='Nguyễn Bá Lộc', email='loc.nguyenba@vti.edu.vn' WHERE Account_id=3; 
-- Q15
UPDATE group_account SET group_account=4 WHERE account_id=5;