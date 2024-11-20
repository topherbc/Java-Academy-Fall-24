USE northwind;

-- Nested Queries or Subqueries


SELECT
	ROUND(AVG(UnitPrice), 4) AS rounded,
    TRUNCATE(AVG(UnitPrice), 4) AS truncated
FROM
	Products;
			

SELECT
	*
FROM
	Products
WHERE
	UnitPrice > (
			SELECT
				FLOOR(AVG(UnitPrice))
			FROM
				Products
			);
            
            
SELECT * 
FROM Products
WHERE ProductID IN (1, 2, 5, 10);

SELECT * 
FROM Products
WHERE ProductID = 1 OR ProductID = 2 OR ProductID = 5 OR ProductID = 10;
    

SELECT 
	*
FROM
	`Order Details`
WHERE
	ProductID IN (
					SELECT
						ProductID
					FROM
						Products
					WHERE
						UnitPrice > (
									SELECT
										FLOOR(AVG(UnitPrice))
									FROM
										Products
									)
				);
    
SELECT
	ProductID
FROM
	Products
WHERE
	UnitPrice > (SELECT
	FLOOR(AVG(UnitPrice))
FROM
	Products);
    
    
    
    
