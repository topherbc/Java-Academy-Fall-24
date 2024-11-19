USE northwind;


-- COUNT

SELECT COUNT(*) AS 'Order Count' 
FROM `Order Details`;










-- AVG

SELECT
	Country,
	AVG(Salary) AS 'Average Salary'
FROM
	Employees
GROUP BY Country;



-- SUM


SELECT
	ProductID,
	SUM(UnitPrice * Quantity) AS 'TotalSales'
FROM
	`Order Details`
WHERE ProductID = 60
GROUP BY ProductID
HAVING 
	TotalSales > 50000;
    








-- MIN / MAX

SELECT
	e.City,
	MIN(e.Salary) AS 'Minimum Salary',
    MAX(e.Salary) AS 'Maximum Salary'
FROM
	Employees AS e
WHERE e.Title LIKE 'Sales%'
GROUP BY e.City;


SELECT * FROM Employees;