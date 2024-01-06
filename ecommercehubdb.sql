
--
-- Host: 127.0.0.1
-- Generation Time: Dec 30, 2023 at 10:41 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";

--
-- Database: `ecommercehubdb`
--
CREATE DATABASE IF NOT EXISTS `ecommercehubdb` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `ecommercehubdb`;

-- --------------------------------------------------------


  `CategoryName` varchar(50) NOT NULL,
  `Description` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `invoice`
--

CREATE TABLE `invoice` (
  `InvoiceID` int(11) NOT NULL,
  `OrderID` int(11) NOT NULL,
  `TotalAmount` decimal(50,0) NOT NULL,
  `DueDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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

  `TotalAmount` float NOT NULL,
  `Status` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `PaymentID` int(11) NOT NULL,
  `OrderID` int(11) NOT NULL,
  `PaymentAmount` decimal(50,0) NOT NULL,
  `PaymentDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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

  `StockQuantity` int(11) NOT NULL,
  `Description` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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

  `Password` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `UserType` varchar(45) NOT NULL,
  `OrderID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`UserID`, `Username`, `Password`, `Email`, `UserType`, `OrderID`) VALUES
(1, 'laraib', 'lmmhh', 'laraib@gmail.com', 'regular', 5),
(2, 'lara', 'gjuuji9', 'lara@', 'regular', 4);

-- --------------------------------------------------------

--
-- Table structure for table `warehouse`
--

CREATE TABLE `warehouse` (
  `WarehouseID` int(11) NOT NULL,
  `Location` varchar(100) NOT NULL,
  `ProductID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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

  ADD PRIMARY KEY (`CategoryID`);

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


  MODIFY `CategoryID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `invoice`
--
ALTER TABLE `invoice`
  MODIFY `InvoiceID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `OrderID` int(11) NOT NULL AUTO_INCREMENT;

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
  MODIFY `UserID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `warehouse`
--
ALTER TABLE `warehouse`
  MODIFY `WarehouseID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

