/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.5.37 : Database - spring_hibernate
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`spring_hibernate` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `spring_hibernate`;

/*Table structure for table `t_address` */

DROP TABLE IF EXISTS `t_address`;

CREATE TABLE `t_address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `fk_person_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_address` */

insert  into `t_address`(`id`,`address`,`fk_person_id`) values (1,'九眼桥',1),(2,'牛王庙',1),(3,'火车北站',1);

/*Table structure for table `t_class` */

DROP TABLE IF EXISTS `t_class`;

CREATE TABLE `t_class` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cls_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_class` */

insert  into `t_class`(`id`,`cls_name`) values (1,'J136');

/*Table structure for table `t_game` */

DROP TABLE IF EXISTS `t_game`;

CREATE TABLE `t_game` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `game_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_game` */

insert  into `t_game`(`id`,`game_name`) values (1,'DOTA'),(2,'红警'),(3,'使命召唤'),(5,'LOL');

/*Table structure for table `t_hus` */

DROP TABLE IF EXISTS `t_hus`;

CREATE TABLE `t_hus` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `hus_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_hus` */

/*Table structure for table `t_person` */

DROP TABLE IF EXISTS `t_person`;

CREATE TABLE `t_person` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `pwd` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `fk_info_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_person` */

insert  into `t_person`(`id`,`name`,`pwd`,`fk_info_id`) values (1,'旺财','123456',1);

/*Table structure for table `t_person_info` */

DROP TABLE IF EXISTS `t_person_info`;

CREATE TABLE `t_person_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `person_msg` varchar(120) COLLATE utf8_bin DEFAULT NULL,
  `idcard` varchar(18) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_person_info` */

insert  into `t_person_info`(`id`,`person_msg`,`idcard`) values (1,'这是一条狗！','55555');

/*Table structure for table `t_player` */

DROP TABLE IF EXISTS `t_player`;

CREATE TABLE `t_player` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `player_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_player` */

insert  into `t_player`(`id`,`player_name`) values (1,'小李子'),(2,'小顺子'),(3,'王八羔子');

/*Table structure for table `t_player_game` */

DROP TABLE IF EXISTS `t_player_game`;

CREATE TABLE `t_player_game` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `fk_player_id` bigint(20) DEFAULT NULL,
  `fk_game_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_player_game` */

insert  into `t_player_game`(`id`,`fk_player_id`,`fk_game_id`) values (13,3,1),(14,3,2),(15,3,3);

/*Table structure for table `t_stus` */

DROP TABLE IF EXISTS `t_stus`;

CREATE TABLE `t_stus` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `stu_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `fk_cls_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_stus` */

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `login_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57339 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_user` */

insert  into `t_user`(`id`,`user_name`,`login_name`,`password`,`age`) values (9,'小明','a',NULL,18),(10,'小爱','b',NULL,18),(11,'小李','c',NULL,18),(12,'小明','a',NULL,18),(13,'小爱','b',NULL,18),(14,'小李','c',NULL,18),(15,'小明','a',NULL,18),(16,'小爱','b',NULL,18),(17,'小李','c',NULL,18),(18,'小明','a',NULL,18),(19,'小爱','b',NULL,18),(20,'小李','c',NULL,18),(22,'小明','a',NULL,18),(23,'小爱','b',NULL,18),(24,'小李','c',NULL,18),(25,'小明','a',NULL,18),(26,'小爱','b',NULL,18),(27,'小李','c',NULL,18),(28,'小明','a',NULL,18),(29,'小爱','b',NULL,18),(30,'小李','c',NULL,18),(31,'小明','a',NULL,18),(32,'小爱','b',NULL,18),(33,'小李','c',NULL,18),(37,'小明','a',NULL,18),(38,'小爱','b',NULL,18),(39,'小李','c',NULL,18),(40,'小明','a',NULL,18),(41,'小爱','b',NULL,18),(42,'小李','c',NULL,18),(43,'小明','a',NULL,18),(44,'小爱','b',NULL,18),(45,'小李','c',NULL,18),(46,'小明','a',NULL,18),(47,'小爱','b',NULL,18),(48,'小李','c',NULL,18),(49,'小明','a',NULL,18),(50,'小爱','b',NULL,18),(51,'小李','c',NULL,18),(52,'小明','a',NULL,18),(53,'小爱','b',NULL,18),(54,'小李','c',NULL,18),(55,'小明','a',NULL,18),(56,'小爱','b',NULL,18),(57,'小李','c',NULL,18),(58,'小明','a',NULL,18),(59,'小爱','b',NULL,18),(60,'小李','c',NULL,18),(68,'小明','a',NULL,18),(69,'小爱','b',NULL,18),(70,'小李','c',NULL,18),(71,'小明','a',NULL,18),(72,'小爱','b',NULL,18),(73,'小李','c',NULL,18),(74,'小明','a',NULL,18),(75,'小爱','b',NULL,18),(76,'小李','c',NULL,18),(77,'小明','a',NULL,18),(78,'小爱','b',NULL,18),(79,'小李','c',NULL,18),(80,'小明','a',NULL,18),(81,'小爱','b',NULL,18),(82,'小李','c',NULL,18),(83,'小明','a',NULL,18),(84,'小爱','b',NULL,18),(85,'小李','c',NULL,18),(86,'小明','a',NULL,18),(87,'小爱','b',NULL,18),(88,'小李','c',NULL,18),(89,'小明','a',NULL,18),(90,'小爱','b',NULL,18),(91,'小李','c',NULL,18),(92,'小明','a',NULL,18),(93,'小爱','b',NULL,18),(94,'小李','c',NULL,18),(95,'小明','a',NULL,18),(96,'小爱','b',NULL,18),(97,'小李','c',NULL,18),(98,'小明','a',NULL,18),(99,'小爱','b',NULL,18),(100,'小李','c',NULL,18);

/*Table structure for table `t_wife` */

DROP TABLE IF EXISTS `t_wife`;

CREATE TABLE `t_wife` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `wife_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `fk_hus_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_wife` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
