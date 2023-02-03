-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: jspml0t14
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Current Database: `jspml0t14`
--

/*!40000 DROP DATABASE IF EXISTS `jspml0t14`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `jspml0t14` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `jspml0t14`;

--
-- Table structure for table `banjixinxi`
--

DROP TABLE IF EXISTS `banjixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `banjixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `banjirenshu` varchar(200) DEFAULT NULL COMMENT '班级人数',
  `fudaoyuan` varchar(200) DEFAULT NULL COMMENT '辅导员',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  PRIMARY KEY (`id`),
  UNIQUE KEY `banji` (`banji`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='班级信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banjixinxi`
--

LOCK TABLES `banjixinxi` WRITE;
/*!40000 ALTER TABLE `banjixinxi` DISABLE KEYS */;
INSERT INTO `banjixinxi` VALUES (81,'2022-01-30 09:38:52','班级1','班级人数1','辅导员1','联系电话1'),(82,'2022-01-30 09:38:52','班级2','班级人数2','辅导员2','联系电话2'),(83,'2022-01-30 09:38:52','班级3','班级人数3','辅导员3','联系电话3'),(84,'2022-01-30 09:38:52','班级4','班级人数4','辅导员4','联系电话4'),(85,'2022-01-30 09:38:52','班级5','班级人数5','辅导员5','联系电话5'),(86,'2022-01-30 09:38:52','班级6','班级人数6','辅导员6','联系电话6');
/*!40000 ALTER TABLE `banjixinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `baoxiuxinxi`
--

DROP TABLE IF EXISTS `baoxiuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `baoxiuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shebeimingcheng` varchar(200) DEFAULT NULL COMMENT '设备名称',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `baoxiushijian` datetime DEFAULT NULL COMMENT '报修时间',
  `qingkuangshuoming` longtext COMMENT '情况说明',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='报修信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `baoxiuxinxi`
--

LOCK TABLES `baoxiuxinxi` WRITE;
/*!40000 ALTER TABLE `baoxiuxinxi` DISABLE KEYS */;
INSERT INTO `baoxiuxinxi` VALUES (41,'2022-01-30 09:38:52','设备名称1','学号1','姓名1','2022-01-30 17:38:52','情况说明1','是',''),(42,'2022-01-30 09:38:52','设备名称2','学号2','姓名2','2022-01-30 17:38:52','情况说明2','是',''),(43,'2022-01-30 09:38:52','设备名称3','学号3','姓名3','2022-01-30 17:38:52','情况说明3','是',''),(44,'2022-01-30 09:38:52','设备名称4','学号4','姓名4','2022-01-30 17:38:52','情况说明4','是',''),(45,'2022-01-30 09:38:52','设备名称5','学号5','姓名5','2022-01-30 17:38:52','情况说明5','是',''),(46,'2022-01-30 09:38:52','设备名称6','学号6','姓名6','2022-01-30 17:38:52','情况说明6','是','');
/*!40000 ALTER TABLE `baoxiuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `laifangdengji`
--

DROP TABLE IF EXISTS `laifangdengji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `laifangdengji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `qinshihao` varchar(200) DEFAULT NULL COMMENT '寝室号',
  `laifangmingdan` longtext COMMENT '来访名单',
  `laifangrenshu` varchar(200) DEFAULT NULL COMMENT '来访人数',
  `guanxi` varchar(200) DEFAULT NULL COMMENT '关系',
  `laifangshijian` datetime DEFAULT NULL COMMENT '来访时间',
  `likaishijian` datetime DEFAULT NULL COMMENT '离开时间',
  `beizhu` longtext COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8 COMMENT='来访登记';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laifangdengji`
--

LOCK TABLES `laifangdengji` WRITE;
/*!40000 ALTER TABLE `laifangdengji` DISABLE KEYS */;
INSERT INTO `laifangdengji` VALUES (111,'2022-01-30 09:38:52','寝室号1','来访名单1','来访人数1','关系1','2022-01-30 17:38:52','2022-01-30 17:38:52','备注1'),(112,'2022-01-30 09:38:52','寝室号2','来访名单2','来访人数2','关系2','2022-01-30 17:38:52','2022-01-30 17:38:52','备注2'),(113,'2022-01-30 09:38:52','寝室号3','来访名单3','来访人数3','关系3','2022-01-30 17:38:52','2022-01-30 17:38:52','备注3'),(114,'2022-01-30 09:38:52','寝室号4','来访名单4','来访人数4','关系4','2022-01-30 17:38:52','2022-01-30 17:38:52','备注4'),(115,'2022-01-30 09:38:52','寝室号5','来访名单5','来访人数5','关系5','2022-01-30 17:38:52','2022-01-30 17:38:52','备注5'),(116,'2022-01-30 09:38:52','寝室号6','来访名单6','来访人数6','关系6','2022-01-30 17:38:52','2022-01-30 17:38:52','备注6');
/*!40000 ALTER TABLE `laifangdengji` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `queqinxinxi`
--

DROP TABLE IF EXISTS `queqinxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `queqinxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `leixing` varchar(200) DEFAULT NULL COMMENT '类型',
  `dengjishijian` datetime DEFAULT NULL COMMENT '登记时间',
  `beizhu` longtext COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8 COMMENT='缺勤信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `queqinxinxi`
--

LOCK TABLES `queqinxinxi` WRITE;
/*!40000 ALTER TABLE `queqinxinxi` DISABLE KEYS */;
INSERT INTO `queqinxinxi` VALUES (131,'2022-01-30 09:38:52','学号1','姓名1','请假','2022-01-30 17:38:52','备注1'),(132,'2022-01-30 09:38:52','学号2','姓名2','请假','2022-01-30 17:38:52','备注2'),(133,'2022-01-30 09:38:52','学号3','姓名3','请假','2022-01-30 17:38:52','备注3'),(134,'2022-01-30 09:38:52','学号4','姓名4','请假','2022-01-30 17:38:52','备注4'),(135,'2022-01-30 09:38:52','学号5','姓名5','请假','2022-01-30 17:38:52','备注5'),(136,'2022-01-30 09:38:52','学号6','姓名6','请假','2022-01-30 17:38:52','备注6');
/*!40000 ALTER TABLE `queqinxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sushefenpei`
--

DROP TABLE IF EXISTS `sushefenpei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sushefenpei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xueyuan` varchar(200) DEFAULT NULL COMMENT '学院',
  `qinshihao` varchar(200) DEFAULT NULL COMMENT '寝室号',
  `chuangweihao` varchar(200) DEFAULT NULL COMMENT '床位号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='宿舍分配';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sushefenpei`
--

LOCK TABLES `sushefenpei` WRITE;
/*!40000 ALTER TABLE `sushefenpei` DISABLE KEYS */;
INSERT INTO `sushefenpei` VALUES (31,'2022-01-30 09:38:52','学号1','姓名1','学院1','寝室号1','床位号1'),(32,'2022-01-30 09:38:52','学号2','姓名2','学院2','寝室号2','床位号2'),(33,'2022-01-30 09:38:52','学号3','姓名3','学院3','寝室号3','床位号3'),(34,'2022-01-30 09:38:52','学号4','姓名4','学院4','寝室号4','床位号4'),(35,'2022-01-30 09:38:52','学号5','姓名5','学院5','寝室号5','床位号5'),(36,'2022-01-30 09:38:52','学号6','姓名6','学院6','寝室号6','床位号6');
/*!40000 ALTER TABLE `sushefenpei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `susheguanliyuan`
--

DROP TABLE IF EXISTS `susheguanliyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `susheguanliyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `suguanzhanghao` varchar(200) DEFAULT NULL COMMENT '宿管账号',
  `suguanxingming` varchar(200) DEFAULT NULL COMMENT '宿管姓名',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `louhao` varchar(200) DEFAULT NULL COMMENT '楼号',
  PRIMARY KEY (`id`),
  UNIQUE KEY `suguanzhanghao` (`suguanzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='宿舍管理员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `susheguanliyuan`
--

LOCK TABLES `susheguanliyuan` WRITE;
/*!40000 ALTER TABLE `susheguanliyuan` DISABLE KEYS */;
INSERT INTO `susheguanliyuan` VALUES (11,'2022-01-30 09:38:52','宿管账号1','宿管姓名1','123456','男','13823888881','楼号1'),(12,'2022-01-30 09:38:52','宿管账号2','宿管姓名2','123456','男','13823888882','楼号2'),(13,'2022-01-30 09:38:52','宿管账号3','宿管姓名3','123456','男','13823888883','楼号3'),(14,'2022-01-30 09:38:52','宿管账号4','宿管姓名4','123456','男','13823888884','楼号4'),(15,'2022-01-30 09:38:52','宿管账号5','宿管姓名5','123456','男','13823888885','楼号5'),(16,'2022-01-30 09:38:52','宿管账号6','宿管姓名6','123456','男','13823888886','楼号6');
/*!40000 ALTER TABLE `susheguanliyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sushelouxinxi`
--

DROP TABLE IF EXISTS `sushelouxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sushelouxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `susheloumingcheng` varchar(200) DEFAULT NULL COMMENT '宿舍楼名称',
  `louceng` varchar(200) DEFAULT NULL COMMENT '楼层',
  `zongfangjianshu` varchar(200) DEFAULT NULL COMMENT '总房间数',
  `suguanzhanghao` varchar(200) DEFAULT NULL COMMENT '宿管账号',
  `suguanxingming` varchar(200) DEFAULT NULL COMMENT '宿管姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `beizhu` longtext COMMENT '备注',
  `xueshengmingdan` longtext COMMENT '学生名单',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='宿舍楼信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sushelouxinxi`
--

LOCK TABLES `sushelouxinxi` WRITE;
/*!40000 ALTER TABLE `sushelouxinxi` DISABLE KEYS */;
INSERT INTO `sushelouxinxi` VALUES (101,'2022-01-30 09:38:52','宿舍楼名称1','楼层1','总房间数1','宿管账号1','宿管姓名1','性别1','备注1','学生名单1'),(102,'2022-01-30 09:38:52','宿舍楼名称2','楼层2','总房间数2','宿管账号2','宿管姓名2','性别2','备注2','学生名单2'),(103,'2022-01-30 09:38:52','宿舍楼名称3','楼层3','总房间数3','宿管账号3','宿管姓名3','性别3','备注3','学生名单3'),(104,'2022-01-30 09:38:52','宿舍楼名称4','楼层4','总房间数4','宿管账号4','宿管姓名4','性别4','备注4','学生名单4'),(105,'2022-01-30 09:38:52','宿舍楼名称5','楼层5','总房间数5','宿管账号5','宿管姓名5','性别5','备注5','学生名单5'),(106,'2022-01-30 09:38:52','宿舍楼名称6','楼层6','总房间数6','宿管账号6','宿管姓名6','性别6','备注6','学生名单6');
/*!40000 ALTER TABLE `sushelouxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sushexinxi`
--

DROP TABLE IF EXISTS `sushexinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sushexinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `sushehao` varchar(200) DEFAULT NULL COMMENT '宿舍号',
  `suozailou` varchar(200) DEFAULT NULL COMMENT '所在楼',
  `chuangweishuliang` varchar(200) DEFAULT NULL COMMENT '床位数量',
  `zhibanren` varchar(200) DEFAULT NULL COMMENT '值班人',
  `beizhu` longtext COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='宿舍信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sushexinxi`
--

LOCK TABLES `sushexinxi` WRITE;
/*!40000 ALTER TABLE `sushexinxi` DISABLE KEYS */;
INSERT INTO `sushexinxi` VALUES (91,'2022-01-30 09:38:52','宿舍号1','所在楼1','床位数量1','值班人1','备注1'),(92,'2022-01-30 09:38:52','宿舍号2','所在楼2','床位数量2','值班人2','备注2'),(93,'2022-01-30 09:38:52','宿舍号3','所在楼3','床位数量3','值班人3','备注3'),(94,'2022-01-30 09:38:52','宿舍号4','所在楼4','床位数量4','值班人4','备注4'),(95,'2022-01-30 09:38:52','宿舍号5','所在楼5','床位数量5','值班人5','备注5'),(96,'2022-01-30 09:38:52','宿舍号6','所在楼6','床位数量6','值班人6','备注6');
/*!40000 ALTER TABLE `sushexinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','qzwob2hj7z5hig9kv3vz4ynj44rccq3y','2022-01-30 09:40:22','2022-01-30 10:40:22');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tongzhigonggao`
--

DROP TABLE IF EXISTS `tongzhigonggao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tongzhigonggao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gonggaobiaoti` varchar(200) DEFAULT NULL COMMENT '公告标题',
  `tongzhileixing` varchar(200) DEFAULT NULL COMMENT '通知类型',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `gonggaoneirong` longtext COMMENT '公告内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='通知公告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tongzhigonggao`
--

LOCK TABLES `tongzhigonggao` WRITE;
/*!40000 ALTER TABLE `tongzhigonggao` DISABLE KEYS */;
INSERT INTO `tongzhigonggao` VALUES (61,'2022-01-30 09:38:52','公告标题1','通知类型1','2022-01-30','公告内容1'),(62,'2022-01-30 09:38:52','公告标题2','通知类型2','2022-01-30','公告内容2'),(63,'2022-01-30 09:38:52','公告标题3','通知类型3','2022-01-30','公告内容3'),(64,'2022-01-30 09:38:52','公告标题4','通知类型4','2022-01-30','公告内容4'),(65,'2022-01-30 09:38:52','公告标题5','通知类型5','2022-01-30','公告内容5'),(66,'2022-01-30 09:38:52','公告标题6','通知类型6','2022-01-30','公告内容6');
/*!40000 ALTER TABLE `tongzhigonggao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tongzhileixing`
--

DROP TABLE IF EXISTS `tongzhileixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tongzhileixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tongzhileixing` varchar(200) NOT NULL COMMENT '通知类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='通知类型';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tongzhileixing`
--

LOCK TABLES `tongzhileixing` WRITE;
/*!40000 ALTER TABLE `tongzhileixing` DISABLE KEYS */;
INSERT INTO `tongzhileixing` VALUES (51,'2022-01-30 09:38:52','通知类型1'),(52,'2022-01-30 09:38:52','通知类型2'),(53,'2022-01-30 09:38:52','通知类型3'),(54,'2022-01-30 09:38:52','通知类型4'),(55,'2022-01-30 09:38:52','通知类型5'),(56,'2022-01-30 09:38:52','通知类型6');
/*!40000 ALTER TABLE `tongzhileixing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2022-01-30 09:38:52');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `weishengpingbi`
--

DROP TABLE IF EXISTS `weishengpingbi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `weishengpingbi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `qinshihao` varchar(200) DEFAULT NULL COMMENT '寝室号',
  `wupinbaifang` varchar(200) DEFAULT NULL COMMENT '物品摆放',
  `dimianweisheng` varchar(200) DEFAULT NULL COMMENT '地面卫生',
  `chuangmianpingfen` varchar(200) DEFAULT NULL COMMENT '床面评分',
  `qiangmianpingfen` varchar(200) DEFAULT NULL COMMENT '墙面评分',
  `neiwupingfen` varchar(200) DEFAULT NULL COMMENT '内务评分',
  `chuanghupingfen` varchar(200) DEFAULT NULL COMMENT '窗户评分',
  `zhuodengpingfen` varchar(200) DEFAULT NULL COMMENT '桌凳评分',
  `zhengtixiaoguo` varchar(200) DEFAULT NULL COMMENT '整体效果',
  `pingxuanjieguo` varchar(200) DEFAULT NULL COMMENT '评选结果',
  `jianchariqi` date DEFAULT NULL COMMENT '检查日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8 COMMENT='卫生评比';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `weishengpingbi`
--

LOCK TABLES `weishengpingbi` WRITE;
/*!40000 ALTER TABLE `weishengpingbi` DISABLE KEYS */;
INSERT INTO `weishengpingbi` VALUES (121,'2022-01-30 09:38:52','寝室号1','0','0','0','0','0','0','0','0','优秀','2022-01-30'),(122,'2022-01-30 09:38:52','寝室号2','0','0','0','0','0','0','0','0','优秀','2022-01-30'),(123,'2022-01-30 09:38:52','寝室号3','0','0','0','0','0','0','0','0','优秀','2022-01-30'),(124,'2022-01-30 09:38:52','寝室号4','0','0','0','0','0','0','0','0','优秀','2022-01-30'),(125,'2022-01-30 09:38:52','寝室号5','0','0','0','0','0','0','0','0','优秀','2022-01-30'),(126,'2022-01-30 09:38:52','寝室号6','0','0','0','0','0','0','0','0','优秀','2022-01-30');
/*!40000 ALTER TABLE `weishengpingbi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xuesheng`
--

DROP TABLE IF EXISTS `xuesheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xuesheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `zhuanye` varchar(200) DEFAULT NULL COMMENT '专业',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `xueyuan` varchar(200) DEFAULT NULL COMMENT '学院',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xuehao` (`xuehao`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='学生';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xuesheng`
--

LOCK TABLES `xuesheng` WRITE;
/*!40000 ALTER TABLE `xuesheng` DISABLE KEYS */;
INSERT INTO `xuesheng` VALUES (21,'2022-01-30 09:38:52','学号1','姓名1','123456','男','专业1','联系电话1','学院1'),(22,'2022-01-30 09:38:52','学号2','姓名2','123456','男','专业2','联系电话2','学院2'),(23,'2022-01-30 09:38:52','学号3','姓名3','123456','男','专业3','联系电话3','学院3'),(24,'2022-01-30 09:38:52','学号4','姓名4','123456','男','专业4','联系电话4','学院4'),(25,'2022-01-30 09:38:52','学号5','姓名5','123456','男','专业5','联系电话5','学院5'),(26,'2022-01-30 09:38:52','学号6','姓名6','123456','男','专业6','联系电话6','学院6');
/*!40000 ALTER TABLE `xuesheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yuanxijianjie`
--

DROP TABLE IF EXISTS `yuanxijianjie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yuanxijianjie` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xueyuanmingcheng` varchar(200) DEFAULT NULL COMMENT '学院名称',
  `yuanxijianjie` longtext COMMENT '院系简介',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='院系简介';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yuanxijianjie`
--

LOCK TABLES `yuanxijianjie` WRITE;
/*!40000 ALTER TABLE `yuanxijianjie` DISABLE KEYS */;
INSERT INTO `yuanxijianjie` VALUES (71,'2022-01-30 09:38:52','学院名称1','院系简介1'),(72,'2022-01-30 09:38:52','学院名称2','院系简介2'),(73,'2022-01-30 09:38:52','学院名称3','院系简介3'),(74,'2022-01-30 09:38:52','学院名称4','院系简介4'),(75,'2022-01-30 09:38:52','学院名称5','院系简介5'),(76,'2022-01-30 09:38:52','学院名称6','院系简介6');
/*!40000 ALTER TABLE `yuanxijianjie` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-31 12:47:22
