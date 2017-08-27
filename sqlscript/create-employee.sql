create database employeedb;
create user 'employeeuser'@'localhost' identified by 'ThePassword';
grant all on db.* to 'employeeuser'@'localhost';
CREATE TABLE `employee` (`id` int(11) NOT NULL AUTO_INCREMENT ,`name` varchar(255) NOT NULL,`dept` varchar(255) NOT NULL, `designation` varchar(255) NOT NULL,`gender` varchar(255) NOT NULL, PRIMARY KEY (`id`)) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;
use employee;