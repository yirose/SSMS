/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : ssm-crud

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2017-12-06 23:34:34
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(8) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) NOT NULL,
  `password` varchar(32) NOT NULL,
  `salt` varchar(20) NOT NULL,
  `regTime` varchar(13) DEFAULT NULL,
  `lastSignTime` varchar(13) DEFAULT NULL,
  `signState` int(4) DEFAULT NULL,
  `tickeId` int(10) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '038bdaf98f2037b31f1e75b5b4c9b26e', 'anil', '1512093188487', '1512093188487', '1', '1');
INSERT INTO `user` VALUES ('2', 'user', '098d2c478e9c11555ce2823231e02ec1', 'monster', '1512093188487', '1512093188487', '1', '1');
INSERT INTO `user` VALUES ('3', 'dog', 'ecb1552e0e1c4060216ae78e0689f645', 'monster', '1512093188487', '1512093188487', '1', '0');
