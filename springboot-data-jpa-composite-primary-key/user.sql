CREATE TABLE user (
    id int unsigned COLLATE utf8mb4_unicode_ci NOT NULL,
    first_name varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
    last_name  varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,    
    PRIMARY KEY (last_name,first_name)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `user` (`id`, `first_name`, `last_name`) VALUES
	(3, 'Arup', 'Roy'),
	(1, 'Soumitra', 'Roy'),
	(2, 'Liton', 'Sarkar');
  
