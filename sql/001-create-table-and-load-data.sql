DROP TABLE IF EXISTS goods;

CREATE TABLE goods (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(20) NOT NULL,
  cost int NOT NULL,
  stock int NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO goods (name, cost, stock) VALUES ("ショーシャンクの空に", 1200, 5);
INSERT INTO goods (name, cost, stock) VALUES ("この世界の片隅に", 1500, 1);
