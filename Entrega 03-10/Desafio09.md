1- Crea una base de datos llamada personal
    create database personal;
    use personal;

2- Genera las siguientes tablas:
    CREATE TABLE `personal`.`departamento` (
    `id_departamento` INT NOT NULL AUTO_INCREMENT,
    `nombre` VARCHAR(30) NOT NULL,
    `presupuesto` INT NOT NULL,
    PRIMARY KEY (`id_departamento`),
    UNIQUE INDEX `id_departamento_UNIQUE` (`id_departamento` ASC) VISIBLE);

    CREATE TABLE `personal`.`empleados` (
    `id_empleado` VARCHAR(8) NOT NULL,
    `nombre` VARCHAR(30) NOT NULL,
    `apellidos` VARCHAR(30) NOT NULL,
    `id_departamento` INT NULL,
    PRIMARY KEY (`id_empleado`),
    UNIQUE INDEX `id_empleado_UNIQUE` (`id_empleado` ASC) VISIBLE,
    INDEX `FK_id_departamento_idx` (`id_departamento` ASC) VISIBLE,
    CONSTRAINT `FK_id_departamento`
    FOREIGN KEY (`id_departamento`)
    REFERENCES `personal`.`departamento` (`id_departamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

3- Introduce los siguientes datos en cada tabla:
    INSERT INTO `personal`.`departamento` (`id_departamento`, `nombre`, `presupuesto`) VALUES ('1', 'Personal', '80000');
    INSERT INTO `personal`.`departamento` (`id_departamento`, `nombre`, `presupuesto`) VALUES ('2', 'Almacén', '70000');
    INSERT INTO `personal`.`departamento` (`id_departamento`, `nombre`, `presupuesto`) VALUES ('3', 'Contabilidad', '60000');
    INSERT INTO `personal`.`departamento` (`id_departamento`, `nombre`, `presupuesto`) VALUES ('4', 'Manufactura', '50000');
    INSERT INTO `personal`.`departamento` (`id_departamento`, `nombre`, `presupuesto`) VALUES ('5', 'Empaque', '30000');

    INSERT INTO `personal`.`empleados` (`id_empleado`, `nombre`, `apellidos`, `id_departamento`) VALUES ('EMP01', 'Armando', 'López', '2');
    INSERT INTO `personal`.`empleados` (`id_empleado`, `nombre`, `apellidos`, `id_departamento`) VALUES ('EMP02', 'Tatiana', 'Vargas', '1');
    INSERT INTO `personal`.`empleados` (`id_empleado`, `nombre`, `apellidos`, `id_departamento`) VALUES ('EMP03', 'Laura', 'Iturria', '3');
    INSERT INTO `personal`.`empleados` (`id_empleado`, `nombre`, `apellidos`, `id_departamento`) VALUES ('EMP04', 'Juan', 'Pérez', '4');
    INSERT INTO `personal`.`empleados` (`id_empleado`, `nombre`, `apellidos`, `id_departamento`) VALUES ('EMP05', 'Iván', 'López', '4');
    INSERT INTO `personal`.`empleados` (`id_empleado`, `nombre`, `apellidos`, `id_departamento`) VALUES ('EMP06', 'Margarita', 'Hernández', '1');
    INSERT INTO `personal`.`empleados` (`id_empleado`, `nombre`, `apellidos`, `id_departamento`) VALUES ('EMP07', 'Jesús', 'Pérez', '3');
    INSERT INTO `personal`.`empleados` (`id_empleado`, `nombre`, `apellidos`, `id_departamento`) VALUES ('EMP08', 'Tonatiuh', 'Flores', '2');
    INSERT INTO `personal`.`empleados` (`id_empleado`, `nombre`, `apellidos`, `id_departamento`) VALUES ('EMP09', 'Juan', 'López', '4');
    INSERT INTO `personal`.`empleados` (`id_empleado`, `nombre`, `apellidos`, `id_departamento`) VALUES ('EMP10', 'José', 'Hernández', '5');

4- Genera las siguientes consultas:
    4.1- obtener nombres y apellidos de los empleados
        select nombre, apellidos from empleados;

    4.2- listar los empleados con apellido Pérez
        select * from empleados where apellidos="Pérez";

    4.3- obtener los nombres de los empleados que trabajan en el departamento 4
        select nombre from empleados where id_departamento=4;

    4.4- traer los datos del departamento cuyo presupuesto está entre $50.000 y $70.000
        select * from departamento where presupuesto between 50000 and 70000;

