use entry_tests_management;
-- Q1
SELECT* FROM Accounts INNER JOIN Department ON Accounts.Department_id =Department.Department_id;
-- Q2
SELECT* FROM Accounts WHERE Create_date <'2010-12-20';
-- Q3
SELECT* FROM Accounts INNER JOIN Position ON Accounts.account_id=Position.account_id WHERE Position.Position_name='developer';
-- Q4
SELECT Department.*, Count(Accounts.Department_id) AS Total_Employee FROM Department INNER JOIN Accounts ON Department.Department_id = Accounts.Department_id GROUP BY Department_id HAVING Total_employee>4;
-- Q5
SELECT Question.*, Count(Exam_Question.Question_id) AS Using_time FROM Question LEFT JOIN Exam_question ON Question.Question_id = Exam_question.question_id GROUP BY Question_id ORDER BY Using_time DESC LIMIT 1;
-- Q6
SELECT Category_question.*, Count(Question.Category_id) FROM Category_question INNER JOIN Question ON Category_question.Category_id = Question.Category_id GROUP BY Category_id;
-- Q7
SELECT Question.*, Count(Exam_question.Question_id) FROM Question INNER JOIN Exam_question ON Question.Question_id = Exam_question.Question_id GROUP BY Question_id;
-- Q8
SELECT Question.*, Count(Answer.Question_id) FROM Question INNER JOIN Answer ON Question.Question_id = Answer.Question_id GROUP BY Question_id;
-- Q9
SELECT Groupp.*, Count(Group_account.Account_id) FROM Groupp LEFTgroupp JOIN Group_Account ON Groupp.Group_id = Group_Account.Group_id GROUP BY Account_id;
-- Q10
SELECT position.*, Count(Accounts.Position_id) AS Total_Employee FROM Position LEFT JOIN Accounts ON Position.Position_id=Accounts.Position_id GROUP BY Position_id ORDER BY Total_Employee ASC LIMIT 1;
-- Q11
SELECT department.*, Position.*, count(accounts.Account_id) FROM department,position INNER JOIN Accounts ON department.Department_id=accounts.Department_id INNER JOIN position ON accounts.Position_id=position.Position_id GROUP BY department.Department_id, position.Position_id ORDER BY department.Department_id;
-- Q12
SELECT Question.*, type_question.Type_name, category_question.Category_name, accounts.Fullname, answer.Content FROM question INNER JOIN type_question ON question.Type_id=type_question.Type_id INNER JOIN category_question ON question.Category_id=category_question.Category_id INNER JOIN Accounts ON Question.Creator_id=accounts.Account_id JOIN answer ON question.Question_id=answer.Answer_id WHERE answer.Is_correct=TRUE;
-- Q13
SELECT type_question.*, count(question.Question_id) FROM Type_question LEFT JOIN question ON type_question.Type_id=question.Type_id GROUP BY type_question.Type_id;
-- Q14
SELECT Groupp.*, count(group_account.Account_id) AS Total_account FROM groupp INNER JOIN group_account ON Groupp.Group_id=group_account.Group_id GROUP BY Groupp.Group_id HAVING COUNT(group_account.Account_id)=0 ;
-- Q15
SELECT question.*, count(answer.Question_id) AS Total_ans FROM Question INNER JOIN Answer ON question.Question_id = Answer.Question_id GROUP BY Question.question_id HAVING Total_ans=0 ;
-- Q17a
SELECT* FROM Accounts INNER JOIN group_account ON Accounts.Account_id = group_account.Account_id WHERE group_account.group_id = 1;
-- Q17b
SELECT* FROM Accounts INNER JOIN group_account ON Accounts.Account_id = group_account.Account_id WHERE group_account.group_id = 2;
-- Q17c
SELECT* FROM Accounts INNER JOIN group_account ON Accounts.Account_id = group_account.Account_id WHERE group_account.group_id = 1
UNION
SELECT* FROM Accounts INNER JOIN group_account ON Accounts.Account_id = group_account.Account_id WHERE group_account.group_id = 2;
-- Q18a
SELECT Groupp.*, count(group_account.account_id) AS Total_acc FROM Groupp INNER JOIN group_account ON Groupp.group_id = Group_account.group_id GROUP BY Groupp.group_id HAVING Total_acc>5;
-- Q18b 
SELECT Groupp.*, count(group_account.account_id) AS Total_Acc FROM Groupp INNER JOIN group_account ON Groupp.group_id = Group_account.group_id GROUP BY Groupp.group_id HAVING Total_acc<7;

-- 18c
SELECT Groupp.*, count(group_account.account_id) AS Total_acc FROM Groupp INNER JOIN group_account ON Groupp.group_id = Group_account.group_id GROUP BY Groupp.group_id HAVING Total_acc>5
UNION
SELECT Groupp.*, count(group_account.account_id) AS Total_Acc FROM Groupp INNER JOIN group_account ON Groupp.group_id = Group_account.group_id GROUP BY Groupp.group_id HAVING Total_acc<7;

