CREATE DATABASE practica;
USE practica; 
CREATE TABLE `practica`.`usuarios` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `dni` VARCHAR(15) NOT NULL,
  `nombre` VARCHAR(100) NOT NULL,
  `telefono` VARCHAR(15) NOT NULL,
  `direccion` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `dni_UNIQUE` (`dni` ASC) VISIBLE);
  
CREATE TABLE `practica`.`libros` (
  `isbn` INT NOT NULL,
  `titulo` VARCHAR(100) NOT NULL,
  `autor` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`isbn`),
  UNIQUE INDEX `isbn_UNIQUE` (`isbn` ASC) VISIBLE);
  
CREATE TABLE `practica`.`prestamos` (
  `id_prestamos` INT NOT NULL AUTO_INCREMENT,
  `id_usuario` INT NOT NULL,
  `isbn` INT NOT NULL,
  `fecha_prestamo` DATE NOT NULL,
  `fecha_devolucion` DATE NULL,
  PRIMARY KEY (`id_prestamos`));

ALTER TABLE `practica`.`prestamos` 
ADD INDEX `prestamos_usuario_FK_idx` (`id_usuario` ASC) VISIBLE,
ADD INDEX `isbn_FK_idx` (`isbn` ASC) VISIBLE;
;
ALTER TABLE `practica`.`prestamos` 
ADD CONSTRAINT `prestamos_usuario_FK`
  FOREIGN KEY (`id_usuario`)
  REFERENCES `practica`.`usuarios` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
ADD CONSTRAINT `prestamos_isbn_FK`
  FOREIGN KEY (`isbn`)
  REFERENCES `practica`.`libros` (`isbn`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;