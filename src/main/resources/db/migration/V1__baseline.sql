CREATE TABLE property (
  id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  property_type VARCHAR(50),
  create_time NOT NULL DEFAULT GETDATE(),
  rent_price FLOAT NOT NULL,
  address  VARCHAR(50) NOT NULL,
  email_address VARCHAR(50) NOT NULL,
  code VARCHAR(50) NOT NULL
);
