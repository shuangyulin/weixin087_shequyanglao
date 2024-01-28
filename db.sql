/*
SQLyog Ultimate v11.3 (64 bit)
MySQL - 5.7.32-log : Database - ssmfr870
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssmfr870` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ssmfr870`;

/*Table structure for table `chat` */

DROP TABLE IF EXISTS `chat`;

CREATE TABLE `chat` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `adminid` bigint(20) DEFAULT NULL COMMENT '管理员id',
  `ask` longtext COMMENT '提问',
  `reply` longtext COMMENT '回复',
  `isreply` int(11) DEFAULT NULL COMMENT '是否回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=197 DEFAULT CHARSET=utf8 COMMENT='在线客服';

/*Data for the table `chat` */

insert  into `chat`(`id`,`addtime`,`userid`,`adminid`,`ask`,`reply`,`isreply`) values (191,'2021-04-01 20:21:21',1,1,'提问1','回复1',1),(192,'2021-04-01 20:21:21',2,2,'提问2','回复2',2),(193,'2021-04-01 20:21:21',3,3,'提问3','回复3',3),(194,'2021-04-01 20:21:21',4,4,'提问4','回复4',4),(195,'2021-04-01 20:21:21',5,5,'提问5','回复5',5),(196,'2021-04-01 20:21:21',6,6,'提问6','回复6',6);

/*Table structure for table `chexiaotousu` */

DROP TABLE IF EXISTS `chexiaotousu`;

CREATE TABLE `chexiaotousu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `fuwumingcheng` varchar(200) DEFAULT NULL COMMENT '服务名称',
  `fuwuyuan` varchar(200) DEFAULT NULL COMMENT '服务员',
  `fuwushijian` varchar(200) DEFAULT NULL COMMENT '服务时间',
  `pingjia` longtext COMMENT '评价',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=187 DEFAULT CHARSET=utf8 COMMENT='撤销投诉';

/*Data for the table `chexiaotousu` */

insert  into `chexiaotousu`(`id`,`addtime`,`zhanghao`,`xingming`,`nianling`,`shouji`,`fuwumingcheng`,`fuwuyuan`,`fuwushijian`,`pingjia`,`tupian`,`sfsh`,`shhf`,`userid`) values (181,'2021-04-01 20:21:21','账号1','姓名1','年龄1','手机1','服务名称1','服务员1','服务时间1','评价1','http://localhost:8080/ssmfr870/upload/chexiaotousu_tupian1.jpg','是','',1),(182,'2021-04-01 20:21:21','账号2','姓名2','年龄2','手机2','服务名称2','服务员2','服务时间2','评价2','http://localhost:8080/ssmfr870/upload/chexiaotousu_tupian2.jpg','是','',2),(183,'2021-04-01 20:21:21','账号3','姓名3','年龄3','手机3','服务名称3','服务员3','服务时间3','评价3','http://localhost:8080/ssmfr870/upload/chexiaotousu_tupian3.jpg','是','',3),(184,'2021-04-01 20:21:21','账号4','姓名4','年龄4','手机4','服务名称4','服务员4','服务时间4','评价4','http://localhost:8080/ssmfr870/upload/chexiaotousu_tupian4.jpg','是','',4),(185,'2021-04-01 20:21:21','账号5','姓名5','年龄5','手机5','服务名称5','服务员5','服务时间5','评价5','http://localhost:8080/ssmfr870/upload/chexiaotousu_tupian5.jpg','是','',5),(186,'2021-04-01 20:21:21','账号6','姓名6','年龄6','手机6','服务名称6','服务员6','服务时间6','评价6','http://localhost:8080/ssmfr870/upload/chexiaotousu_tupian6.jpg','是','',6);

/*Table structure for table `config` */

DROP TABLE IF EXISTS `config`;

CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';

/*Data for the table `config` */

insert  into `config`(`id`,`name`,`value`) values (1,'picture1','http://localhost:8080/ssmfr870/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/ssmfr870/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssmfr870/upload/picture3.jpg'),(6,'homepage',NULL);

/*Table structure for table `daiwanchengfuwu` */

DROP TABLE IF EXISTS `daiwanchengfuwu`;

CREATE TABLE `daiwanchengfuwu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `fuwumingcheng` varchar(200) DEFAULT NULL COMMENT '服务名称',
  `fuwuleixing` varchar(200) DEFAULT NULL COMMENT '服务类型',
  `yuyueshijian` varchar(200) DEFAULT NULL COMMENT '预约时间',
  `fuwuzhuangtai` varchar(200) DEFAULT NULL COMMENT '服务状态',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1617279978883 DEFAULT CHARSET=utf8 COMMENT='待完成服务';

/*Data for the table `daiwanchengfuwu` */

insert  into `daiwanchengfuwu`(`id`,`addtime`,`zhanghao`,`xingming`,`fuwumingcheng`,`fuwuleixing`,`yuyueshijian`,`fuwuzhuangtai`,`tupian`,`userid`) values (61,'2021-04-01 20:21:21','账号1','姓名1','服务名称1','服务类型1','预约时间1','待完成服务','http://localhost:8080/ssmfr870/upload/daiwanchengfuwu_tupian1.jpg',1),(62,'2021-04-01 20:21:21','账号2','姓名2','服务名称2','服务类型2','预约时间2','待完成服务','http://localhost:8080/ssmfr870/upload/daiwanchengfuwu_tupian2.jpg',2),(63,'2021-04-01 20:21:21','账号3','姓名3','服务名称3','服务类型3','预约时间3','待完成服务','http://localhost:8080/ssmfr870/upload/daiwanchengfuwu_tupian3.jpg',3),(64,'2021-04-01 20:21:21','账号4','姓名4','服务名称4','服务类型4','预约时间4','待完成服务','http://localhost:8080/ssmfr870/upload/daiwanchengfuwu_tupian4.jpg',4),(65,'2021-04-01 20:21:21','账号5','姓名5','服务名称5','服务类型5','预约时间5','待完成服务','http://localhost:8080/ssmfr870/upload/daiwanchengfuwu_tupian5.jpg',5),(66,'2021-04-01 20:21:21','账号6','姓名6','服务名称6','服务类型6','预约时间6','待完成服务','http://localhost:8080/ssmfr870/upload/daiwanchengfuwu_tupian6.jpg',6),(1617279967925,'2021-04-01 20:26:06','用户1','姓名1','服务名称1','医疗服务','2021-04-01 20:24:08','代办服务','http://localhost:8080/ssmfr870/upload/fuwuchanpin_tupian1.jpg',11),(1617279978882,'2021-04-01 20:26:18','用户1','姓名1','服务名称1','医疗服务','2021-04-01 20:24:08','待完成服务','http://localhost:8080/ssmfr870/upload/fuwuchanpin_tupian1.jpg',11);

/*Table structure for table `discussfuwuchanpin` */

DROP TABLE IF EXISTS `discussfuwuchanpin`;

CREATE TABLE `discussfuwuchanpin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=227 DEFAULT CHARSET=utf8 COMMENT='服务产品评论表';

/*Data for the table `discussfuwuchanpin` */

insert  into `discussfuwuchanpin`(`id`,`addtime`,`refid`,`userid`,`nickname`,`content`,`reply`) values (221,'2021-04-01 20:21:21',1,1,'用户名1','评论内容1','回复内容1'),(222,'2021-04-01 20:21:21',2,2,'用户名2','评论内容2','回复内容2'),(223,'2021-04-01 20:21:21',3,3,'用户名3','评论内容3','回复内容3'),(224,'2021-04-01 20:21:21',4,4,'用户名4','评论内容4','回复内容4'),(225,'2021-04-01 20:21:21',5,5,'用户名5','评论内容5','回复内容5'),(226,'2021-04-01 20:21:21',6,6,'用户名6','评论内容6','回复内容6');

/*Table structure for table `discussfuwurenyuantongzhi` */

DROP TABLE IF EXISTS `discussfuwurenyuantongzhi`;

CREATE TABLE `discussfuwurenyuantongzhi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=257 DEFAULT CHARSET=utf8 COMMENT='服务人员通知评论表';

/*Data for the table `discussfuwurenyuantongzhi` */

insert  into `discussfuwurenyuantongzhi`(`id`,`addtime`,`refid`,`userid`,`nickname`,`content`,`reply`) values (251,'2021-04-01 20:21:21',1,1,'用户名1','评论内容1','回复内容1'),(252,'2021-04-01 20:21:21',2,2,'用户名2','评论内容2','回复内容2'),(253,'2021-04-01 20:21:21',3,3,'用户名3','评论内容3','回复内容3'),(254,'2021-04-01 20:21:21',4,4,'用户名4','评论内容4','回复内容4'),(255,'2021-04-01 20:21:21',5,5,'用户名5','评论内容5','回复内容5'),(256,'2021-04-01 20:21:21',6,6,'用户名6','评论内容6','回复内容6');

/*Table structure for table `discusshuodong` */

DROP TABLE IF EXISTS `discusshuodong`;

CREATE TABLE `discusshuodong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=237 DEFAULT CHARSET=utf8 COMMENT='活动评论表';

/*Data for the table `discusshuodong` */

insert  into `discusshuodong`(`id`,`addtime`,`refid`,`userid`,`nickname`,`content`,`reply`) values (231,'2021-04-01 20:21:21',1,1,'用户名1','评论内容1','回复内容1'),(232,'2021-04-01 20:21:21',2,2,'用户名2','评论内容2','回复内容2'),(233,'2021-04-01 20:21:21',3,3,'用户名3','评论内容3','回复内容3'),(234,'2021-04-01 20:21:21',4,4,'用户名4','评论内容4','回复内容4'),(235,'2021-04-01 20:21:21',5,5,'用户名5','评论内容5','回复内容5'),(236,'2021-04-01 20:21:21',6,6,'用户名6','评论内容6','回复内容6');

/*Table structure for table `discussshipin` */

DROP TABLE IF EXISTS `discussshipin`;

CREATE TABLE `discussshipin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=247 DEFAULT CHARSET=utf8 COMMENT='视频评论表';

/*Data for the table `discussshipin` */

insert  into `discussshipin`(`id`,`addtime`,`refid`,`userid`,`nickname`,`content`,`reply`) values (241,'2021-04-01 20:21:21',1,1,'用户名1','评论内容1','回复内容1'),(242,'2021-04-01 20:21:21',2,2,'用户名2','评论内容2','回复内容2'),(243,'2021-04-01 20:21:21',3,3,'用户名3','评论内容3','回复内容3'),(244,'2021-04-01 20:21:21',4,4,'用户名4','评论内容4','回复内容4'),(245,'2021-04-01 20:21:21',5,5,'用户名5','评论内容5','回复内容5'),(246,'2021-04-01 20:21:21',6,6,'用户名6','评论内容6','回复内容6');

/*Table structure for table `fuwuchanpin` */

DROP TABLE IF EXISTS `fuwuchanpin`;

CREATE TABLE `fuwuchanpin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `fuwumingcheng` varchar(200) DEFAULT NULL COMMENT '服务名称',
  `fuwuleixing` varchar(200) DEFAULT NULL COMMENT '服务类型',
  `fuwujieshao` longtext COMMENT '服务介绍',
  `fuwurenyuan` varchar(200) DEFAULT NULL COMMENT '服务人员',
  `fuwurenyuanjieshao` longtext COMMENT '服务人员介绍',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='服务产品';

/*Data for the table `fuwuchanpin` */

insert  into `fuwuchanpin`(`id`,`addtime`,`fuwumingcheng`,`fuwuleixing`,`fuwujieshao`,`fuwurenyuan`,`fuwurenyuanjieshao`,`tupian`,`thumbsupnum`,`crazilynum`) values (31,'2021-04-01 20:21:21','服务名称1','医疗服务','服务介绍1','服务人员1','服务人员介绍1','http://localhost:8080/ssmfr870/upload/fuwuchanpin_tupian1.jpg',1,1),(32,'2021-04-01 20:21:21','服务名称2','医疗服务','服务介绍2','服务人员2','服务人员介绍2','http://localhost:8080/ssmfr870/upload/fuwuchanpin_tupian2.jpg',2,2),(33,'2021-04-01 20:21:21','服务名称3','医疗服务','服务介绍3','服务人员3','服务人员介绍3','http://localhost:8080/ssmfr870/upload/fuwuchanpin_tupian3.jpg',3,3),(34,'2021-04-01 20:21:21','服务名称4','医疗服务','服务介绍4','服务人员4','服务人员介绍4','http://localhost:8080/ssmfr870/upload/fuwuchanpin_tupian4.jpg',4,4),(35,'2021-04-01 20:21:21','服务名称5','医疗服务','服务介绍5','服务人员5','服务人员介绍5','http://localhost:8080/ssmfr870/upload/fuwuchanpin_tupian5.jpg',5,5),(36,'2021-04-01 20:21:21','服务名称6','医疗服务','服务介绍6','服务人员6','服务人员介绍6','http://localhost:8080/ssmfr870/upload/fuwuchanpin_tupian6.jpg',6,6);

/*Table structure for table `fuwurenyuan` */

DROP TABLE IF EXISTS `fuwurenyuan`;

CREATE TABLE `fuwurenyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='服务人员';

/*Data for the table `fuwurenyuan` */

insert  into `fuwurenyuan`(`id`,`addtime`,`zhanghao`,`mima`,`xingming`,`xingbie`,`shenfenzheng`,`shouji`,`youxiang`,`zhaopian`) values (21,'2021-04-01 20:21:21','服务人员1','123456','姓名1','男','440300199101010001','13823888881','773890001@qq.com','http://localhost:8080/ssmfr870/upload/fuwurenyuan_zhaopian1.jpg'),(22,'2021-04-01 20:21:21','服务人员2','123456','姓名2','男','440300199202020002','13823888882','773890002@qq.com','http://localhost:8080/ssmfr870/upload/fuwurenyuan_zhaopian2.jpg'),(23,'2021-04-01 20:21:21','服务人员3','123456','姓名3','男','440300199303030003','13823888883','773890003@qq.com','http://localhost:8080/ssmfr870/upload/fuwurenyuan_zhaopian3.jpg'),(24,'2021-04-01 20:21:21','服务人员4','123456','姓名4','男','440300199404040004','13823888884','773890004@qq.com','http://localhost:8080/ssmfr870/upload/fuwurenyuan_zhaopian4.jpg'),(25,'2021-04-01 20:21:21','服务人员5','123456','姓名5','男','440300199505050005','13823888885','773890005@qq.com','http://localhost:8080/ssmfr870/upload/fuwurenyuan_zhaopian5.jpg'),(26,'2021-04-01 20:21:21','服务人员6','123456','姓名6','男','440300199606060006','13823888886','773890006@qq.com','http://localhost:8080/ssmfr870/upload/fuwurenyuan_zhaopian6.jpg');

/*Table structure for table `fuwurenyuandaibanshixiang` */

DROP TABLE IF EXISTS `fuwurenyuandaibanshixiang`;

CREATE TABLE `fuwurenyuandaibanshixiang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `mingcheng` varchar(200) DEFAULT NULL COMMENT '名称',
  `shijian` date DEFAULT NULL COMMENT '时间',
  `neirong` longtext COMMENT '内容',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=157 DEFAULT CHARSET=utf8 COMMENT='服务人员待办事项';

/*Data for the table `fuwurenyuandaibanshixiang` */

insert  into `fuwurenyuandaibanshixiang`(`id`,`addtime`,`zhanghao`,`xingming`,`mingcheng`,`shijian`,`neirong`,`tupian`,`userid`) values (151,'2021-04-01 20:21:21','账号1','姓名1','名称1','2021-04-01','内容1','http://localhost:8080/ssmfr870/upload/fuwurenyuandaibanshixiang_tupian1.jpg',1),(152,'2021-04-01 20:21:21','账号2','姓名2','名称2','2021-04-01','内容2','http://localhost:8080/ssmfr870/upload/fuwurenyuandaibanshixiang_tupian2.jpg',2),(153,'2021-04-01 20:21:21','账号3','姓名3','名称3','2021-04-01','内容3','http://localhost:8080/ssmfr870/upload/fuwurenyuandaibanshixiang_tupian3.jpg',3),(154,'2021-04-01 20:21:21','账号4','姓名4','名称4','2021-04-01','内容4','http://localhost:8080/ssmfr870/upload/fuwurenyuandaibanshixiang_tupian4.jpg',4),(155,'2021-04-01 20:21:21','账号5','姓名5','名称5','2021-04-01','内容5','http://localhost:8080/ssmfr870/upload/fuwurenyuandaibanshixiang_tupian5.jpg',5),(156,'2021-04-01 20:21:21','账号6','姓名6','名称6','2021-04-01','内容6','http://localhost:8080/ssmfr870/upload/fuwurenyuandaibanshixiang_tupian6.jpg',6);

/*Table structure for table `fuwurenyuantongzhi` */

DROP TABLE IF EXISTS `fuwurenyuantongzhi`;

CREATE TABLE `fuwurenyuantongzhi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) DEFAULT NULL COMMENT '名称',
  `shijian` date DEFAULT NULL COMMENT '时间',
  `neirong` longtext COMMENT '内容',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=147 DEFAULT CHARSET=utf8 COMMENT='服务人员通知';

/*Data for the table `fuwurenyuantongzhi` */

insert  into `fuwurenyuantongzhi`(`id`,`addtime`,`mingcheng`,`shijian`,`neirong`,`tupian`,`thumbsupnum`,`crazilynum`,`clicktime`) values (141,'2021-04-01 20:21:21','名称1','2021-04-01','内容1','http://localhost:8080/ssmfr870/upload/fuwurenyuantongzhi_tupian1.jpg',1,1,'2021-04-01 20:21:21'),(142,'2021-04-01 20:21:21','名称2','2021-04-01','内容2','http://localhost:8080/ssmfr870/upload/fuwurenyuantongzhi_tupian2.jpg',2,2,'2021-04-01 20:21:21'),(143,'2021-04-01 20:21:21','名称3','2021-04-01','内容3','http://localhost:8080/ssmfr870/upload/fuwurenyuantongzhi_tupian3.jpg',3,3,'2021-04-01 20:21:21'),(144,'2021-04-01 20:21:21','名称4','2021-04-01','内容4','http://localhost:8080/ssmfr870/upload/fuwurenyuantongzhi_tupian4.jpg',4,4,'2021-04-01 20:21:21'),(145,'2021-04-01 20:21:21','名称5','2021-04-01','内容5','http://localhost:8080/ssmfr870/upload/fuwurenyuantongzhi_tupian5.jpg',5,5,'2021-04-01 20:21:21'),(146,'2021-04-01 20:21:21','名称6','2021-04-01','内容6','http://localhost:8080/ssmfr870/upload/fuwurenyuantongzhi_tupian6.jpg',6,6,'2021-04-01 20:21:21');

/*Table structure for table `fuwurenyuanyiwanchengshixiang` */

DROP TABLE IF EXISTS `fuwurenyuanyiwanchengshixiang`;

CREATE TABLE `fuwurenyuanyiwanchengshixiang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `mingcheng` varchar(200) DEFAULT NULL COMMENT '名称',
  `shijian` varchar(200) DEFAULT NULL COMMENT '时间',
  `neirong` varchar(200) DEFAULT NULL COMMENT '内容',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=167 DEFAULT CHARSET=utf8 COMMENT='服务人员已完成事项';

/*Data for the table `fuwurenyuanyiwanchengshixiang` */

insert  into `fuwurenyuanyiwanchengshixiang`(`id`,`addtime`,`zhanghao`,`xingming`,`mingcheng`,`shijian`,`neirong`,`tupian`,`userid`) values (161,'2021-04-01 20:21:21','账号1','姓名1','名称1','时间1','内容1','http://localhost:8080/ssmfr870/upload/fuwurenyuanyiwanchengshixiang_tupian1.jpg',1),(162,'2021-04-01 20:21:21','账号2','姓名2','名称2','时间2','内容2','http://localhost:8080/ssmfr870/upload/fuwurenyuanyiwanchengshixiang_tupian2.jpg',2),(163,'2021-04-01 20:21:21','账号3','姓名3','名称3','时间3','内容3','http://localhost:8080/ssmfr870/upload/fuwurenyuanyiwanchengshixiang_tupian3.jpg',3),(164,'2021-04-01 20:21:21','账号4','姓名4','名称4','时间4','内容4','http://localhost:8080/ssmfr870/upload/fuwurenyuanyiwanchengshixiang_tupian4.jpg',4),(165,'2021-04-01 20:21:21','账号5','姓名5','名称5','时间5','内容5','http://localhost:8080/ssmfr870/upload/fuwurenyuanyiwanchengshixiang_tupian5.jpg',5),(166,'2021-04-01 20:21:21','账号6','姓名6','名称6','时间6','内容6','http://localhost:8080/ssmfr870/upload/fuwurenyuanyiwanchengshixiang_tupian6.jpg',6);

/*Table structure for table `fuwutuiding` */

DROP TABLE IF EXISTS `fuwutuiding`;

CREATE TABLE `fuwutuiding` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `fuwumingcheng` varchar(200) DEFAULT NULL COMMENT '服务名称',
  `fuwuleixing` varchar(200) DEFAULT NULL COMMENT '服务类型',
  `fuwurenyuan` varchar(200) DEFAULT NULL COMMENT '服务人员',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='服务退订';

/*Data for the table `fuwutuiding` */

insert  into `fuwutuiding`(`id`,`addtime`,`zhanghao`,`xingming`,`fuwumingcheng`,`fuwuleixing`,`fuwurenyuan`,`tupian`,`sfsh`,`shhf`,`userid`) values (71,'2021-04-01 20:21:21','账号1','姓名1','服务名称1','服务类型1','服务人员1','http://localhost:8080/ssmfr870/upload/fuwutuiding_tupian1.jpg','是','',1),(72,'2021-04-01 20:21:21','账号2','姓名2','服务名称2','服务类型2','服务人员2','http://localhost:8080/ssmfr870/upload/fuwutuiding_tupian2.jpg','是','',2),(73,'2021-04-01 20:21:21','账号3','姓名3','服务名称3','服务类型3','服务人员3','http://localhost:8080/ssmfr870/upload/fuwutuiding_tupian3.jpg','是','',3),(74,'2021-04-01 20:21:21','账号4','姓名4','服务名称4','服务类型4','服务人员4','http://localhost:8080/ssmfr870/upload/fuwutuiding_tupian4.jpg','是','',4),(75,'2021-04-01 20:21:21','账号5','姓名5','服务名称5','服务类型5','服务人员5','http://localhost:8080/ssmfr870/upload/fuwutuiding_tupian5.jpg','是','',5),(76,'2021-04-01 20:21:21','账号6','姓名6','服务名称6','服务类型6','服务人员6','http://localhost:8080/ssmfr870/upload/fuwutuiding_tupian6.jpg','是','',6);

/*Table structure for table `fuwuyuyue` */

DROP TABLE IF EXISTS `fuwuyuyue`;

CREATE TABLE `fuwuyuyue` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `fuwumingcheng` varchar(200) DEFAULT NULL COMMENT '服务名称',
  `fuwuleixing` varchar(200) DEFAULT NULL COMMENT '服务类型',
  `yuyueshijian` datetime DEFAULT NULL COMMENT '预约时间',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1617279854021 DEFAULT CHARSET=utf8 COMMENT='服务预约';

/*Data for the table `fuwuyuyue` */

insert  into `fuwuyuyue`(`id`,`addtime`,`zhanghao`,`xingming`,`fuwumingcheng`,`fuwuleixing`,`yuyueshijian`,`tupian`,`sfsh`,`shhf`,`ispay`,`userid`) values (41,'2021-04-01 20:21:21','账号1','姓名1','服务名称1','服务类型1','2021-04-01 20:21:21','http://localhost:8080/ssmfr870/upload/fuwuyuyue_tupian1.jpg','是','','未支付',1),(42,'2021-04-01 20:21:21','账号2','姓名2','服务名称2','服务类型2','2021-04-01 20:21:21','http://localhost:8080/ssmfr870/upload/fuwuyuyue_tupian2.jpg','是','','未支付',2),(43,'2021-04-01 20:21:21','账号3','姓名3','服务名称3','服务类型3','2021-04-01 20:21:21','http://localhost:8080/ssmfr870/upload/fuwuyuyue_tupian3.jpg','是','','未支付',3),(44,'2021-04-01 20:21:21','账号4','姓名4','服务名称4','服务类型4','2021-04-01 20:21:21','http://localhost:8080/ssmfr870/upload/fuwuyuyue_tupian4.jpg','是','','未支付',4),(45,'2021-04-01 20:21:21','账号5','姓名5','服务名称5','服务类型5','2021-04-01 20:21:21','http://localhost:8080/ssmfr870/upload/fuwuyuyue_tupian5.jpg','是','','未支付',5),(46,'2021-04-01 20:21:21','账号6','姓名6','服务名称6','服务类型6','2021-04-01 20:21:21','http://localhost:8080/ssmfr870/upload/fuwuyuyue_tupian6.jpg','是','','未支付',6),(1617279854020,'2021-04-01 20:24:13','用户1','姓名1','服务名称1','医疗服务','2021-04-01 20:24:08','http://localhost:8080/ssmfr870/upload/fuwuchanpin_tupian1.jpg','是','00','',11);

/*Table structure for table `fuwuzhuangtai` */

DROP TABLE IF EXISTS `fuwuzhuangtai`;

CREATE TABLE `fuwuzhuangtai` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `fuwumingcheng` varchar(200) DEFAULT NULL COMMENT '服务名称',
  `fuwuleixing` varchar(200) DEFAULT NULL COMMENT '服务类型',
  `yuyueshijian` varchar(200) DEFAULT NULL COMMENT '预约时间',
  `fuwuzhuangtai` varchar(200) DEFAULT NULL COMMENT '服务状态',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1617279938730 DEFAULT CHARSET=utf8 COMMENT='服务状态';

/*Data for the table `fuwuzhuangtai` */

insert  into `fuwuzhuangtai`(`id`,`addtime`,`zhanghao`,`xingming`,`fuwumingcheng`,`fuwuleixing`,`yuyueshijian`,`fuwuzhuangtai`,`tupian`,`userid`) values (51,'2021-04-01 20:21:21','账号1','姓名1','服务名称1','服务类型1','预约时间1','代办服务','http://localhost:8080/ssmfr870/upload/fuwuzhuangtai_tupian1.jpg',1),(52,'2021-04-01 20:21:21','账号2','姓名2','服务名称2','服务类型2','预约时间2','代办服务','http://localhost:8080/ssmfr870/upload/fuwuzhuangtai_tupian2.jpg',2),(53,'2021-04-01 20:21:21','账号3','姓名3','服务名称3','服务类型3','预约时间3','代办服务','http://localhost:8080/ssmfr870/upload/fuwuzhuangtai_tupian3.jpg',3),(54,'2021-04-01 20:21:21','账号4','姓名4','服务名称4','服务类型4','预约时间4','代办服务','http://localhost:8080/ssmfr870/upload/fuwuzhuangtai_tupian4.jpg',4),(55,'2021-04-01 20:21:21','账号5','姓名5','服务名称5','服务类型5','预约时间5','代办服务','http://localhost:8080/ssmfr870/upload/fuwuzhuangtai_tupian5.jpg',5),(56,'2021-04-01 20:21:21','账号6','姓名6','服务名称6','服务类型6','预约时间6','代办服务','http://localhost:8080/ssmfr870/upload/fuwuzhuangtai_tupian6.jpg',6),(1617279938729,'2021-04-01 20:25:38','用户1','姓名1','服务名称1','医疗服务','2021-04-01 20:24:08','代办服务','http://localhost:8080/ssmfr870/upload/fuwuchanpin_tupian1.jpg',11);

/*Table structure for table `huodong` */

DROP TABLE IF EXISTS `huodong`;

CREATE TABLE `huodong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) DEFAULT NULL COMMENT '名称',
  `leixing` varchar(200) DEFAULT NULL COMMENT '类型',
  `shijian` datetime DEFAULT NULL COMMENT '时间',
  `neirong` longtext COMMENT '内容',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='活动';

/*Data for the table `huodong` */

insert  into `huodong`(`id`,`addtime`,`mingcheng`,`leixing`,`shijian`,`neirong`,`tupian`,`thumbsupnum`,`crazilynum`) values (91,'2021-04-01 20:21:21','名称1','文化教育活动','2021-04-01 20:21:21','内容1','http://localhost:8080/ssmfr870/upload/huodong_tupian1.jpg',1,1),(92,'2021-04-01 20:21:21','名称2','文化教育活动','2021-04-01 20:21:21','内容2','http://localhost:8080/ssmfr870/upload/huodong_tupian2.jpg',2,2),(93,'2021-04-01 20:21:21','名称3','文化教育活动','2021-04-01 20:21:21','内容3','http://localhost:8080/ssmfr870/upload/huodong_tupian3.jpg',3,3),(94,'2021-04-01 20:21:21','名称4','文化教育活动','2021-04-01 20:21:21','内容4','http://localhost:8080/ssmfr870/upload/huodong_tupian4.jpg',4,4),(95,'2021-04-01 20:21:21','名称5','文化教育活动','2021-04-01 20:21:21','内容5','http://localhost:8080/ssmfr870/upload/huodong_tupian5.jpg',5,5),(96,'2021-04-01 20:21:21','名称6','文化教育活动','2021-04-01 20:21:21','内容6','http://localhost:8080/ssmfr870/upload/huodong_tupian6.jpg',6,6);

/*Table structure for table `news` */

DROP TABLE IF EXISTS `news`;

CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `introduction` longtext COMMENT '简介',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=217 DEFAULT CHARSET=utf8 COMMENT='养老资讯';

/*Data for the table `news` */

insert  into `news`(`id`,`addtime`,`title`,`introduction`,`picture`,`content`) values (211,'2021-04-01 20:21:21','标题1','简介1','http://localhost:8080/ssmfr870/upload/news_picture1.jpg','内容1'),(212,'2021-04-01 20:21:21','标题2','简介2','http://localhost:8080/ssmfr870/upload/news_picture2.jpg','内容2'),(213,'2021-04-01 20:21:21','标题3','简介3','http://localhost:8080/ssmfr870/upload/news_picture3.jpg','内容3'),(214,'2021-04-01 20:21:21','标题4','简介4','http://localhost:8080/ssmfr870/upload/news_picture4.jpg','内容4'),(215,'2021-04-01 20:21:21','标题5','简介5','http://localhost:8080/ssmfr870/upload/news_picture5.jpg','内容5'),(216,'2021-04-01 20:21:21','标题6','简介6','http://localhost:8080/ssmfr870/upload/news_picture6.jpg','内容6');

/*Table structure for table `shipin` */

DROP TABLE IF EXISTS `shipin`;

CREATE TABLE `shipin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) DEFAULT NULL COMMENT '名称',
  `leixing` varchar(200) DEFAULT NULL COMMENT '类型',
  `neirong` longtext COMMENT '内容',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `shipin` varchar(200) DEFAULT NULL COMMENT '视频',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='视频';

/*Data for the table `shipin` */

insert  into `shipin`(`id`,`addtime`,`mingcheng`,`leixing`,`neirong`,`tupian`,`shipin`,`thumbsupnum`,`crazilynum`) values (101,'2021-04-01 20:21:21','名称1','养生','内容1','http://localhost:8080/ssmfr870/upload/shipin_tupian1.jpg','',1,1),(102,'2021-04-01 20:21:21','名称2','养生','内容2','http://localhost:8080/ssmfr870/upload/shipin_tupian2.jpg','',2,2),(103,'2021-04-01 20:21:21','名称3','养生','内容3','http://localhost:8080/ssmfr870/upload/shipin_tupian3.jpg','',3,3),(104,'2021-04-01 20:21:21','名称4','养生','内容4','http://localhost:8080/ssmfr870/upload/shipin_tupian4.jpg','',4,4),(105,'2021-04-01 20:21:21','名称5','养生','内容5','http://localhost:8080/ssmfr870/upload/shipin_tupian5.jpg','',5,5),(106,'2021-04-01 20:21:21','名称6','养生','内容6','http://localhost:8080/ssmfr870/upload/shipin_tupian6.jpg','',6,6);

/*Table structure for table `storeup` */

DROP TABLE IF EXISTS `storeup`;

CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';

/*Data for the table `storeup` */

/*Table structure for table `token` */

DROP TABLE IF EXISTS `token`;

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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='token表';

/*Data for the table `token` */

insert  into `token`(`id`,`userid`,`username`,`tablename`,`role`,`token`,`addtime`,`expiratedtime`) values (1,11,'用户1','yonghu','用户','bjobomabuna1edl4ff2kfes0r6fgioat','2021-04-01 20:23:50','2021-04-01 21:26:38'),(2,1,'abo','users','管理员','sgnt88tbmpnze57hl11vg1bln5crgxqa','2021-04-01 20:24:33','2021-04-01 21:24:34');

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `users` */

insert  into `users`(`id`,`username`,`password`,`role`,`addtime`) values (1,'abo','abo','管理员','2021-04-01 20:21:21');

/*Table structure for table `yiwanchengfuwu` */

DROP TABLE IF EXISTS `yiwanchengfuwu`;

CREATE TABLE `yiwanchengfuwu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `fuwumingcheng` varchar(200) DEFAULT NULL COMMENT '服务名称',
  `fuwuleixing` varchar(200) DEFAULT NULL COMMENT '服务类型',
  `yuyueshijian` varchar(200) DEFAULT NULL COMMENT '预约时间',
  `fuwuzhuangtai` varchar(200) DEFAULT NULL COMMENT '服务状态',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='已完成服务';

/*Data for the table `yiwanchengfuwu` */

insert  into `yiwanchengfuwu`(`id`,`addtime`,`zhanghao`,`xingming`,`fuwumingcheng`,`fuwuleixing`,`yuyueshijian`,`fuwuzhuangtai`,`tupian`,`userid`) values (81,'2021-04-01 20:21:21','账号1','姓名1','服务名称1','服务类型1','预约时间1','已完成','http://localhost:8080/ssmfr870/upload/yiwanchengfuwu_tupian1.jpg',1),(82,'2021-04-01 20:21:21','账号2','姓名2','服务名称2','服务类型2','预约时间2','已完成','http://localhost:8080/ssmfr870/upload/yiwanchengfuwu_tupian2.jpg',2),(83,'2021-04-01 20:21:21','账号3','姓名3','服务名称3','服务类型3','预约时间3','已完成','http://localhost:8080/ssmfr870/upload/yiwanchengfuwu_tupian3.jpg',3),(84,'2021-04-01 20:21:21','账号4','姓名4','服务名称4','服务类型4','预约时间4','已完成','http://localhost:8080/ssmfr870/upload/yiwanchengfuwu_tupian4.jpg',4),(85,'2021-04-01 20:21:21','账号5','姓名5','服务名称5','服务类型5','预约时间5','已完成','http://localhost:8080/ssmfr870/upload/yiwanchengfuwu_tupian5.jpg',5),(86,'2021-04-01 20:21:21','账号6','姓名6','服务名称6','服务类型6','预约时间6','已完成','http://localhost:8080/ssmfr870/upload/yiwanchengfuwu_tupian6.jpg',6);

/*Table structure for table `yonghu` */

DROP TABLE IF EXISTS `yonghu`;

CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='用户';

/*Data for the table `yonghu` */

insert  into `yonghu`(`id`,`addtime`,`zhanghao`,`mima`,`xingming`,`xingbie`,`nianling`,`shenfenzheng`,`shouji`,`youxiang`,`zhaopian`) values (11,'2021-04-01 20:21:21','用户1','123456','姓名1','男',1,'440300199101010001','13823888881','773890001@qq.com','http://localhost:8080/ssmfr870/upload/yonghu_zhaopian1.jpg'),(12,'2021-04-01 20:21:21','用户2','123456','姓名2','男',2,'440300199202020002','13823888882','773890002@qq.com','http://localhost:8080/ssmfr870/upload/yonghu_zhaopian2.jpg'),(13,'2021-04-01 20:21:21','用户3','123456','姓名3','男',3,'440300199303030003','13823888883','773890003@qq.com','http://localhost:8080/ssmfr870/upload/yonghu_zhaopian3.jpg'),(14,'2021-04-01 20:21:21','用户4','123456','姓名4','男',4,'440300199404040004','13823888884','773890004@qq.com','http://localhost:8080/ssmfr870/upload/yonghu_zhaopian4.jpg'),(15,'2021-04-01 20:21:21','用户5','123456','姓名5','男',5,'440300199505050005','13823888885','773890005@qq.com','http://localhost:8080/ssmfr870/upload/yonghu_zhaopian5.jpg'),(16,'2021-04-01 20:21:21','用户6','123456','姓名6','男',6,'440300199606060006','13823888886','773890006@qq.com','http://localhost:8080/ssmfr870/upload/yonghu_zhaopian6.jpg');

/*Table structure for table `yonghudaibanshixiang` */

DROP TABLE IF EXISTS `yonghudaibanshixiang`;

CREATE TABLE `yonghudaibanshixiang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `mingcheng` varchar(200) DEFAULT NULL COMMENT '名称',
  `shijian` date DEFAULT NULL COMMENT '时间',
  `neirong` longtext COMMENT '内容',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8 COMMENT='用户待办事项';

/*Data for the table `yonghudaibanshixiang` */

insert  into `yonghudaibanshixiang`(`id`,`addtime`,`zhanghao`,`xingming`,`mingcheng`,`shijian`,`neirong`,`tupian`,`userid`) values (121,'2021-04-01 20:21:21','账号1','姓名1','名称1','2021-04-01','内容1','http://localhost:8080/ssmfr870/upload/yonghudaibanshixiang_tupian1.jpg',1),(122,'2021-04-01 20:21:21','账号2','姓名2','名称2','2021-04-01','内容2','http://localhost:8080/ssmfr870/upload/yonghudaibanshixiang_tupian2.jpg',2),(123,'2021-04-01 20:21:21','账号3','姓名3','名称3','2021-04-01','内容3','http://localhost:8080/ssmfr870/upload/yonghudaibanshixiang_tupian3.jpg',3),(124,'2021-04-01 20:21:21','账号4','姓名4','名称4','2021-04-01','内容4','http://localhost:8080/ssmfr870/upload/yonghudaibanshixiang_tupian4.jpg',4),(125,'2021-04-01 20:21:21','账号5','姓名5','名称5','2021-04-01','内容5','http://localhost:8080/ssmfr870/upload/yonghudaibanshixiang_tupian5.jpg',5),(126,'2021-04-01 20:21:21','账号6','姓名6','名称6','2021-04-01','内容6','http://localhost:8080/ssmfr870/upload/yonghudaibanshixiang_tupian6.jpg',6);

/*Table structure for table `yonghutongzhi` */

DROP TABLE IF EXISTS `yonghutongzhi`;

CREATE TABLE `yonghutongzhi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) DEFAULT NULL COMMENT '名称',
  `shijian` date DEFAULT NULL COMMENT '时间',
  `tongzhileixing` varchar(200) DEFAULT NULL COMMENT '通知类型',
  `neirong` longtext COMMENT '内容',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8 COMMENT='用户通知';

/*Data for the table `yonghutongzhi` */

insert  into `yonghutongzhi`(`id`,`addtime`,`mingcheng`,`shijian`,`tongzhileixing`,`neirong`,`tupian`,`clicktime`) values (111,'2021-04-01 20:21:21','名称1','2021-04-01','通知类型1','内容1','http://localhost:8080/ssmfr870/upload/yonghutongzhi_tupian1.jpg','2021-04-01 20:21:21'),(112,'2021-04-01 20:21:21','名称2','2021-04-01','通知类型2','内容2','http://localhost:8080/ssmfr870/upload/yonghutongzhi_tupian2.jpg','2021-04-01 20:21:21'),(113,'2021-04-01 20:21:21','名称3','2021-04-01','通知类型3','内容3','http://localhost:8080/ssmfr870/upload/yonghutongzhi_tupian3.jpg','2021-04-01 20:21:21'),(114,'2021-04-01 20:21:21','名称4','2021-04-01','通知类型4','内容4','http://localhost:8080/ssmfr870/upload/yonghutongzhi_tupian4.jpg','2021-04-01 20:21:21'),(115,'2021-04-01 20:21:21','名称5','2021-04-01','通知类型5','内容5','http://localhost:8080/ssmfr870/upload/yonghutongzhi_tupian5.jpg','2021-04-01 20:21:21'),(116,'2021-04-01 20:21:21','名称6','2021-04-01','通知类型6','内容6','http://localhost:8080/ssmfr870/upload/yonghutongzhi_tupian6.jpg','2021-04-01 20:21:21');

/*Table structure for table `yonghutousu` */

DROP TABLE IF EXISTS `yonghutousu`;

CREATE TABLE `yonghutousu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `fuwumingcheng` varchar(200) DEFAULT NULL COMMENT '服务名称',
  `fuwurenyuan` varchar(200) DEFAULT NULL COMMENT '服务人员',
  `fuwushijian` date DEFAULT NULL COMMENT '服务时间',
  `tousuxiangqing` longtext COMMENT '投诉详情',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=177 DEFAULT CHARSET=utf8 COMMENT='用户投诉';

/*Data for the table `yonghutousu` */

insert  into `yonghutousu`(`id`,`addtime`,`zhanghao`,`xingming`,`nianling`,`shouji`,`fuwumingcheng`,`fuwurenyuan`,`fuwushijian`,`tousuxiangqing`,`tupian`,`sfsh`,`shhf`,`userid`) values (171,'2021-04-01 20:21:21','账号1','姓名1','年龄1','手机1','服务名称1','服务人员1','2021-04-01','投诉详情1','http://localhost:8080/ssmfr870/upload/yonghutousu_tupian1.jpg','是','',1),(172,'2021-04-01 20:21:21','账号2','姓名2','年龄2','手机2','服务名称2','服务人员2','2021-04-01','投诉详情2','http://localhost:8080/ssmfr870/upload/yonghutousu_tupian2.jpg','是','',2),(173,'2021-04-01 20:21:21','账号3','姓名3','年龄3','手机3','服务名称3','服务人员3','2021-04-01','投诉详情3','http://localhost:8080/ssmfr870/upload/yonghutousu_tupian3.jpg','是','',3),(174,'2021-04-01 20:21:21','账号4','姓名4','年龄4','手机4','服务名称4','服务人员4','2021-04-01','投诉详情4','http://localhost:8080/ssmfr870/upload/yonghutousu_tupian4.jpg','是','',4),(175,'2021-04-01 20:21:21','账号5','姓名5','年龄5','手机5','服务名称5','服务人员5','2021-04-01','投诉详情5','http://localhost:8080/ssmfr870/upload/yonghutousu_tupian5.jpg','是','',5),(176,'2021-04-01 20:21:21','账号6','姓名6','年龄6','手机6','服务名称6','服务人员6','2021-04-01','投诉详情6','http://localhost:8080/ssmfr870/upload/yonghutousu_tupian6.jpg','是','',6);

/*Table structure for table `yonghuyiwanchengshixiang` */

DROP TABLE IF EXISTS `yonghuyiwanchengshixiang`;

CREATE TABLE `yonghuyiwanchengshixiang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `mingcheng` varchar(200) DEFAULT NULL COMMENT '名称',
  `shijian` varchar(200) DEFAULT NULL COMMENT '时间',
  `neirong` longtext COMMENT '内容',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8 COMMENT='用户已完成事项';

/*Data for the table `yonghuyiwanchengshixiang` */

insert  into `yonghuyiwanchengshixiang`(`id`,`addtime`,`zhanghao`,`xingming`,`mingcheng`,`shijian`,`neirong`,`tupian`,`userid`) values (131,'2021-04-01 20:21:21','账号1','姓名1','名称1','时间1','内容1','http://localhost:8080/ssmfr870/upload/yonghuyiwanchengshixiang_tupian1.jpg',1),(132,'2021-04-01 20:21:21','账号2','姓名2','名称2','时间2','内容2','http://localhost:8080/ssmfr870/upload/yonghuyiwanchengshixiang_tupian2.jpg',2),(133,'2021-04-01 20:21:21','账号3','姓名3','名称3','时间3','内容3','http://localhost:8080/ssmfr870/upload/yonghuyiwanchengshixiang_tupian3.jpg',3),(134,'2021-04-01 20:21:21','账号4','姓名4','名称4','时间4','内容4','http://localhost:8080/ssmfr870/upload/yonghuyiwanchengshixiang_tupian4.jpg',4),(135,'2021-04-01 20:21:21','账号5','姓名5','名称5','时间5','内容5','http://localhost:8080/ssmfr870/upload/yonghuyiwanchengshixiang_tupian5.jpg',5),(136,'2021-04-01 20:21:21','账号6','姓名6','名称6','时间6','内容6','http://localhost:8080/ssmfr870/upload/yonghuyiwanchengshixiang_tupian6.jpg',6);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
