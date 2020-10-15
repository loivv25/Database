-- Question 1: Tạo table với các ràng buộc và kiểu dữ liệu. Thêm ít nhất 5 bản ghi vào table.
CREATE DATABASE Testing_Exam;
USE Testing_Exam;
CREATE TABLE Customer
(Customer_id INT(7) AUTO_INCREMENT PRIMARY KEY,
Namee VARCHAR(50),
Phone INT(10),
Email VARCHAR(50),
Address VARCHAR(100),
NOTE VARCHAR(100));

CREATE TABLE Car
(Car_id INT(7) AUTO_INCREMENT PRIMARY KEY,
Maker ENUM('HONDA','TOYOTA','NISSAN'),
Model VARCHAR(20),
Yearr YEAR,
Color VARCHAR(20),
Note VARCHAR(100)
);
drop table orders;
CREATE TABLE ORDERS
(Order_id INT(7) AUTO_INCREMENT PRIMARY KEY,
Customer_id INT(7),
Car_id INT(7),
Amount INT(7) DEFAULT(1),
Sale_price INT(20),
Order_date TIMESTAMP,
Delivery_Date TIMESTAMP,
Delivery_Address VARCHAR(100),
Statuss ENUM('0','1','2'),
Note VARCHAR(100),
FOREIGN KEY (Customer_id) REFERENCES Customer (Customer_id),
FOREIGN KEY (Car_id) REFERENCES Car (Car_id)
);
INSERT INTO Customer (Customer_id, Namee, Phone, Email, Address, Note)
VALUES
(1, 'Lợi', 0979433621, 'vangloi@gmail.com', 'Hà Nội',''),
(2, 'Hùng', 0979300082, 'Hungnguyen@gmail.com', 'Hải Dương',''),
(3, 'Mai', 0386399723, 'maipham@gmail.com', 'Hà Nam',''),
(4, 'Hưng', 0979487698, 'hungtran@gmail.com', 'Hải Phòng',''),
(5, 'Thảo', 0979433628, 'tranthao@gmail.com', 'Hà Nội','');

INSERT INTO Car (Car_id, Maker, Model, Yearr, Color, Note)
VALUES
(1,'HONDA','Future',2020,'Black',''),
(2,'HONDA','Wave',2017,'Red',''),
(3,'TOYOTA','Extra',2020,'White',''),
(4,'TOYOTA','Camry',2020,'Black',''),
(5,'NISSAN','Delux',2018,'Sliver','');

INSERT INTO Orders (Order_id, Customer_id, Car_id, Amount, Sale_price, order_date, delivery_date, delivery_address, statuss, Note)
VALUES
(1,5,1,1, 1000,'2020-10-1','2020-10-15','Hà Nội','0',''),
(2,4,3,1, 1500,'2020-10-2','2020-10-15','Hà Nội','1',''),
(3,2,2,1, 1000,'2020-10-2','2020-10-16','Hải Phòng','2',''),
(4,3,4,1, 1000,'2020-10-3','2020-10-17','Hà Nội','0',''),
(5,1,5,1, 2000,'2020-10-4','2020-10-18','Hà Nội','0','');

-- Question 2: Viết lệnh lấy ra thông tin của khách hàng tên, số lượng oto khách hàng đã mua và sắp sếp tăng dần theo số lượng oto đã mua.
SELECT Customer.namee, count(orders.amount) AS Total_buy FROM Customer INNER JOIN Orders ON Customer.Customer_id = Orders.Customer_id GROUP BY Orders.Customer_id ORDER BY Total_buy ASC;
-- Question 3: Viết hàm (không có parameter) trả về tên hãng sản xuất đã bán được nhiều oto nhất trong năm nay.
DROP FUNCTION IF EXISTS Get_best_sale;
DELIMITER $$
CREATE FUNCTION Get_best_sale() RETURNS VARCHAR(50)
DETERMINISTIC
READS SQL DATA
	BEGIN
    DECLARE var_maker VARCHAR(50);
    SELECT Maker INTO Var_maker 
    FROM (SELECT Maker, max(total_sale) 
    FROM (SELECT Car.maker AS Maker, SUM(orders.Amount) AS total_sale 
    FROM Car INNER JOIN Orders ON Car.car_id = Orders.car_id
    GROUP BY Car.maker) tb) tb1;
    RETURN var_maker;
    END$$
DELIMITER ;

-- Question 4: Viết 1 thủ tục (không có parameter) để xóa các đơn hàng đã bị hủy của những năm trước. In ra số lượng bản ghi đã bị xóa.

DELIMITER $$
CREATE PROCEDURE Delete_cancel_order()
	BEGIN 
    SELECT count(Order_id) AS Total_deleted  FROM (SELECT* FROM Orders WHERE Orders.statuss='2' AND (YEAR(Orders.Order_date) < (SELECT YEAR(current_date())))) tb;
    DELETE FROM Orders WHERE Orders.statuss='2' AND (YEAR(Orders.Order_date) < YEAR(current_date()));
    END$$
DELIMITER ;

-- Question 5: Viết 1 thủ tục (có CustomerID parameter) để in ra thông tin của các đơn hàng đã đặt hàng bao gồm: tên của khách hàng, mã đơn hàng, số lượng oto và tên hãng sản xuất.

DELIMITER $$
CREATE PROCEDURE get_order_infor (IN Var_Custommer_id INT(7))
	BEGIN 
 SELECT Customer.namee AS Fullname, Orders.order_id AS Order_id, Orders.amount AS Amount, Car.maker FROM customer, Car, Orders WHERE orders.Customer_id=Customer.Customer_id AND orders.Car_id = car.Car_id;
    END$$
DELIMITER ;

-- Question 6: Viết trigger để tránh trường hợp người dụng nhập thông tin không hợp lệ vào database (DeliveryDate < OrderDate + 15).

DROP TRIGGER Orders_before_insert;
DELIMITER $$
CREATE TRIGGER Orders_before_insert 
BEFORE INSERT
	ON Orders FOR EACH ROW
	BEGIN 
	IF NEW.Delivery_date < (SELECT DATE_ADD(NEW.order_date, interval 15 DAY)) THEN SET NEW.Delivery_date=(SELECT DATE_ADD(NEW.order_date, interval 15 day));
    END IF;
    END$$
DELIMITER ;


    
    
SELECT* FROM ORDERS WHERE ORDER_id =10;