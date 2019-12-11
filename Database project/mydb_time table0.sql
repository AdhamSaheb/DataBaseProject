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
-- Table structure for table `time table`
--

DROP TABLE IF EXISTS `time table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `time table` (
  `Day` varchar(10) NOT NULL,
  `Clock` varchar(10) NOT NULL DEFAULT '',
  `Vehicles_Passing_per_hr` int(11) DEFAULT NULL,
  `DriverID` varchar(11) NOT NULL DEFAULT '',
  `LName` varchar(45) NOT NULL DEFAULT '',
  `Plate_Num` varchar(11) NOT NULL DEFAULT '',
  PRIMARY KEY (`Day`,`Clock`,`DriverID`,`LName`,`Plate_Num`),
  KEY `DID_idx` (`DriverID`),
  KEY `LName_idx` (`LName`),
  KEY `Plate_Num_idx` (`Plate_Num`),
  CONSTRAINT `DriverID` FOREIGN KEY (`DriverID`) REFERENCES `driver` (`DID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `LName` FOREIGN KEY (`LName`) REFERENCES `lane` (`Lname`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `Plate_Num` FOREIGN KEY (`Plate_Num`) REFERENCES `vehicles` (`Plate_Num`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `time table`
--

LOCK TABLES `time table` WRITE;
/*!40000 ALTER TABLE `time table` DISABLE KEYS */;
/*!40000 ALTER TABLE `time table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-25 22:07:55
