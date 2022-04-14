-- MySQL Script generated by MySQL Workbench
-- Thu 14 Apr 2022 11:11:18 AM -03
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Cliente`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Cliente` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Cliente` (
  `dni` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `fechaNacimiento` DATE NULL,
  `direccion` VARCHAR(45) NULL,
  PRIMARY KEY (`dni`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Vendedor`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Vendedor` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Vendedor` (
  `dni` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `direccion` VARCHAR(45) NULL,
  `fechaNacimiento` VARCHAR(45) NULL,
  `salario` DOUBLE NULL,
  PRIMARY KEY (`dni`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Producto`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Producto` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Producto` (
  `idProducto` INT NOT NULL,
  `precioUnitario` DOUBLE NULL,
  `stockMinimo` INT NULL,
  `cantidad` VARCHAR(45) NULL,
  PRIMARY KEY (`idProducto`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Factura`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Factura` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Factura` (
  `nroFactura` INT NOT NULL,
  `fechaCompra` DATE NULL,
  `cliente_dni` INT NOT NULL,
  `producto_idProducto` INT NOT NULL,
  `Vendedor_dni` INT NOT NULL,
  PRIMARY KEY (`nroFactura`),
  INDEX `fk_table1_Cliente_idx` (`cliente_dni` ASC) VISIBLE,
  INDEX `fk_table1_Producto1_idx` (`producto_idProducto` ASC) VISIBLE,
  INDEX `fk_table1_Vendedor1_idx` (`Vendedor_dni` ASC) VISIBLE,
FOREIGN KEY (`cliente_dni`)
    REFERENCES `mydb`.`Cliente` (`dni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
FOREIGN KEY (`producto_idProducto`)
    REFERENCES `mydb`.`Producto` (`idProducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
FOREIGN KEY (`Vendedor_dni`)
    REFERENCES `mydb`.`Vendedor` (`dni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
