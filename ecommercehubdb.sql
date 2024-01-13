-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 13, 2024 at 05:52 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ecommercehubdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `accounts`
--

CREATE TABLE `accounts` (
  `AccountID` int(11) NOT NULL,
  `CustomerID` varchar(50) NOT NULL,
  `AccountCreationDate` date NOT NULL,
  `PaymentMethod` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `accounts`
--

INSERT INTO `accounts` (`AccountID`, `CustomerID`, `AccountCreationDate`, `PaymentMethod`) VALUES
(1, 'c1', '2017-09-20', 'cash '),
(2, 'c2', '2019-05-24', 'card'),
(3, 'c4', '2020-12-09', 'card'),
(4, 'c5', '2018-08-14', 'cash '),
(5, 'c3', '2019-03-12', 'cash ');

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE `categories` (
  `CategoryID` int(11) NOT NULL,
  `CategoryName` varchar(50) NOT NULL,
  `Description` varchar(50) NOT NULL,
  `StockID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `categories`
--

INSERT INTO `categories` (`CategoryID`, `CategoryName`, `Description`, `StockID`) VALUES
(1, 'Man', 'large,medium,small', 5),
(2, 'Woman', 'large,medium,small', 3),
(3, 'Kids', 'large,medium,small', 2);

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `CustomerID` varchar(50) NOT NULL,
  `FirstName` varchar(50) NOT NULL,
  `LastName` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `PhoneNumber` int(11) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Gender` varchar(50) NOT NULL,
  `Status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`CustomerID`, `FirstName`, `LastName`, `Email`, `PhoneNumber`, `Address`, `Gender`, `Status`) VALUES
('c1', 'Areeba', 'Khalid', 'Areeba12@gmail.com', 333123456, 'House 123 shah faisal colony', 'Female', 'Active'),
('c2', 'Maham', 'Arif', 'Maham@gmail.com', 314253664, 'House 113 shahrah-e-faisal', 'Female', 'Inactive'),
('c3', 'Khalid', 'Waheed', 'Khalid02@gmail.com', 332735466, 'House 456 jauhar', 'Male', 'Active'),
('c4', 'Areeba', 'Hanif', 'AreebaHanif1@gmail.com', 332763581, 'House 788 malir', 'Female', 'Active'),
('c5', 'Hassan', 'Majid', 'Hassan55@gmail.com', 332756488, 'House 654 tariq road', 'Male', 'Inactive');

-- --------------------------------------------------------

--
-- Table structure for table `invoice`
--

CREATE TABLE `invoice` (
  `InvoiceID` int(11) NOT NULL,
  `OrderID` int(11) NOT NULL,
  `TotalAmount` decimal(50,0) NOT NULL,
  `DueDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `invoice`
--

INSERT INTO `invoice` (`InvoiceID`, `OrderID`, `TotalAmount`, `DueDate`) VALUES
(1, 1, '5000', '2023-12-12'),
(2, 3, '3000', '2023-12-16'),
(3, 2, '1500', '2023-12-12'),
(4, 5, '2000', '2023-12-17'),
(5, 4, '1000', '2023-12-18');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `OrderID` int(11) NOT NULL,
  `OrderDate` date NOT NULL,
  `TotalAmount` float NOT NULL,
  `Status` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`OrderID`, `OrderDate`, `TotalAmount`, `Status`) VALUES
(1, '2023-10-15', 1000, 'Shipped'),
(2, '2023-01-12', 5000, 'Pending'),
(3, '2021-11-12', 4000, 'Shipped'),
(4, '2023-01-12', 4000, 'Shipped'),
(5, '2022-10-12', 600, 'Pending');

-- --------------------------------------------------------

--
-- Table structure for table `order_items`
--

CREATE TABLE `order_items` (
  `OrderItemID` int(11) NOT NULL,
  `OrderID` int(11) NOT NULL,
  `ProductID` int(11) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `SubTotal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `order_items`
--

INSERT INTO `order_items` (`OrderItemID`, `OrderID`, `ProductID`, `Quantity`, `SubTotal`) VALUES
(1, 1, 1, 3, 1000),
(2, 2, 2, 4, 600),
(3, 3, 3, 5, 5000);

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `PaymentID` int(11) NOT NULL,
  `OrderID` int(11) NOT NULL,
  `PaymentAmount` decimal(50,0) NOT NULL,
  `PaymentDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`PaymentID`, `OrderID`, `PaymentAmount`, `PaymentDate`) VALUES
(1, 3, '3000', '2023-12-11'),
(2, 1, '5000', '2023-12-30'),
(3, 2, '1500', '2023-12-27'),
(4, 5, '2000', '2023-12-17'),
(5, 4, '1000', '2023-12-29');

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `ProductID` int(11) NOT NULL,
  `ProductName` varchar(45) NOT NULL,
  `Price` float NOT NULL,
  `StockQuantity` int(11) NOT NULL,
  `Description` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`ProductID`, `ProductName`, `Price`, `StockQuantity`, `Description`) VALUES
(1, 'shirt', 500, 30, 'large,medium,small'),
(2, 'skirt', 3000, 53, 'large,medium,small'),
(3, 'jeans', 1000, 44, 'large,medium,small');

-- --------------------------------------------------------

--
-- Table structure for table `productstock`
--

CREATE TABLE `productstock` (
  `ProductID` int(11) NOT NULL,
  `StockID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `productstock`
--

INSERT INTO `productstock` (`ProductID`, `StockID`) VALUES
(1, 5),
(2, 3),
(3, 2),
(4, 1),
(5, 4),
(6, 1);

-- --------------------------------------------------------

--
-- Table structure for table `shipment`
--

CREATE TABLE `shipment` (
  `ShipmentID` int(11) NOT NULL,
  `OrderID` int(11) NOT NULL,
  `ShipmentStatus` varchar(50) NOT NULL,
  `DeliveryAddress` varchar(260) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `shipment`
--

INSERT INTO `shipment` (`ShipmentID`, `OrderID`, `ShipmentStatus`, `DeliveryAddress`) VALUES
(1, 5, 'processing', 'house no 1770/6788 sector 7d street 6 near ruby shop karachi'),
(2, 4, 'shipped', 'house no 1770/6788 sector 7d street 4 near ruby shop lahore'),
(3, 3, 'shipped', 'house no 1770/6118 sector 19d street 9 near lal kothi lahore'),
(4, 2, 'processing', 'house no 1770/6788 sector 7d street 4 near ruby shop lahore'),
(5, 1, 'processing', 'house no 1270/6788 sector 4d street 4near naz plaza karachi');

-- --------------------------------------------------------

--
-- Table structure for table `shiporder`
--

CREATE TABLE `shiporder` (
  `ShipmentID` int(11) NOT NULL,
  `OrderID` int(11) NOT NULL,
  `PaymentID` int(11) NOT NULL,
  `InvoiceID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `shiporder`
--

INSERT INTO `shiporder` (`ShipmentID`, `OrderID`, `PaymentID`, `InvoiceID`) VALUES
(1, 5, 4, 4),
(2, 4, 5, 5),
(3, 3, 1, 2),
(4, 2, 3, 3),
(5, 1, 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `stock`
--

CREATE TABLE `stock` (
  `StockID` int(11) NOT NULL,
  `ProductID` int(11) NOT NULL,
  `WarehouseID` int(11) NOT NULL,
  `Quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `stock`
--

INSERT INTO `stock` (`StockID`, `ProductID`, `WarehouseID`, `Quantity`) VALUES
(1, 4, 3, 6),
(2, 3, 4, 6),
(3, 2, 5, 3),
(4, 5, 1, 7),
(5, 1, 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `UserID` int(11) NOT NULL,
  `Username` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `UserType` varchar(45) NOT NULL,
  `OrderID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`UserID`, `Username`, `Password`, `Email`, `UserType`, `OrderID`) VALUES
(1, 'Areeba Hanif', '54321', 'areeba.hanif222@gmail.com', 'Customer', 2),
(2, 'Areeba', 'reeb123', 'areeba222@gmail.com', 'Customer', 1),
(3, 'Admin', 'admin123', 'admin@gmail.com', 'Admin', 4);

-- --------------------------------------------------------

--
-- Table structure for table `warehouse`
--

CREATE TABLE `warehouse` (
  `WarehouseID` int(11) NOT NULL,
  `Location` varchar(100) NOT NULL,
  `ProductID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `warehouse`
--

INSERT INTO `warehouse` (`WarehouseID`, `Location`, `ProductID`) VALUES
(1, 'block d, street 5 near mashaallah hotal karachi', 5),
(2, 'block f 105, street 9 near manson karachi', 1),
(3, 'block f 1505, street 8 near manson lahore', 4),
(4, 'block a 1505, street 8 near manson lahore', 3),
(5, 'block f 105, street 9 near maju karachi', 2),
(6, 'block f 105, street 9 near manson karachi', 1);

-- --------------------------------------------------------

--
-- Table structure for table `warehousestock`
--

CREATE TABLE `warehousestock` (
  `StockID` int(11) NOT NULL,
  `WarehouseID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `warehousestock`
--

INSERT INTO `warehousestock` (`StockID`, `WarehouseID`) VALUES
(1, 3),
(2, 4),
(3, 5),
(4, 1),
(5, 2),
(6, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `accounts`
--
ALTER TABLE `accounts`
  ADD PRIMARY KEY (`AccountID`),
  ADD KEY `CustomerID` (`CustomerID`);

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`CategoryID`);

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`CustomerID`),
  ADD UNIQUE KEY `PhoneNumber` (`PhoneNumber`);

--
-- Indexes for table `invoice`
--
ALTER TABLE `invoice`
  ADD PRIMARY KEY (`InvoiceID`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`OrderID`);

--
-- Indexes for table `order_items`
--
ALTER TABLE `order_items`
  ADD PRIMARY KEY (`OrderItemID`),
  ADD KEY `OrderID_FK_1` (`OrderID`),
  ADD KEY `products_FK_1` (`ProductID`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`PaymentID`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`ProductID`);

--
-- Indexes for table `shipment`
--
ALTER TABLE `shipment`
  ADD PRIMARY KEY (`ShipmentID`);

--
-- Indexes for table `shiporder`
--
ALTER TABLE `shiporder`
  ADD UNIQUE KEY `ShipmentID` (`ShipmentID`);

--
-- Indexes for table `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`StockID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`UserID`);

--
-- Indexes for table `warehouse`
--
ALTER TABLE `warehouse`
  ADD PRIMARY KEY (`WarehouseID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `categories`
--
ALTER TABLE `categories`
  MODIFY `CategoryID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `invoice`
--
ALTER TABLE `invoice`
  MODIFY `InvoiceID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `OrderID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `PaymentID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `ProductID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `shipment`
--
ALTER TABLE `shipment`
  MODIFY `ShipmentID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `stock`
--
ALTER TABLE `stock`
  MODIFY `StockID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `UserID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `warehouse`
--
ALTER TABLE `warehouse`
  MODIFY `WarehouseID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `accounts`
--
ALTER TABLE `accounts`
  ADD CONSTRAINT `accounts_ibfk_1` FOREIGN KEY (`CustomerID`) REFERENCES `customers` (`CustomerID`);

--
-- Constraints for table `order_items`
--
ALTER TABLE `order_items`
  ADD CONSTRAINT `OrderID_FK_1` FOREIGN KEY (`OrderID`) REFERENCES `orders` (`OrderID`),
  ADD CONSTRAINT `products_FK_1` FOREIGN KEY (`ProductID`) REFERENCES `products` (`ProductID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
