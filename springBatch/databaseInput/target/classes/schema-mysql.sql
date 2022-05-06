DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` mediumint(8) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(255) default NULL,
  `lastName` varchar(255) default NULL,
  PRIMARY KEY (`id`)
);
