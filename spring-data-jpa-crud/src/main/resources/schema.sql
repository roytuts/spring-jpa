DROP TABLE ProductType IF EXISTS;
CREATE TABLE ProductType (
    ProductTypeId integer identity primary key,
    ProductTypeName varchar(50) not null,
    ProductTypeDesc varchar(255) not null
);
DROP TABLE Product IF EXISTS;
CREATE TABLE Product (
    ProductId integer identity primary key,
    ProductTypeId integer,
    ProductName varchar(50) not null,
    ProductDesc varchar(255) not null,
    ProductPrice float not null
);
ALTER TABLE Product
ADD FOREIGN KEY (ProductTypeId)
REFERENCES ProductType(ProductTypeId);