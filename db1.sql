/*
 Navicat MySQL Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50560
 Source Host           : localhost:3306
 Source Schema         : db1

 Target Server Type    : MySQL
 Target Server Version : 50560
 File Encoding         : 65001

 Date: 17/07/2018 17:13:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for infromation
-- ----------------------------
DROP TABLE IF EXISTS `infromation`;
CREATE TABLE `infromation`  (
  `name` varchar(25) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `addres` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `number` int(10) DEFAULT NULL,
  `age` int(3) DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ti
-- ----------------------------
DROP TABLE IF EXISTS `ti`;
CREATE TABLE `ti`  (
  `id` int(11) NOT NULL,
  `question` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `A` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `B` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `C` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `D` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `answer` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of ti
-- ----------------------------
INSERT INTO `ti` VALUES (1, '1+1=', '1', '2', '3', '4', 'B');
INSERT INTO `ti` VALUES (2, '2+3=', '3', '4', '5', '6', 'C');
INSERT INTO `ti` VALUES (3, 'ni', 'me', 'l', 'l', 'l', 'A');
INSERT INTO `ti` VALUES (4, 'why', 'no why', 'good', 'because', 'asd阿斯顿', 'C');

SET FOREIGN_KEY_CHECKS = 1;
