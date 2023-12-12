CREATE TABLE `region` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

insert into `region`(`name`) 
values ('Asia'), ('US'), ('UK');

CREATE TABLE `country` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

insert into `country`(`name`) 
values ('India'), ('Mexico'), ('Canada'), ('England'), ('Scotland');

CREATE TABLE `cse` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `region_id` int unsigned NOT NULL,
  `country_id` int unsigned NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (region_id)
      REFERENCES region(id),
  FOREIGN KEY (country_id)
      REFERENCES country(id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

insert into `cse`(`region_id`, `country_id`) 
values (1, 1), (2, 3), (2, 2), (3, 4);
