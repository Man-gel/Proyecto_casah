-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.5.5-10.0.14-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             8.3.0.4694
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando estructura de base de datos para casah
CREATE DATABASE IF NOT EXISTS `casah` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `casah`;


-- Volcando estructura para tabla casah.producto
CREATE TABLE IF NOT EXISTS `casah`.`producto` (
`id_producto` INT(4) NOT NULL AUTO_INCREMENT ,
`pnombre` VARCHAR(40) NOT NULL ,
`descripcion` VARCHAR(60) NOT NULL ,
PRIMARY KEY (`id_producto`) )
ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla casah.ingresos
CREATE TABLE IF NOT EXISTS `casah`.`ingresos` (
`id_producto` INT(4) NOT NULL ,
`cantidad` INT(5) NOT NULL ,
`descripcion` VARCHAR(50) NOT NULL,
`fecha_ingreso` DATE NOT NULL,
`monto` INT(7.2) NOT NULL,
`id_proveedor` INT(4) NOT NULL ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla casah.existencias
CREATE TABLE IF NOT EXISTS `casah`.`existencias` (
`id_producto` INT(4) NOT NULL ,
`cantidad` INT(5) NOT NULL ,
`fecha_actualizacion` DATE NOT NULL,
`id_beneficiario` INT(5) NOT NULL ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla casah.proveedores
CREATE TABLE IF NOT EXISTS `casah`.`proveedores` (
`id_proveedor` INT(4) NOT NULL AUTO_INCREMENT,
`pvnombre` VARCHAR(50) NOT NULL ,
`domicilio` VARCHAR(45) NOT NULL,
PRIMARY KEY(`id_proveedor`) ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla casah.beneficiarios
CREATE TABLE IF NOT EXISTS `casah`.`beneficiarios` (
`id_beneficiario` INT(5) NOT NULL AUTO_INCREMENT,
`bnombre` VARCHAR(50) NOT NULL ,
`tipo` VARCHAR(35) NOT NULL,
PRIMARY KEY(`id_beneficiario`) ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla casah.usuarios
CREATE TABLE IF NOT EXISTS `casah`.`usuarios` (
`id_usuario` INT(3) NOT NULL AUTO_INCREMENT ,
`user` VARCHAR(35) NOT NULL ,
`password` VARCHAR(30) NOT NULL ,
`unombre` VARCHAR(45) NOT NULL ,
`permisos` VARCHAR(25) NOT NULL ,
PRIMARY KEY(`id_usuario`) ,
UNIQUE KEY `user`(`user`) ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;