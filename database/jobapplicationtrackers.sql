-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 21, 2025 at 06:06 PM
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
(1, 'sadasd', 'asdasdas', 'dasdasdas', 2222, 'asdasdasdas', 'Incomplete', '', 1),
(2, 'asdasd', 'adsadasd', 'asdasd@gmail.com', 22121, 'assdasdasdass', 'Incomplete', '', 1),
(5, 'jiggy', 'getuaban', 'jiggygetuaban@gmail.com', 3333, 'dfsdfsfs', 'Completed', '', 1),
(6, 'xzczxc', 'zxczxczx', 'zxcxzczxc', 111111, 'zxczxczxc', 'Incomplete', 'src/images/Screenshot (79).png', 1),
(7, 'sadasd', 'asdasdas', 'dasdas@gmail.com', 21312312, 'dasdasdasd', 'Incomplete', '', 1);

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
(6, 1, 5, 6, '2025-05-20T21:55:04.526', 'Approved');

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
(5, 'fdsdfs', 'fsdfsdfsd', 'Available', 1),
(6, 'hr manager', 'fsdfsa', 'Available', 1);

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
(7, 'Added job application with ID No.: 5', '2025-05-18 23:22:46', 1),
(8, 'Created user account ID: 4', '2025-05-19 19:52:50', 1),
(9, 'Created user account ID: 5', '2025-05-19 19:54:51', 1),
(10, 'Added applicant with ID: 6', '2025-05-19 20:01:09', 1),
(11, 'Deleted application with ID No.: 5', '2025-05-19 20:02:46', 1),
(12, 'Deleted application with ID No.: 2', '2025-05-19 20:02:55', 1),
(13, 'Deleted application with ID No.: 1', '2025-05-19 20:03:03', 1),
(14, 'Added applicant with ID: 7', '2025-05-19 20:20:19', 1),
(15, 'Updated applicant with ID No.: 2', '2025-05-19 20:23:28', 1),
(16, 'Updated their account with ID No.: 1', '2025-05-19 21:35:57', 1),
(17, 'Updated their account with ID No.: 1', '2025-05-20 20:28:33', 1),
(18, 'Updated their account with ID No.: 1', '2025-05-20 20:30:54', 1),
(19, 'Created user account ID: 9', '2025-05-20 20:36:30', 1),
(20, 'Created user account ID: 10', '2025-05-20 21:05:52', 1),
(21, 'Updated user with ID No.: 7', '2025-05-20 21:06:28', 1),
(22, 'Updated their account with ID No.: 1', '2025-05-20 21:09:33', 1),
(23, 'Added job with ID: 6', '2025-05-20 21:54:48', 1),
(24, 'Added job application with ID No.: 6', '2025-05-20 21:55:06', 1),
(25, 'Updated application with ID No.: 6', '2025-05-20 22:05:59', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_recovery`
--

CREATE TABLE `tbl_recovery` (
  `r_id` int(10) NOT NULL,
  `uid` int(11) NOT NULL,
  `r_answer1` varchar(255) NOT NULL,
  `r_answer2` varchar(255) NOT NULL,
  `r_answer3` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_recovery`
--

INSERT INTO `tbl_recovery` (`r_id`, `uid`, `r_answer1`, `r_answer2`, `r_answer3`) VALUES
(1, 1, 'Caq82Fnkpy+SIw4H5voUoYSK8vmNTQ6F8Y6kppcRViE=', '0jNjPZUk6Exx1v5F6zg2+JGRSOSl/CI0zJ5klOwPEcI=', 'iojDJA62T/fJJ/5x2FxJCU9vJ63KZ7F2stAqmwfot0U=');

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
(1, 'jiggyy', 'getuaban', 'jiggy', 'jiggy@gmail.com', 'BU47MIcINw6gKdwuvRZGxJjVnXIDyeGkTPBITfmOWBo=', 'Active', 'Admin', 'src/images/gojo.jpg'),
(3, 'getuaban', 'dsadasdas', 'getuaban', 'sadasdsad', '	\nBU47MIcINw6gKdwuvRZGxJjVnXIDyeGkTPBITfmOWBo=', 'Active', 'User', ''),
(4, 'sdfsdf', 'sdfsdfsd', '222222', 'fsdfsdfsd', '	\nBU47MIcINw6gKdwuvRZGxJjVnXIDyeGkTPBITfmOWBo=', 'Active', 'Admin', ''),
(5, 'dasdas', 'dasdas', 'dasdsdad', 'asdas', '	\nBU47MIcINw6gKdwuvRZGxJjVnXIDyeGkTPBITfmOWBo=', 'Active', 'Admin', 'src/images/Screenshot (79).png'),
(6, 'getuaban', 'jiggy', 'getuabann', 'werwerwe', 'BU47MIcINw6gKdwuvRZGxJjVnXIDyeGkTPBITfmOWBo=', 'Inactive', 'Admin', ' '),
(7, 'asdas', 'asdasdas', 'asdasdas', 'asdasda@gmail.com', 'aktJZ5FsTp18HNfTeZfBHTwihT5j1DWw5t16UBse5oU=', 'Active', 'Admin', 'src/images/Screenshot (79).png'),
(8, 'FSFSDF', 'SDFSDFS', 'FSFDSFSD', 'FDSFSD@gmail.com', 'fLw0iPTLtxARVNh3/C/7KVfx9aXutrPuP0RM/xeITpQ=', 'Inactive', 'Admin', ' '),
(9, 'fsdfsd', 'fsdfsd', 'dsfaasf', 'sdfs@gmail.com', '7a27be56ce8837e712d08d66f821e22ba633227577915e98c572616a4669fa43', 'Pending', 'User', 'src/images/Screenshot (80).png'),
(10, 'qweqw', 'qwewqe', 'qweqwe', 'qweqw@gmail.com', '7408962cfe991fd9f74b22c56ed8899375ab86a5e48998aac491c6eb2de82d62', 'Active', 'Admin', 'src/images/Screenshot (80).png');

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
-- Indexes for table `tbl_recovery`
--
ALTER TABLE `tbl_recovery`
  ADD PRIMARY KEY (`r_id`),
  ADD KEY `uid` (`uid`);

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
  MODIFY `a_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tbl_applications`
--
ALTER TABLE `tbl_applications`
  MODIFY `app_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tbl_jobs`
--
ALTER TABLE `tbl_jobs`
  MODIFY `j_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  MODIFY `l_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `tbl_recovery`
--
ALTER TABLE `tbl_recovery`
  MODIFY `r_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tbl_users`
--
ALTER TABLE `tbl_users`
  MODIFY `u_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

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

--
-- Constraints for table `tbl_recovery`
--
ALTER TABLE `tbl_recovery`
  ADD CONSTRAINT `tbl_recovery_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `tbl_users` (`u_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
