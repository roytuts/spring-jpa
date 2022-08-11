CREATE DATABASE IF NOT EXISTS `roytuts`
USE `roytuts`;

CREATE TABLE IF NOT EXISTS `department` (
  `id` int unsigned COLLATE utf8mb4_unicode_ci NOT NULL AUTO_INCREMENT,
  `name` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
  `description` varchar(150) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `department` (`id`, `name`, `description`) VALUES
	(1, 'IT', 'Information Technology'),
	(2, 'TelComm', 'Telecommunication'),
	(3, 'Ins', 'Insurance'),
	(4, 'HR', 'Human Resources');
	
CREATE TABLE IF NOT EXISTS `employee` (
  `id` int unsigned COLLATE utf8mb4_unicode_ci NOT NULL AUTO_INCREMENT,
  `name` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(150) COLLATE utf8mb4_unicode_ci NOT NULL,
  `address` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `dept_id` int unsigned COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `dept_id` (`dept_id`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`dept_id`) REFERENCES `department` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


INSERT INTO `employee` (`id`, `name`, `email`, `address`, `dept_id`) VALUES
	(1, 'Soumitra', 'soumitra@gmail.com', NULL, 1),
	(2, 'Suman', 'suman@gmail.com', NULL, 2),
	(3, 'Avisek', 'avisek@gmail.com', NULL, 3);
