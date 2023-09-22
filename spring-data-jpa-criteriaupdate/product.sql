CREATE TABLE `product` (
	`id` int unsigned COLLATE utf8mb4_unicode_ci NOT NULL AUTO_INCREMENT,
	`name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
	`price` double COLLATE utf8mb4_unicode_ci NOT NULL,
	`sale_price` double COLLATE utf8mb4_unicode_ci NOT NULL,
	`sales_count` int unsigned COLLATE utf8mb4_unicode_ci NOT NULL,
	`sale_date` VARCHAR(20) NOT NULL,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=UTF8MB4_UNICODE_CI;

insert into product(id,name,price,sale_price,sales_count,sale_date) values(1, 'Desktop','30000','35000','55','02-10-2021');
insert into product(id,name,price,sale_price,sales_count,sale_date) values(2, 'Desktop','30300','37030','43','03-10-2021');
insert into product(id,name,price,sale_price,sales_count,sale_date) values(3, 'Tablet','39010','48700','145','10-10-2021');
insert into product(id,name,price,sale_price,sales_count,sale_date) values(4, 'Phone','15000','17505','251','05-10-2021');
insert into product(id,name,price,sale_price,sales_count,sale_date) values(5, 'Phone','18000','22080','178','05-10-2021');
insert into product(id,name,price,sale_price,sales_count,sale_date) values(6, 'Tablet','30500','34100','58','05-10-2021');
insert into product(id,name,price,sale_price,sales_count,sale_date) values(7, 'Adapter','2000','2500','68','06-10-2021');
insert into product(id,name,price,sale_price,sales_count,sale_date) values(8, 'TV','45871','55894','165','07-10-2021');
