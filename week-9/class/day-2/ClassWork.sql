USE northwind;

SELECT OrderID FROM Orders;

SELECT
	ContactName, 
    ContactTitle 
FROM
	Customers;
    
    
SELECT
	*
FROM
	Employees
WHERE
	(City = "Seattle" OR City = "Tacoma")
    AND BirthDate BETWEEN "1952-01-01" AND "1953-01-01"
ORDER BY FirstName, LastName
LIMIT 2;

-- Datetime format: yyyy-MM-dd HH:mm:ss



SELECT * FROM `Order Details` WHERE ProductID = 69;


SELECT
    DISTINCT City,
    Region
FROM
	Employees;
    
    
SELECT
	*
FROM
	`Order Details`
WHERE
	Quantity >= 25;





