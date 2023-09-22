CREATE TABLE `item` (
  `item_id` int unsigned COLLATE utf8mb4_unicode_ci NOT NULL AUTO_INCREMENT,
  `item_name` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `item_desc` text COLLATE utf8mb4_unicode_ci,
  `item_price` double COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '0',
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


insert into `item`(`item_id`,`item_name`,`item_desc`,`item_price`)
values (1,'CD','CD is a compact disk',100),
(2,'DVD','DVD is larger than CD in size',150),
(3,'ABC','ABC test description',24),
(4,'XYZ','XYZ test description',25.32),
(5,'CD Player','CD player is used to play CD',30.02),
(6,'New Item1','New Item1 Desc',125);
