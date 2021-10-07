DROP TABLE IF EXISTS promotion;

CREATE TABLE promotion(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  sku_code VARCHAR(250)NOT NULL,
  units INT NOT NULL,
  per_unit_price INT NOT NULL,
  promotion_price INT NOT NULL
);

INSERT INTO promotion(id,sku_code, units, promotion_price) VALUES
  (1,'A', 3,50, 130);



INSERT INTO promotion(id,sku_code, units, promotion_price) VALUES
  (2,'B', 2, 50, 45);