-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 14, 2020 at 01:59 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbfilm`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE `anggota` (
  `IDAnggota` varchar(8) NOT NULL,
  `nama` varchar(40) NOT NULL,
  `tempat_lahir` varchar(15) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `jkl` varchar(15) NOT NULL,
  `status` varchar(15) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `telp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`IDAnggota`, `nama`, `tempat_lahir`, `tgl_lahir`, `jkl`, `status`, `alamat`, `telp`) VALUES
('1', 'Rahmad Saipul Anwar', 'Sungai Loban', '2000-04-05', 'Laki - Laki', 'Mahasiswa', 'Jl Perjungan Gg Setia Damai Sei Sipai', '081998376451'),
('2', 'Saipul Anwar', 'Tanah Bumbu', '2000-04-05', 'Laki - Laki', 'Mahasiswa', 'Jl Perjungan Gg Setia Damai Sei Sipai', '081998376451'),
('3', 'Rahmad', 'Tanah Bumbu', '2000-11-05', 'Laki - Laki', 'Mahasiswa', 'Jl Provinsi desa Sungai Loban', '085787887194');

-- --------------------------------------------------------

--
-- Table structure for table `detail_pinjam`
--

CREATE TABLE `detail_pinjam` (
  `no` int(11) NOT NULL,
  `KodeFilm` varchar(5) NOT NULL,
  `IDPinjam` varchar(8) NOT NULL,
  `tgl_pinjam` date NOT NULL,
  `tgl_kembali` date NOT NULL,
  `status` varchar(15) NOT NULL,
  `keterangan` varchar(20) NOT NULL,
  `denda` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detail_pinjam`
--

INSERT INTO `detail_pinjam` (`no`, `KodeFilm`, `IDPinjam`, `tgl_pinjam`, `tgl_kembali`, `status`, `keterangan`, `denda`) VALUES
(0, '123', '', '2020-11-04', '2020-11-04', '0', 'Kembali', 0);

-- --------------------------------------------------------

--
-- Table structure for table `film`
--

CREATE TABLE `film` (
  `KodeFilm` varchar(5) NOT NULL,
  `Judul` varchar(30) NOT NULL,
  `Genre` varchar(20) NOT NULL,
  `Tahun` int(4) NOT NULL,
  `Asal` varchar(15) NOT NULL,
  `Stok` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `film`
--

INSERT INTO `film` (`KodeFilm`, `Judul`, `Genre`, `Tahun`, `Asal`, `Stok`) VALUES
('001', 'Anak Durhaka', 'Crime', 2009, 'Thailand', 1),
('002', 'Mang Oleh', 'Action', 2020, 'Papua Nugini', 2),
('003', 'Gundulan', 'Comedy', 2019, 'Swedia', 5);

-- --------------------------------------------------------

--
-- Table structure for table `pinjam`
--

CREATE TABLE `pinjam` (
  `IDPinjam` varchar(8) NOT NULL,
  `IDAnggota` varchar(8) NOT NULL,
  `TotalDenda` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pinjam`
--

INSERT INTO `pinjam` (`IDPinjam`, `IDAnggota`, `TotalDenda`) VALUES
('123', '213', 0);

-- --------------------------------------------------------

--
-- Stand-in structure for view `view_pinjam`
-- (See below for the actual view)
--
CREATE TABLE `view_pinjam` (
`IDPinjam` varchar(8)
,`IDAnggota` varchar(8)
,`nama` varchar(40)
,`KodeFilm` varchar(5)
,`judul` varchar(30)
,`tgl_pinjam` date
,`tgl_kembali` date
,`status` varchar(15)
,`keterangan` varchar(20)
,`denda` double
);

-- --------------------------------------------------------

--
-- Structure for view `view_pinjam`
--
DROP TABLE IF EXISTS `view_pinjam`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view_pinjam`  AS SELECT DISTINCT `pinjam`.`IDPinjam` AS `IDPinjam`, `pinjam`.`IDAnggota` AS `IDAnggota`, `anggota`.`nama` AS `nama`, `detail_pinjam`.`KodeFilm` AS `KodeFilm`, `film`.`Judul` AS `judul`, `detail_pinjam`.`tgl_pinjam` AS `tgl_pinjam`, `detail_pinjam`.`tgl_kembali` AS `tgl_kembali`, `detail_pinjam`.`status` AS `status`, `detail_pinjam`.`keterangan` AS `keterangan`, `detail_pinjam`.`denda` AS `denda` FROM (((`anggota` join `pinjam` on(`anggota`.`IDAnggota` = `pinjam`.`IDAnggota`)) join `detail_pinjam` on(`detail_pinjam`.`IDPinjam` = `pinjam`.`IDPinjam`)) join `film` on(`film`.`KodeFilm` = `detail_pinjam`.`KodeFilm`)) ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`IDAnggota`);

--
-- Indexes for table `detail_pinjam`
--
ALTER TABLE `detail_pinjam`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `film`
--
ALTER TABLE `film`
  ADD PRIMARY KEY (`KodeFilm`);

--
-- Indexes for table `pinjam`
--
ALTER TABLE `pinjam`
  ADD PRIMARY KEY (`IDPinjam`),
  ADD UNIQUE KEY `IDAnggota` (`IDAnggota`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
