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
-- Table structure for table `ford`
--

DROP TABLE IF EXISTS `ford`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ford` (
  `Plate_Num` varchar(11) NOT NULL,
  `Passengers_Capacity` int(11) DEFAULT NULL,
  `Symbol` varchar(5) DEFAULT NULL,
  `Original_Assigned_Lane` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Plate_Num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ford`
--

LOCK TABLES `ford` WRITE;
/*!40000 ALTER TABLE `ford` DISABLE KEYS */;
INSERT INTO `ford` VALUES ('111222333',7,'F','Ramallah-Nablus'),('123456789',7,'F','Ramallah-Mazra\'a Al Sharqieh'),('1987654321',7,'F','Ramallah-BZU'),('341664411',7,'F','Ramallah-Deir Debwan'),('341664811',7,'F','Ramallah-Turmusayya'),('341664824',7,'F','Ramallah-Beit Our'),('567234987',7,'F','Beirzeit-Sinjil'),('771664824',7,'F','Ramallah-Beit Seera'),('771669823',7,'F','Beirzeit-Betlahem'),('771669824',7,'F','BZU-Irsal');
/*!40000 ALTER TABLE `ford` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-25 22:08:01
