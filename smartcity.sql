-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Dec 19, 2023 at 11:49 AM
-- Server version: 8.2.0
-- PHP Version: 8.2.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `smartcity`
--

-- --------------------------------------------------------

--
-- Table structure for table `accomidation`
--

DROP TABLE IF EXISTS `accomidation`;
CREATE TABLE IF NOT EXISTS `accomidation` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` text NOT NULL,
  `Address` text NOT NULL,
  `Longa` float NOT NULL,
  `Lat` float NOT NULL,
  `Description` text NOT NULL,
  `AverageWeeklyCost` float NOT NULL,
  UNIQUE KEY `ID` (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `company`
--

DROP TABLE IF EXISTS `company`;
CREATE TABLE IF NOT EXISTS `company` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Company` text NOT NULL,
  `Address` text NOT NULL,
  `Description` text NOT NULL,
  `Industry` text NOT NULL,
  `DateCreated` datetime DEFAULT CURRENT_TIMESTAMP,
  UNIQUE KEY `ID` (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `hotels`
--

DROP TABLE IF EXISTS `hotels`;
CREATE TABLE IF NOT EXISTS `hotels` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` text NOT NULL,
  `Address` text NOT NULL,
  `Longa` float NOT NULL,
  `Lat` float NOT NULL,
  `Description` text NOT NULL,
  `Email` text NOT NULL,
  UNIQUE KEY `ID` (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `jobposting`
--

DROP TABLE IF EXISTS `jobposting`;
CREATE TABLE IF NOT EXISTS `jobposting` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `JobTitle` text NOT NULL,
  `Company` text NOT NULL,
  `Salary` float NOT NULL,
  `Description` text NOT NULL,
  `Contact` text NOT NULL,
  `CompanyWebsite` text NOT NULL,
  UNIQUE KEY `ID` (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `libraries`
--

DROP TABLE IF EXISTS `libraries`;
CREATE TABLE IF NOT EXISTS `libraries` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Address` text NOT NULL,
  `Longa` float NOT NULL,
  `Lat` float NOT NULL,
  `Description` text NOT NULL,
  `Website` text NOT NULL,
  UNIQUE KEY `ID` (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
CREATE TABLE IF NOT EXISTS `news` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Headline` text NOT NULL,
  `Description` text NOT NULL,
  `DateCreated` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  UNIQUE KEY `ID` (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `rentablespace`
--

DROP TABLE IF EXISTS `rentablespace`;
CREATE TABLE IF NOT EXISTS `rentablespace` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Address` text NOT NULL,
  `SizeSQF` float NOT NULL,
  `CostPerMonth` float NOT NULL,
  `Description` text NOT NULL,
  `Contact` text NOT NULL,
  `DatePublished` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  UNIQUE KEY `ID` (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `resteraunt`
--

DROP TABLE IF EXISTS `resteraunt`;
CREATE TABLE IF NOT EXISTS `resteraunt` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` text NOT NULL,
  `Address` text NOT NULL,
  `Longa` float NOT NULL,
  `Lat` float NOT NULL,
  `Description` text NOT NULL,
  `Email` text NOT NULL,
  UNIQUE KEY `ID` (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `unicol`
--

DROP TABLE IF EXISTS `unicol`;
CREATE TABLE IF NOT EXISTS `unicol` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` int NOT NULL,
  `Address` int NOT NULL,
  `Longa` int NOT NULL,
  `Lat` int NOT NULL,
  `Description` int NOT NULL,
  `Email` int NOT NULL,
  `Courses` int NOT NULL,
  `Website` int NOT NULL,
  UNIQUE KEY `ID` (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `UserName` text NOT NULL,
  `Fullname` text NOT NULL,
  `Password` text NOT NULL,
  `Email` text NOT NULL,
  `DateCreated` datetime NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `volunteering`
--

DROP TABLE IF EXISTS `volunteering`;
CREATE TABLE IF NOT EXISTS `volunteering` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `JobTitle` text NOT NULL,
  `Company` text NOT NULL,
  `Description` text NOT NULL,
  `CompanyWebsite` text NOT NULL,
  `Contact` text NOT NULL,
  UNIQUE KEY `ID` (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `whatson`
--

DROP TABLE IF EXISTS `whatson`;
CREATE TABLE IF NOT EXISTS `whatson` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` text NOT NULL,
  `Address` text NOT NULL,
  `Longa` float NOT NULL,
  `Lat` float NOT NULL,
  `Description` text NOT NULL,
  `Email` text NOT NULL,
  `Activity` text NOT NULL,
  UNIQUE KEY `ID` (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
