-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: mydb
-- ------------------------------------------------------
-- Server version	5.1.46-community

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `lane`
--

DROP TABLE IF EXISTS `lane`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lane` (
  `LName` varchar(45) NOT NULL,
  `Av_trip_duration` float DEFAULT NULL,
  `Price` float DEFAULT NULL,
  `Final_Destination` varchar(45) DEFAULT NULL,
  `Starting_Point` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`LName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lane`
--

LOCK TABLES `lane` WRITE;
/*!40000 ALTER TABLE `lane` DISABLE KEYS */;
INSERT INTO `lane` VALUES ('Balou\'-Ramallah',10,2.5,'Ramallah','Balou\''),('Birzeit-BZU',3,2,'BZU','Birzeit\''),('Irsal-AbuQash-BZU-Birzeit',7,3,'BZU','BestEastern'),('Irsal-BZU-Mazra\'a Al Sharqieh',20,6,'Mazra\'a Al Sharqieh','Irsal'),('Kufr Aqab-Ramallah',10,2.5,'Ramallah','Kufr Aqab'),('Kufr Aqab-Ramallah-Irsal-AbuQash-BZU',40,7.5,'BZU','Kufr Aqab'),('Masyoon-Ramallah',10,2.5,'Ramallah','Masyoon\''),('Masyoon-Ramallah-Irsal-AbuQash-BZU',30,7.5,'BZU','Masyoon'),('Ramallah-Irsal-AbuQash-BZU-Birzeit',20,5,'Birzeit','Irsal'),('Surda-BZU',5,3,'BZU','Surda\''),('Teireh-Ramallah',10,3,'Ramallah','Teireh\''),('Teireh-Ramallah-Irsal-AbuQash-BZU',30,8,'BZU','Teireh');
/*!40000 ALTER TABLE `lane` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-25 22:07:54
