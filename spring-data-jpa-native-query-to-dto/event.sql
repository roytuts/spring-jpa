CREATE TABLE IF NOT EXISTS `event` (
  `id` int unsigned COLLATE utf8mb4_unicode_ci NOT NULL AUTO_INCREMENT,
  `title` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `url` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `clasz` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `start_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `end_date` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `event` (`id`, `title`, `url`, `clasz`, `start_date`, `end_date`) VALUES
	(1, 'Example', 'http://www.example.com', 'event-success', '2021-03-03 15:27:51', '2020-04-10 20:01:02'),
	(2, 'Jee Tutorials', 'https://roytuts.com', 'event-important', '2021-03-11 19:00:00', '2020-03-12 19:42:45'),
	(3, 'Roy Tutorial', 'https://roytuts.com', 'event-info', '2021-03-12 20:03:05', '2020-05-13 08:45:53');