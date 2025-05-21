-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 21, 2025 at 07:11 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mini-framework-store`
--

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `guest_name` varchar(255) NOT NULL,
  `guest_phone` int(50) NOT NULL,
  `guest_address` varchar(255) NOT NULL,
  `total` double NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `order_details`
--

CREATE TABLE `order_details` (
  `id` int(11) NOT NULL,
  `order_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `quantity` int(50) NOT NULL,
  `price` double NOT NULL,
  `subtotal` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `price` double NOT NULL,
  `slug` varchar(255) NOT NULL,
  `image_path` varchar(255) NOT NULL,
  `category_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`id`, `name`, `description`, `price`, `slug`, `image_path`, `category_id`, `created_at`, `updated_at`) VALUES
(1, 'TECNO CAMON 40', 'SPECS:\r\nRam: 8/12\r\nRom128/256\r\nProcessor mediatek helio G1000', 19999, 'tecno-camon-40', 'uploads/TECNO-CAMON-40.jpg.webp', 1, '2025-05-15 17:38:24', '2025-05-15 11:38:24'),
(2, 'LENOVO LEGION 5', 'processors like Intel Core i7 or AMD Ryzen 5/7, graphics cards like NVIDIA GeForce RTX 3050 Ti or RTX 4060, and displays with refresh rates up to 165Hz. Storage options include SSDs with PCIe 4.0 NVMe.', 1100, 'lenovo-legion-5', 'uploads/legion5.jpg', 2, '2025-05-15 17:50:23', '2025-05-15 11:50:23'),
(3, 'POTATO FRIES - OISHI', 'Barbeque flavor\r\ncrispy ', 20, 'potato-fries---oishi', 'uploads/potatooishi.jpg', 3, '2025-05-15 17:54:34', '2025-05-15 11:54:34'),
(4, '5x5 MAGNETIC CUBE', 'X-Man Hong 5x5 Magnetic Ball-Core Stickerless UV Coated', 500, '5x5-magnetic-cube', 'uploads/5x5.jpg', 4, '2025-05-15 17:56:29', '2025-05-15 11:56:29'),
(5, 'CAMON 30 5G', 'RAM: 8/12\r\nROM: 128/256\r\nPROCESSOR: mediatek helio g99 ultimate\r\nBATTERY: 5000MHA\r\nVERSION: android 14', 19999, 'camon-30-5g', 'uploads/CAMON305G.jpg', 1, '2025-05-15 18:01:59', '2025-05-15 12:01:59');

-- --------------------------------------------------------

--
-- Table structure for table `product_categories`
--

CREATE TABLE `product_categories` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `product_categories`
--

INSERT INTO `product_categories` (`id`, `name`) VALUES
(1, 'Mobile phone'),
(2, 'Desktop'),
(3, 'Snacks'),
(4, 'Puzzles');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone` int(50) NOT NULL,
  `birthdate` varchar(255) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `email`, `password`, `address`, `phone`, `birthdate`, `created_at`, `updated_at`) VALUES
(1, 'teves', 'teves@gmail.com', '$2y$10$RL6FA0T6Umk7.gSNmCEjQ.CGFC2vuFTWqgY5w2Ig4N9bpGBqIYcj.', '', 0, '2025-05-15', '2025-05-15 17:21:21', '2025-05-15 17:21:21'),
(2, 'romo', 'romo@gmail.com', '$2y$10$oTdGhQtkTYkFOVwjgXb9ku1aQYHJz2M1K8O7JSH6Sd8xzjFsBgRmC', '', 0, '', '2025-05-15 18:38:33', '2025-05-15 18:38:33');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `order_details`
--
ALTER TABLE `order_details`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product_categories`
--
ALTER TABLE `product_categories`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `order_details`
--
ALTER TABLE `order_details`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `product_categories`
--
ALTER TABLE `product_categories`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
