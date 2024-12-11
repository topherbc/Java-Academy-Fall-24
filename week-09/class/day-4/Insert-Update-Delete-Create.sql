USE northwind;


CREATE TABLE advertisments (
	AdID int NOT NULL AUTO_INCREMENT,
    Title varchar(50) NOT NULL,
    MagicCode varchar(9),
    PercentOFF float,
	PRIMARY KEY (AdID)
);

INSERT INTO advertisments 
VALUES (NULL, "Discount 1", "CO10", 10);

INSERT INTO advertisments 
VALUES (NULL, "Discount 2", "CO20", 20);

INSERT INTO advertisments  (Title, MagicCode, PercentOFF)
VALUES ("Discount 3", "CO30", 30);

INSERT INTO advertisments  (Title, MagicCode, PercentOFF)
VALUES ("Discount 4", "CO40", 40), ("Discount 5", "CO50", 50),
("Discount 0", "CO00", NULL);

-- SET SQL_SAFE_UPDATES=0

UPDATE advertisments
SET PercentOFF = 0
WHERE AdID = 6;


DELETE FROM advertisments
WHERE AdID = 3;




SELECT * FROM advertisments;




-- One-to-one


-- one-to-many

-- many-to-many
