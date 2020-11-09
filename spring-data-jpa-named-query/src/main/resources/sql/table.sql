CREATE TABLE `item` (
  `item_id` int(10) NOT NULL AUTO_INCREMENT,
  `item_name` varchar(45) NOT NULL,
  `item_desc` text,
  `item_price` double NOT NULL DEFAULT '0',
  PRIMARY KEY (`item_id`)
);