create database employee;
create user 'employeeuser'@'localhost' identified by 'ThePassword';
account grant all on db.* to 'employeeuser'@'localhost';
use employee;