-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 20, 2022 at 05:41 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `libreria_ventas`
--

-- --------------------------------------------------------

--
-- Table structure for table `vcomprador`
--

CREATE TABLE `vcomprador` (
  `codigo_v` int(11) NOT NULL,
  `nombre_v` varchar(50) DEFAULT NULL,
  `apellidos_v` varchar(100) DEFAULT NULL,
  `dni_v` varchar(9) DEFAULT NULL,
  `fecha_nacimiento_v` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `vlibro`
--

CREATE TABLE `vlibro` (
  `codigo` int(11) NOT NULL,
  `nombre_l` varchar(200) DEFAULT NULL,
  `autor_l` varchar(150) DEFAULT NULL,
  `aniopub_l` varchar(5) DEFAULT NULL,
  `volumen_l` varchar(3) DEFAULT NULL,
  `edicion_l` varchar(2) DEFAULT NULL,
  `descripcion_l` varchar(200) DEFAULT NULL,
  `precio_l` float NOT NULL,
  `imagen_link` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `vusuario`
--

CREATE TABLE `vusuario` (
  `codigo_u` int(11) NOT NULL,
  `nombre_u` varchar(50) DEFAULT NULL,
  `apellidos_u` varchar(100) DEFAULT NULL,
  `dni_u` varchar(9) DEFAULT NULL,
  `fecha_nacimiento_u` varchar(10) DEFAULT NULL,
  `usuario_u` varchar(20) DEFAULT NULL,
  `password_u` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `vcomprador`
--
ALTER TABLE `vcomprador`
  ADD PRIMARY KEY (`codigo_v`);

--
-- Indexes for table `vlibro`
--
ALTER TABLE `vlibro`
  ADD PRIMARY KEY (`codigo`);

--
-- Indexes for table `vusuario`
--
ALTER TABLE `vusuario`
  ADD PRIMARY KEY (`codigo_u`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `vcomprador`
--
ALTER TABLE `vcomprador`
  MODIFY `codigo_v` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `vlibro`
--
ALTER TABLE `vlibro`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `vusuario`
--
ALTER TABLE `vusuario`
  MODIFY `codigo_u` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
