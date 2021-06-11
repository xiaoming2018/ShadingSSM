/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80025
 Source Host           : localhost:3306
 Source Schema         : shading

 Target Server Type    : MySQL
 Target Server Version : 80025
 File Encoding         : 65001

 Date: 11/06/2021 15:22:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for camera
-- ----------------------------
DROP TABLE IF EXISTS `camera`;
CREATE TABLE `camera`  (
  `Camera_ID` int NOT NULL AUTO_INCREMENT,
  `Camera_Title` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `Camera_Type` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `Camera_near` int NULL DEFAULT NULL,
  `Camera_Far` int NULL DEFAULT NULL,
  `Camera_Visibility` enum('true','false') CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT 'true',
  `Camera_Position_X` int NULL DEFAULT NULL,
  `Camera_Position_Y` int NULL DEFAULT NULL,
  `Camera_Position_Z` int NULL DEFAULT NULL,
  `scene_id` int NULL DEFAULT NULL,
  `field_of_view` int NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`Camera_ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of camera
-- ----------------------------
INSERT INTO `camera` VALUES (201, '透视投影相机', 'Perspective', 10, 1000, 'true', 0, 0, 0, 1, 45, '2021-06-11 14:57:46', '2021-06-11 14:57:49');

-- ----------------------------
-- Table structure for light
-- ----------------------------
DROP TABLE IF EXISTS `light`;
CREATE TABLE `light`  (
  `light_id` int NOT NULL,
  `light_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `light_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `light_position_x` float NULL DEFAULT NULL,
  `light_position_y` float NULL DEFAULT NULL,
  `light_position_z` float NULL DEFAULT NULL,
  `light_color` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `light_intensity` float NULL DEFAULT NULL,
  `scene_id` int NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`light_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of light
-- ----------------------------
INSERT INTO `light` VALUES (301, '环境光', 'AmbientLight', 10, 10, 10, '0xfffff', 1, 1, '2021-06-11 14:58:57', '2021-06-25 14:58:59');

-- ----------------------------
-- Table structure for model
-- ----------------------------
DROP TABLE IF EXISTS `model`;
CREATE TABLE `model`  (
  `model_id` int NOT NULL AUTO_INCREMENT,
  `model_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `model_type_id` int NULL DEFAULT NULL,
  `model_position_x` float NULL DEFAULT NULL,
  `model_position_y` float NULL DEFAULT NULL,
  `model_position_z` float NULL DEFAULT NULL,
  `model_rotation_x` float NULL DEFAULT NULL,
  `model_rotation_y` float NULL DEFAULT NULL,
  `model_rotation_z` float NULL DEFAULT NULL,
  `model_scale_x` float NULL DEFAULT NULL,
  `model_scale_y` float NULL DEFAULT NULL,
  `model_scale_z` float NULL DEFAULT NULL,
  `model_file_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `model_file_index` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `scene_id` int NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`model_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of model
-- ----------------------------
INSERT INTO `model` VALUES (101, '默认模型', 401, -3.57775, 1.12696, -0.751304, 0, 0, 0, 1, 1, 1, '/upload/20210527111814xiaoming.obj', '/upload/20210610145345xiaoming', 1, '2021-06-11 15:01:36', '2021-06-11 15:12:38');
INSERT INTO `model` VALUES (102, 'cow', 401, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '/upload/20210611151232xiaoming.obj', '/upload/20210611151232xiaoming', 1, '2021-06-11 15:12:33', '2021-06-11 15:12:33');

-- ----------------------------
-- Table structure for model_type
-- ----------------------------
DROP TABLE IF EXISTS `model_type`;
CREATE TABLE `model_type`  (
  `model_type_id` int NOT NULL,
  `model_type_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `model_type_create_time` datetime NULL DEFAULT NULL,
  `model_type_updata_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`model_type_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of model_type
-- ----------------------------
INSERT INTO `model_type` VALUES (401, 'OBJ', '2021-06-11 14:59:21', '2021-06-11 14:59:23');
INSERT INTO `model_type` VALUES (402, 'PLY', '2021-06-11 14:59:38', '2021-06-11 14:59:40');

-- ----------------------------
-- Table structure for scene
-- ----------------------------
DROP TABLE IF EXISTS `scene`;
CREATE TABLE `scene`  (
  `scene_id` int NOT NULL,
  `scene_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`scene_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of scene
-- ----------------------------
INSERT INTO `scene` VALUES (1, '默认场景', '2021-06-11 14:55:30', '2021-06-11 14:55:32');

SET FOREIGN_KEY_CHECKS = 1;
