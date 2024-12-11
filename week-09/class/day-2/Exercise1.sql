USE northwind;

-- 5. What are the products that we carry where we have at least 100 units on hand? 
--    Order them in descending order by price.

SELECT
	ProductName, UnitsInStock, UnitPrice
FROM
	Products
WHERE
	UnitsInStock >= 100
ORDER BY UnitPrice DESC;


-- 6. What are the products that we carry where we have at least 100 units on hand? 
--    Order them in descending order by price. 
--    If two or more have the same price, list those in ascending order by product name.

SELECT
	ProductName, UnitsInStock, UnitPrice
FROM
	Products
WHERE
	UnitsInStock >= 100
ORDER BY UnitPrice DESC, ProductName ASC;

-- 7. What are the products that we carry where we have no units on hand, 
--    but 1 or more units of them on backorder? Order them by product name.

SELECT 
	*
FROM
	Products
WHERE
	UnitsInStock = 0 AND UnitsOnOrder >= 1;


-- 10. Examine the Products table. How does it identify the type (category) of
--     each item sold? Write a query to list all of the seafood items we carry.

SELECT * FROM Products;

SELECT * FROM Categories WHERE CategoryName LIKE "%Sea%";

SELECT * FROM Products WHERE CategoryID = 8;
