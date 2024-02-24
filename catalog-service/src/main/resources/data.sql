-- Create the catalog table
CREATE TABLE catalog (
                         product_id VARCHAR(20) PRIMARY KEY,
                         product_name VARCHAR(100),
                         stock INT,
                         unit_price DECIMAL(10, 2)
);

insert into catalog(product_id, product_name, stock, unit_price)
values('CATALOG-001', 'berlin', 100, 1500);
insert into catalog(product_id, product_name, stock, unit_price)
values('CATALOG-002', 'tokyo', 110, 1000);
insert into catalog(product_id, product_name, stock, unit_price)
values('CATALOG-003', 'stockholm', 120, 2000);