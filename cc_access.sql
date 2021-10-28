-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 28-10-2021 a las 03:03:33
-- Versión del servidor: 8.0.18
-- Versión de PHP: 7.4.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cc_access`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cursos`
--

DROP TABLE IF EXISTS `cursos`;
CREATE TABLE IF NOT EXISTS `cursos` (
  `códigoCurso` varchar(10) NOT NULL,
  `NombreCursos` varchar(3) NOT NULL,
  `Jornada` varchar(10) NOT NULL,
  `idDirectorCurso` int(10) NOT NULL,
  PRIMARY KEY (`códigoCurso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `eventos`
--

DROP TABLE IF EXISTS `eventos`;
CREATE TABLE IF NOT EXISTS `eventos` (
  `idEvento` int(10) NOT NULL,
  `HoraEvento` time NOT NULL,
  `NombreEvento` varchar(45) NOT NULL,
  `FechaEvento` date NOT NULL,
  `LugarEvento` varchar(45) NOT NULL,
  `Descripción` varchar(300) NOT NULL,
  PRIMARY KEY (`idEvento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `loggin`
--

DROP TABLE IF EXISTS `loggin`;
CREATE TABLE IF NOT EXISTS `loggin` (
  `Id_Usuario` int(11) NOT NULL AUTO_INCREMENT,
  `Usuario` varchar(20) NOT NULL,
  `Correo` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `contraseña` varchar(30) NOT NULL,
  `identidad` int(11) NOT NULL,
  PRIMARY KEY (`Id_Usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

DROP TABLE IF EXISTS `materia`;
CREATE TABLE IF NOT EXISTS `materia` (
  `maCodigo` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `maNombre` varchar(35) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `ma_idDocente` int(11) NOT NULL,
  PRIMARY KEY (`maCodigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pqrs`
--

DROP TABLE IF EXISTS `pqrs`;
CREATE TABLE IF NOT EXISTS `pqrs` (
  `idPqrs` int(11) NOT NULL AUTO_INCREMENT,
  `FechaPqrs` date NOT NULL,
  `horaPqrs` time NOT NULL,
  `TipoPqrs` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `PqrsPersona` int(11) NOT NULL,
  `DescripciónPqrs` varchar(300) NOT NULL,
  PRIMARY KEY (`idPqrs`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reg_docente`
--

DROP TABLE IF EXISTS `reg_docente`;
CREATE TABLE IF NOT EXISTS `reg_docente` (
  `idDocente` int(11) NOT NULL,
  `NombreDocente` varchar(45) NOT NULL,
  `ApellidoDocente` varchar(45) NOT NULL,
  `EdadDocente` int(2) NOT NULL,
  `CorreoDocente` varchar(45) NOT NULL,
  `NumIdDocente` int(11) NOT NULL,
  `CelularDocente` int(11) NOT NULL,
  `GeneroDocente` varchar(10) NOT NULL,
  PRIMARY KEY (`idDocente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reg_estudiantes`
--

DROP TABLE IF EXISTS `reg_estudiantes`;
CREATE TABLE IF NOT EXISTS `reg_estudiantes` (
  `nombres` varchar(35) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `Apellido` varchar(35) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `edad` int(2) NOT NULL,
  `Curso` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `numIdentidad` int(11) NOT NULL,
  `nomAcudiente` varchar(35) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `cel_Acudiente` int(11) NOT NULL,
  `genero` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `idEstudiante` int(10) NOT NULL,
  `CorreoEstudiante` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`idEstudiante`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
