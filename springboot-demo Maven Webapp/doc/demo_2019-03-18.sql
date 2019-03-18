create database demo;
use demo;

DROP TABLE IF EXISTS `t_class`;

CREATE TABLE `t_class` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `class_name` varchar(100) DEFAULT NULL,
  `student_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `t_class` WRITE;
/*!40000 ALTER TABLE `t_class` DISABLE KEYS */;

INSERT INTO `t_class` (`id`, `class_name`, `student_num`)
VALUES
	(1,'class_1',0),
	(2,'class_2',0);

/*!40000 ALTER TABLE `t_class` ENABLE KEYS */;
UNLOCK TABLES;


DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

LOCK TABLES `t_user` WRITE;
/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;

INSERT INTO `t_user` (`id`, `name`, `age`)
VALUES
	(1,'张三',20),
	(2,'李四',25),
	(4,'王五',20),
	(5,'赵六',25),
	(11,'周七',22);

/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;
UNLOCK TABLES;


