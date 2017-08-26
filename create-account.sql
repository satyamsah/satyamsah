create database db;
create user 'springuser'@'localhost' identified by 'ThePassword';
account grant all on db.* to 'springuser'@'localhost';