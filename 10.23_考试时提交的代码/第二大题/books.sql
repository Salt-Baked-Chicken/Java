/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.5.40 : Database - books
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`books` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `books`;

/*Table structure for table `books` */

DROP TABLE IF EXISTS `books`;

CREATE TABLE `books` (
  `book` varchar(20) NOT NULL DEFAULT '书',
  `auther` varchar(8) DEFAULT '佚名',
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `leibie` varchar(8) DEFAULT NULL,
  `chubanshe` varchar(10) DEFAULT NULL,
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `books` */

insert  into `books`(`book`,`auther`,`id`,`leibie`,`chubanshe`) values ('a','c',3,NULL,NULL),('nn','oo',4,NULL,NULL);

/*Table structure for table `loginame` */

DROP TABLE IF EXISTS `loginame`;

CREATE TABLE `loginame` (
  `loginame` int(10) NOT NULL,
  `psw` int(10) DEFAULT NULL,
  PRIMARY KEY (`loginame`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `loginame` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
