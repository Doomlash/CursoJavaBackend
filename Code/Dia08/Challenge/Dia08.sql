
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Cliente`
-- -----------------------------------------------------
DROP TABLE IF EXISTS Cliente ;

CREATE TABLE IF NOT EXISTS Cliente (
  dni INT NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  apellido VARCHAR(45) NOT NULL,
  direccion VARCHAR(45) NOT NULL,
  PRIMARY KEY (dni))
ENGINE = InnoDB;

DROP TABLE IF EXISTS RegistroCambiosClientes ;
CREATE TABLE IF NOT EXISTS RegistroCambiosClientes (
	idCambio INT NOT NULL AUTO_INCREMENT,
    dni INT NOT NULL,
    fechaHoraCambio DATETIME,
    accion VARCHAR(6),
    PRIMARY KEY (idCambio)
) ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

DROP TRIGGER IF EXISTS delete_cliente;
DROP TRIGGER IF EXISTS update_cliente;
DROP TRIGGER IF EXISTS update_cliente;
delimiter $$
CREATE TRIGGER delete_cliente  AFTER DELETE ON Cliente FOR EACH ROW
BEGIN
	INSERT INTO RegistroCambiosClientes(dni,fechaHoraCambio,accion) values(OLD.dni,sysdate(),'DELETE');
END$$

CREATE TRIGGER update_cliente  AFTER UPDATE ON Cliente FOR EACH ROW
BEGIN
	INSERT INTO RegistroCambiosClientes(dni,fechaHoraCambio,accion) values(NEW.dni,sysdate(),'UPDATE');
END$$

CREATE TRIGGER insert_cliente  AFTER INSERT ON Cliente FOR EACH ROW
BEGIN
	INSERT INTO RegistroCambiosClientes(dni,fechaHoraCambio,accion) values(NEW.dni,sysdate(),'INSERT');
END$$
delimiter ;

INSERT INTO Cliente(dni,nombre,apellido,direccion) values (40000000,'Emiliano','Vilche','Estomba 159');
UPDATE Cliente SET nombre='Juan' WHERE dni = 40000000;
DELETE FROM Cliente WHERE dni = 40000000;
SELECT * FROM RegistroCambiosClientes;
SELECT * FROM Cliente;


