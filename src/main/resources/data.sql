DROP TABLE IF EXISTS promotion;

CREATE TABLE promotion(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  sku_code VARCHAR(250)NOT NULL,
  units INT NOT NULL,
  promotion_price INT NOT NULL
);

INSERT INTO promotion(sku_code, units, promotion_price) VALUES
  ('A', 3, 130);