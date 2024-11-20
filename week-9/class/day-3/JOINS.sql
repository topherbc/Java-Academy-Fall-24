-- Keys

-- Primary Key

SELECT
	*
FROM
	Products;
    
    
SELECT
	*
FROM
	`Order Details`;



-- Foreign Key



SELECT
	od.*,
    p.*
FROM
	`Order Details` AS od
    JOIN Products AS p ON (p.ProductID = od.ProductID);
    
    
SELECT
	o.OrderID,
    od.ProductID,
    e.FirstName,
    e.LastName
FROM
	`Order Details` AS od
    JOIN Orders AS o ON (o.OrderID = od.OrderID)
    JOIN Employees AS e ON (e.EmployeeID = o.EmployeeID);
    
    
-- INNER JOINs - must have values on either table
-- JOIN


-- OUTER JOINS - joins on null value
-- LEFT OUTER JOIN or LEFT JOIN
-- RIGHT OUTER JOIN or RIGHT JOIN


