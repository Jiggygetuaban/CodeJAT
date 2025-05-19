-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 19, 2025 at 08:29 AM
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
-- Database: `jobapplicationtrackers`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_applicants`
--

CREATE TABLE `tbl_applicants` (
  `a_id` int(10) NOT NULL,
  `a_fname` varchar(255) NOT NULL,
  `a_lname` varchar(255) NOT NULL,
  `a_email` varchar(255) NOT NULL,
  `a_contact` int(11) NOT NULL,
  `a_address` varchar(255) NOT NULL,
  `a_status` varchar(255) NOT NULL,
  `a_image` varchar(255) NOT NULL,
  `u_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_applicants`
--

INSERT INTO `tbl_applicants` (`a_id`, `a_fname`, `a_lname`, `a_email`, `a_contact`, `a_address`, `a_status`, `a_image`, `u_id`) VALUES
(1, 'sadasd', 'asdasdas', 'dasdasdas', 2222, 'asdasdasdas', 'Completed', '', 1),
(2, 'asdasd', 'adsadasd', 'adsadas', 22121, 'assdasdasdass', 'Completed', '', 1),
(5, 'jiggy', 'getuaban', 'jiggygetuaban@gmail.com', 3333, 'dfsdfsfs', 'Completed', '', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_applications`
--

CREATE TABLE `tbl_applications` (
  `app_id` int(10) NOT NULL,
  `app_uid` int(10) NOT NULL,
  `app_aid` int(10) NOT NULL,
  `app_jid` int(10) NOT NULL,
  `date` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_applications`
--

INSERT INTO `tbl_applications` (`app_id`, `app_uid`, `app_aid`, `app_jid`, `date`, `status`) VALUES
(1, 1, 2, 2, '2025-05-18T15:22:49.500', 'Approved'),
(2, 1, 1, 1, '2025-05-18T19:17:31.055', 'Pending'),
(5, 1, 5, 5, '2025-05-18T23:22:45.173', 'Pending');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_jobs`
--

CREATE TABLE `tbl_jobs` (
  `j_id` int(10) NOT NULL,
  `j_name` varchar(255) NOT NULL,
  `j_description` varchar(255) NOT NULL,
  `j_status` varchar(255) NOT NULL,
  `u_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_jobs`
--

INSERT INTO `tbl_jobs` (`j_id`, `j_name`, `j_description`, `j_status`, `u_id`) VALUES
(1, 'dasdssas', 'dasdasdasd', 'Available', 1),
(2, 'fsdfsd', 'sdfsdfsdfsd', 'Available', 1),
(4, 'it support', 'dfasfsdf', 'Available', 1),
(5, 'fdsdfs', 'fsdfsdfsd', 'Available', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_logs`
--

CREATE TABLE `tbl_logs` (
  `l_id` int(10) NOT NULL,
  `action` varchar(255) NOT NULL,
  `date` datetime NOT NULL,
  `user_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_logs`
--

INSERT INTO `tbl_logs` (`l_id`, `action`, `date`, `user_id`) VALUES
(1, 'Added job application with ID No.: 1', '2025-05-18 15:22:51', 1),
(2, 'Added job application with ID No.: 2', '2025-05-18 19:17:32', 1),
(3, 'Added job application with ID No.: 3', '2025-05-18 22:11:49', 1),
(4, 'Added job application with ID No.: 4', '2025-05-18 22:15:19', 1),
(5, 'Created user account ID: 3', '2025-05-18 23:10:38', 1),
(6, 'Created user account ID: 5', '2025-05-18 23:10:59', 1),
(7, 'Added job application with ID No.: 5', '2025-05-18 23:22:46', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_users`
--

CREATE TABLE `tbl_users` (
  `u_id` int(10) NOT NULL,
  `u_fname` varchar(255) NOT NULL,
  `u_lname` varchar(255) NOT NULL,
  `u_username` varchar(255) NOT NULL,
  `u_email` varchar(255) NOT NULL,
  `u_password` varchar(255) NOT NULL,
  `u_status` varchar(255) NOT NULL,
  `u_role` varchar(255) NOT NULL,
  `u_image` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_users`
--

INSERT INTO `tbl_users` (`u_id`, `u_fname`, `u_lname`, `u_username`, `u_email`, `u_password`, `u_status`, `u_role`, `u_image`) VALUES
(1, 'jiggy', 'getuaban', 'jiggy', 'jiggy@gmail.com', '15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225', 'Active', 'Admin', ''),
(3, 'dsadas', 'dsadasdas', 'sdasdasd', 'sadasdsad', '2313123213', 'Active', 'Admin', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_applicants`
--
ALTER TABLE `tbl_applicants`
  ADD PRIMARY KEY (`a_id`),
  ADD KEY `uid` (`u_id`);

--
-- Indexes for table `tbl_applications`
--
ALTER TABLE `tbl_applications`
  ADD PRIMARY KEY (`app_id`),
  ADD KEY `app_uid` (`app_uid`),
  ADD KEY `app_aid` (`app_aid`),
  ADD KEY `app_jid` (`app_jid`);

--
-- Indexes for table `tbl_jobs`
--
ALTER TABLE `tbl_jobs`
  ADD PRIMARY KEY (`j_id`),
  ADD KEY `u_id` (`u_id`);

--
-- Indexes for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  ADD PRIMARY KEY (`l_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `tbl_users`
--
ALTER TABLE `tbl_users`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_applicants`
--
ALTER TABLE `tbl_applicants`
  MODIFY `a_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbl_applications`
--
ALTER TABLE `tbl_applications`
  MODIFY `app_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbl_jobs`
--
ALTER TABLE `tbl_jobs`
  MODIFY `j_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  MODIFY `l_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tbl_users`
--
ALTER TABLE `tbl_users`
  MODIFY `u_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_applicants`
--
ALTER TABLE `tbl_applicants`
  ADD CONSTRAINT `uid` FOREIGN KEY (`u_id`) REFERENCES `tbl_users` (`u_id`);

--
-- Constraints for table `tbl_applications`
--
ALTER TABLE `tbl_applications`
  ADD CONSTRAINT `tbl_applications_ibfk_1` FOREIGN KEY (`app_uid`) REFERENCES `tbl_users` (`u_id`),
  ADD CONSTRAINT `tbl_applications_ibfk_2` FOREIGN KEY (`app_aid`) REFERENCES `tbl_applicants` (`a_id`),
  ADD CONSTRAINT `tbl_applications_ibfk_3` FOREIGN KEY (`app_jid`) REFERENCES `tbl_jobs` (`j_id`);

--
-- Constraints for table `tbl_jobs`
--
ALTER TABLE `tbl_jobs`
  ADD CONSTRAINT `tbl_jobs_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `tbl_users` (`u_id`);

--
-- Constraints for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  ADD CONSTRAINT `tbl_logs_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `tbl_users` (`u_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
