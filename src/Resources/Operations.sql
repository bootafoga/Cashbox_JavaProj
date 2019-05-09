/* CREATE TABLE products
(
  id INT AUTO_INCREMENT NOT NULL,
  name VARCHAR(30),
  code VARCHAR(10),
  count INT,
  price INT,
  PRIMARY KEY (id)
);

INSERT INTO products (name, code, count, price)
VALUES ('Tea cup, 300ml', '001', 15, 4);

INSERT INTO products (name, code, count, price)
VALUES ('Blue pen, PIG', '002', 111, 1);

INSERT INTO products (name, code, count, price)
VALUES ('Flowers in bottle', '003', 4, 50);

INSERT INTO products (name, code, count, price)
VALUES ('Coffee standart', '004', 51, 16);
*/
USE test;
SELECT * FROM products;