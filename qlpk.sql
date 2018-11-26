-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 26, 2018 at 10:55 AM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qlpk`
--

-- --------------------------------------------------------

--
-- Table structure for table `bangluong`
--

CREATE TABLE `bangluong` (
  `ID` int(10) NOT NULL,
  `NhanVienID` int(10) NOT NULL,
  `PaymentAmount` float NOT NULL,
  `PaymentDate` date DEFAULT NULL,
  `Note` varchar(255) DEFAULT NULL,
  `Week` int(10) NOT NULL,
  `Paid` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `bangluong`
--

INSERT INTO `bangluong` (`ID`, `NhanVienID`, `PaymentAmount`, `PaymentDate`, `Note`, `Week`, `Paid`) VALUES
(1, 1, 5850000, '2018-11-10', 'Tra tien cong tuan 45', 45, b'0');

-- --------------------------------------------------------

--
-- Table structure for table `benhan`
--

CREATE TABLE `benhan` (
  `ID` int(10) NOT NULL,
  `BenhNhanID` int(10) NOT NULL,
  `Resuft` varchar(255) DEFAULT NULL,
  `Note` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `benhnhan`
--

CREATE TABLE `benhnhan` (
  `ID` int(10) NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Age` int(10) NOT NULL,
  `Phone` varchar(255) DEFAULT NULL,
  `Address` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `buong`
--

CREATE TABLE `buong` (
  `ID` int(10) NOT NULL,
  `PhongKhamID` int(10) NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Local` varchar(255) DEFAULT NULL,
  `Type` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `buong`
--

INSERT INTO `buong` (`ID`, `PhongKhamID`, `Name`, `Local`, `Type`) VALUES
(1, 1, 'Phong Kham 01', 'phong 201 - Toa Nha 2A', 'Phong Kham'),
(2, 1, 'Phong Kham 02', 'phong 301 - Toa Nha 2A', 'Phong Kham');

-- --------------------------------------------------------

--
-- Table structure for table `cakham`
--

CREATE TABLE `cakham` (
  `ID` int(10) NOT NULL,
  `NhanVienID` int(10) NOT NULL,
  `BuongID` int(10) NOT NULL,
  `Day` date DEFAULT NULL,
  `Shift` varchar(255) DEFAULT NULL,
  `IsActive` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cakham`
--

INSERT INTO `cakham` (`ID`, `NhanVienID`, `BuongID`, `Day`, `Shift`, `IsActive`) VALUES
(1, 1, 1, '2018-11-05', 'Sang', b'1'),
(2, 1, 1, '2018-11-06', 'Sang', b'1'),
(3, 1, 1, '2018-11-07', 'Chieu', b'1');

-- --------------------------------------------------------

--
-- Table structure for table `calamviec`
--

CREATE TABLE `calamviec` (
  `ID` int(10) NOT NULL,
  `CaKhamID` int(10) NOT NULL,
  `BangLuongID` int(10) NOT NULL,
  `NhanVienID` int(10) NOT NULL,
  `CheckIn` time DEFAULT NULL,
  `CheckOut` time DEFAULT NULL,
  `IsCheckedIn` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `calamviec`
--

INSERT INTO `calamviec` (`ID`, `CaKhamID`, `BangLuongID`, `NhanVienID`, `CheckIn`, `CheckOut`, `IsCheckedIn`) VALUES
(1, 1, 1, 1, '07:33:03', '11:38:00', b'1'),
(2, 2, 1, 1, '08:02:03', '11:40:00', b'1'),
(3, 3, 1, 1, '07:39:09', '11:41:03', b'1');

-- --------------------------------------------------------

--
-- Table structure for table `dangkykham`
--

CREATE TABLE `dangkykham` (
  `ID` int(10) NOT NULL,
  `BenhAnID` int(10) NOT NULL,
  `BuongID` int(10) NOT NULL,
  `IsActive` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `hoadonbenhan`
--

CREATE TABLE `hoadonbenhan` (
  `ID` int(10) NOT NULL,
  `PhongKhamID` int(10) NOT NULL,
  `BenhAnID` int(10) NOT NULL,
  `PaymentDate` date DEFAULT NULL,
  `PaymentAmount` float NOT NULL,
  `PaymentType` varchar(255) DEFAULT NULL,
  `Note` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `ID` int(10) NOT NULL,
  `PhongKhamID` int(10) NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Age` int(10) NOT NULL,
  `Sex` varchar(255) DEFAULT NULL,
  `Level` varchar(255) DEFAULT NULL,
  `Specialize` varchar(255) DEFAULT NULL,
  `Position` varchar(255) DEFAULT NULL,
  `PriceUnit` float NOT NULL,
  `Phone` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`ID`, `PhongKhamID`, `Name`, `Age`, `Sex`, `Level`, `Specialize`, `Position`, `PriceUnit`, `Phone`) VALUES
(1, 1, 'Vu Hoai Nam', 25, 'Nam', 'Dai Hoc', 'Xuong Khop', 'Bac Si', 500000, '0366891060'),
(2, 1, 'Le Minh Minh', 26, 'Nam', 'Dai Hoc', 'Than Kinh', 'Bac Si', 500000, '0366891069'),
(3, 2, 'Hoang Van Huong', 28, 'Nam', 'Dai Hoc', 'Tai Mui Hong', 'bac si', 200000, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `phieuxetnghiem`
--

CREATE TABLE `phieuxetnghiem` (
  `ID` int(10) NOT NULL,
  `BuongID` int(10) NOT NULL,
  `BenhNhanID` int(10) NOT NULL,
  `BenhAnID` int(10) NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Results` varchar(255) DEFAULT NULL,
  `Cost` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `phongkham`
--

CREATE TABLE `phongkham` (
  `ID` int(10) NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Local` varchar(255) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `phongkham`
--

INSERT INTO `phongkham` (`ID`, `Name`, `Local`, `Description`) VALUES
(1, 'Thái Hà', '11 Thái Hà, Trung Liệt, Đống Đa, Hà Nội', 'Phòng Khám Đa Khoa Thái Hà được xây dựng và thành lập bởi ban lãnh đạo có tầm nhìn và đội ngũ y bác sĩ tâm huyết với nghề. '),
(2, 'Bach Mai', 'Ha Noi', 'Benh vien da khoa');

-- --------------------------------------------------------

--
-- Table structure for table `thuoc`
--

CREATE TABLE `thuoc` (
  `ID` int(10) NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  `Code` varchar(255) DEFAULT NULL,
  `Publisher` varchar(255) DEFAULT NULL,
  `PriceUnit` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `thuocsd`
--

CREATE TABLE `thuocsd` (
  `ID` int(10) NOT NULL,
  `BenhAnID` int(10) NOT NULL,
  `ThuocID` int(10) NOT NULL,
  `Amount` int(10) NOT NULL,
  `Total` float NOT NULL,
  `Usege` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `ID` int(10) NOT NULL,
  `Username` varchar(255) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL,
  `Type` int(10) NOT NULL,
  `PhongKhamID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`ID`, `Username`, `Password`, `Type`, `PhongKhamID`) VALUES
(1, 'namvh', '12345', 1, 1),
(2, 'admin', '12345', 2, 1),
(3, 'namkk', '11111', 1, 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bangluong`
--
ALTER TABLE `bangluong`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`),
  ADD UNIQUE KEY `ID_2` (`ID`),
  ADD UNIQUE KEY `ID_3` (`ID`),
  ADD KEY `FKBangLuong756632` (`NhanVienID`);

--
-- Indexes for table `benhan`
--
ALTER TABLE `benhan`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`),
  ADD UNIQUE KEY `ID_2` (`ID`),
  ADD UNIQUE KEY `ID_3` (`ID`),
  ADD KEY `FKBenhAn349100` (`BenhNhanID`);

--
-- Indexes for table `benhnhan`
--
ALTER TABLE `benhnhan`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`),
  ADD UNIQUE KEY `ID_2` (`ID`),
  ADD UNIQUE KEY `ID_3` (`ID`);

--
-- Indexes for table `buong`
--
ALTER TABLE `buong`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`),
  ADD UNIQUE KEY `ID_2` (`ID`),
  ADD UNIQUE KEY `ID_3` (`ID`),
  ADD KEY `FKBuong213073` (`PhongKhamID`);

--
-- Indexes for table `cakham`
--
ALTER TABLE `cakham`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`),
  ADD UNIQUE KEY `ID_2` (`ID`),
  ADD UNIQUE KEY `ID_3` (`ID`),
  ADD KEY `FKCaKham144504` (`BuongID`),
  ADD KEY `FKCaKham884360` (`NhanVienID`);

--
-- Indexes for table `calamviec`
--
ALTER TABLE `calamviec`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`),
  ADD UNIQUE KEY `ID_2` (`ID`),
  ADD UNIQUE KEY `ID_3` (`ID`),
  ADD KEY `FKCaLamViec282255` (`NhanVienID`),
  ADD KEY `FKCaLamViec550425` (`BangLuongID`),
  ADD KEY `FKCaLamViec271502` (`CaKhamID`);

--
-- Indexes for table `dangkykham`
--
ALTER TABLE `dangkykham`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`),
  ADD UNIQUE KEY `ID_2` (`ID`),
  ADD UNIQUE KEY `ID_3` (`ID`),
  ADD KEY `FKDangKyKham212364` (`BuongID`),
  ADD KEY `FKDangKyKham440266` (`BenhAnID`);

--
-- Indexes for table `hoadonbenhan`
--
ALTER TABLE `hoadonbenhan`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`),
  ADD UNIQUE KEY `ID_2` (`ID`),
  ADD UNIQUE KEY `ID_3` (`ID`),
  ADD KEY `FKHoaDonBenh688465` (`BenhAnID`),
  ADD KEY `FKHoaDonBenh883797` (`PhongKhamID`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`),
  ADD UNIQUE KEY `ID_2` (`ID`),
  ADD UNIQUE KEY `ID_3` (`ID`),
  ADD KEY `FKNhanVien125963` (`PhongKhamID`);

--
-- Indexes for table `phieuxetnghiem`
--
ALTER TABLE `phieuxetnghiem`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`),
  ADD UNIQUE KEY `ID_2` (`ID`),
  ADD UNIQUE KEY `ID_3` (`ID`),
  ADD KEY `FKPhieuXetNg949299` (`BenhAnID`),
  ADD KEY `FKPhieuXetNg683670` (`BenhNhanID`),
  ADD KEY `FKPhieuXetNg703330` (`BuongID`);

--
-- Indexes for table `phongkham`
--
ALTER TABLE `phongkham`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`),
  ADD UNIQUE KEY `ID_2` (`ID`),
  ADD UNIQUE KEY `ID_3` (`ID`);

--
-- Indexes for table `thuoc`
--
ALTER TABLE `thuoc`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`),
  ADD UNIQUE KEY `ID_2` (`ID`),
  ADD UNIQUE KEY `ID_3` (`ID`);

--
-- Indexes for table `thuocsd`
--
ALTER TABLE `thuocsd`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`),
  ADD UNIQUE KEY `ID_2` (`ID`),
  ADD UNIQUE KEY `ID_3` (`ID`),
  ADD KEY `FKThuocSD365002` (`ThuocID`),
  ADD KEY `FKThuocSD779474` (`BenhAnID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`),
  ADD UNIQUE KEY `ID_2` (`ID`),
  ADD UNIQUE KEY `ID_3` (`ID`),
  ADD KEY `FKUsers735212` (`PhongKhamID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bangluong`
--
ALTER TABLE `bangluong`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `benhan`
--
ALTER TABLE `benhan`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `benhnhan`
--
ALTER TABLE `benhnhan`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `buong`
--
ALTER TABLE `buong`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `cakham`
--
ALTER TABLE `cakham`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `calamviec`
--
ALTER TABLE `calamviec`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `dangkykham`
--
ALTER TABLE `dangkykham`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `hoadonbenhan`
--
ALTER TABLE `hoadonbenhan`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `nhanvien`
--
ALTER TABLE `nhanvien`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `phieuxetnghiem`
--
ALTER TABLE `phieuxetnghiem`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `phongkham`
--
ALTER TABLE `phongkham`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `thuoc`
--
ALTER TABLE `thuoc`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `thuocsd`
--
ALTER TABLE `thuocsd`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bangluong`
--
ALTER TABLE `bangluong`
  ADD CONSTRAINT `FKBangLuong756632` FOREIGN KEY (`NhanVienID`) REFERENCES `nhanvien` (`ID`);

--
-- Constraints for table `benhan`
--
ALTER TABLE `benhan`
  ADD CONSTRAINT `FKBenhAn349100` FOREIGN KEY (`BenhNhanID`) REFERENCES `benhnhan` (`ID`);

--
-- Constraints for table `buong`
--
ALTER TABLE `buong`
  ADD CONSTRAINT `FKBuong213073` FOREIGN KEY (`PhongKhamID`) REFERENCES `phongkham` (`ID`);

--
-- Constraints for table `cakham`
--
ALTER TABLE `cakham`
  ADD CONSTRAINT `FKCaKham144504` FOREIGN KEY (`BuongID`) REFERENCES `buong` (`ID`),
  ADD CONSTRAINT `FKCaKham884360` FOREIGN KEY (`NhanVienID`) REFERENCES `nhanvien` (`ID`);

--
-- Constraints for table `calamviec`
--
ALTER TABLE `calamviec`
  ADD CONSTRAINT `FKCaLamViec271502` FOREIGN KEY (`CaKhamID`) REFERENCES `cakham` (`ID`),
  ADD CONSTRAINT `FKCaLamViec282255` FOREIGN KEY (`NhanVienID`) REFERENCES `nhanvien` (`ID`),
  ADD CONSTRAINT `FKCaLamViec550425` FOREIGN KEY (`BangLuongID`) REFERENCES `bangluong` (`ID`);

--
-- Constraints for table `dangkykham`
--
ALTER TABLE `dangkykham`
  ADD CONSTRAINT `FKDangKyKham212364` FOREIGN KEY (`BuongID`) REFERENCES `buong` (`ID`),
  ADD CONSTRAINT `FKDangKyKham440266` FOREIGN KEY (`BenhAnID`) REFERENCES `benhan` (`ID`);

--
-- Constraints for table `hoadonbenhan`
--
ALTER TABLE `hoadonbenhan`
  ADD CONSTRAINT `FKHoaDonBenh688465` FOREIGN KEY (`BenhAnID`) REFERENCES `benhan` (`ID`),
  ADD CONSTRAINT `FKHoaDonBenh883797` FOREIGN KEY (`PhongKhamID`) REFERENCES `phongkham` (`ID`);

--
-- Constraints for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `FKNhanVien125963` FOREIGN KEY (`PhongKhamID`) REFERENCES `phongkham` (`ID`);

--
-- Constraints for table `phieuxetnghiem`
--
ALTER TABLE `phieuxetnghiem`
  ADD CONSTRAINT `FKPhieuXetNg683670` FOREIGN KEY (`BenhNhanID`) REFERENCES `benhnhan` (`ID`),
  ADD CONSTRAINT `FKPhieuXetNg703330` FOREIGN KEY (`BuongID`) REFERENCES `buong` (`ID`),
  ADD CONSTRAINT `FKPhieuXetNg949299` FOREIGN KEY (`BenhAnID`) REFERENCES `benhan` (`ID`);

--
-- Constraints for table `thuocsd`
--
ALTER TABLE `thuocsd`
  ADD CONSTRAINT `FKThuocSD365002` FOREIGN KEY (`ThuocID`) REFERENCES `thuoc` (`ID`),
  ADD CONSTRAINT `FKThuocSD779474` FOREIGN KEY (`BenhAnID`) REFERENCES `benhan` (`ID`);

--
-- Constraints for table `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `FKUsers735212` FOREIGN KEY (`PhongKhamID`) REFERENCES `phongkham` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
