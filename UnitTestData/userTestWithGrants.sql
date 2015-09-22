DROP USER wucheng;
CREATE USER wucheng IDENTIFIED BY '123456';
drop database testSQLtest;
create database testSQLtest;
use testSQLtest;
create table testSQLtest.student(id int,name varchar(30),age int,sex int,num varchar(15));
GRANT select ON student TO wucheng;