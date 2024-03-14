-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: evrak_otomasyon
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `evraklar`
--

DROP TABLE IF EXISTS `evraklar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `evraklar` (
  `evrak_no` int NOT NULL AUTO_INCREMENT,
  `gUnvan` varchar(45) NOT NULL,
  `aUnvan` varchar(45) NOT NULL,
  `icerik` varchar(45) NOT NULL,
  `tarih` varchar(45) NOT NULL,
  `konu` varchar(45) NOT NULL,
  `gHesapNo` int DEFAULT NULL,
  `aHesapNo` int DEFAULT NULL,
  `gTel` varchar(14) DEFAULT NULL,
  `aTel` varchar(14) DEFAULT NULL,
  `gAdres` varchar(45) DEFAULT NULL,
  `aAdres` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`evrak_no`)
) ENGINE=InnoDB AUTO_INCREMENT=566 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evraklar`
--

LOCK TABLES `evraklar` WRITE;
/*!40000 ALTER TABLE `evraklar` DISABLE KEYS */;
INSERT INTO `evraklar` VALUES (111,'Omer_Kavakli','Maramar','sa','2024-01-04','selam',100,0,'0          ','0          ','',''),(121,'Omer_Kavakli','deede','asd','2023-05-12','komlk',100,NULL,NULL,NULL,NULL,NULL),(564,'burak.kaan_karacay','omer_kavakli','how are you?','2023-01-02','how r u?',102,100,'0(   )   -    ','0(156)156-1656','brezilya',''),(565,'omer_kavakli','burak.kaan_karacay','im fine thanks please sit down','2023-01-03','fine',100,102,'0(   )   -    ','0(554)155-1515','Marmara Uni','');
/*!40000 ALTER TABLE `evraklar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kullanicilar`
--

DROP TABLE IF EXISTS `kullanicilar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kullanicilar` (
  `hesap_no` int NOT NULL,
  `sifre` varchar(45) NOT NULL,
  `ad` varchar(45) NOT NULL,
  `soyad` varchar(45) NOT NULL,
  `unvan` varchar(45) NOT NULL,
  `tel` varchar(14) DEFAULT NULL,
  `adres` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`hesap_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kullanicilar`
--

LOCK TABLES `kullanicilar` WRITE;
/*!40000 ALTER TABLE `kullanicilar` DISABLE KEYS */;
INSERT INTO `kullanicilar` VALUES (100,'1','Omer','Kavakli','omer_kavakli','0(554)155-1515','Marmara Uni'),(101,'1','Fatih','Kavakli','Fatih_Kavakli',NULL,NULL),(102,'2','Burak Kaan','Karacay','burak.kaan_karacay','0(156)156-1656','brezilya');
/*!40000 ALTER TABLE `kullanicilar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `malievraklar`
--

DROP TABLE IF EXISTS `malievraklar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `malievraklar` (
  `mEvrak_no` int NOT NULL,
  `gUnvan` varchar(45) NOT NULL,
  `aUnvan` varchar(45) NOT NULL,
  `icerik` varchar(45) NOT NULL,
  `tarih` varchar(45) NOT NULL,
  `konu` varchar(45) NOT NULL,
  `tutar` varchar(45) NOT NULL,
  `kdv` varchar(5) NOT NULL,
  `gHesapNo` int DEFAULT NULL,
  `aHesapNo` int DEFAULT NULL,
  `gTel` varchar(14) DEFAULT NULL,
  `aTel` varchar(14) DEFAULT NULL,
  `gAdres` varchar(45) DEFAULT NULL,
  `aAdres` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`mEvrak_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `malievraklar`
--

LOCK TABLES `malievraklar` WRITE;
/*!40000 ALTER TABLE `malievraklar` DISABLE KEYS */;
INSERT INTO `malievraklar` VALUES (121,'Omer_Kavakli','deede','asd','2023-05-12','komlk','50000','%0',100,0,'0          ','0          ','',''),(142,'Omer_Kavakli','arada','vvd','2023-05-12','ssh','234567','20',100,NULL,NULL,NULL,NULL,NULL),(315,'Omer_Kavakli','damla','dsa','2024-01-01','dsa','150','%20',100,0,'','','','');
/*!40000 ALTER TABLE `malievraklar` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-01 22:26:54
