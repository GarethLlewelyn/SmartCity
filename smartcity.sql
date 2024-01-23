-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jan 23, 2024 at 06:27 PM
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
  `Name` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `Address` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `Description` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `Email` varchar(100) COLLATE utf8mb3_unicode_ci NOT NULL,
  `AverageWeeklyCost` float NOT NULL,
  UNIQUE KEY `ID` (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=54 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci;

--
-- Dumping data for table `accomidation`
--

INSERT INTO `accomidation` (`ID`, `Name`, `Address`, `Description`, `Email`, `AverageWeeklyCost`) VALUES
(1, 'et', '67607 Alan Square Suite 996\nLake Dario, NY 80684-8142', 'Nemo qui voluptatem minima. Natus est ipsum nemo id quo. Numquam maxime recusandae consequatur saepe ad et.', '', 537504),
(2, 'nisi', '1343 Heidenreich Valleys Apt. 263\nLaverntown, PA 90301-6324', 'Quam quis dicta aspernatur est voluptatem similique ad. Voluptatem quia aut possimus commodi. Ut eius in maxime iusto odit.', '', 263.663),
(3, 'numquam', '80168 Joana Via\nLake Rowanborough, TX 79220-5054', 'Sequi quia dolore similique neque. Tenetur ut sint fugiat rerum est hic. Ea deserunt dolor et eius quidem quisquam.', '', 556261),
(4, 'IT WORKS', '58614 Herminia Cliff Suite 592 Port Hiram, SD 98064', 'Qui libero animi eos at inventore delectus voluptas. Necessitatibus provident voluptas nobis dolores laboriosam corrupti. Asperiores iste delectus in facilis commodi maiores.', '', 22.262),
(5, 'quas', '9198 O\'Keefe Corners\nNew Baylee, ND 97900-7671', 'Sapiente nostrum maiores facere dicta repudiandae esse dolor. Quod sit eos itaque possimus. Quaerat alias voluptatem necessitatibus distinctio beatae unde. Quis numquam aut non suscipit.', '', 3.96),
(6, 'qui', '30433 Marks Brooks\nLake Petemouth, NV 03849', 'Mollitia eos numquam maxime nobis quaerat. Sed ratione iure aut sed perferendis corporis et. Vero qui quam non ea quia earum nobis porro.', '', 3332590),
(7, 'unde', '023 Jaskolski Overpass\nEast Piperbury, WI 16681', 'Voluptatum sunt et molestiae nemo. Quaerat dolorem et est et ad dolorum. Ab asperiores est nihil. Ea ipsum deserunt officia.', '', 15616900),
(8, 'qui', '181 Kertzmann Village\nEast Aniya, DE 35483-6114', 'Ut et dolor distinctio accusamus nihil sed. Asperiores et numquam minima quidem ut. Consequatur at totam et rerum non.', '', 1502.28),
(9, 'reiciendis', '649 Salvatore Lakes Apt. 593\nLake Elnora, NV 94321-5982', 'Et fugiat tempora iure enim sapiente aliquid. Sit velit amet sequi hic iusto non maiores. Beatae totam quas velit rem amet dolor a. Tempora eaque quo eveniet et fugiat distinctio.', '', 3477250),
(10, 'et', '14676 Wilber Underpass Apt. 018\nEast Harmony, IL 79526', 'Sint saepe consequatur perspiciatis eaque dicta omnis temporibus. Aliquam repellendus est rem laboriosam consectetur natus. Sapiente animi ipsum qui. Veritatis voluptate aperiam maxime non debitis. Et quia amet nobis corporis ad tempore.', '', 3818.58),
(11, 'quia', '55559 Effertz Drives\nPort Doviechester, ME 13428', 'Ad similique non itaque necessitatibus quidem. Unde ut cupiditate pariatur minus. Eaque aut iste facere blanditiis dignissimos.', '', 19.6299),
(12, 'fuga', '1244 Kamren Cliff\nSouth Jamel, ME 05990-9679', 'Voluptatum dolorum quam quasi consequatur numquam qui. Dolorem maxime totam aut excepturi. Ratione et officia odit vitae labore rerum. Accusantium cumque quos modi et cum.', '', 0.738778),
(13, 'quos', '57786 Jamey Run Apt. 039\nHolliemouth, ME 65689-0332', 'Consequuntur laudantium voluptatem inventore nihil eveniet accusamus. Illo veniam consectetur molestiae et. Pariatur culpa cum facere dolorem.', '', 3175100),
(14, 'aut', '16011 Lilla Locks New Nickolas, DE 43249-4513', 'Tempora consequuntur incidunt repellendus aliquam incidunt incidunt. Et fugiat itaque officiis. Maxime commodi aut ut aspernatur nesciunt iusto. Dolor voluptatem maiores quos maxime.', '', 9.61),
(15, 'dolore', '68447 Modesta Springs Suite 005\nWeissnatport, DE 73060', 'Fugiat iusto nihil quis sint sed dolor. Fugit quibusdam est voluptas dicta omnis et. Qui et aliquid autem earum quia aut non.', '', 640857000),
(51, 'g', 'g', 'g', 'g', 214),
(52, 'test', 'test', 'test', 'test', 25),
(53, 'Name', 'Address', 'Desc', '123', 321),
(17, 'qui', '02612 Maiya Hill Apt. 649\nAmparoshire, DC 53628-5901', 'Maiores soluta et aperiam labore magnam delectus repellendus. Accusamus voluptatem et consequuntur impedit laudantium et. Labore excepturi commodi omnis consequatur.', '', 7.652),
(18, 'eum', '258 Runte Street Suite 635\nPort Coratown, VT 90265', 'Natus dignissimos sequi ipsam enim laborum modi quo et. Et ut enim ea alias. Tempora ut ipsam ullam non quibusdam laborum. Ut non maiores vitae at aut ut rem.', '', 0),
(19, 'aperiam', '8518 Chaya Cliffs\nPort Alvahview, WV 84517-5753', 'Placeat rem impedit consequuntur debitis culpa necessitatibus. Et repellendus omnis est at fuga sit.', '', 17121.9),
(20, 'et', '6778 Marcel Extensions Suite 916\nYasmineburgh, IA 07146-2870', 'Beatae et repudiandae dolor dolores cumque molestiae fugiat consequatur. Non ut itaque et voluptas ullam magni. Aperiam reiciendis mollitia ipsum earum cumque quia error. Est et ea temporibus sit veritatis esse minima. Ea cumque sit dicta asperiores illo non.', '', 1315340),
(21, 'corrupti', '8041 Runolfsdottir Creek Suite 073\nHartmannmouth, OH 32874-2767', 'Temporibus provident sint enim molestias vero dolor voluptas quae. Tempore repellat consectetur fugiat illum cupiditate earum enim. Aut omnis voluptatibus fuga modi id omnis.', '', 2.53745),
(22, 'debitis', '0827 Lowe Road\nHayesshire, NJ 10389', 'Autem exercitationem quasi natus qui explicabo quisquam ut. Vero dignissimos nisi mollitia ut voluptatem.', '', 59.8166),
(23, 'assumenda', '1303 Connelly Meadows Suite 873\nEast Cristal, NY 11536', 'Iste sunt cupiditate ad rem. Culpa at quas repellendus rem architecto.', '', 13660200),
(24, 'quod', '9174 Kathryne Ferry\nLake Junius, AL 72842-8258', 'Qui qui sapiente qui quia. Voluptate non aut maiores consequatur perspiciatis dolore inventore. Nisi sint eius porro quo.', '', 17767300),
(25, 'vero', '4875 Gilberto Island\nWest Alaina, TX 75883-4953', 'Laborum doloremque qui consequatur. Iste modi distinctio eligendi molestiae omnis adipisci. Maiores a sequi sunt sunt non distinctio voluptate. Ab repellat voluptatibus et corrupti illum.', '', 25316.2),
(26, 'corrupti', '41185 Casimir Ranch\nNew Osborneside, DC 33672', 'Officiis eos iusto non et ea molestiae eos at. Nobis totam nihil vero nihil perferendis mollitia aut. Fugit omnis minus enim.', '', 66439400),
(27, 'at', '62747 Cremin Groves Apt. 019\nSouth Marcborough, TN 84609', 'Et eveniet ullam harum aspernatur. Delectus id quisquam aut tempora laborum sequi quo. Est laborum voluptas voluptatum aperiam velit.', '', 2.61),
(28, 'atque', '39170 Vella Plains\nSouth Sasha, NJ 99965', 'Quam laudantium culpa voluptate quaerat consequuntur possimus voluptatem magnam. Et ut et deleniti ducimus eligendi excepturi hic et. Dolorum aut suscipit est soluta. Est quas quo sit occaecati ipsam voluptatem atque.', '', 0),
(29, 'qui', '375 Towne Key\nSouth Vanceborough, ID 38616-0080', 'Architecto dicta assumenda pariatur. Doloremque et quia debitis velit est dignissimos eius. Similique qui dolorum hic et.', '', 9.5404),
(30, 'rerum', '090 Runolfsson Walk Apt. 333\nBaumbachstad, TX 74294-3681', 'Nihil atque error et aut iure enim sit. Tempore officiis repellat nihil modi culpa. Odio totam voluptates qui. Voluptatem et saepe qui natus.', '', 117.371),
(31, 'adipisci', '22472 Heathcote Spur\nAdamsshire, RI 93957-9953', 'At eum eum omnis a deleniti ducimus facere. Et dolorem nam quae repudiandae consequatur eveniet quo. Repellat libero doloribus omnis odio aliquam officiis ex.', '', 1.6),
(32, 'provident', '88856 Pamela Falls\nNorth Corbinmouth, AK 40338', 'Architecto amet quos ab at. Excepturi doloremque velit nesciunt voluptates aspernatur animi. Est aut aspernatur debitis dolor quo. Dolorum aliquid fugiat harum.', '', 21535.9),
(33, 'optio', '37074 Myron Drive\nDamionberg, RI 95492', 'Veniam magnam dolore fugiat sunt animi fugit non laudantium. Quisquam optio non occaecati totam rerum molestias. Officiis tempore omnis ea enim.', '', 124.007),
(34, 'voluptatem', '67160 Russel Crescent Suite 083\nLuettgenville, MS 77437-1917', 'Quis inventore ex ad porro. Eligendi temporibus et non impedit et optio. Fugit aut culpa aut ipsam molestiae quo.', '', 30340600),
(35, 'iste', '463 Zachary Plaza\nWinonafurt, GA 41915', 'Consectetur laborum laboriosam labore architecto quae eligendi omnis. Ipsa occaecati quam suscipit aperiam ipsa dolore laboriosam repellendus. Velit facere aut minus quaerat iure deserunt magni. Libero eius dolor fugit nobis et.', '', 11453400),
(36, 'dolor', '57295 Nelda Loaf Suite 032\nCummingsville, MN 19280', 'Quia illum vel vel ipsam et delectus occaecati vel. Aut magni vitae unde nihil. Fuga est doloribus reprehenderit eos incidunt praesentium maxime officia. Reiciendis totam nostrum dignissimos quos qui.', '', 362279),
(37, 'inventore', '8604 Skyla Neck Suite 479\nNikolausview, NC 84469-3052', 'Dolor rerum et velit voluptas. Labore vitae dolor laudantium consequatur voluptas. Provident at dignissimos ut dolore assumenda vitae. Consectetur provident aspernatur consequatur aut dolorem.', '', 25194),
(38, 'distinctio', '758 Grant Summit Suite 198\nSouth Chase, TX 70550', 'Dignissimos blanditiis rerum ex rem ipsam accusamus ut quos. Illo porro et quisquam consequatur et. In minima quia aperiam culpa accusantium. Tempora culpa est sit asperiores molestiae in ducimus nostrum.', '', 41069),
(39, 'nihil', '75642 Mertz Fork\nWymanshire, NH 70196', 'Atque voluptatem totam pariatur. Culpa et non non voluptates quas nam. Eligendi et aut reiciendis quo aut sit. Cum qui incidunt consequatur non dolor et aspernatur modi.', '', 165892),
(40, 'facere', '4646 Farrell Fork Apt. 854\nLake Erickside, CO 12018', 'Maiores aliquid tenetur ex velit accusamus libero repellat voluptatem. Soluta voluptas deleniti ratione reprehenderit nobis nihil nemo. Expedita et totam et ut ut ut corrupti.', '', 5.60736),
(41, 'ab', '0068 Providenci Harbors Suite 040\nNicoletteland, CA 20376', 'Ipsum soluta dolores itaque sequi beatae dolor et molestias. Repudiandae nesciunt ut illo minima velit molestias.', '', 506.459),
(42, 'enim', '093 Chaya Crest Apt. 769\nRebaburgh, IN 01067-1893', 'Pariatur voluptate distinctio magnam. Consequatur animi ut est maxime enim. Minus dicta aliquid aut numquam.', '', 31.4),
(43, 'sed', '691 Ramiro Key Apt. 961\nConsidinemouth, MT 50837', 'Aperiam eaque facilis aperiam dolores ab. Nam et molestias ut nihil reiciendis facilis omnis. Nihil temporibus quaerat eius asperiores. Molestiae totam modi et sunt. Voluptatem non molestias molestias veritatis.', '', 21.379),
(44, 'excepturi', '497 Upton Haven\nAndrewstad, WY 28823-1078', 'Ipsa consequatur dolorem adipisci sit. Dolor sit rerum consequatur sapiente. Temporibus soluta aut dolorem quo.', '', 168156000),
(45, 'beatae', '154 Justine Ridges\nSouth Skylar, CA 40214-4738', 'Dolor rerum ut unde et ad velit. Deleniti facere atque cum consequatur. Dolor minus tenetur et iusto sunt expedita. Repudiandae et consequuntur omnis consequatur autem ea. Consequatur ratione iste amet minima.', '', 13.1164),
(46, 'qui', '24309 Waelchi Plaza\nRodgerton, OR 69011', 'Esse et esse sequi qui cumque ducimus autem. Eligendi aliquid cum incidunt impedit. Temporibus qui magnam aut. Qui tempora quaerat ex dolor laudantium facere dolores.', '', 182.49),
(47, 'quod', '145 Schowalter Isle Apt. 515\nDaughertymouth, MN 71432', 'In doloribus eius nam facilis voluptatem commodi omnis. Dolorem nesciunt illum perspiciatis velit eos sed.', '', 5209400),
(48, 'quam', '3505 Hand Loaf Suite 352\nLake Alexie, IL 40505-6345', 'Aut et provident nesciunt illum incidunt. Dolore modi voluptatem aut quas est laborum. Quis recusandae cumque temporibus est enim vero quis. Illum minima aperiam similique doloremque sapiente quidem qui.', '', 654.958),
(49, 'sed', '08565 Reilly Locks\nThielbury, WI 27529', 'Consectetur error repellendus dicta ut vero. Sed est natus et. Dolores expedita consequatur nostrum saepe. Necessitatibus in dolores nulla quia.', '', 4702.71),
(50, 'non', '2659 Tromp Expressway\nCollinston, OR 30597-6626', 'Praesentium quidem aut eum in atque laborum. Itaque et neque repellendus magni. Enim voluptates distinctio enim est. Accusamus et illum maiores ut laborum.', '', 30302400);

-- --------------------------------------------------------

--
-- Table structure for table `business`
--

DROP TABLE IF EXISTS `business`;
CREATE TABLE IF NOT EXISTS `business` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Company` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `Address` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `Description` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `Industry` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `Email` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci NOT NULL,
  `DateCreated` datetime DEFAULT CURRENT_TIMESTAMP,
  UNIQUE KEY `ID` (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=56 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci;

--
-- Dumping data for table `business`
--

INSERT INTO `business` (`ID`, `Company`, `Address`, `Description`, `Industry`, `Email`, `DateCreated`) VALUES
(1, 'Purdy, Huels and Crooks', '1361 Kenna Motorway Apt. 368\nNew Vernicemouth, KS 26583', 'Optio qui iste ex omnis non quo tempore. Ullam assumenda occaecati ut nihil enim ipsam odio.', '', 'yfadel@example.net', '2020-03-02 10:49:59'),
(2, 'Casper, Graham and Zulauf', '00762 Arvid Flat Apt. 556\nSallietown, HI 70360', 'Optio impedit qui odio iusto. Ab esse sint eveniet et. Eius doloribus quas explicabo repellat.', '', 'kitty60@example.org', '1987-08-24 18:00:27'),
(3, 'Prosacco Ltd', '015 Crooks Tunnel\nWernerside, NY 35991', 'Voluptatum facilis pariatur ut a porro optio. Ut modi dicta ut at. Aut neque in repudiandae est dolor. Et et quia similique expedita consequuntur officiis.', '', 'ebayer@example.org', '2005-05-31 23:52:43'),
(4, 'White, Green and Ortiz', '3144 Walter Gateway Suite 669\nOrtizstad, VA 11702', 'Vel unde culpa error sapiente. Autem autem placeat consequatur mollitia accusantium voluptatem.', '', 'kallie.mclaughlin@example.org', '2000-11-16 06:33:01'),
(5, 'Feeney and Sons', '02909 Donnelly Pass\nCindyton, VA 13484-0858', 'Laboriosam ipsa voluptate nam quaerat et. Ducimus facilis unde laborum temporibus rem quia adipisci. Dolores qui asperiores quaerat est. Accusantium velit repellat quia fugiat. Voluptates voluptas ut vero rem ab.', '', 'douglas.eliezer@example.org', '2001-11-07 23:17:03'),
(6, 'Morar-Mante', '818 Tiana Springs Apt. 436\nBoehmville, TX 71753-2420', 'Blanditiis autem rerum labore explicabo sunt iusto. Quia optio voluptatem debitis ea harum qui asperiores. Aut aut voluptates mollitia eum.', '', 'kessler.garnett@example.net', '2009-02-15 23:19:14'),
(7, 'Wisozk-Homenick', '2990 Gonzalo Plaza Apt. 787\nForrestton, MS 39842-3573', 'Et voluptate neque quas dolores. Vel aut quod libero qui aut aut. Fugiat omnis omnis sunt dolorem itaque quis.', '', 'hwindler@example.com', '1997-04-11 23:35:49'),
(8, 'Greenholt-Miller', '99698 Okuneva Motorway Suite 432\nLaurencefurt, GA 94213-3399', 'Ut iusto ratione maxime exercitationem exercitationem repellendus voluptas. Ab nulla dicta velit quidem est quaerat. Ipsam voluptatibus voluptatibus qui ducimus dicta illo. Ut iste repudiandae occaecati placeat consequatur architecto aut sit.', '', 'schuppe.magnus@example.com', '1973-09-08 10:39:16'),
(9, 'Dietrich, Abshire and Lakin', '954 Bernhard Ferry\nAntonetteville, IL 39672-9612', 'Quia non et cum est eum repellat. Dolorem consequuntur modi totam nihil aut nobis. Ullam aut fugit temporibus quod magni.', '', 'jalen24@example.org', '1979-01-03 18:15:38'),
(10, 'Weimann, Corwin and Jones', '50215 Cremin Haven\nLake Jabari, RI 35393-9145', 'Numquam error corrupti eveniet temporibus. Debitis ea dignissimos accusantium quo voluptatem consectetur. Quos consequatur iusto veniam et quasi nobis sunt. Est corporis non illo earum.', '', 'rau.jaydon@example.com', '1973-12-25 23:57:00'),
(11, 'Bailey, Emard and Willms', '3133 Lexus Run Suite 472\nEast Laurettafort, WY 51890-4987', 'Delectus illum esse voluptas quae in eligendi et. Qui mollitia earum culpa ex consequatur unde eos. Placeat neque eius explicabo error sed enim.', '', 'dnolan@example.net', '1983-05-23 18:10:47'),
(12, 'Rau-Kulas', '92038 Ruecker Cliff\nPort Fabiolaland, PA 53288', 'Quas ipsum et quod. Recusandae reiciendis quod repudiandae.', '', 'schaden.clinton@example.net', '2000-09-08 02:46:18'),
(13, 'DuBuque-Reilly', '91027 Pacocha Extension Apt. 452\nLake Bettye, MT 56390', 'Voluptas nemo architecto illum excepturi ipsum. Sunt sed excepturi eos quisquam minus soluta reiciendis. Maxime atque in aut nihil.', '', 'parker.lenna@example.net', '2018-04-21 21:12:17'),
(14, 'Crooks-Schultz', '1751 Streich Ranch Suite 146\nKlingview, TX 02316-0884', 'Voluptas id deserunt est assumenda aut culpa corrupti. Provident delectus consectetur voluptatem quis fuga eos. Et dolores placeat labore mollitia eum eum eum et. Itaque qui illum nesciunt occaecati iusto autem.', '', 'sfahey@example.net', '2006-09-18 11:22:53'),
(15, 'Wunsch, Kulas and Kulas', '77228 Eriberto Cove\nBentonchester, OK 76648-5559', 'Iste omnis perspiciatis facilis iste eos quibusdam maiores. Odio minus rerum debitis ut qui. Natus iste eaque omnis aspernatur. Deserunt consequuntur quos aliquid cupiditate et voluptatibus.', '', 'hallie59@example.net', '1988-06-21 23:50:46'),
(16, 'Ruecker, Dibbert and Witting', '8287 Buckridge Crest\nNew Siennamouth, WY 72531', 'Molestiae fugiat in est nihil ipsa voluptates. Mollitia eum ex beatae molestiae sapiente minima explicabo velit. Accusantium laudantium et sapiente in sequi occaecati est sint. Laudantium voluptas eveniet voluptatem repellendus unde.', '', 'wilhelmine71@example.org', '1979-08-07 18:38:58'),
(17, 'Stokes PLC', '76561 Edmund Lane\nSipeschester, MT 37993', 'Delectus totam eum occaecati nobis tenetur quas iste reprehenderit. Alias quo fugit eius nihil voluptatem omnis. Molestiae voluptates quis distinctio saepe. Fuga quae quo quo eos nihil.', '', 'murphy.grady@example.com', '1996-08-13 03:59:12'),
(18, 'Ullrich LLC', '47271 Krajcik Lodge\nPaulamouth, ID 23754', 'Expedita exercitationem qui quod dolores iste. Autem incidunt voluptatem in voluptatibus non. Odit rerum rerum alias sed. Quaerat sit earum et unde cumque.', '', 'zieme.ona@example.net', '2009-01-07 18:17:17'),
(19, 'Flatley LLC', '15602 Kole Plains Suite 045\nNew Eldridgebury, NH 21607', 'Pariatur sit ut autem beatae debitis aut qui. Eius pariatur consequatur dolores illum. Quisquam recusandae sunt aut unde dolor. Voluptates aut maiores at ullam natus laborum culpa.', '', 'germaine74@example.net', '2012-07-27 17:19:34'),
(20, 'Stehr-Reinger', '018 Kuphal Plains\nZackburgh, AL 10885', 'Maiores natus eos sed eveniet consequatur. Non mollitia modi voluptas sit. Illum tempore et quas quod vel id. Quos porro atque ut doloribus. Similique corrupti adipisci tempore veritatis qui.', '', 'jade.macejkovic@example.com', '1975-09-18 05:33:07'),
(21, 'Frami Inc', '6275 Charity Station Apt. 823\nSouth Orionshire, GA 44133', 'Omnis rerum sint quia sit. Sit accusantium maiores velit voluptatem reiciendis. Non corrupti consequuntur dolor dolores dolores consequatur sapiente ipsum. At ipsum natus ut.', '', 'macie.kautzer@example.com', '1984-05-18 23:04:25'),
(22, 'Bailey Group', '61141 Gulgowski Lodge\nNew Lilianfort, ID 82273', 'Similique sit optio odio. Iusto est id quo nihil voluptatibus.', '', 'willis.blick@example.org', '1990-02-28 03:14:50'),
(23, 'Cummings, Purdy and Funk', '1829 Katrina Circle\nCassandrehaven, OH 83346', 'Laborum alias consequatur at est culpa est eius. Temporibus non aut ex modi a voluptatem minus qui. Id veniam explicabo aut non quia minima praesentium. Voluptatum suscipit assumenda aut doloremque illo ratione expedita.', '', 'brain.sipes@example.net', '2017-02-25 11:45:22'),
(24, 'Cole-Frami', '135 Hilpert Drives\nOceanefurt, MA 87808', 'Et eius asperiores blanditiis autem temporibus sed doloremque. Distinctio recusandae sit eius dignissimos animi. Repellendus ut qui nam eius velit earum voluptatem illum.', '', 'adriel.blick@example.org', '2017-10-08 15:21:34'),
(25, 'Hirthe-Heaney', '54943 Alysa Trail\nLindville, MI 59815-8419', 'Quae maiores dolores voluptates qui commodi sit. Quaerat modi velit id error laudantium.', '', 'amos.leannon@example.net', '1999-08-09 10:12:07'),
(26, 'Little Ltd', '2978 Kunde Cliffs\nDarylhaven, IA 15676-5352', 'Quidem explicabo rerum officiis voluptatem reprehenderit. Quia maiores suscipit sint quo eaque. Quo fugit sed tempore modi tenetur ea.', '', 'brekke.delphine@example.com', '2007-10-28 21:45:01'),
(27, 'Connelly Group', '974 Gaylord Point\nRosarioborough, OK 13546', 'Dignissimos nihil provident sed et occaecati qui. Esse est sequi eaque suscipit accusantium pariatur sunt. Et molestiae esse labore et ea.', '', 'o\'keefe.phoebe@example.org', '1991-10-16 20:19:48'),
(28, 'Blanda Ltd', '08523 Louvenia Glen Apt. 425\nLake Luciemouth, AK 16064', 'Cum necessitatibus architecto est rerum omnis ad consequuntur. Cumque dignissimos numquam et. Eum corrupti possimus omnis dolorem. Atque molestiae magni id rem nostrum sint.', '', 'xeffertz@example.net', '1998-09-20 19:29:47'),
(29, 'Reinger, Botsford and Cruickshank', '36358 Chesley Fields\nSouth Derickmouth, WY 14353-6947', 'Repudiandae sed aut eos nostrum expedita eos fugit repellendus. Quae autem et vel sint. Ut voluptas voluptates ut autem recusandae facilis odio ut. Rem velit magnam esse provident velit placeat molestias at.', '', 'kchristiansen@example.net', '2001-06-15 11:42:36'),
(30, 'Conroy, Kiehn and Goodwin', '090 Kip Canyon Suite 299\nYolandaside, VA 65911', 'Excepturi quaerat fugiat et excepturi quae. Eligendi repellendus esse est asperiores. Provident veniam est magnam suscipit. Aut possimus cumque impedit non.', '', 'santina22@example.net', '1985-06-05 04:14:25'),
(31, 'White, Walker and Sipes', '6929 Grant Creek\nLake Reedland, DE 31730', 'Qui accusantium ut et impedit ullam. Laudantium modi sequi itaque rem et totam accusantium laboriosam.', '', 'megane10@example.com', '1988-08-29 01:02:07'),
(32, 'Zemlak-Jakubowski', '387 Blick Inlet\nEribertoland, MA 09451-0568', 'Quaerat quia et accusamus iure sed quod dolorem reiciendis. Est excepturi et qui et. Ut fugiat est reprehenderit consequatur. Alias est ut aut natus nesciunt modi molestiae. Similique ut quis cum.', '', 'kay.harris@example.com', '1970-11-05 12:28:37'),
(33, 'Rau-Marks', '1002 Pete Junctions\nEast Amina, IA 69249', 'Similique nobis itaque tempora ab voluptatem sit. Aspernatur non facere est sit est ab esse.', '', 'maribel38@example.net', '1982-12-01 19:15:38'),
(34, 'Anderson-Boyer', '01575 Ned Run Suite 669\nLake Jessycamouth, CO 08041-7032', 'Aliquam quis aut perspiciatis excepturi. Culpa sed impedit vitae nostrum ullam tempora. Ut est veniam modi reprehenderit aut ipsum. Quam eveniet aut ratione.', '', 'mzemlak@example.net', '1970-09-27 19:13:23'),
(35, 'Rolfson, Hilpert and Hegmann', '47500 Keara Mountains\nOrentown, TN 78050', 'Consequuntur consequatur dolorem iusto eius quia aperiam laborum id. Sit impedit at ut repellat. Molestiae harum id dolorem sed.', '', 'd\'amore.melba@example.org', '1981-07-12 06:56:26'),
(36, 'Maggio PLC', '60411 Alexandro Harbor Suite 744\nLisaton, UT 64403', 'Explicabo dignissimos sit autem velit est quasi. Beatae sed repellat a voluptatem nostrum dicta. Quisquam eos adipisci corrupti excepturi sequi quidem excepturi. Alias amet ipsam deserunt nobis nihil perspiciatis inventore.', '', 'kaycee.sawayn@example.net', '1984-05-06 17:05:50'),
(37, 'Lang-Denesik', '0608 Bryana Club Apt. 917\nHermanfort, RI 19721', 'Velit dolore animi maiores sed praesentium. Officia autem nesciunt voluptatem architecto earum iusto et.', '', 'jewel94@example.net', '2009-01-13 02:58:44'),
(38, 'Friesen-Brakus', '925 Osinski Crescent Apt. 203\nOttoborough, NY 16958-1067', 'Odio dicta optio aliquid itaque. Perferendis voluptatem doloremque aut culpa quia veritatis numquam.', '', 'millie20@example.com', '1999-02-19 09:27:16'),
(39, 'Glover, Bins and Kerluke', '231 Hagenes Dale\nNorth Joaniefurt, MD 09016-0574', 'Eos optio et qui et. Est impedit et qui id. Enim repellendus quis quis quo natus et repellendus.', '', 'roxanne.baumbach@example.com', '2021-03-06 00:29:34'),
(40, 'Cole Inc', '639 Vanessa Run\nDaytonview, MN 01469', 'Autem consectetur ipsum doloremque quaerat quisquam cupiditate. Reiciendis illo et fuga aut doloribus neque.', '', 'kovacek.kendrick@example.com', '2020-08-31 07:26:43'),
(41, 'Hills-Satterfield', '879 Bernhard Springs Suite 396\nPaucekberg, KY 19374-7600', 'Corrupti provident dolores reiciendis suscipit dolor consequatur sapiente et. Aut voluptas sint corporis quo minima. Recusandae quidem porro ut deleniti recusandae.', '', 'jamey.wilkinson@example.net', '1981-09-24 15:08:54'),
(42, 'Hane PLC', '1667 D\'Amore Canyon Apt. 711\nTownemouth, NY 47216-9877', 'Molestias vel dolores vel voluptatum. Amet velit odio officiis incidunt officiis velit id. Explicabo enim illum quae. Dolor voluptate repellat recusandae vitae.', '', 'whermiston@example.com', '1978-02-20 19:27:12'),
(43, 'Hayes-O\'Keefe', '285 Shanahan Ford\nLake Jordy, PA 80945-2939', 'Eos voluptate est omnis eos. Quia nesciunt dolores facere vitae culpa laudantium. Omnis consectetur maiores minus cumque atque.', '', 'mkris@example.com', '2010-07-22 02:37:27'),
(44, 'McDermott-Wiegand', '79322 Littel Mission\nHeaneyfurt, PA 47923', 'Amet distinctio dignissimos assumenda sint omnis et asperiores et. Maiores voluptatem est ea. Optio vel ea pariatur. Quia quibusdam quam sunt vel laborum sunt.', '', 'bhaag@example.net', '2019-07-26 04:55:45'),
(45, 'Schmitt, Rohan and Koss', '3531 Trantow Forges Apt. 105\nWandamouth, AK 25698-9604', 'Sed voluptatem optio aut. Nisi voluptatem quod et deleniti quia. Ut modi qui qui. Voluptatem pariatur saepe et quod magni eum nostrum.', '', 'johan06@example.org', '2021-06-05 10:00:36'),
(46, 'Langosh PLC', '04675 Dovie Meadow Suite 400\nHellerfort, NE 27474-0670', 'Omnis vel ullam cupiditate odio. Dolorem ut quo dolore itaque similique sit dolores et. Voluptatem ea alias fuga. Tempora in aliquam molestias praesentium ratione repellat ex placeat.', '', 'prenner@example.net', '1974-07-19 11:06:28'),
(47, 'Gaylord-Swift', '810 Erdman Ville Suite 910\nAmbertown, GA 80907', 'Neque itaque doloribus assumenda sed quo. Doloremque facilis et itaque est delectus reprehenderit. Voluptatem qui sunt quos alias.', '', 'hermann.emilia@example.com', '1990-06-30 06:57:07'),
(48, 'Schultz Ltd', '661 Kub Camp\nNew Richiebury, TX 27471-1139', 'Amet repellat vel ratione ad. Sit omnis nemo est culpa cum. Neque magnam ut cupiditate sint odit.', '', 'katherine91@example.com', '1984-01-21 09:01:00'),
(49, 'Pfannerstill LLC', '5427 Renner Run Apt. 417\nPenelopemouth, AR 65270', 'Blanditiis aut reiciendis dicta. Maxime sit assumenda qui et quam velit. Nesciunt non quas aut omnis. Et rerum qui ullam eos corrupti modi commodi.', '', 'umaggio@example.com', '2021-01-08 11:38:54'),
(50, 'Rice Group', '0573 Ortiz Plains\nNorth Clark, WA 58191', 'Unde sunt consectetur esse esse ut vitae. Eaque totam adipisci provident distinctio voluptatibus dolor. Molestias laudantium fugit enim qui sit maxime nulla. Dolor quisquam illum itaque at mollitia libero.', '', 'qbartoletti@example.net', '1972-09-26 06:33:55'),
(51, '', '', '', '', 'N/A', '2024-01-04 13:15:37'),
(52, 'elo', 'elo', 'el', 'o', 'N/A', '2024-01-04 13:15:45'),
(53, 'g', 'g', 'g', 'g', 'N/A', '2024-01-04 13:17:18'),
(54, 'test', 'test', 'test', 'test', 'N/A', '2024-01-04 13:22:29'),
(55, 'Company', 'Address', 'Desc', 'Industry', 'N/A', '2024-01-05 21:48:57');

-- --------------------------------------------------------

--
-- Table structure for table `hotels`
--

DROP TABLE IF EXISTS `hotels`;
CREATE TABLE IF NOT EXISTS `hotels` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `Address` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `Description` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `Email` text COLLATE utf8mb3_unicode_ci NOT NULL,
  UNIQUE KEY `ID` (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=63 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci;

--
-- Dumping data for table `hotels`
--

INSERT INTO `hotels` (`ID`, `Name`, `Address`, `Description`, `Email`) VALUES
(5, 'Gleason, Ondricka and Gusikowski', '28770 Moore Oval\nJeremieland, WY 86623-8858', 'Dolor nihil ut ipsum aut facilis. A aspernatur quod non est ullam voluptatem deserunt. Impedit aliquam expedita tempore eligendi explicabo numquam. Vitae vero odio et facilis corporis non.', 'wspencer@kertzmann.com'),
(6, 'Marvin Group', '307 Gwen Port Apt. 667\nSouth Buford, TN 02366-4946', 'Corrupti ducimus reprehenderit amet consectetur ut dolor qui. Praesentium debitis incidunt quod cupiditate necessitatibus non. Hic nihil et et sunt voluptatem aliquid. Omnis quia accusamus omnis voluptatem iste voluptas alias.', 'legros.marjory@dickens.com'),
(7, 'Hoppe, Walsh and Grimes', '882 Vincent Greens Suite 208\nHomenickmouth, WY 39128', 'Autem velit a minus maiores quasi. Est quaerat debitis praesentium debitis illum. Eligendi mollitia perspiciatis tempore accusantium. Quia culpa non quo beatae officiis. Minima ea cum hic ut illo cum.', 'oleta12@reichertrunte.biz'),
(8, 'Treutel Inc', '96541 Agustina Road\nNorth Haylee, KY 34901-4644', 'Quod autem quidem repellat esse voluptatem. Minus sequi accusamus eos maiores. Distinctio est sit repellat sed nihil. Nisi reprehenderit distinctio temporibus enim necessitatibus. Velit quos delectus reiciendis quasi.', 'fisher.queen@mayert.com'),
(9, 'Schuster, Langworth and Williamson', '66606 Juston Loaf\nRyanborough, MO 61351-2127', 'Et sed voluptas asperiores commodi non eius quibusdam. Deleniti aut necessitatibus voluptas eos. Illo ut asperiores itaque sunt quia neque.', 'ltromp@hessel.com'),
(10, 'Kunde, Mohr and Buckridge', '4109 Eliezer Spring\nEast Pricestad, SD 40695-3366', 'Et rerum numquam temporibus exercitationem libero. Ut sed et quidem numquam dolore ab enim. Exercitationem et rerum dolores.', 'may.langworth@wymanrath.org'),
(11, 'Ondricka-Langosh', '44972 Edna Underpass Suite 769\nLake Maurine, DE 70102-3897', 'Qui qui asperiores quam reiciendis culpa ea facere. Tempora cumque id et sint dolor ut. Temporibus dicta dolorum rerum ut. Accusamus aut amet fugit tempora commodi sint. Corrupti officiis sit fugit omnis sunt aut vero.', 'wiza.zachery@schmidt.com'),
(12, 'Jacobi, Senger and Marks', '3804 Brandt Crossing\nNorth Christine, FL 35148', 'Vel est libero nemo consequatur aut ea. Qui ut ut aut laudantium. Aut ex ipsum culpa qui. Eos eveniet aliquid laborum.', 'walsh.marley@armstrong.net'),
(14, 'Hamill, Cummerata and Tillman', '585 Rohan Lane Suite 408\nHintzton, OK 81019-1514', 'Nostrum harum consequuntur iste quae omnis consectetur qui. Cumque qui rerum accusamus adipisci. Sed cumque distinctio eum laboriosam aut. Aut occaecati error culpa a tempore voluptas.', 'dooley.victoria@emardfritsch.com'),
(57, 'wqfugyuguy', 'wf', 'wqf', 'fwq'),
(58, 'reg', 'erh', 'he', 'rhe'),
(59, 'wfwqfwq', 'qfq', 'fq', 'fwqfwqwf'),
(60, 'g', 'g', 'g', 'g'),
(61, 'bonjour', 'elo', 'elo', 'elo'),
(62, 'NAme', 'Address', 'Description', 'Email'),
(51, 'N/A', 'h', 'h', 'h'),
(52, 'N/A', 'qwf', 'qwf', 'wqf'),
(53, 'N/A', 'g', 'g', 'g'),
(54, 'Tsting Thread', 'g', 'g', 'g'),
(55, 'g', 'g', 'g', 'g'),
(56, 'JohnLEwis', 'feqf', 'f', 'f'),
(17, 'McCullough-Feil', '84997 Nathanial Highway\nSouth Caroleshire, TN 97594', 'Sed corporis maiores eaque facere et voluptatum distinctio. Ut quidem odit non eligendi a pariatur laboriosam. Voluptas ad et rerum vel vel. Accusantium odit a et aperiam neque quo fuga. Est voluptate voluptas quasi et pariatur corrupti sint.', 'edward16@bogan.com'),
(18, 'Weimann PLC', '78285 Gulgowski Lakes\nPort Cassidy, GA 63403-6428', 'Sunt qui similique aut qui. Modi nobis dolorem dignissimos mollitia delectus et aut. Sint vero quibusdam distinctio omnis porro. Nemo similique fuga repellat ad sit et et. Id deserunt rem et odit id.', 'csmith@kunze.com'),
(19, 'Hoppe Group', '11886 Violet Underpass Apt. 741\nRoybury, PA 43357-2644', 'Consequatur et ex occaecati est qui. Consectetur repellat quam praesentium nihil ut impedit voluptate. Porro voluptatem qui sint distinctio. Commodi quaerat voluptas quas suscipit ut dolor expedita.', 'garett.cassin@schaefer.com'),
(20, 'Welch-Schulist', '995 Connelly Hills Apt. 500\nDrakefort, CA 97230', 'Maxime accusantium saepe incidunt nobis. Sit quibusdam minima ut dolorem qui qui voluptas. Odit quis voluptatem nihil doloribus delectus.', 'jazlyn.kling@balistreri.com'),
(21, 'Larson-Feest', '36411 Marvin Locks\nSchneiderberg, NY 20095-4240', 'Optio deserunt nostrum repudiandae dolores facilis. Non facere corrupti cumque. Dolorum perspiciatis quod blanditiis eaque non quibusdam.', 'julia.robel@dooley.info'),
(22, 'Herzog, Hickle and Wilkinson', '875 Stehr Trace Suite 059\nNew Dulce, IL 93869-8118', 'Harum nihil adipisci doloremque et mollitia temporibus. Rerum numquam fugiat doloribus aut. Laborum quis debitis sed alias saepe. Quidem et qui voluptates explicabo minima. Autem eius vel voluptatem ut.', 'emil.crooks@cole.com'),
(23, 'wegfwegeg', '702 Omer Station Apt. 043 Turcottetown, WA 16494-8908', 'Dolor facere possimus quaerat voluptatem repellat. Ea rerum et ut et sit iusto sunt ipsum. Sunt perferendis aut laudantium a harum libero itaque iste. Possimus consequatur optio minima aliquam nam aut.', 'mckenzie98@shields.biz'),
(24, 'Walker, Bruen and Corkery', '97412 Cruickshank Fork\nDonatomouth, NM 49765', 'Voluptates laboriosam qui quaerat ut. Enim a iure inventore adipisci eligendi omnis. Aut aut eos ut doloribus quos ullam. Blanditiis qui animi aliquam dolores ea veniam.', 'schmeler.destini@bednar.net'),
(25, 'Runolfsdottir, Zulauf and Gleichner', '3068 Schroeder Plaza Apt. 761\nEast Freddie, WV 33278-2469', 'Est at aut aspernatur ipsa distinctio dolorum. Quod molestiae esse ut eum autem sed nemo. Et quos ea temporibus ratione quasi numquam laborum molestiae.', 'ud\'amore@cronaschmeler.biz'),
(26, 'Barton-Gerlach', '326 Purdy Rapid\nPort Stuart, NY 36689', 'Et ipsum possimus numquam laboriosam autem corporis voluptatum. Architecto accusantium distinctio iusto dolorem. Impedit consequatur expedita eius neque id provident molestiae vel.', 'alyce.howell@ruecker.com'),
(27, 'Rowe Group', '0273 Harvey Island\nNew Ewell, PA 50663-9130', 'Ea cum ullam quisquam repellat animi reprehenderit ipsam nisi. Explicabo est dolor autem non porro et.', 'marilyne.rowe@kiehn.org'),
(28, 'Kuvalis, Cartwright and Ferry', '56422 Botsford Valleys Apt. 440\nLake Jalonbury, AK 87022-5494', 'Aut quas eaque beatae nisi. Corrupti sed maiores dolorem soluta. Voluptas quo reprehenderit consequatur iusto assumenda soluta. Dolor sed ullam dolorem.', 'rhea00@johnston.com'),
(29, 'Kozey-Lubowitz', '6712 Bartell Meadow\nLuciomouth, LA 81994-2607', 'Ut reprehenderit pariatur at iure fugit quibusdam. Tenetur dolorem et iusto odio officia delectus. Aut perferendis dolor consequatur qui id quidem ratione.', 'eliseo.kuhic@gloverhamill.com'),
(30, 'Funk LLC', '03067 Cole Hills\nNorth Johnathon, MS 99539-2088', 'Officia aut fugit numquam accusantium doloremque vel. Id non et qui maiores mollitia sit voluptatem itaque. Voluptatem iusto debitis dignissimos eius sed architecto officiis.', 'torp.benton@lemke.biz'),
(31, 'Hirthe-Toy', '44910 Ferne Views Suite 505\nOberbrunnerbury, UT 95913-5273', 'Voluptas aut error suscipit totam. Iure quis asperiores maxime in sunt. Eligendi nisi qui blanditiis occaecati quod veniam eius nihil.', 'collins.christina@ward.com'),
(32, 'Feil LLC', '5205 Brandy Corner\nNew Mervinland, MT 35264-4949', 'Accusamus quas cum quo soluta voluptas. Ad quidem voluptas maxime atque sint saepe officia iusto. Maxime in non eveniet unde laudantium.', 'shane.murray@kuhiclowe.net'),
(33, 'Jakubowski, Ward and Koelpin', '171 Mackenzie Roads Apt. 613\nWest Trudieton, ND 96257-6320', 'Sit recusandae laboriosam voluptatem nostrum. Ipsum velit quo et veritatis nemo quod fugiat. Adipisci est sunt autem error ea architecto.', 'ycarter@rosenbaum.com'),
(34, 'O\'Kon, Fisher and Ryan', '04189 Maggio Keys\nLillieport, NC 60061-2437', 'Cupiditate voluptatem pariatur accusantium magnam sapiente. Amet qui dolor autem numquam. Aut veritatis voluptatum quis et dolorem.', 'ydubuque@gottlieb.com'),
(35, 'Shanahan-Bailey', '103 Collins Overpass Suite 414\nWest Akeemmouth, NJ 09495', 'Ut et expedita eum qui. Dolorum labore totam sequi aspernatur qui et reiciendis. Nulla libero dolorem deleniti cum. Est et culpa enim cumque qui quia.', 'hjerde@mohrrolfson.info'),
(36, 'Collier Ltd', '23603 Lura Drives Suite 330\nLake Sally, ME 77067-8194', 'Voluptatem labore similique eius voluptate quas harum voluptas natus. Facilis ullam quam voluptas quis sapiente quo. Quisquam atque animi rerum ipsa ipsum id at. Sequi et distinctio aut aut aspernatur molestiae.', 'herman.alf@hagenes.biz'),
(37, 'Green-Hodkiewicz', '069 Bergstrom Run\nElyssaburgh, MO 40632', 'Doloribus accusantium fugiat cupiditate quis laudantium ipsum blanditiis quia. Ad libero aut quia dolores itaque. Quia est fugiat cumque laboriosam quisquam accusamus eaque in. Debitis eum similique ullam et voluptas cum.', 'fgleason@hilpert.biz'),
(38, 'Auer, Wiza and Bogan', '8274 Mittie Groves\nGarrettside, NC 42084', 'Eos asperiores expedita ut vitae. Et dolorem qui eveniet voluptas rerum beatae magni nam. Delectus autem corporis voluptatem voluptatem doloremque perspiciatis. Voluptatem aliquid tenetur eos voluptatum tempore. Enim rerum voluptatem quia asperiores in quas ea.', 'treutel.porter@hudsontowne.com'),
(39, 'Howe-Bayer', '57599 Schaden Plaza Suite 106\nBrakusmouth, NJ 28849', 'Sunt sapiente itaque et incidunt. Dolorem voluptas dolorem id aut blanditiis consectetur ut nobis. Esse quo omnis beatae ut voluptas.', 'thora45@sauerkautzer.com'),
(40, 'Witting and Sons', '5715 Jacinto Square\nVanshire, IL 17659', 'Maiores sunt ipsam laudantium suscipit fugiat cumque quia aliquam. Impedit velit laudantium et. Nihil ipsa architecto doloribus perspiciatis.', 'jwolf@hayes.com'),
(41, 'Olson-Sipes', '84683 Zoila Burg Suite 238\nPagacburgh, SC 90025-3822', 'Ex vel voluptate laborum nam similique magni sint. Odio laborum id quos. Reiciendis nihil quasi ut ipsa commodi. Voluptatem dicta perspiciatis et expedita laboriosam praesentium non quaerat.', 'cole.leda@sengertromp.com'),
(42, 'Walker-Jenkins', '344 Lance Rapids Suite 700\nGregoriaside, NM 79700', 'Sapiente consectetur qui ea quo est. Quis eaque quis odio. Et quo a aut fugiat nesciunt rerum esse.', 'kiehn.xzavier@gibson.com'),
(43, 'Kuhic PLC', '441 Jerrell Parkways Apt. 602\nJenkinsfurt, HI 91071', 'Qui nostrum ipsum veniam facere non voluptatem maiores. Non vero aliquid consectetur impedit. Quaerat dolore quae ea est. Illo ut quo minima in porro numquam.', 'citlalli.klocko@goldnermorissette.com'),
(44, 'Wilderman and Sons', '77981 Emery Pike\nBuckridgemouth, WI 11565', 'Incidunt praesentium nulla sed in itaque. Ullam qui aperiam iure quo voluptas autem pariatur. Delectus delectus nobis optio eius animi incidunt earum quibusdam. Et occaecati quas quibusdam laudantium.', 'pauline.gutkowski@tillman.com'),
(45, 'Wolff-Bode', '43240 Wolf River\nLake Jett, NV 68299', 'Repellendus reiciendis voluptatum officia eveniet et autem non. Maxime ducimus corrupti modi quae esse. Minus beatae quisquam tenetur qui qui nihil porro.', 'lynch.vidal@bernhardreichert.com'),
(46, 'Koss LLC', '417 Katharina Crossroad Apt. 238\nPort Angelicashire, OK 05936', 'Quis laborum voluptatem ad odio et. Quis voluptates laudantium dolor numquam esse. Tempora expedita veniam est ratione perspiciatis.', 'hyman68@wehner.com'),
(47, 'Beatty-Wilderman', '7960 Enos Tunnel Suite 195\nKarianeburgh, WV 04814', 'Dolores vel eum labore tempora accusamus. Facere exercitationem nesciunt autem sunt perferendis. Distinctio aspernatur cumque vero animi ea sit. Iure officiis exercitationem quia id.', 'dooley.alverta@connelly.com'),
(48, 'Aufderhar, King and Leannon', '0395 Jakubowski Row\nSouth Daisy, GA 02184-4538', 'Magni omnis accusamus id. Asperiores quia maxime incidunt totam mollitia. Qui beatae doloremque accusantium nisi. Et a architecto illo qui dolorum optio tempore.', 'runolfsson.damion@kilbackmaggio.com'),
(49, 'Hamill, Witting and Zieme', '159 Mayert Walks Suite 856\nOpalmouth, RI 28030', 'Odit delectus alias fugit ut pariatur enim nisi. Odio voluptas expedita veritatis est.', 'boris31@mills.net'),
(50, 'Ferry Group', '08640 Maxie Fort\nNew Kelleyburgh, DE 73614', 'Ut facilis consequatur sint quia. Culpa voluptatem voluptate totam vel quo. Voluptatum rerum nemo sapiente rerum illo.', 'gfisher@kreiger.com');

-- --------------------------------------------------------

--
-- Table structure for table `jobposting`
--

DROP TABLE IF EXISTS `jobposting`;
CREATE TABLE IF NOT EXISTS `jobposting` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `JobTitle` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `Company` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `Salary` float NOT NULL,
  `Description` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `Apprentiship` tinyint(1) NOT NULL,
  `CompanyWebsite` text COLLATE utf8mb3_unicode_ci NOT NULL,
  UNIQUE KEY `ID` (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=56 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci;

--
-- Dumping data for table `jobposting`
--

INSERT INTO `jobposting` (`ID`, `JobTitle`, `Company`, `Salary`, `Description`, `Apprentiship`, `CompanyWebsite`) VALUES
(51, 'qfhoweqi', 'fhwqiofh', 215, 'bwb', 0, 'google.com'),
(52, 'test', 'test', 352, 'test', 0, 'test'),
(53, 'Camera Tech', 'BBC', 21000, 'BE a camera tech at the BBC!', 1, 'BBC.com'),
(54, 'Title', 'Company', 321, 'Desc', 1, 'Website'),
(2, 'Quis tempora dolorem et ut ut placeat aliquid.', 'Daugherty, Yost and Becker', 963906, 'Dolores consequatur omnis hic perferendis veniam. Recusandae aliquam sed fugit aut quibusdam. Minima velit adipisci alias aliquam. Recusandae corporis repellat vero fugiat.', 0, 'http://www.nienow.org/'),
(3, 'Sunt aut temporibus qui.', 'Labadie, Jones and Haley', 873683000, 'Corrupti dignissimos culpa adipisci velit voluptas ipsa. Eos autem eveniet expedita beatae omnis sunt non. Occaecati illo ea veniam ipsum inventore perspiciatis alias. Fugiat enim impedit rerum.', 0, 'http://buckridge.info/'),
(4, 'Consequatur ex officia autem.', 'Harris, Runolfsson and Conn', 84488000, 'Porro nulla placeat et ea corrupti. Expedita voluptatibus ut esse voluptatem repudiandae et. Iusto quos sunt expedita culpa beatae iste.', 0, 'http://www.westbatz.com/'),
(5, 'Eveniet inventore facere dolore nisi.', 'Beier-Terry', 41526, 'Sit ullam consequuntur dolorum voluptatem iusto corporis. Pariatur at quis quia consequuntur ut ullam magni. Repellendus et ratione nam. Molestiae quo quaerat dolorum tenetur quos.', 0, 'http://haley.com/'),
(6, 'Non ipsam pariatur qui.', 'O\'Kon, Ward and Miller', 7765750, 'Et nesciunt accusamus neque qui. Possimus occaecati omnis quia ipsum tempore. Non voluptatibus ad omnis quis harum repudiandae. Occaecati qui inventore blanditiis. Veniam ipsam reprehenderit aut ut molestiae.', 0, 'http://mosciski.biz/'),
(7, 'Et alias unde veritatis ipsam.', 'Ward, Bogan and Lueilwitz', 0, 'Amet cupiditate culpa omnis et eaque. Nihil quia quis et dolores ea animi totam. Repudiandae quo iusto sed minima modi.', 0, 'http://www.mclaughlin.com/'),
(8, 'Natus qui culpa voluptatem.', 'Satterfield-Paucek', 13568100, 'Facere delectus animi consequatur consequuntur quia est. Corporis voluptatem est excepturi. Sit ab fuga ipsam architecto consequatur ut consectetur.', 0, 'http://www.yost.org/'),
(9, 'Voluptate ipsum pariatur in odit quia.', 'Bernhard, Ferry and Ruecker', 887955, 'Voluptatem quis ipsum modi dignissimos quos. Error est aut nobis aut blanditiis. Architecto delectus saepe a ut accusamus eligendi.', 0, 'http://www.stark.com/'),
(10, 'Delectus tempora cumque velit odio pariatur aut.', 'Bins Inc', 81328400, 'Qui asperiores optio dignissimos eaque sunt voluptate quia. Odit non et et odit cumque ut. Corrupti iusto incidunt animi quis omnis eos.', 0, 'http://johnssatterfield.com/'),
(11, 'Error adipisci praesentium necessitatibus.', 'Schneider-Hermiston', 819, 'Sit perspiciatis accusamus aut voluptatem. Eaque sequi ea numquam ipsa. Doloribus officiis perspiciatis pariatur necessitatibus quia fuga. Est minus omnis in cumque dolor qui occaecati.', 0, 'http://sanfordharber.org/'),
(12, 'Deleniti consequatur ut nulla vitae.', 'Adams, Kreiger and McClure', 43, 'Praesentium accusantium autem ut quia vel. Voluptatem sapiente libero quos inventore tenetur. Ratione magni iusto aut et officiis veniam qui.', 0, 'http://koss.com/'),
(13, 'Ea non expedita aut dolorum neque sed.', 'Ziemann PLC', 50345, 'Pariatur quis ab quia saepe placeat. Eum sequi dolores non consequuntur ut itaque. Quam non temporibus dolorem eum accusantium porro. Nulla est dolorem unde voluptas pariatur sunt odio.', 0, 'http://www.gorczany.net/'),
(14, 'Quia rerum consequatur corrupti architecto in dicta aspernatur.', 'Blanda-Volkman', 0, 'Corporis et repudiandae dicta sit praesentium necessitatibus saepe adipisci. Impedit voluptas enim porro voluptatibus eum repellat molestiae. Praesentium repellendus iure dolor sed expedita.', 0, 'http://www.abbott.com/'),
(15, 'Sed autem harum temporibus rerum repellendus optio et.', 'Marks-Kuhic', 86, 'Ratione dolorem quidem deserunt maxime. Porro corporis consequatur non reiciendis ullam. Cumque sit error ex velit enim amet. Deleniti error ea voluptatem sapiente at dolorum.', 0, 'http://www.rowekling.com/'),
(16, 'Quibusdam soluta atque aut id sit.', 'Yost Group', 997998000, 'Impedit soluta voluptatibus beatae odit nulla alias. Amet et sit harum ullam quod quam sit molestiae. Dolore enim hic maiores sint autem vitae ut. Ipsam voluptatem sit maxime recusandae.', 0, 'http://www.leuschke.net/'),
(17, 'Aperiam vel recusandae non rerum.', 'Schultz, Schowalter and Purdy', 76566, 'Eligendi laborum ut omnis molestias porro ea et quam. Asperiores veniam autem maiores qui placeat. Sint qui id inventore reprehenderit nam.', 0, 'http://kautzer.com/'),
(18, 'Sed consectetur perferendis sit ducimus ut necessitatibus.', 'Buckridge PLC', 5, 'Illo repellendus officiis vitae recusandae consectetur repudiandae. Tempora quasi possimus maxime voluptas odio saepe beatae harum. Quia iusto in a incidunt aut ab quo voluptas. Molestiae beatae commodi et.', 0, 'http://krajcik.com/'),
(19, 'Ipsum nostrum blanditiis ea voluptatem non.', 'Dooley-Hilll', 29535, 'Pariatur earum assumenda sequi ut. Consequuntur nulla aut iste commodi et voluptatum cumque sint. Reiciendis et iste voluptatum debitis culpa animi. Voluptatum asperiores expedita qui voluptatem.', 0, 'http://www.mckenzie.com/'),
(20, 'Dolor culpa ratione dignissimos omnis.', 'Streich, Kessler and Harvey', 9978970, 'Rerum dolor voluptate nostrum veritatis vero magni. Animi tempora nisi id soluta ad dolorem repellat. Qui assumenda est odit minus sint eius. Cupiditate omnis repudiandae fugiat deleniti. Quos est aut quaerat aut.', 0, 'http://www.andersonreilly.biz/'),
(21, 'Rerum consequatur enim autem sed.', 'Howell, Bailey and Abbott', 253605000, 'Harum fugiat in nam quisquam voluptas similique voluptas. Et tempora officia sed numquam est quaerat. Qui nihil possimus consectetur aliquid voluptatum ea officiis.', 0, 'http://www.kertzmann.org/'),
(22, 'Et et in distinctio quo.', 'Cummings Group', 272057, 'Quasi dicta quia vero est. Officia voluptate voluptatem in saepe voluptate nostrum. Quae repellat accusamus laboriosam officia. Perspiciatis et commodi at nihil dolore commodi.', 0, 'http://www.smithbednar.com/'),
(23, 'Ut sunt cumque et natus iusto et molestiae.', 'Lockman, Wisoky and Terry', 925, 'Quam occaecati voluptas numquam qui. Quidem nobis id et nobis. Omnis voluptatem aliquam qui quos illo rerum molestiae velit. Voluptas quia atque est eos tempora omnis. Quam eaque expedita saepe laboriosam.', 0, 'http://www.mckenzie.com/'),
(24, 'Sint iusto aut accusamus cumque ducimus et.', 'Ortiz, Nolan and Leuschke', 8143490, 'Optio excepturi expedita minima atque eum. Rem vitae delectus eius consequuntur. Ea dolore consequatur tempora voluptatum vel fugiat occaecati.', 0, 'http://mclaughlin.com/'),
(25, 'Animi delectus itaque cumque deserunt ex.', 'Bernier, Bosco and Dietrich', 0, 'Eum suscipit nam corrupti omnis. Officiis eum sapiente odio in quasi veritatis eum. Cumque placeat animi enim quas. Inventore adipisci unde omnis quo voluptatibus fugiat id.', 0, 'http://www.satterfield.net/'),
(26, 'Omnis ipsa repudiandae qui aperiam incidunt.', 'Price, Ferry and Mraz', 1951540, 'Qui perferendis molestias at deleniti distinctio temporibus inventore. Sequi quasi reiciendis at cupiditate voluptates. Ut eligendi nihil est nulla blanditiis aut.', 0, 'http://beatty.org/'),
(27, 'Magni doloribus rerum eum vero est dolore nisi.', 'Will, Doyle and Mraz', 38916700, 'Sit quod cupiditate omnis necessitatibus voluptatibus est nam esse. Aspernatur facere qui quaerat odio neque. Corrupti voluptatem nobis reiciendis reiciendis debitis harum sit. Suscipit qui ut magni excepturi velit.', 0, 'http://cassinkertzmann.com/'),
(28, 'Odit aut autem ipsam velit sed.', 'Zboncak, Okuneva and Robel', 885, 'Voluptas blanditiis soluta earum dignissimos beatae harum quibusdam. Laboriosam non facilis et modi. Reiciendis omnis qui vel cupiditate doloremque.', 0, 'http://morar.net/'),
(29, 'Alias debitis et et repellendus quasi ut.', 'Watsica, Metz and Adams', 770109, 'Praesentium omnis dolorem quo itaque repellat inventore in. Dolor amet molestiae et eaque sit in perferendis. Voluptatibus a voluptatum perspiciatis et aliquam.', 0, 'http://beahanrutherford.com/'),
(30, 'Officia mollitia dolorum eligendi molestiae.', 'Boyer-Ledner', 9575, 'Commodi praesentium a aliquam autem. Minima officia voluptatem eveniet officiis magnam ex itaque consequatur. Explicabo voluptas accusantium excepturi illum at.', 0, 'http://www.wilderman.org/'),
(31, 'Qui sed omnis omnis officiis velit.', 'Sauer-Turcotte', 62, 'Sed qui eos nulla ab. Est velit labore dolorum iure porro. Quidem et ratione eius earum porro est. Iste omnis quaerat commodi provident eligendi et eligendi sint.', 0, 'http://langosh.biz/'),
(32, 'Quos adipisci voluptatibus dolores enim.', 'Cassin Ltd', 58, 'Laudantium aut animi nihil consequuntur voluptatibus earum tempora. Eveniet ullam modi laudantium aspernatur et doloribus. Iure veniam tenetur est possimus. Et nisi assumenda fugiat aut blanditiis aut.', 0, 'http://kreigerheidenreich.org/'),
(33, 'Repellat exercitationem libero voluptatem.', 'Ratke-Christiansen', 0, 'Sit quasi in incidunt et impedit. Ducimus ipsa et dolorem repudiandae saepe.', 0, 'http://www.armstrong.info/'),
(34, 'Velit quisquam sequi provident veritatis voluptatem perferendis aperiam.', 'Rodriguez-Gleason', 482, 'Quis laborum quia odit voluptas aspernatur reiciendis. Magnam adipisci rerum ab illo quis laudantium ullam et. Perspiciatis esse quas hic quidem. Sit provident tempore facere officiis necessitatibus sapiente.', 0, 'http://www.hills.com/'),
(35, 'Alias sed est ipsam sequi.', 'Mayer Inc', 5, 'Quia tempora quisquam assumenda quia. Ad quia eum accusamus similique mollitia. Id ipsam porro unde quibusdam.', 0, 'http://connelly.net/'),
(36, 'Reprehenderit fugit nisi error sunt est.', 'Hoeger LLC', 3838930, 'Officiis qui porro quibusdam dolorum nihil iure autem. Explicabo qui accusamus iure porro dolore rerum quidem. Assumenda voluptatem assumenda quo sunt.', 0, 'http://ullrich.com/'),
(37, 'Perferendis debitis rerum vero repellat.', 'Howe, Johns and Harber', 673808000, 'Corrupti et optio impedit non doloribus. Similique deserunt numquam fugit vitae molestias provident. Quibusdam maxime quas ut tempore aut provident accusamus. In sed id eum possimus illum non.', 0, 'http://heidenreichhessel.net/'),
(38, 'Est molestiae mollitia rerum libero.', 'Keebler Group', 71706, 'Quas officiis earum iusto et ut nam quo. Qui quia nemo odit sit natus odit debitis esse. Qui reprehenderit nihil soluta eligendi voluptatem. Similique ab fugit cumque.', 0, 'http://www.ziemewhite.biz/'),
(39, 'Non ut cumque quo esse quia voluptates.', 'Klein, Johnson and Predovic', 0, 'Eveniet aperiam voluptas qui itaque. Sed accusamus possimus esse dolores. Quibusdam esse quasi reiciendis et non expedita et. Delectus in iusto vel minima aut. Magni dolorum doloribus a eum fuga similique.', 0, 'http://www.conn.com/'),
(40, 'Nisi officiis est fuga quod temporibus ut quasi.', 'Gibson LLC', 808415000, 'Sequi quia sunt quas adipisci omnis. Est nesciunt soluta porro aperiam nihil.', 0, 'http://www.harrisgutkowski.com/'),
(41, 'Laboriosam aut veniam qui culpa ex sint minima.', 'Mosciski PLC', 3532, 'Consectetur esse velit laborum voluptatem ut. Consequatur id quam beatae a est aut. Libero reiciendis est rerum reprehenderit necessitatibus deserunt.', 0, 'http://mueller.com/'),
(42, 'Recusandae sed accusamus quis quas rem id.', 'Tremblay-Berge', 1, 'Ducimus rerum voluptas quae porro dolores. Est at magni et sit et. Qui sint omnis qui amet eum.', 0, 'http://kautzerolson.info/'),
(43, 'Voluptas voluptatem accusamus quae nemo eos eaque.', 'Bayer, Rowe and Romaguera', 674195, 'Voluptas labore ab quae qui. Porro quis suscipit ut. Ipsum doloribus voluptatem pariatur animi non. Dolore debitis veniam repellat magnam eius. Est magnam ex libero.', 0, 'http://schuppe.com/'),
(44, 'Rerum ipsam quos impedit quis.', 'Russel, Pacocha and Cremin', 96, 'Dicta aut quo et occaecati voluptas laudantium autem blanditiis. Voluptate totam aspernatur natus vel. Autem sint eligendi iusto praesentium veniam. Consequatur autem fugiat unde est.', 0, 'http://www.boehmbrown.com/'),
(45, 'Quo sed praesentium quidem soluta eum.', 'Ebert-Kovacek', 0, 'Consequuntur corrupti vitae atque sunt. Perspiciatis dolorem explicabo ducimus reprehenderit et quos deleniti. Sunt reprehenderit quisquam facilis esse eius quas qui.', 0, 'http://reinger.info/'),
(46, 'Aut hic labore optio quia laborum aut ipsa.', 'Bergnaum, Veum and Haag', 24422, 'Qui dolorem natus culpa atque qui et quia. In eligendi voluptatum aliquid non. Rerum sed est exercitationem qui qui id earum et.', 0, 'http://www.johnson.com/'),
(47, 'Qui itaque inventore libero saepe ipsa animi.', 'Brown-Swift', 4248220, 'Sint et dolores sint id iste. Voluptatum voluptas delectus velit deserunt. Quasi sint minus sed voluptates sapiente laboriosam repellendus at. Laboriosam suscipit laudantium nisi dolores omnis ut molestiae.', 0, 'http://lebsack.com/'),
(48, 'Fuga quo qui voluptas blanditiis laborum cumque consequatur.', 'Hansen, Welch and Dibbert', 59012, 'Rerum exercitationem eos et est architecto sed pariatur. Est sit blanditiis eos corrupti laborum aliquam.', 0, 'http://www.jakubowskibernier.info/'),
(49, 'Sunt vitae animi praesentium sed voluptatem possimus laudantium.', 'Carroll-Von', 7647, 'Unde et et saepe veniam sed earum culpa magnam. Sint ea recusandae quod et. Harum dignissimos quis tempora.', 0, 'http://hamill.org/'),
(50, 'Dolores incidunt ex ipsum.', 'Quitzon-Spencer', 778551000, 'Commodi velit cumque quia deleniti id porro. Repellat ducimus qui eius illum reiciendis.', 0, 'http://www.weberdurgan.biz/'),
(55, 'JobTitle', 'Company', 123, 'Desc', 1, 'Website');

-- --------------------------------------------------------

--
-- Table structure for table `libraries`
--

DROP TABLE IF EXISTS `libraries`;
CREATE TABLE IF NOT EXISTS `libraries` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `Address` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `Description` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `Website` text COLLATE utf8mb3_unicode_ci NOT NULL,
  UNIQUE KEY `ID` (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci;

--
-- Dumping data for table `libraries`
--

INSERT INTO `libraries` (`ID`, `Name`, `Address`, `Description`, `Website`) VALUES
(1, 'Ltd', '972 Trycia Square Suite 115\nHirtheview, PA 37607-1383', 'THE KING AND QUEEN OF HEARTS. Alice was silent. The Dormouse had closed its eyes by this time). \'Don\'t grunt,\' said Alice; \'I might as well as she did not dare to disobey, though she knew that it.', 'http://wilkinson.info/'),
(2, 'Group', '591 Candace Locks\nGeorgianaside, MI 48040', 'The Knave did so, and giving it a little wider. \'Come, it\'s pleased so far,\' said the Eaglet. \'I don\'t think--\' \'Then you may SIT down,\' the King repeated angrily, \'or I\'ll have you executed.\' The.', 'http://toy.com/'),
(3, 'LLC', '779 Ahmad Bypass\nSouth Connorton, OH 07055-7087', 'Alice, as she swam about, trying to touch her. \'Poor little thing!\' said the Caterpillar seemed to be a walrus or hippopotamus, but then she heard the Rabbit in a whisper, half afraid that she.', 'http://www.king.com/'),
(4, 'Group', '94535 Oceane Tunnel\nShanahanborough, IN 05342-1431', 'March Hare moved into the court, without even looking round. \'I\'ll fetch the executioner ran wildly up and said, very gravely, \'I think, you ought to be Number One,\' said Alice. \'Who\'s making.', 'http://runolfsdottirspencer.info/'),
(5, 'and Sons', '69505 Jacobs Mission\nCarsonshire, SC 93259', 'Alice, \'and if it likes.\' \'I\'d rather finish my tea,\' said the sage, as he spoke. \'A cat may look at me like that!\' By this time it vanished quite slowly, beginning with the bread-knife.\' The March.', 'http://zboncakwintheiser.com/'),
(6, 'and Sons', '894 Russell Causeway\nWymanstad, MI 17768-5715', 'Turtle. \'Hold your tongue, Ma!\' said the March Hare said in a deep voice, \'What are you getting on now, my dear?\' it continued, turning to Alice, and tried to look about her repeating \'YOU ARE OLD,.', 'http://www.doyle.biz/'),
(7, 'and Sons', '01653 Preston Road\nLake Viola, IA 90970-1546', 'Oh, my dear paws! Oh my dear Dinah! I wonder what was on the glass table as before, \'It\'s all about as she could not tell whether they were filled with cupboards and book-shelves; here and there..', 'http://www.kinghahn.biz/'),
(8, 'LLC', '5204 Kuhlman Mountains Apt. 052\nWest Nellie, ME 78512-6617', 'So she stood watching them, and considered a little different. But if I\'m Mabel, I\'ll stay down here with me! There are no mice in the wood,\' continued the King. \'I can\'t go no lower,\' said the.', 'http://www.robellehner.com/'),
(9, 'and Sons', '98345 Gulgowski Manor Apt. 273\nSimonisstad, IN 03850', 'The Gryphon lifted up both its paws in surprise. \'What! Never heard of such a thing before, but she gained courage as she listened, or seemed to think this a very melancholy voice. \'Repeat, \"YOU ARE.', 'http://www.shields.com/'),
(10, 'PLC', '892 Iva Spur\nReidtown, OR 43695', 'But said I didn\'t!\' interrupted Alice. \'You must be,\' said the Dormouse crossed the court, arm-in-arm with the dream of Wonderland of long ago: and how she would keep, through all her knowledge of.', 'http://hintz.com/'),
(11, 'Inc', '26039 Pacocha Ports\nWavaburgh, UT 94323', 'White Rabbit read:-- \'They told me he was obliged to write this down on her spectacles, and began by taking the little thing sat down a good many little girls in my kitchen AT ALL. Soup does very.', 'http://king.net/'),
(12, 'and Sons', '325 Ena Parkways Apt. 992\nTillmantown, AK 27610-3221', 'King. (The jury all wrote down on their slates, when the Rabbit noticed Alice, as she spoke. (The unfortunate little Bill had left off when they hit her; and the choking of the ground, Alice soon.', 'http://kertzmann.com/'),
(13, 'and Sons', '333 Raynor Harbors Suite 152\nNorth Cadenview, ID 05549-0966', 'Mock Turtle. So she went hunting about, and crept a little hot tea upon its nose. The Dormouse had closed its eyes again, to see what was the first position in dancing.\' Alice said; but was.', 'http://hudsonkeebler.com/'),
(14, 'Ltd', '054 Lew Shoal Suite 786\nPort Brionna, VA 01417', 'I haven\'t been invited yet.\' \'You\'ll see me there,\' said the Duchess: \'flamingoes and mustard both bite. And the muscular strength, which it gave to my jaw, Has lasted the rest waited in silence..', 'http://www.harrisnicolas.com/'),
(15, 'PLC', '481 Balistreri Locks\nPort Waino, UT 37303-2716', 'Pigeon in a great crash, as if she had accidentally upset the milk-jug into his cup of tea, and looked at it, busily painting them red. Alice thought over all she could not join the dance? Will you,.', 'http://langosh.biz/'),
(16, 'Group', '89366 Elenor Fords Apt. 105\nToyville, OK 25233', 'Alice watched the White Rabbit put on his spectacles. \'Where shall I begin, please your Majesty,\' said Alice doubtfully: \'it means--to--make--anything--prettier.\' \'Well, then,\' the Cat said, waving.', 'http://moen.org/'),
(17, 'and Sons', '3663 Lynch Corner\nMyriammouth, NV 55072', 'Tortoise--\' \'Why did they live at the March Hare interrupted, yawning. \'I\'m getting tired of being all alone here!\' As she said to herself, \'to be going messages for a minute or two the Caterpillar.', 'http://walsh.com/'),
(18, 'Inc', '6319 Mohamed Plaza Apt. 692\nNew Santiagoside, MS 41476', 'Hatter. \'It isn\'t a bird,\' Alice remarked. \'Right, as usual,\' said the Caterpillar took the least notice of her head to keep back the wandering hair that curled all over crumbs.\' \'You\'re wrong about.', 'http://strosin.com/'),
(19, 'and Sons', '84729 Hand Light Apt. 896\nJosieview, IA 62877', 'Gryphon, \'you first form into a large crowd collected round it: there were no tears. \'If you\'re going to give the prizes?\' quite a crowd of little Alice herself, and fanned herself with one finger;.', 'http://www.williamson.org/'),
(20, 'Inc', '50087 Quitzon Valleys\nBergstrombury, TX 64905-2564', 'Footman went on \'And how many hours a day did you manage on the breeze that followed them, the melancholy words:-- \'Soo--oop of the Lizard\'s slate-pencil, and the little door into that lovely.', 'http://jaskolski.net/');

-- --------------------------------------------------------

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
CREATE TABLE IF NOT EXISTS `news` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Headline` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `Description` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `DateCreated` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Business` tinyint(1) NOT NULL DEFAULT '0',
  UNIQUE KEY `ID` (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=106 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci;

--
-- Dumping data for table `news`
--

INSERT INTO `news` (`ID`, `Headline`, `Description`, `DateCreated`, `Business`) VALUES
(1, 'Secured well-modulated strategy', 'WHAT?\' said the Hatter. \'You MUST remember,\' remarked the King, the Queen, who were lying round the hall, but they were mine before. If I or she should push the matter on, What would become of it;.', '2019-01-22 22:41:43', 0),
(2, 'Self-enabling stable pricingstructure', 'Five! Don\'t go splashing paint over me like a snout than a rat-hole: she knelt down and began by taking the little glass table. \'Now, I\'ll manage better this time,\' she said to Alice. \'What sort of.', '2005-05-22 21:50:16', 0),
(4, 't4b45', 'Caterpillar called after it; and while she ran, as well as she tucked it away under her arm, and timidly said \'Consider, my dear: she is of yours.\"\' \'Oh, I know!\' exclaimed Alice, who had been.', '2023-05-10 21:17:12', 0),
(5, 'Multi-tiered discrete artificialintelligence', 'Duchess, it had entirely disappeared; so the King and the game began. Alice gave a look askance-- Said he thanked the whiting kindly, but he would not stoop? Soup of the shepherd boy--and the sneeze.', '1976-03-27 13:21:48', 0),
(6, 'Integrated real-time access', 'CAN I have to turn into a conversation. Alice felt a little hot tea upon its forehead (the position in which case it would be quite absurd for her neck kept getting entangled among the people that.', '2004-07-27 01:46:36', 0),
(102, '6j56j', '56j', '2024-01-03 20:25:01', 0),
(103, 'news', 'ewswqd', '2024-01-04 12:29:07', 0),
(104, 'test', 'test', '2024-01-04 13:21:19', 0),
(105, 'HEadline', 'Desc', '2024-01-05 21:47:00', 0),
(8, 'Vision-oriented analyzing toolset', 'Alice. \'I\'m glad they\'ve begun asking riddles.--I believe I can creep under the hedge. In another minute there was nothing else to do, and in his turn; and both footmen, Alice noticed, had powdered.', '1977-04-10 01:48:32', 0),
(10, 'Virtual non-volatile functionalities', 'M?\' said Alice. \'I don\'t think they play at all the party sat silent and looked at Alice. \'It goes on, you know,\' said the Dormouse followed him: the March Hare, who had been would have called him a.', '2020-10-07 03:51:23', 0),
(11, 'Total optimizing groupware', 'Queen\'s voice in the house before she found herself in a low trembling voice, \'--and I hadn\'t quite finished my tea when I got up in her head, and she could see her after the rest of the words don\'t.', '1998-03-09 20:51:41', 0),
(12, 'Stand-alone object-oriented matrices', 'For anything tougher than suet; Yet you finished the first sentence in her hand, and made another rush at the bottom of a muchness\"--did you ever see such a dear quiet thing,\' Alice went on again:--.', '2023-02-27 06:41:42', 0),
(13, 'Decentralized real-time database', 'Alice had no very clear notion how long ago anything had happened.) So she swallowed one of the what?\' said the Caterpillar sternly. \'Explain yourself!\' \'I can\'t go no lower,\' said the Duck: \'it\'s.', '1973-06-04 09:51:00', 0),
(14, 'Organic global infrastructure', 'I used to read fairy-tales, I fancied that kind of sob, \'I\'ve tried every way, and the procession came opposite to Alice, and her eyes to see its meaning. \'And just as usual. I wonder who will put.', '1972-08-12 19:01:47', 0),
(15, 'Self-enabling mobile workforce', 'Queen in a languid, sleepy voice. \'Who are YOU?\' Which brought them back again to the Duchess: \'what a clear way you can;--but I must have imitated somebody else\'s hand,\' said the Cat. \'--so long as.', '2010-08-02 04:40:08', 0),
(16, 'Distributed leadingedge matrix', 'Alice panted as she could. \'The game\'s going on between the executioner, the King, and the m--\' But here, to Alice\'s great surprise, the Duchess\'s knee, while plates and dishes crashed around.', '1980-05-25 04:39:40', 0),
(17, 'Sharable high-level projection', 'Queen. \'Well, I should like it very nice, (it had, in fact, a sort of use in waiting by the Queen said--\' \'Get to your little boy, And beat him when he pleases!\' CHORUS. \'Wow! wow! wow!\' \'Here! you.', '1995-01-08 14:23:31', 0),
(18, 'Down-sized executive leverage', 'Caterpillar. Alice thought to herself, \'because of his great wig.\' The judge, by the White Rabbit blew three blasts on the spot.\' This did not appear, and after a few minutes it seemed quite dull.', '1984-04-23 10:44:08', 0),
(19, 'Distributed client-driven access', 'Alice, (she had grown so large a house, that she ought not to make out which were the verses the White Rabbit: it was in confusion, getting the Dormouse go on crying in this way! Stop this moment, I.', '2011-11-10 00:23:17', 0),
(20, 'Cross-platform value-added instructionset', 'Gryphon; and then added them up, and began an account of the hall: in fact she was as steady as ever; Yet you finished the first figure!\' said the Mouse, turning to the shore, and then Alice put.', '1994-09-22 04:52:41', 0),
(21, 'Inverse directional archive', 'Gryphon. \'We can do without lobsters, you know. So you see, Miss, this here ought to be done, I wonder?\' And here poor Alice in a low voice, \'Why the fact is, you know. So you see, Miss, this here.', '1994-04-15 18:48:25', 0),
(22, 'Facetoface intangible GraphicalUserInterface', 'Geography. London is the capital of Rome, and Rome--no, THAT\'S all wrong, I\'m certain! I must have prizes.\' \'But who is Dinah, if I might venture to say which), and they went up to them to be Number.', '1972-07-04 20:51:45', 0),
(23, 'Switchable maximized info-mediaries', 'Alice; but she did so, and giving it a bit, if you were down here with me! There are no mice in the trial done,\' she thought, \'and hand round the court with a soldier on each side, and opened their.', '2019-04-20 18:06:56', 0),
(24, 'Reactive mobile knowledgeuser', 'And so it was just possible it had gone. \'Well! I\'ve often seen a rabbit with either a waistcoat-pocket, or a worm. The question is, what did the Dormouse indignantly. However, he consented to go.', '1973-02-16 20:07:01', 0),
(25, 'Optimized uniform synergy', 'King eagerly, and he poured a little hot tea upon its forehead (the position in dancing.\' Alice said; \'there\'s a large caterpillar, that was sitting on the slate. \'Herald, read the accusation!\' said.', '2003-01-31 07:40:34', 0),
(26, 'Right-sized bottom-line hub', 'Alice. \'You must be,\' said the Dodo, \'the best way you go,\' said the Duchess; \'and most things twinkled after that--only the March Hare was said to herself, \'I wish the creatures wouldn\'t be in a.', '2015-09-09 19:46:27', 0),
(27, 'Optimized systematic budgetarymanagement', 'Alice began, in rather a hard word, I will tell you my history, and you\'ll understand why it is all the arches are gone from this morning,\' said Alice indignantly. \'Ah! then yours wasn\'t a really.', '1991-06-07 08:35:59', 0),
(28, 'Future-proofed assymetric knowledgeuser', 'I am so VERY remarkable in that; nor did Alice think it was,\' the March Hare took the place of the shelves as she passed; it was all very well without--Maybe it\'s always pepper that makes them.', '2009-12-19 10:11:34', 0),
(29, 'Versatile tangible hardware', 'Bill,\' thought Alice,) \'Well, I hardly know--No more, thank ye; I\'m better now--but I\'m a hatter.\' Here the other queer noises, would change (she knew) to the other, saying, in a low voice, \'Your.', '2011-03-31 08:16:35', 0),
(30, 'Re-engineered fresh-thinking forecast', 'Mouse only growled in reply. \'Please come back in a natural way. \'I thought you did,\' said the King say in a very grave voice, \'until all the time she had accidentally upset the milk-jug into his.', '1976-12-25 09:53:54', 0),
(31, 'Stand-alone multimedia framework', 'Alice kept her waiting!\' Alice felt so desperate that she never knew whether it was the first day,\' said the Mouse. \'--I proceed. \"Edwin and Morcar, the earls of Mercia and Northumbria, declared for.', '1997-09-16 18:02:39', 0),
(32, 'Pre-emptive maximized database', 'The Cat seemed to quiver all over their slates; \'but it doesn\'t matter a bit,\' she thought of herself, \'I wonder how many miles I\'ve fallen by this time, and was beating her violently with its head,.', '1979-02-22 14:52:47', 0),
(33, 'Networked dedicated groupware', 'Mock Turtle recovered his voice, and, with tears again as she could, for the fan and gloves, and, as the Caterpillar took the least idea what a long time together.\' \'Which is just the case with my.', '2019-10-13 22:28:19', 0),
(34, 'Organized holistic standardization', 'COULD he turn them out again. The rabbit-hole went straight on like a candle. I wonder what you\'re at!\" You know the meaning of it appeared. \'I don\'t know what to beautify is, I suppose?\' \'Yes,\'.', '2013-07-31 15:34:08', 0),
(35, 'Exclusive grid-enabled concept', 'Alice could not tell whether they were nowhere to be Involved in this affair, He trusts to you to offer it,\' said Alice thoughtfully: \'but then--I shouldn\'t be hungry for it, while the rest waited.', '1984-12-19 22:13:52', 0),
(36, 'Triple-buffered systemic installation', 'That\'ll be a lesson to you never tasted an egg!\' \'I HAVE tasted eggs, certainly,\' said Alice, and she felt sure she would manage it. \'They were obliged to write this down on their slates, \'SHE.', '1977-12-26 12:03:01', 0),
(37, 'Compatible dynamic functionalities', 'Soup! Who cares for fish, Game, or any other dish? Who would not join the dance? Will you, won\'t you, will you join the dance. Will you, won\'t you, won\'t you, won\'t you, will you join the dance..', '2002-08-13 20:05:21', 0),
(38, 'Ameliorated bandwidth-monitored customerloyalty', 'So she set to work throwing everything within her reach at the door and went on planning to herself \'That\'s quite enough--I hope I shan\'t go, at any rate, there\'s no use in the direction it pointed.', '2002-01-14 15:43:54', 0),
(39, 'Sharable bi-directional attitude', 'I eat\" is the same thing as \"I get what I say--that\'s the same as they were filled with tears running down his brush, and had just succeeded in bringing herself down to them, and all must have got.', '2019-01-24 16:31:11', 0),
(40, 'Programmable attitude-oriented knowledgeuser', 'King. \'Nearly two miles high,\' added the Queen. \'I never saw one, or heard of uglifying!\' it exclaimed. \'You know what to uglify is, you ARE a simpleton.\' Alice did not sneeze, were the two.', '1981-12-01 15:39:18', 0),
(41, 'Persistent neutral access', 'Alice, and she crossed her hands on her lap as if nothing had happened. \'How am I to do?\' said Alice. \'I don\'t see any wine,\' she remarked. \'There isn\'t any,\' said the Caterpillar. \'Well, perhaps.', '1998-01-01 11:23:50', 0),
(42, 'Sharable tertiary moderator', 'Lory, who at last she stretched her arms folded, frowning like a frog; and both the hedgehogs were out of its right paw round, \'lives a March Hare. \'Then it ought to be a book of rules for shutting.', '1985-09-19 06:43:31', 0),
(43, 'Pre-emptive 6thgeneration customerloyalty', 'Mouse, turning to the Mock Turtle, and said to herself, for this curious child was very fond of beheading people here; the great concert given by the time when she heard a voice sometimes choked.', '2011-06-16 13:36:46', 0),
(44, 'Polarised background neural-net', 'I\'m not particular as to bring tears into her head. Still she went on, very much what would be like, but it makes me grow large again, for this time the Queen had never left off when they liked, and.', '2005-08-14 01:44:23', 0),
(45, 'Assimilated bandwidth-monitored initiative', 'How the Owl and the beak-- Pray how did you manage to do next, when suddenly a footman in livery, with a shiver. \'I beg your pardon!\' said the Caterpillar. Alice thought she had succeeded in curving.', '1995-09-18 20:37:28', 0),
(46, 'Universal interactive neural-net', 'Said his father; \'don\'t give yourself airs! Do you think I can remember feeling a little before she gave a little hot tea upon its forehead (the position in dancing.\' Alice said; \'there\'s a large.', '2023-07-02 17:31:48', 0),
(47, 'Reduced multi-state circuit', 'Mock Turtle said with a cart-horse, and expecting every moment to think about it, so she began shrinking directly. As soon as look at the bottom of a book,\' thought Alice to herself, as she could,.', '1998-03-18 22:30:50', 0),
(48, 'Polarised solution-oriented website', 'Gryphon. \'Turn a somersault in the sea. But they HAVE their tails fast in their mouths; and the Gryphon said, in a sulky tone; \'Seven jogged my elbow.\' On which Seven looked up and say \"How doth the.', '1977-07-12 03:18:12', 0),
(49, 'Cross-platform zerodefect emulation', 'Alice, \'how am I to get out again. That\'s all.\' \'Thank you,\' said Alice, whose thoughts were still running on the second verse of the e--e--evening, Beautiful, beauti--FUL SOUP!\' \'Chorus again!\'.', '1981-08-13 05:26:03', 0),
(50, 'Ameliorated user-facing interface', 'And the Eaglet bent down its head to feel very sleepy and stupid), whether the blows hurt it or not. So she began: \'O Mouse, do you know what they\'re about!\' \'Read them,\' said the King, \'that only.', '1978-06-20 12:45:00', 0),
(51, 'Configurable optimizing hierarchy', 'She did it so yet,\' said the last few minutes, and she had got to come once a week: HE taught us Drawling, Stretching, and Fainting in Coils.\' \'What was that?\' inquired Alice. \'Reeling and Writhing,.', '2022-07-08 13:21:36', 0),
(52, 'Focused needs-based GraphicalUserInterface', 'White Rabbit returning, splendidly dressed, with a knife, it usually bleeds; and she tried to speak, and no one could possibly hear you.\' And certainly there was enough of it at last, and they all.', '1988-07-23 04:52:54', 0),
(53, 'Multi-layered zeroadministration implementation', 'After a minute or two, which gave the Pigeon the opportunity of saying to her in the sun. (IF you don\'t even know what a delightful thing a bit!\' said the King, who had followed him into the garden.', '2023-06-29 08:41:50', 0),
(54, 'Up-sized uniform strategy', 'Hatter: \'I\'m on the Duchess\'s voice died away, even in the night? Let me see: I\'ll give them a railway station.) However, she soon found an opportunity of adding, \'You\'re looking for eggs, as it.', '2013-12-19 19:01:18', 0),
(55, 'Quality-focused hybrid help-desk', 'And concluded the banquet--] \'What IS the same thing,\' said the Dodo, \'the best way to explain the paper. \'If there\'s no use in knocking,\' said the King, and the Hatter went on at last, and managed.', '2003-12-15 09:30:16', 0),
(56, 'Multi-layered multi-state customerloyalty', 'Who for such dainties would not give all else for two Pennyworth only of beautiful Soup? Pennyworth only of beautiful Soup? Pennyworth only of beautiful Soup? Pennyworth only of beautiful Soup?.', '1973-01-23 01:39:11', 0),
(57, 'Reactive object-oriented implementation', 'King said, turning to Alice, flinging the baby with some curiosity. \'What a number of cucumber-frames there must be!\' thought Alice. The poor little thing howled so, that Alice said; \'there\'s a.', '2020-11-22 11:55:09', 0),
(58, 'Adaptive multi-tasking GraphicInterface', 'Oh dear! I\'d nearly forgotten to ask.\' \'It turned into a butterfly, I should be free of them bowed low. \'Would you tell me,\' said Alice, \'and why it is almost certain to disagree with you, sooner or.', '1980-03-25 03:15:19', 0),
(59, 'Synchronised zeroadministration knowledgebase', 'Tell her to carry it further. So she was talking. \'How CAN I have dropped them, I wonder?\' Alice guessed who it was, even before she had read about them in books, and she tried the roots of trees,.', '2016-02-22 02:33:50', 0),
(60, 'Team-oriented stable complexity', 'Alice, and, after waiting till she too began dreaming after a minute or two. \'They couldn\'t have done just as she could, and waited to see the Mock Turtle said: \'advance twice, set to partners--\'.', '1995-07-28 08:42:17', 0),
(61, 'Advanced upward-trending support', 'Then turn not pale, beloved snail, but come and join the dance. So they went on so long that they must be removed,\' said the Gryphon, and the jury had a little bottle that stood near the.', '1975-04-20 13:38:11', 0),
(62, 'Synergized zeroadministration capacity', 'BEST butter, you know.\' \'I DON\'T know,\' said Alice, who had got its head impatiently, and said, without even looking round. \'I\'ll fetch the executioner went off like an honest man.\' There was a real.', '1999-11-05 19:37:11', 0),
(63, 'Digitized foreground superstructure', 'Queen till she had to be executed for having cheated herself in a wondering tone. \'Why, what are they made of?\' Alice asked in a long, low hall, which was full of smoke from one end of your nose--.', '1989-12-20 23:51:59', 0),
(64, 'Networked well-modulated intranet', 'There was nothing on it in less than no time she\'d have everybody executed, all round. (It was this last remark, \'it\'s a vegetable. It doesn\'t look like one, but it did not sneeze, were the cook,.', '2020-05-31 13:15:06', 0),
(65, 'Optional scalable complexity', 'THERE again!\' said Alice indignantly, and she put it. She stretched herself up and repeat \"\'TIS THE VOICE OF THE SLUGGARD,\"\' said the Duchess; \'and the moral of that is, but I can\'t remember,\' said.', '2010-05-17 13:12:20', 0),
(66, 'Profit-focused incremental task-force', 'Presently she began looking at the March Hare said--\' \'I didn\'t!\' the March Hare took the least idea what Latitude was, or Longitude I\'ve got to grow up again! Let me see--how IS it to the Queen, in.', '1978-10-23 09:07:17', 0),
(67, 'Self-enabling systematic hardware', 'I must be growing small again.\' She got up this morning, but I hadn\'t mentioned Dinah!\' she said to a farmer, you know, this sort of circle, (\'the exact shape doesn\'t matter,\' it said,) and then.', '1972-06-29 23:59:16', 0),
(68, 'Universal local throughput', 'This did not much larger than a rat-hole: she knelt down and looked very anxiously into her eyes--and still as she swam nearer to make it stop. \'Well, I\'d hardly finished the first position in.', '2000-10-10 05:03:51', 0),
(69, 'Secured nextgeneration portal', 'These were the two creatures, who had got its neck nicely straightened out, and was just beginning to get in at the top of his teacup and bread-and-butter, and then said, \'It WAS a curious.', '2009-11-19 12:04:49', 0),
(70, 'Persevering stable superstructure', 'Hatter, and here the Mock Turtle sang this, very slowly and sadly:-- \'\"Will you walk a little pattering of feet in the newspapers, at the Queen, who were lying on their slates, and then she.', '1994-11-14 14:42:14', 0),
(71, 'Re-contextualized optimal openarchitecture', 'I\'m sure she\'s the best of educations--in fact, we went to the other ladder?--Why, I hadn\'t gone down that rabbit-hole--and yet--and yet--it\'s rather curious, you know, this sort in her life, and.', '1977-07-17 20:45:46', 0),
(72, 'Diverse regional contingency', 'How queer everything is to-day! And yesterday things went on so long that they had been found and handed back to yesterday, because I was sent for.\' \'You ought to speak, and no one else seemed.', '1987-03-28 02:19:14', 0),
(73, 'Ergonomic holistic adapter', 'I don\'t want to be?\' it asked. \'Oh, I\'m not myself, you see.\' \'I don\'t like them raw.\' \'Well, be off, and she had succeeded in bringing herself down to her feet as the Rabbit, and had just upset the.', '1978-10-10 01:37:33', 0),
(74, 'Configurable leadingedge capacity', 'I\'m better now--but I\'m a deal faster than it does.\' \'Which would NOT be an old conger-eel, that used to read fairy-tales, I fancied that kind of serpent, that\'s all I can reach the key; and if I.', '1975-06-26 14:26:47', 0),
(75, 'Optimized systemic superstructure', 'I\'ve offended it again!\' For the Mouse replied rather crossly: \'of course you know what \"it\" means well enough, when I find a thing,\' said the Caterpillar. \'Not QUITE right, I\'m afraid,\' said Alice,.', '1975-01-16 02:10:02', 0),
(76, 'Ameliorated client-driven contingency', 'Bill\'s got the other--Bill! fetch it here, lad!--Here, put \'em up at this moment Alice felt a little glass table. \'Now, I\'ll manage better this time,\' she said to herself \'Now I can creep under the.', '1990-08-28 20:19:09', 0),
(77, 'Implemented uniform encryption', 'TWO little shrieks, and more puzzled, but she saw maps and pictures hung upon pegs. She took down a very respectful tone, but frowning and making quite a commotion in the night? Let me think: was I.', '2017-06-05 10:42:15', 0),
(78, 'Automated modular analyzer', 'Seven flung down his brush, and had come to the Classics master, though. He was an uncomfortably sharp chin. However, she got to grow here,\' said the Queen. First came ten soldiers carrying clubs;.', '1995-07-14 19:07:50', 0),
(79, 'Automated intermediate methodology', 'Rabbit began. Alice gave a little shriek and a great hurry. An enormous puppy was looking about for a long tail, certainly,\' said Alice, (she had grown in the distance would take the place of the.', '2001-08-25 07:54:35', 0),
(80, 'Managed intermediate matrix', 'Alice. \'Reeling and Writhing, of course, I meant,\' the King said to herself, for she felt sure it would feel very uneasy: to be a person of authority among them, called out, \'First witness!\' The.', '2016-07-05 07:22:41', 0),
(81, 'Reactive system-worthy service-desk', 'King. Here one of the wood for fear of killing somebody, so managed to swallow a morsel of the gloves, and she went round the refreshments!\' But there seemed to listen, the whole pack of cards!\' At.', '2004-07-08 07:20:49', 0),
(82, 'Fundamental nextgeneration definition', 'Queen, tossing her head through the wood. \'It\'s the first position in dancing.\' Alice said; \'there\'s a large cauldron which seemed to follow, except a little anxiously. \'Yes,\' said Alice, as she.', '1976-03-14 12:31:00', 0),
(83, 'Team-oriented bottom-line emulation', 'White Rabbit blew three blasts on the bank, and of having nothing to what I see\"!\' \'You might just as well. The twelve jurors were writing down \'stupid things!\' on their throne when they passed too.', '1984-05-12 11:26:34', 0),
(84, 'Object-based asynchronous methodology', 'Pigeon; \'but if you\'ve seen them so shiny?\' Alice looked at it, and they can\'t prove I did: there\'s no meaning in it,\' said the Mock Turtle, \'they--you\'ve seen them, of course?\' \'Yes,\' said Alice.', '1975-02-04 06:42:29', 0),
(85, 'Adaptive tertiary project', 'THE KING AND QUEEN OF HEARTS. Alice was only the pepper that makes them sour--and camomile that makes you forget to talk. I can\'t take LESS,\' said the Mock Turtle repeated thoughtfully. \'I should.', '1992-04-10 02:42:48', 0),
(86, 'Realigned 24hour architecture', 'May it won\'t be raving mad after all! I almost wish I hadn\'t cried so much!\' Alas! it was talking in his sleep, \'that \"I like what I say,\' the Mock Turtle. \'Seals, turtles, salmon, and so on.\' \'What.', '1998-03-10 20:52:07', 0),
(87, 'Total bi-directional framework', 'Alice, as she could. The next thing is, to get us dry would be like, \'--for they haven\'t got much evidence YET,\' she said to herself, \'to be going messages for a minute or two she walked down the.', '2005-06-13 03:39:45', 0),
(88, 'Focused zerodefect parallelism', 'Alice, surprised at this, that she was terribly frightened all the rest of the edge of her sharp little chin. \'I\'ve a right to grow larger again, and said, \'So you did, old fellow!\' said the.', '2001-10-21 12:46:38', 0),
(89, 'Business-focused tangible alliance', 'I could let you out, you know.\' \'Not the same year for such dainties would not join the dance. Would not, could not, would not, could not, could not, would not open any of them. \'I\'m sure those are.', '2007-02-14 18:30:44', 0),
(90, 'Compatible solution-oriented customerloyalty', 'Crab, a little animal (she couldn\'t guess of what work it would feel with all their simple joys, remembering her own children. \'How should I know?\' said Alice, (she had grown in the other. \'I beg.', '1997-08-13 19:02:00', 0),
(91, 'Profit-focused context-sensitive success', 'Cat said, waving its tail about in a very interesting dance to watch,\' said Alice, who had been broken to pieces. \'Please, then,\' said Alice, who always took a great crowd assembled about them--all.', '2007-05-24 07:14:11', 0),
(92, 'Multi-lateral holistic info-mediaries', 'I was sent for.\' \'You ought to have no sort of meaning in them, after all. I needn\'t be afraid of it. She stretched herself up closer to Alice\'s side as she picked up a little pattering of footsteps.', '2020-01-17 16:41:00', 0),
(93, 'Versatile empowering localareanetwork', 'Dinah, tell me who YOU are, first.\' \'Why?\' said the Caterpillar. \'Not QUITE right, I\'m afraid,\' said Alice, quite forgetting that she looked down at them, and the King sharply. \'Do you play.', '2013-05-26 13:05:53', 0),
(94, 'Digitized attitude-oriented support', 'I must be what he did it,) he did with the words have got altered.\' \'It is wrong from beginning to get out again. Suddenly she came in sight of the birds hurried off to the shore. CHAPTER III. A.', '2008-12-16 01:26:17', 0),
(95, 'Open-architected executive benchmark', 'All the time she had accidentally upset the milk-jug into his plate. Alice did not dare to laugh; and, as she couldn\'t answer either question, it didn\'t much matter which way I ought to go near the.', '2018-12-26 13:58:37', 0),
(96, 'Ameliorated zerotolerance policy', 'Alice, a good opportunity for croqueting one of the cattle in the pool, and the fan, and skurried away into the air off all its feet at the thought that she was peering about anxiously among the.', '1987-06-25 03:54:33', 0),
(97, 'Reduced multi-tasking task-force', 'Dormouse shook itself, and was looking down with her head!\' Those whom she sentenced were taken into custody by the hand, it hurried off, without waiting for turns, quarrelling all the party sat.', '1994-10-28 21:28:30', 0),
(98, 'Customer-focused transitional GraphicalUserInterface', 'Hatter was the White Rabbit. She was a very truthful child; \'but little girls eat eggs quite as safe to stay in here any longer!\' She waited for some time without hearing anything more: at last it.', '1984-07-26 19:22:46', 0),
(99, 'Secured zerodefect instructionset', 'The master was an old crab, HE was.\' \'I never could abide figures!\' And with that she had succeeded in curving it down \'important,\' and some were birds,) \'I suppose so,\' said the King, going up to.', '1979-07-02 11:10:36', 0),
(100, 'Inverse local parallelism', 'French lesson-book. The Mouse did not answer, so Alice went on, very much what would be like, but it is.\' \'Then you keep moving round, I suppose?\' \'Yes,\' said Alice, who felt very lonely and.', '1975-05-05 02:41:44', 0);

-- --------------------------------------------------------

--
-- Table structure for table `rentablespace`
--

DROP TABLE IF EXISTS `rentablespace`;
CREATE TABLE IF NOT EXISTS `rentablespace` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Company` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `Address` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `SizeSQF` int NOT NULL,
  `CostPerMonth` int NOT NULL,
  `Description` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `Contact` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `DatePublished` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  UNIQUE KEY `ID` (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=54 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci;

--
-- Dumping data for table `rentablespace`
--

INSERT INTO `rentablespace` (`ID`, `Company`, `Address`, `SizeSQF`, `CostPerMonth`, `Description`, `Contact`, `DatePublished`) VALUES
(1, 'Heidenreich Inc', '9413 Osinski Drive Apt. 413\nJudgefort, AK 69709', 235920000, 36, 'Non doloremque tempora nostrum qui quo sunt. Dolorem ducimus nihil eum vel vitae maxime. Delectus iste odio reiciendis corrupti. Quis reprehenderit magnam aut magni.', '650.494.7649x760', '2023-12-18 02:28:58'),
(2, 'Stark-O\'Hara', '669 Enola Avenue Apt. 675\nPort Blaze, MO 64426', 6736660, 0, 'Excepturi error mollitia id corporis. Non officiis aut sequi doloribus temporibus enim voluptatum. Expedita tempore esse veniam rerum. Et eaque molestiae omnis est ab. Provident aut earum eaque suscipit nihil et quis.', '(788)268-9818x16288', '2023-12-24 11:48:53'),
(3, 'Towne PLC', '633 Ceasar Port\nWatsicafurt, HI 86604-6710', 1, 7420, 'Laudantium veniam dolor repellendus sequi. Error dignissimos sed atque. Quasi ut aut reiciendis nesciunt impedit et. Nulla facere et dolorem eum ipsam corrupti fugit. Ut error dignissimos in dolorem ut doloremque debitis.', '+61(1)5863355454', '2023-12-22 05:20:14'),
(4, 'IT WORKS', '67330 Keebler Key Port Bentonburgh, IL 62180-9082', 0, 10, 'Odit sit minus quasi doloribus. Explicabo ut recusandae quae aut. Quam tempora officia saepe sit consequatur magnam minus. Doloremque quia nostrum est aliquam adipisci alias cum.', '06943113820', '2023-12-17 19:23:34'),
(5, 'Powlowski, Borer and Nienow', '09115 Adriana Passage\nWest Imeldaborough, NY 00609', 5734, 0, 'Nesciunt enim quae a voluptas ut magni. Earum et vel vero ut mollitia sunt. Autem eos voluptates at libero praesentium.', '(754)183-4323', '2023-12-01 04:19:53'),
(6, 'Zieme Group', '58128 Vandervort Valley Apt. 050\nNew Abel, WI 33873-3356', 289640000, 86325, 'Aut sit dolor ipsa. Optio quia placeat qui nobis et. Velit neque molestiae ut sapiente. Quis perferendis magni laborum ut repellendus ea quia.', '835-635-4779', '2023-12-03 08:52:11'),
(7, 'Pouros-Bahringer', '9184 Kieran Mill Suite 027\nJuliastad, IL 32851', 266708000, 16527, 'Aut sit eius aut quia. Libero rerum enim non voluptas repellendus. Expedita nesciunt est molestiae consequuntur numquam. Voluptas eos occaecati molestias error dicta non. Excepturi sint dolor ullam eum aut vitae.', '1-988-194-1818x634', '2023-12-25 22:07:03'),
(8, 'Lueilwitz-Lebsack', '573 Klocko Trace\nWest Erlingbury, KY 45025-4114', 3251, 16350, 'Ut magni illum optio et. Dicta et explicabo praesentium aut. Officiis rerum illo et sequi veniam.', '1-628-374-4558', '2023-12-19 13:30:13'),
(9, 'Vandervort and Sons', '4882 Alexandrea Extension\nAshlynnview, NJ 84197-8958', 3844240, 30098, 'Laboriosam officiis neque ducimus necessitatibus et distinctio ipsum neque. Corrupti dolorem nobis non. Ipsum quae sit id laudantium dolores. Animi in nostrum ducimus asperiores ut quidem velit.', '+48(4)8160576165', '2023-12-16 01:58:08'),
(10, 'Nienow-Schimmel', '54398 Jazmin Prairie\nNew Terenceton, NV 08962-9467', 74748304, 4412880, 'Non praesentium sit soluta aut nemo quisquam. Rerum tempora magnam quibusdam quis sed. Aperiam veniam saepe praesentium qui sapiente nemo.', '(417)632-6882x58966', '2023-12-12 04:15:59'),
(11, 'Zieme, Heidenreich and Schumm', '6296 Bridgette Walk\nLambertmouth, AK 37147', 35920, 363, 'Ea reprehenderit provident quae non vel. Asperiores dolor expedita voluptas sed laborum accusantium. Et sapiente fugit repudiandae sequi.', '1-947-270-8638', '2023-12-14 05:24:02'),
(12, 'Buckridge LLC', '3175 Kohler Mountains Apt. 542\nLake Tyree, IL 49059', 94277, 32176, 'Vitae veritatis facere aut sed vitae est et. Doloremque et facilis quos maxime consequatur voluptatem ut. Earum quidem velit aspernatur corporis aut id veritatis. Minus modi non architecto consequuntur ab rerum ea.', '869-926-3688', '2023-12-07 08:21:51'),
(13, 'Effertz PLC', '51747 Sidney Road Suite 196\nNicholeland, NE 81669', 55923, 60130200, 'Earum sed atque et ea vel. Atque et et voluptas quibusdam facere. Fuga fugit ut iusto.', '(109)690-2932', '2023-11-30 10:33:15'),
(14, 'Oberbrunner Ltd', '382 Graham Branch Suite 290\nConsidinefurt, NE 31512-3839', 850417984, 183501, 'Quo qui consequatur molestiae. Hic doloribus reprehenderit quo aut omnis. Aperiam esse id optio perferendis quo quo.', '104-610-7260x821', '2023-12-04 05:48:47'),
(15, 'Botsford, Jacobson and Stoltenberg', '18379 Olga Canyon\nWest Al, MA 66904-1843', 488100992, 0, 'Modi dicta molestiae aspernatur nulla consequuntur omnis ratione repellat. Nihil fugit est aut rerum magni nisi.', '737.017.6401', '2023-12-10 00:05:09'),
(16, 'Brown, Heaney and Schulist', '70660 Raina Village Suite 160\nEast Lenny, MS 17909-1344', 9921, 18769800, 'Iure sunt inventore et dolores fugit quia. Vero ex et et accusantium dolorem molestias. Voluptatem delectus consequatur qui incidunt voluptatem voluptates ut saepe. Nesciunt voluptatum modi id.', '(215)912-0587', '2023-12-17 20:55:33'),
(17, 'Koch LLC', '676 Kilback Junctions\nNorth Elton, NH 75408', 5865720, 50435, 'Esse reprehenderit ut perferendis ut ullam. Et eum qui doloribus voluptatem. Dolores dolores qui consectetur ut suscipit. Repellendus rerum sit veniam facilis perspiciatis.', '851.433.7149x9370', '2023-12-09 09:43:12'),
(18, 'McCullough-Bogisich', '83857 Kutch Avenue\nHildegardmouth, WA 11533-4255', 0, 126, 'Corrupti hic beatae asperiores. Illo consequuntur non cumque reprehenderit autem. Dolorum sapiente qui reiciendis aut.', '548-437-2924x80608', '2023-12-18 23:16:58'),
(19, 'Dicki LLC', '0641 Mayert Springs Suite 616\nNew Kelliland, MO 94580-0864', 21, 240921, 'Sequi quos et quae porro omnis qui laborum. Quia ipsam quos accusamus. Quibusdam non ratione veniam impedit minus. Praesentium voluptatem et quia quos quia quia cupiditate.', '(977)912-3428x10084', '2023-12-16 14:35:30'),
(20, 'Bechtelar, Hartmann and Hickle', '6964 Anderson Lights Suite 905\nWest Maribelport, AL 91254', 6, 20510200, 'Dolor beatae aut et eos ipsa qui. Sed qui delectus eveniet commodi et eum. Ipsam excepturi repudiandae aut accusamus sit aperiam quam.', '+47(3)8811479291', '2023-12-20 07:49:26'),
(21, 'Bode, Reilly and Keebler', '6249 Pouros Lake Suite 475\nNew Dax, NJ 26260-2834', 92040800, 7932760, 'Quos qui et modi ex. Ut enim atque quia ab magnam occaecati aut iusto. Animi ea esse tempore magni consectetur accusantium. Ut voluptates atque ex autem dolorem sunt hic error.', '731.556.2072', '2023-12-04 17:36:00'),
(22, 'Lesch, Stokes and Hoeger', '36313 Savannah Dale Suite 833\nLake Damienberg, MD 18124', 5517, 2867, 'Aut incidunt pariatur aspernatur voluptate reprehenderit. Molestiae voluptas vel perspiciatis cupiditate aperiam. Quaerat similique eum tempora dolor voluptatem laborum ex eos.', '1-776-785-3857x21493', '2023-12-16 09:34:42'),
(23, 'Bechtelar, Wyman and Weissnat', '1871 Welch Crest Apt. 455\nSouth Broderickborough, MS 41095-7749', 88, 13348, 'Maiores soluta quia enim est veniam quia itaque officiis. Tenetur quia rerum quam nulla et. Nemo repudiandae aut rerum accusantium blanditiis. Veritatis similique ducimus temporibus quaerat molestiae impedit voluptatem.', '1-729-634-6217', '2023-12-13 21:23:07'),
(24, 'Walter, Sporer and Carter', '770 Koss Port Apt. 475\nPort Rachel, IL 70372-8264', 0, 564326016, 'Alias ratione omnis inventore. Enim autem ullam excepturi ea nihil excepturi voluptatem recusandae. Sequi error aspernatur quia quo et voluptatum facilis.', '+72(9)1683116518', '2023-12-23 18:18:20'),
(25, 'Schuster, Romaguera and Hudson', '245 Block Prairie Suite 388\nWest Gerdaland, MT 57583', 311247008, 731, 'Quia in inventore voluptates et dicta rerum modi. Dolor veritatis autem recusandae rerum possimus voluptas. Ut excepturi nesciunt voluptatem libero voluptatem. Quos qui iure tempora ut assumenda numquam.', '582-520-8842x9299', '2023-12-27 21:16:15'),
(26, 'Thiel-Howell', '843 Savion Plains Apt. 712\nEast Zoeyville, UT 16038-4546', 0, 329058, 'Et sed aut fugit commodi eveniet voluptas amet. Sunt hic qui cum officia sed minima quaerat. Architecto non nihil eligendi commodi doloremque. Molestiae beatae nihil voluptatibus repudiandae sed deserunt maiores.', '1-071-076-5899x5784', '2023-12-20 02:06:47'),
(27, 'Champlin, McDermott and Pouros', '68515 Jayme Harbors\nSouth Unaberg, MT 56379-5112', 424732000, 1, 'Et numquam consequatur laborum aut itaque sit. Aspernatur maxime inventore quis tempore deleniti non enim debitis. In aut ducimus nobis. Eaque sit velit et aut quo nihil nobis.', '244.481.7990x63901', '2023-12-07 18:36:44'),
(28, 'Schamberger-D\'Amore', '9912 Isobel Canyon Suite 539\nBartolettiview, MI 03602-8557', 6359, 72192, 'Officia possimus aut enim explicabo voluptas est rerum. Quaerat explicabo atque at dolorem ratione iste. Cumque eligendi optio fuga fugit odio ut sit. Laborum rem rem et perferendis minus quo.', '1-439-983-3686x027', '2023-12-13 11:18:00'),
(29, 'Turner, Will and Wunsch', '399 Goldner Mountains\nNorth Elvera, CT 73982', 637189, 64111, 'Doloribus occaecati non quis consequatur. Eum atque ipsa neque officia sunt id qui.', '06660212285', '2023-11-29 21:36:09'),
(30, 'Towne-Douglas', '431 Georgianna Row Suite 649\nAdrianview, SC 17609-5302', 0, 262492, 'Nihil exercitationem atque eos dolores numquam eum. Quaerat autem cupiditate excepturi dicta rerum qui eos. Labore accusantium tenetur eligendi nesciunt sit. Eos enim quaerat quaerat sit tempore. Quis nam autem neque minus.', '876.298.8067', '2023-12-03 04:59:34'),
(31, 'Wisozk Group', '85712 Derick Spur Apt. 279\nRusselside, CT 99013-3388', 694254, 320302, 'Voluptatem sint odio vitae quia. Autem non et omnis. Reprehenderit voluptatem odit porro quas cum tenetur.', '931.285.4117', '2023-12-16 22:13:35'),
(32, 'Borer-Keeling', '350 Fisher Forge\nEast Myra, HI 56228', 628662976, 0, 'Laudantium aut aliquid temporibus. Molestias fuga cum et minus repellendus. Earum dignissimos est molestiae vero et ut. Illum eveniet quidem animi nisi inventore.', '1-170-508-1353x963', '2023-12-08 18:20:19'),
(33, 'Hudson Ltd', '034 Hilario Mountains\nWest Moses, FL 88143', 72, 193, 'Culpa voluptatem esse ut necessitatibus est voluptatem et. Dolorum dolores similique perferendis quo aperiam. Non laborum ea commodi omnis. Ut consequatur dolorum quibusdam.', '1-078-347-9806', '2023-11-30 11:28:09'),
(34, 'Kuhlman Ltd', '01377 Keegan Valley\nRessiebury, NY 20803-2110', 644, 12208200, 'Dolorem facere quia qui rerum. Necessitatibus aut magnam harum aspernatur. Consequuntur quos vel aut nihil sapiente nihil voluptatem. Nemo praesentium ut nulla sit est quos quisquam nemo. Aut laudantium aspernatur consectetur aut omnis accusamus.', '242-276-6164x14425', '2023-12-17 23:05:18'),
(35, 'Ortiz-McClure', '801 Bartell Lights\nEast Jaida, AZ 25361-6633', 0, 401290, 'Omnis amet rerum rerum ducimus odio. Quo maiores sit enim nostrum. Iste corporis doloremque voluptates laboriosam. Dolores repellendus quaerat id sint alias animi repellat illo.', '(331)480-7418x4152', '2023-12-17 10:27:01'),
(36, 'Rowe, Mills and Balistreri', '286 Manuela Mission\nNew Ulicesfort, DE 45951', 717358, 516, 'Et sint atque magnam ullam facilis. Sed est sed exercitationem molestiae numquam. Enim fugit ea quo mollitia unde excepturi nemo ab. Velit facilis architecto nisi modi sunt quia iure.', '(614)033-8207', '2023-12-26 22:28:02'),
(37, 'Ritchie, Legros and Collins', '13397 Alberto Stravenue Suite 924\nEast Nettieshire, MO 88257', 906038976, 216, 'Ut minus ullam et eum praesentium illum repellendus. Pariatur nihil tenetur aut rem molestiae voluptatem harum. Quo dolorem repudiandae sint accusantium accusantium. Ipsa atque eos dolorem laboriosam quod consequuntur. Esse nesciunt optio ipsa.', '00334554971', '2023-12-01 19:19:16'),
(38, 'Hills, Spinka and Kuhlman', '932 Kieran Brook\nKihnfort, PA 00707-5793', 38, 0, 'Enim possimus non aspernatur eveniet. Aut blanditiis assumenda qui dolor animi omnis. Totam voluptatem est voluptate perspiciatis quia explicabo ducimus quas.', '1-899-189-8077x1102', '2023-12-19 08:49:45'),
(39, 'Stark, Witting and Yundt', '417 Watsica Vista Apt. 617\nO\'Harashire, MD 18173-1508', 9558, 91, 'Ut rerum soluta minima debitis rerum expedita provident. Est similique molestiae et ut aut quod. Dolor doloribus temporibus aut nostrum fugiat debitis voluptates.', '781.956.0218', '2023-12-15 12:01:24'),
(40, 'Kassulke PLC', '68554 Kenyon Manors\nPort Oral, WV 22519-8242', 6, 224275, 'Quis voluptatem eveniet qui repellat sunt necessitatibus accusamus. Omnis ipsam minus velit velit quo quas autem. Sit et eius voluptatibus nemo itaque porro necessitatibus. Autem et enim eligendi sed iusto autem corrupti.', '1-670-791-6676x2438', '2023-12-09 10:29:11'),
(41, 'McGlynn PLC', '9830 Bret Burg Apt. 652\nWilburnville, VA 61861', 210, 0, 'Et commodi eum autem similique quo omnis. Aut sint rerum ad aut quasi rem quo dolorem. Hic omnis nostrum laborum voluptatem incidunt.', '544.257.6800x03527', '2023-12-22 02:52:23'),
(42, 'Kerluke PLC', '77362 Evie Walk\nChynamouth, ID 22050', 0, 3, 'Sequi suscipit qui similique velit aut velit optio. Cumque non dolorum possimus. Minima voluptas eos nulla nesciunt.', '03836706233', '2023-12-23 09:20:59'),
(43, 'Yundt, Rowe and Bartoletti', '142 Stanley Forest\nO\'Reillyburgh, PA 44420', 720633, 190, 'Assumenda consequatur quia officiis voluptates. Nesciunt animi non possimus mollitia vel. Consequuntur autem tempora quaerat voluptates. Vitae libero in sunt dolorem earum.', '299-217-9511', '2023-12-16 04:26:18'),
(44, 'Heidenreich LLC', '509 Gleichner Freeway\nSchmittborough, TN 79235', 800, 284, 'Deserunt accusantium maxime libero tempora delectus. Illum autem dolorem eveniet voluptatem voluptatum. Porro deserunt qui aut aliquid voluptatem dolore. Dolorem voluptas officiis debitis repellat. Eveniet quaerat ipsam excepturi incidunt.', '(741)968-8143', '2023-12-14 06:15:04'),
(45, 'Botsford and Sons', '67769 Bosco Knolls\nNorth Juwan, CT 52504-2275', 6531350, 240099, 'Dolorem quod perferendis ut. Repellat aspernatur dolor provident quia fugit. Non non vel distinctio explicabo.', '1-230-544-2900', '2023-12-03 13:40:47'),
(46, 'Larkin, Kreiger and Braun', '88082 Ritchie Shore\nNew Daynebury, AL 33193-1387', 0, 1416, 'Dolores atque autem et nemo quod optio esse. Est ullam eos est ut facere. Quia repellat at delectus suscipit ratione quo aperiam magnam. Voluptatem est vitae quo fuga sunt qui vero amet.', '899.409.0190', '2023-12-29 09:24:02'),
(47, 'Volkman, Lubowitz and Lockman', '924 Volkman Mountains\nWest Hellen, DC 87794', 444988992, 21989, 'Natus atque ex sit aperiam in fuga. Vel dolore molestias et ut alias numquam ut odit. Tenetur cumque et magni recusandae quia iste. Nam rerum itaque quam quibusdam soluta.', '521-667-9559x05880', '2023-12-26 18:46:51'),
(48, 'Glover LLC', '64883 Carroll Forges Suite 686\nEverettburgh, SC 21646', 357684992, 34, 'Consequatur vel nesciunt nulla at saepe delectus repellendus. Voluptate culpa pariatur quo doloremque magni. Omnis animi nulla earum quod. Ea repellendus nulla sit consequuntur provident omnis fuga consequatur. Hic ea illo hic voluptate nesciunt voluptas enim.', '1-764-243-4624x10602', '2023-12-14 21:01:16'),
(49, 'Kuhn Ltd', '5045 Vincenza Ports Suite 298\nNew Aaliyahport, MA 75329-7890', 76, 1832030, 'Iusto numquam fugiat delectus quos. Dolorem repudiandae in enim blanditiis. Qui pariatur est et et et nulla temporibus nesciunt. Et sunt ipsum sit sint autem.', '568.199.7824x6532', '2023-12-23 10:01:48'),
(50, 'Fisher, Wintheiser and Rogahn', '11295 Michele Ramp\nRussmouth, ID 00569', 177, 2085410, 'Deserunt iusto sint culpa et consequuntur. Earum sint commodi qui quibusdam corporis. Eos dolore vero rerum dolor ullam sapiente. Ratione mollitia error maiores accusantium est rerum. Laboriosam voluptas sed accusantium quod ducimus atque.', '199-380-2352', '2023-12-24 23:45:23'),
(51, 'g', 'g', 214, 412, 'g', 'g', '2024-01-04 12:57:07'),
(52, 'test', 'test', 124, 325, 'test', '325', '2024-01-04 13:22:13'),
(53, 'Compant', 'Address', 123, 321, 'Desc', 'Contact', '2024-01-05 21:48:26');

-- --------------------------------------------------------

--
-- Table structure for table `resteraunt`
--

DROP TABLE IF EXISTS `resteraunt`;
CREATE TABLE IF NOT EXISTS `resteraunt` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `Address` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `Description` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `Email` text COLLATE utf8mb3_unicode_ci NOT NULL,
  UNIQUE KEY `ID` (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=55 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci;

--
-- Dumping data for table `resteraunt`
--

INSERT INTO `resteraunt` (`ID`, `Name`, `Address`, `Description`, `Email`) VALUES
(1, 'Nitzsche Ltd', '518 Jennings Run\nSchoenburgh, GA 22465', 'Molestiae et esse eos vel commodi qui. Dolores consequuntur eos consequuntur et. In temporibus recusandae voluptate placeat.', 'ehermiston@example.com'),
(2, 'Bruen-Rutherford', '5663 Trey Gateway Apt. 989\nToyville, MN 14813', 'Magnam sapiente est autem eos. Ut est cupiditate optio cupiditate sed vero fuga. Voluptate consequatur repudiandae et hic quidem praesentium. Provident officiis ea dignissimos sit.', 'kuvalis.delaney@example.net'),
(3, 'Bashirian-Ritchie', '802 Susie Pine\nEast Gina, NY 70176-9624', 'Quia esse optio qui fugiat impedit architecto. Quod placeat delectus est amet. Voluptas fugit non mollitia provident. Nostrum ut ea in amet itaque.', 'lcrooks@example.org'),
(4, 'Schamberger, Sauer and O\'Conner', '59116 Friesen Brook Apt. 778\nVivashire, AZ 79863-1183', 'Aut necessitatibus nemo illum debitis ad aut. Sunt explicabo optio sunt adipisci aliquid perspiciatis nisi. Corrupti in minima eum repudiandae qui eum.', 'sedrick54@example.com'),
(5, 'Bernhard-Rice', '926 Rutherford Islands\nAlexanestad, NM 49676-6980', 'Deleniti animi sunt labore id omnis ut. Explicabo nostrum eum eius quasi aut autem dolores repellendus.', 'powlowski.horacio@example.com'),
(6, 'Brakus, Collier and Marvin', '47202 Gutkowski Passage\nHazleton, FL 36818', 'Quas vel consequatur hic et maxime similique quae. Aut sunt inventore aut ut. Suscipit maiores commodi molestiae ratione saepe.', 'mollie31@example.org'),
(7, 'Frami, Botsford and Leuschke', '35898 Cornelius Cliff Apt. 480\nSouth Aminamouth, GA 84754', 'Fuga autem aut ratione ut. Quia voluptatem eveniet occaecati. Autem necessitatibus repudiandae qui minus.', 'irving.walter@example.org'),
(8, 'Kohler, Blanda and Gutkowski', '8921 Rogahn Drive Suite 742\nNew Adrianton, DC 40008', 'Aut impedit corrupti tempora. Ullam itaque dolorum ratione ea pariatur explicabo. Consectetur earum dolorum neque reprehenderit quia. Doloribus amet esse doloribus illo.', 'williamson.carlos@example.com'),
(9, 'Russel Group', '655 Mayert Stravenue\nPort Madalineland, AZ 16579-2541', 'Quisquam laboriosam adipisci id. Occaecati eos tempora atque quidem magni qui ut non. Fugiat expedita delectus aut eos. Officiis molestiae non omnis voluptatem doloribus.', 'okey.kreiger@example.com'),
(10, 'Hirthe, Glover and Fritsch', '747 Bogan Fords Suite 061\nAlberthastad, CA 14891-0255', 'Enim sit quia dolores veritatis. Eveniet repellat distinctio quaerat at sunt. Voluptate odio et vel vel aut consequatur.', 'joelle.waters@example.net'),
(11, 'Ward and Sons', '343 Kuhic Prairie Apt. 750\nLake Benhaven, LA 82331', 'Earum voluptatem consequatur itaque molestiae. Voluptatibus voluptas qui minus cupiditate ex quidem delectus. Sapiente rerum qui nemo beatae modi. Molestiae ut unde harum qui eligendi voluptatem.', 'shyanne.lind@example.net'),
(12, 'Hagenes-Kessler', '07470 Katrine Viaduct\nDouglasmouth, CO 50230', 'Quis ullam cumque placeat. A sint laudantium optio assumenda velit nisi laudantium. Necessitatibus omnis omnis qui quia delectus. Repellendus accusamus eveniet nobis.', 'schmitt.darius@example.org'),
(13, 'Trantow, Schiller and O\'Hara', '30810 Reta Brook Apt. 677\nPort Danykaberg, PA 63696-5200', 'Dolor qui repudiandae delectus ullam consequatur eligendi laborum ea. Neque numquam amet non quia. Eligendi architecto eum minus dolorem quod illo nam.', 'lucile84@example.net'),
(14, 'Lubowitz Group', '62316 Katheryn Lock Suite 142\nKoelpinstad, CO 78138-1583', 'Voluptate laborum blanditiis a hic eaque. Voluptate aut in voluptatibus tempora et eveniet.', 'gutkowski.hollie@example.org'),
(15, 'Ullrich, Nienow and Kovacek', '986 Marion Mount Suite 989\nMollyshire, AL 51960', 'Doloremque commodi molestiae ex. Quam vel deserunt possimus nulla a enim necessitatibus. Qui quo saepe ipsum aut repellendus eos nulla.', 'marlin97@example.com'),
(16, 'Hahn-Haley', '12288 Price Underpass\nPort Santinostad, CO 19255-6958', 'Corrupti veniam nostrum laudantium. Sint laborum est soluta omnis est.', 'wilderman.clifton@example.org'),
(17, 'Bartoletti Inc', '77656 Rudy Field Apt. 574\nNew Elishaborough, SC 95681-6844', 'Eius est a facilis pariatur maiores odit dolorem fugiat. Ipsam sed dicta velit quia earum molestias. Odio quam sed voluptatibus deleniti sit nemo qui sapiente.', 'jeffrey43@example.net'),
(18, 'Roberts, Willms and Lakin', '953 Stehr Vista\nEast Alexandro, CA 71795-1746', 'Quo aspernatur doloremque beatae eum occaecati nemo. Perspiciatis velit et reiciendis. Dolorum qui veniam sit harum. Ipsum atque nostrum id nulla.', 'spinka.david@example.org'),
(19, 'Schmitt, McDermott and Koelpin', '293 Kailey Prairie Suite 702\nStreichfurt, NM 85774-6426', 'Veniam voluptates et fugit. Dignissimos dolor minima vel ullam voluptatum. Esse velit ipsa autem eum sunt ipsa sapiente. Unde voluptatum inventore veritatis iste nihil aspernatur qui.', 'predovic.austen@example.com'),
(20, 'Nitzsche-Lang', '623 Halvorson Burgs\nAlbertaberg, SD 28341', 'Dolores facilis et et amet voluptatibus aut. Qui enim non provident rerum. Nam animi quis ea porro explicabo sit et. Optio modi nihil ex enim est.', 'dibbert.maurine@example.com'),
(21, 'Terry, Mann and Huels', '45878 Greenfelder Camp\nWest Jarrellchester, IN 12176', 'Qui excepturi sapiente et sit aspernatur qui nemo fugiat. Tempora qui ipsum autem illum expedita aliquam. Qui ut inventore nobis quasi aut dolorem ut. Officiis nihil sed ratione deleniti rerum.', 'lisandro.muller@example.net'),
(22, 'Swaniawski-Schmeler', '9997 Schmitt Mission Apt. 743\nWest Magnusstad, ND 96383-0701', 'Explicabo aspernatur animi quas eveniet et. Optio excepturi qui laborum aspernatur ipsum ullam fugiat.', 'ziemann.reyna@example.com'),
(23, 'Kulas Ltd', '270 Dave Orchard\nSouth Sigrid, UT 80217-2747', 'Quo quis molestiae voluptas dolores neque dolores ex et. Aut molestias saepe earum quo repellendus et. Est at quo placeat eum nemo commodi.', 'sarai54@example.net'),
(24, 'O\'Keefe-Feil', '0457 Wisoky Row Suite 113\nKihnview, IL 95526', 'Quo beatae autem non voluptatum. Perferendis quis est ipsum ullam distinctio recusandae necessitatibus sapiente. Quis libero iure accusantium fugit quo.', 'araceli90@example.com'),
(25, 'Gleason-Ward', '52001 Carleton Summit\nLake Adellaville, NE 95178-6296', 'Illo velit voluptatem rerum illum quidem mollitia. Unde quas eos animi animi ullam animi qui. Eligendi animi iusto nesciunt necessitatibus.', 'victor.cartwright@example.net'),
(26, 'Reinger-Schimmel', '99138 Kassulke Street Apt. 423\nNew Corbinhaven, IA 28016', 'Quo voluptatem quos ut omnis tenetur sed. Perspiciatis quaerat aspernatur ut optio deleniti ex dolorum a. Sed impedit totam quia repellendus eveniet eius nemo architecto.', 'lia.ruecker@example.net'),
(27, 'Kerluke Group', '8949 Kunze Key Apt. 809\nPort Laverne, AZ 19681', 'Nesciunt fugiat officia illo quas cum commodi et voluptas. Dolores qui tempore molestiae.', 'jimmy22@example.org'),
(28, 'Schowalter, Bernhard and Altenwerth', '14565 Ortiz Mount Apt. 153\nNew Mariane, CA 20518', 'Ipsam accusamus non sit sed. Nostrum iure voluptas sequi est. Qui qui eius aut omnis consectetur dolore quia. Sed molestias quae quia magnam reprehenderit.', 'jazmyne34@example.com'),
(29, 'Abernathy Ltd', '916 Mitchell Circle Suite 935\nEast Justyntown, OR 08658-3264', 'Et ea voluptas ex nobis. Voluptate qui eos doloribus voluptatibus possimus labore aut. Necessitatibus deserunt labore incidunt vel qui et sit. Sed possimus sit temporibus.', 'considine.markus@example.org'),
(30, 'Bruen-Stark', '015 Syble Springs\nSouth Augustine, ID 49716-2963', 'Eum impedit et iure occaecati. Magnam adipisci quis ducimus qui quia voluptatem. Ea voluptate unde sint quam aspernatur. Rerum possimus sit est esse quibusdam.', 'zraynor@example.org'),
(31, 'Maggio-O\'Hara', '23970 Noah Way\nWest Dolly, CO 40708', 'Dicta eius consectetur qui laudantium temporibus dolorem quia quaerat. Aspernatur rem iure eos tempore perferendis minus accusantium aspernatur.', 'mstanton@example.org'),
(32, 'Heaney-Gutkowski', '4707 Alfonzo View Apt. 820\nLake Eleonore, CA 34162-8676', 'A dolore quod sed qui modi consectetur. Dolorem pariatur rerum labore est. Est debitis debitis dolorem deserunt. Natus nesciunt ut voluptatum quia.', 'nsauer@example.net'),
(33, 'Witting-Kihn', '024 Leatha Way Apt. 299\nLake Letafort, NH 88146', 'Sed ipsa ut qui. Ducimus rem est pariatur quam. Ut magnam hic est aliquam perspiciatis qui et.', 'viviane52@example.org'),
(34, 'Emmerich-Okuneva', '47473 Heaney Manors\nImeldaton, IA 00343', 'Natus quis eligendi ipsam vitae suscipit. Et recusandae sequi sint eveniet qui. Eaque quibusdam iusto aut voluptatibus. Quis eos esse ipsum soluta est veritatis.', 'louisa18@example.org'),
(35, 'Greenfelder-Cremin', '8271 Graham Vista\nRobertsfurt, ME 14769', 'Distinctio ut vel unde vero. Laboriosam consectetur quas illum labore temporibus ipsum. Quidem rerum facere ut aut. Cum commodi itaque officia et iure.', 'towne.vilma@example.org'),
(36, 'Block, Kihn and Maggio', '4577 Breitenberg Meadows Suite 608\nLindmouth, NC 30491-6317', 'Impedit exercitationem beatae tenetur explicabo sed qui impedit. Libero blanditiis possimus nemo eaque quibusdam.', 'yschimmel@example.org'),
(37, 'Bogan, Gulgowski and Stokes', '777 Kenton Avenue\nMarianeberg, AZ 67088-4253', 'Omnis harum ut occaecati quis ex provident. Qui itaque qui quos quasi iusto amet autem. Dicta aut quidem aperiam tempore repudiandae laborum. Cupiditate reprehenderit dolorem voluptates eos.', 'helmer.upton@example.com'),
(38, 'Lockman, Dickinson and Feil', '918 Heaney Prairie\nAshleystad, HI 74136-5948', 'Reprehenderit aut molestiae et eius maxime quis. Rerum pariatur sed itaque molestiae vero distinctio enim. Voluptatem optio quia deleniti commodi delectus hic.', 'jermaine.weissnat@example.com'),
(39, 'Hamill, Hilll and Bartell', '00949 Marcelino Point\nKiraland, MN 82602-9552', 'Culpa et enim voluptas voluptates atque cupiditate laborum. Suscipit explicabo voluptates est et. Voluptatem et facilis itaque impedit exercitationem.', 'jody.veum@example.com'),
(40, 'Sauer PLC', '461 Gottlieb Shoal Suite 528\nPort Cloyd, MI 45679-9721', 'Fugit hic suscipit id hic placeat voluptatibus fugit vitae. Enim fugit repellendus vel labore perspiciatis. Quasi dolores dolorem impedit velit.', 'ischmeler@example.net'),
(41, 'Stamm Group', '964 Hermiston Causeway\nBodestad, WI 30038-5139', 'Ut ea qui mollitia maiores. Nesciunt labore deserunt dolor sed.', 'jonathan08@example.com'),
(42, 'Bogan Ltd', '0101 Kamille Mews Suite 227\nAracelyview, KS 67586', 'Quasi est minima rerum corporis soluta nihil. Modi voluptate placeat officiis ut. Consectetur rem id nemo. Ipsa sit in optio vero culpa. Et et quas quis enim officia.', 'catalina.wuckert@example.org'),
(43, 'Bashirian and Sons', '9016 Macejkovic Underpass\nWest Zoey, WY 50769-5853', 'Nisi voluptates doloremque sint ab sint optio voluptas qui. Mollitia est error aliquam. Explicabo assumenda ut temporibus repudiandae. Repellendus ratione quibusdam animi veniam sint nesciunt.', 'elva.daugherty@example.org'),
(44, 'McKenzie-Kling', '09608 Citlalli Cliff Apt. 344\nProsaccotown, MI 97164', 'Velit blanditiis voluptatibus amet aliquam tempore. Sit beatae adipisci animi molestias voluptates. Est voluptas reiciendis temporibus sit.', 'runolfsdottir.marielle@example.org'),
(45, 'Ward Ltd', '3414 Juston Land\nCordiehaven, SC 72230', 'Inventore sed est consequatur. Est consequatur nobis natus. Dolor quas ullam in odio nisi. Id ipsa vel molestiae cupiditate fuga tempora.', 'juston46@example.net'),
(46, 'Koelpin, Gutkowski and Schmitt', '04058 Pfannerstill Ranch Apt. 871\nDickiland, GA 41930', 'Fugiat quia ea tempore doloribus est. Ad consequatur dolore id error. Rerum ad aut voluptate et qui unde. Beatae dolores odit nemo placeat incidunt sunt. At et officia sint suscipit aut.', 'lester71@example.net'),
(47, 'Berge-Padberg', '01499 Merle Skyway\nKavonmouth, UT 27784-3115', 'Id accusantium iste similique voluptatem. Sapiente unde est eum eum. Suscipit ut tempora sunt aspernatur qui.', 'cdaugherty@example.net'),
(48, 'Shanahan, Hane and Kozey', '27055 D\'Amore Station\nTreutelmouth, IN 81759-1065', 'Recusandae nihil sit nihil nostrum alias. Qui amet et aut eaque rerum omnis. Assumenda ex et ratione similique incidunt. Nobis omnis ex nobis velit.', 'glen.price@example.net'),
(49, 'West, Kihn and Legros', '2379 Deshaun Canyon Suite 600\nMaggieview, MD 75939', 'Soluta consequatur occaecati porro doloribus. Tenetur vel aliquid numquam voluptates ducimus. Qui quia saepe optio vel et vero iste.', 'moshe87@example.net'),
(50, 'Kuphal-Schaefer', '2173 Annie Isle\nSouth Baron, AL 26757-7799', 'Illo reprehenderit incidunt eaque officiis. Ut aut a amet et ducimus deleniti incidunt vitae. Blanditiis officia ipsa blanditiis magni.', 'mathilde38@example.org'),
(51, 'wefwef', 'wegweg', 'weg', 'weg'),
(52, 'Name', 'Address', 'Description', 'Emqail'),
(53, 'g', 'g', 'g', 'g'),
(54, 'Name', 'Address', 'Desc', 'Email');

-- --------------------------------------------------------

--
-- Table structure for table `unicol`
--

DROP TABLE IF EXISTS `unicol`;
CREATE TABLE IF NOT EXISTS `unicol` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` text NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Description` varchar(1000) NOT NULL,
  `Website` varchar(100) NOT NULL,
  UNIQUE KEY `ID` (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `unicol`
--

INSERT INTO `unicol` (`ID`, `Name`, `Address`, `Description`, `Website`) VALUES
(1, 'Cardiff Met', 'Cardiff', 'Home to many students!', 'cardiffmet.ac.uk'),
(2, 'test', 'test', 'test', 'test'),
(3, 'Name', 'Address', 'Description', 'Website');

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
  `DateCreated` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Verified` tinyint(1) NOT NULL DEFAULT '0',
  `Admin` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`ID`, `UserName`, `Fullname`, `Password`, `Email`, `DateCreated`, `Verified`, `Admin`) VALUES
(1, 'Gaza', 'Gareth Llewelyn Evans', 'Gaza123', 'gareth873@gmail.com', '2023-12-19 14:25:02', 1, 1),
(2, 'g', 'Gareth Llewellll Evans', 'g', 'GLEphotography@gmail.com', '2023-12-21 13:43:25', 1, 0),
(11, 'GarethEvans', 'Gareth Llewelyn Evans', 'blabla', 'garetjh873@blabla.com', '2024-01-04 22:26:01', 0, 0),
(7, 'Leila', 'Leila Emanuel', 'Leila', 'Leila@gmail.com', '2023-12-21 17:34:44', 1, 1),
(10, 'gg', 'g', 'g', 'g', '2023-12-22 00:18:24', 1, 0),
(12, 'John', 'Bro', 'Gareth12', 'gareth873@gmail.com', '2024-01-22 11:12:47', 1, 0),
(13, 'JohnEvans', 'John Llewelyn Evans', 'Gareth12', 'John123@gmail.com', '2024-01-22 12:33:36', 0, 0),
(14, 'Kim#1', 'Kim jon un', 'NorthKorea', 'North@Hotmail.com', '2024-01-22 12:35:45', 0, 0),
(15, 'OwenJones', 'Owen Ap Jones', 'Owen123', 'Owen@gmail.com', '2024-01-22 12:36:24', 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `volunteering`
--

DROP TABLE IF EXISTS `volunteering`;
CREATE TABLE IF NOT EXISTS `volunteering` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `JobTitle` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `Address` varchar(200) COLLATE utf8mb3_unicode_ci NOT NULL,
  `Company` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `Description` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `CompanyWebsite` text COLLATE utf8mb3_unicode_ci NOT NULL,
  `Contact` text COLLATE utf8mb3_unicode_ci NOT NULL,
  UNIQUE KEY `ID` (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=55 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci;

--
-- Dumping data for table `volunteering`
--

INSERT INTO `volunteering` (`ID`, `JobTitle`, `Address`, `Company`, `Description`, `CompanyWebsite`, `Contact`) VALUES
(1, '2', '5376 Elian Trafficway\nNew Earleneshire, DC 75662', 'Swaniawski-Schamberger', 'Est repellendus fugiat illum. Assumenda autem deleniti quia. Incidunt fuga non cum.', 'http://www.kulas.info/', '1-526-995-8782'),
(2, '2', '01479 Gleason Cliffs\nErdmanstad, KS 55249', 'Greenholt, Barton and West', 'Voluptas repudiandae consectetur excepturi odio ab ut enim. Quis in qui qui ut enim. Architecto iste quis placeat cum necessitatibus sed pariatur. Quisquam ratione et amet corporis molestiae.', 'http://www.donnelly.net/', '1-337-350-0256x111'),
(3, '7', '942 Lorenzo Garden Apt. 019\nBrandynmouth, OK 60202', 'Hoeger Group', 'Iste qui ipsam atque dolor. Omnis dolorem eos et possimus quia voluptatem sapiente. Voluptatem eum totam molestiae.', 'http://zboncaknolan.net/', '1-375-327-3093x2710'),
(4, '5', '8145 Andreane Common\nLake Maya, NJ 81880', 'Koepp-Satterfield', 'Ipsa labore maxime quia consequatur aut voluptas aliquam. Repellendus praesentium atque perferendis sit eos. Cum aspernatur voluptas veniam fugit corrupti.', 'http://schultz.com/', '931.210.9671'),
(5, '', '361 Janessa Plaza\nEast Kelsimouth, WV 63028-7650', 'Dooley LLC', 'Perspiciatis aut non qui nihil. Porro accusantium repudiandae reiciendis reiciendis sint. Vel architecto porro ullam non deserunt et. Autem deleniti eveniet et et.', 'http://www.luettgenheidenreich.com/', '745-804-3583x75220'),
(6, '8', '269 Wunsch Square Suite 150\nPourosville, VT 70297-2217', 'Stoltenberg and Sons', 'Quidem tempora est provident quisquam autem placeat mollitia. Dolores eos saepe rerum et et. Non eos vero dolorem autem quaerat voluptatem. Atque ut odio quos sequi.', 'http://mertzvon.info/', '(562)355-8043'),
(7, '9', '95225 Tyler Manors Suite 363\nShanahanton, TN 59967-1109', 'Cronin-Cremin', 'Sit non sapiente aut sint modi nihil. Optio modi cumque iste. Odit quod aut voluptatem quidem dignissimos rerum.', 'http://www.hodkiewicz.com/', '1-769-133-5721x150'),
(8, '5', '81434 Aiden Corner\nEast Burnice, NY 86422', 'Quigley LLC', 'Qui distinctio qui totam sed. Quos ex vero beatae quibusdam.', 'http://www.waters.info/', '+23(6)7000232171'),
(9, '1', '356 Celestino Alley\nBarrowsburgh, ME 05615', 'Wisozk, Deckow and Beahan', 'Consequatur sunt aut fugit placeat. Eius sunt et repellendus et. Accusamus non fugit in impedit.', 'http://www.cassin.com/', '744.042.6378'),
(10, '3', '28956 Miller Square\nMattieberg, CO 16348', 'Senger-Yundt', 'Ducimus saepe adipisci eligendi vitae quis quis voluptatem. Voluptates molestiae distinctio et qui vel rem expedita. Et incidunt exercitationem provident non ut quia.', 'http://moen.com/', '(277)865-7210'),
(11, '3', '6092 Sheldon Ferry\nSouth Sienna, MA 58646', 'Kertzmann-Gerlach', 'Laborum et laudantium repudiandae aliquam praesentium suscipit est. Consequuntur aut officiis quis rerum reprehenderit maxime. Sed ab sit distinctio qui unde quidem sed commodi. Ut qui ad ad vel eum.', 'http://www.daniel.info/', '(255)518-3200x92362'),
(12, '6', '850 Keyon Station\nWest Clementineton, WI 99729', 'Reilly-Stoltenberg', 'Quia autem cupiditate possimus sit. Optio dolorem minima excepturi eos nam tempore.', 'http://www.zboncak.biz/', '(138)571-2180x492'),
(13, '2', '5930 Wellington Viaduct\nNorth Kasandra, UT 30815-8904', 'Hegmann, Koepp and Ziemann', 'Voluptas optio in id aliquam. Odit sequi qui sit dolorem labore cupiditate est. Inventore quasi earum numquam laboriosam esse vitae.', 'http://dare.net/', '(208)165-6903'),
(14, '3', '303 Bins Glens\nEast Mariah, MS 80588', 'Beatty, Armstrong and Waelchi', 'Vitae qui est ut. Dolore cum labore et unde dignissimos beatae qui. Consectetur necessitatibus et inventore soluta. Hic dicta optio et.', 'http://sauer.com/', '114.160.0576'),
(15, '', '7731 Maverick Heights\nNew Ethelyn, OK 14278-6361', 'Goodwin, Hammes and Considine', 'Suscipit ullam atque consequatur enim quas est. Inventore similique qui expedita sit. Beatae error iure dolor eaque ut. Ipsa mollitia mollitia ad excepturi molestiae velit odio.', 'http://www.weber.com/', '954.986.1159x95707'),
(16, '4', '68667 Ruthe Mountains Apt. 730\nNienowhaven, VT 96182-0069', 'Wuckert and Sons', 'Et exercitationem aliquam accusamus veritatis voluptates et. Dignissimos et qui nostrum delectus nam dicta. Velit eos qui tempore porro quam omnis nisi. Ex qui est assumenda reiciendis.', 'http://kesslerwalker.net/', '08687557750'),
(17, '4', '31154 Murray Club\nLake Emery, AL 92317-0121', 'Mraz and Sons', 'Dolorem doloribus quasi officiis totam architecto. Occaecati placeat dignissimos sit iusto ut numquam eos. Perferendis omnis et qui suscipit modi vel non. Sint similique ut sed at quia enim quas.', 'http://www.armstrongwiegand.com/', '(344)644-6573x13305'),
(18, '4', '2513 Lia Viaduct\nNew Dimitrifort, IA 27067-4002', 'Kulas-Schulist', 'Dolorem molestiae culpa et ratione earum exercitationem occaecati. Deleniti voluptates molestiae aut velit iure. Nostrum nostrum eveniet quia. Officiis nihil voluptas a.', 'http://morar.com/', '477-611-3881'),
(19, '4', '08121 Dare Ranch Apt. 481\nBeahanville, GA 47286', 'Fisher, Lynch and Okuneva', 'Praesentium possimus rerum veniam sint quaerat doloribus. Occaecati esse dolor sed sit. Minima praesentium unde voluptates est accusantium fugit. Eaque eveniet sit et ratione vero.', 'http://www.kling.biz/', '1-036-137-7450x14351'),
(20, '8', '600 Cleora Drives Apt. 441\nPort Elisabeth, CT 66416', 'Larson-Walter', 'Eius et exercitationem minus explicabo tempora id. Qui vel eum doloremque consectetur porro vitae possimus. Soluta aut ut corporis ut et. Sed possimus cumque minus laudantium.', 'http://www.schmitthilll.net/', '08149847812'),
(21, '1', '2382 Geovanny Path\nPowlowskiburgh, OR 86361-5867', 'Becker-Carter', 'Et enim esse recusandae a delectus quae voluptatum. Dolor illum atque eum sit aut enim.', 'http://www.gislasonreinger.com/', '(602)245-0632x7345'),
(22, '9', '708 Brakus Knolls Suite 476\nFarrellburgh, NC 31111', 'Zemlak, Fahey and Wyman', 'Soluta libero quisquam aut est nam. Consequatur quasi voluptas reiciendis explicabo cupiditate. Magnam mollitia voluptatem modi et aut soluta. Vero ut quibusdam voluptas sequi ipsa.', 'http://daniel.net/', '189.226.2624'),
(23, '1', '24682 Kling Land\nMonahanton, NM 60453', 'Metz, Torphy and Goyette', 'Expedita maiores fugit qui aut. Sed aperiam doloremque nisi aut. Consectetur aut eum commodi molestiae doloremque enim ex.', 'http://www.bayer.com/', '+83(0)3504839462'),
(24, '1', '32171 DuBuque Vista\nNew Robertohaven, MD 20910', 'Kris, Hayes and Upton', 'Non voluptatum in unde sed itaque. Nobis modi at doloremque quia quidem qui ut. Iure est veritatis officia aperiam reiciendis.', 'http://renner.com/', '515-879-9794'),
(25, '9', '5625 Forrest Track Suite 479\nDanteside, MI 18740-2393', 'Weissnat-Cartwright', 'Non non et doloribus et voluptatem quos. Tenetur accusantium enim harum est atque. Recusandae dolore quaerat aut aut. Et ea labore minus qui odit autem ut.', 'http://www.kautzer.info/', '735.883.5953x894'),
(26, '8', '066 Jacobson Skyway\nBarryburgh, DC 96676', 'Flatley Group', 'Dolorem magnam accusamus odit natus mollitia quibusdam repellendus. Magni quas expedita maiores aspernatur iste voluptas. Et natus aliquam molestiae fuga velit reprehenderit nobis. Sint commodi aut eos laborum.', 'http://lowefisher.biz/', '00054154928'),
(27, '', '92094 Orn Greens Apt. 052\nNorth Kirstenland, RI 84805-0763', 'Emmerich-Feeney', 'Nihil consectetur placeat vel ut esse tempore reiciendis. Sit et quibusdam neque eum. Ab quidem voluptatem rerum vel. Atque et ut ut est quia optio et.', 'http://www.russel.com/', '546-930-4669x51922'),
(28, '1', '9912 Clare Springs Apt. 202\nJessicaview, MI 81008', 'Jenkins, Gorczany and Dicki', 'Deserunt excepturi autem et dolores qui reprehenderit. Totam dolorem sunt quasi sunt excepturi maxime. Quisquam similique sint ut harum. Quae omnis aliquam amet et.', 'http://www.weimannlang.com/', '(420)598-0146x1365'),
(29, '2', '0781 Ritchie Creek\nNew Fabiola, LA 77253', 'Hudson Ltd', 'Tempore eos culpa et necessitatibus reprehenderit. Earum error sunt excepturi beatae. Similique veniam soluta quo impedit dolores voluptas. Facilis maiores deserunt porro ab reprehenderit nemo.', 'http://www.mayertmoen.com/', '867-521-9099'),
(30, '4', '89997 Loren Isle Suite 791\nPort Modestaberg, AR 26085', 'Kessler, Metz and Cole', 'Alias qui dolorum maxime totam officiis libero dolore. Laborum rem modi ea amet praesentium deserunt. Eum omnis expedita necessitatibus autem officia sint.', 'http://www.mayerschmeler.info/', '119.173.6453x3600'),
(31, '8', '30706 Braun Haven Apt. 835\nLenorastad, KY 41827-3582', 'Kulas, Collins and O\'Kon', 'Consequuntur quo neque laborum. Atque cum in cupiditate eum. Cumque neque repellendus cum.', 'http://hintz.com/', '1-672-943-0147x8928'),
(32, '8', '750 Corrine Mount\nStrackeburgh, CT 09613', 'Bins-Heathcote', 'Quam ea autem qui voluptates. In sint ducimus ipsa cum consectetur eligendi et totam. Et voluptas quam soluta occaecati iste. Aliquid recusandae quia corporis libero.', 'http://www.stiedemannhuel.com/', '334.055.3081x7656'),
(33, '2', '953 Nyah Parkway Suite 804\nJarvisfurt, LA 62549', 'Kunze-Donnelly', 'Saepe sed eum quia ipsum voluptatibus. Accusamus ut libero vel delectus placeat. Possimus consequatur non nesciunt iusto facere et.', 'http://www.cole.info/', '(218)906-5295'),
(34, '6', '59156 Stokes Path\nPort Vivien, NE 70050-0968', 'Ferry, Abbott and Jacobson', 'Molestiae maiores quisquam quos ut ducimus accusamus. Quo ad odio at non quo. Laborum quos ut unde ut necessitatibus.', 'http://waters.com/', '1-962-756-5759x82620'),
(35, '2', '4085 Haley Glen Apt. 864\nUllrichside, IN 81366', 'Schoen Inc', 'Placeat aperiam praesentium libero eum reiciendis eum vero. Quo ratione facere sit eligendi et quia est. Magnam natus dolore explicabo in.', 'http://www.adams.com/', '1-416-731-7843'),
(36, '2', '953 Jerde Falls\nNew Kaela, VA 34804', 'Runolfsdottir Ltd', 'Dolorum rerum minima repellendus. Voluptatem maxime aliquid dolorem enim officia ullam eum. Qui est et rerum dolore architecto qui.', 'http://www.cruickshankwalsh.info/', '852-614-9205'),
(37, '9', '550 Conroy Via Suite 625\nNew Rita, DC 92572', 'Sporer, Gulgowski and Lubowitz', 'Velit dicta corrupti temporibus perspiciatis ad repellendus blanditiis. Numquam illum rerum in deleniti molestias. Voluptas repellendus eligendi natus corporis est ut. Porro cupiditate repellendus animi esse.', 'http://www.flatley.com/', '979.573.8881x7844'),
(38, '7', '5745 Kitty Lane\nEast Alicia, AZ 20346-2966', 'Harris-Leuschke', 'Distinctio ipsa vero cum nam ut. Illum in et doloribus similique eveniet officiis explicabo ab.', 'http://www.bashiriannader.com/', '856.261.9057'),
(39, '', '5795 Ruecker Bridge Apt. 753\nMonahanfort, CA 89096', 'Christiansen-Leuschke', 'Dolorum minus quibusdam in. Iure voluptatem blanditiis quaerat tempora quasi. Blanditiis dolor autem vitae eveniet et provident non. Recusandae et alias aut praesentium voluptatum cumque.', 'http://berge.com/', '451-787-5616'),
(40, '9', '621 Kling Neck\nBergnaumshire, AL 86324-4594', 'Borer, Gerlach and Sipes', 'Voluptas tempora temporibus et qui ab. Laborum dolore aut aspernatur minus. Soluta voluptas dicta nemo deserunt veniam dolor numquam.', 'http://reinger.net/', '1-348-748-7915'),
(41, '3', '195 Boyle Point\nEloyview, NJ 06025-4006', 'Stiedemann-Reynolds', 'Rerum voluptatem commodi aut enim quas impedit. Aut porro ea ut libero nisi rerum aut. Dolorem et cupiditate est cupiditate et dolorum.', 'http://lindgren.com/', '989.176.7444'),
(42, '9', '8942 Hickle Terrace\nSouth Dorrisshire, WA 90799', 'Hilll-Borer', 'Beatae vero sit minima impedit qui. Impedit quis et omnis explicabo id et alias. Iste qui suscipit deserunt inventore quo iste. Et sit et animi eius natus.', 'http://www.rutherford.com/', '757.219.8099'),
(43, '2', '85377 Greenholt Mill\nWest Eliezer, NH 05871-3622', 'Borer and Sons', 'Beatae eius id ut dolorum aut vel facere. Nisi sit rem natus laboriosam delectus. Non quo praesentium at.', 'http://hansennicolas.com/', '322-869-0870'),
(44, '', '3548 Kessler Crest\nPort Malindaberg, NE 51054-8906', 'Schumm Ltd', 'Expedita ea illum optio nostrum sapiente explicabo et. Doloremque numquam saepe quia quidem. Quam ducimus qui aut sint autem. Voluptas voluptatem ipsa quae molestiae hic excepturi voluptatem.', 'http://www.klein.com/', '(559)521-5953'),
(45, '', '0242 Benedict Avenue\nKesslerhaven, VA 42622-8891', 'Schmeler, Lowe and Veum', 'Odio veniam ut iusto ducimus. Voluptate eveniet voluptatem magnam quis omnis consequatur aut occaecati.', 'http://mccullough.net/', '+79(9)6327091467'),
(46, '', '3982 Pat Mountains\nEast Spencerfort, NE 65843', 'Keeling Group', 'Sed nisi voluptates id in. Officia pariatur eos et et totam accusantium nobis sint. In adipisci assumenda totam in dolores. Ex facilis in dolore sed nobis eius dolores.', 'http://www.veumlubowitz.biz/', '047.563.1205'),
(47, '6', '44811 Heathcote Square\nSouth Lyda, NC 44659', 'Lesch, Schmitt and Bradtke', 'Illo et assumenda ut aspernatur non. Eligendi omnis at sapiente illo nesciunt. Repudiandae blanditiis nemo itaque beatae ut molestiae velit sed. Porro modi nesciunt deleniti distinctio nulla autem omnis.', 'http://smith.com/', '(532)719-2099x42505'),
(48, '5', '1910 Paul Path\nRosiehaven, CT 86969-1821', 'Jacobi, Zieme and Nicolas', 'Et sit esse ut sunt sunt veritatis optio voluptatem. Laboriosam nam amet quia recusandae ab impedit voluptate. Aut aut blanditiis sit sunt.', 'http://schmittbeatty.com/', '134.916.6132'),
(49, '7', '6775 Jason Manors\nMedhursthaven, NE 93370', 'Kling, Macejkovic and Hudson', 'Occaecati est qui quasi deserunt fuga quis aspernatur. Esse quia voluptas consequatur velit facilis vitae assumenda molestiae. Voluptatem omnis explicabo facere quam ut ut.', 'http://dickensmoore.com/', '907-337-4113x74157'),
(50, '3', '67428 Arturo Mountains Suite 020\nFerryburgh, MN 84798-5532', 'Murray, Hegmann and Reinger', 'Ab impedit corrupti odit delectus. Explicabo non itaque et voluptas. Quae eligendi id nobis sed.', 'http://runte.com/', '313-414-9388x716'),
(51, 'g', 'g', 'g', 'g', 'g', '325'),
(52, 'Stupid charity', '109-115 - Stupidvile', 'stupid orthodoxy', 'Centrer of stupidity', 'SamyeFoundation.com', '091039'),
(53, 'test', 'test', 'test', 'test', 'test', '325'),
(54, 'Title', 'Address', 'Company', 'Desc', 'Website', 'Contact');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
