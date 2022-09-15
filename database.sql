-- create database emp;
use emp;

create table employee (
id int not null unique primary key,
fname varchar(100) not null,
lname varchar(100) not null
);

insert into employee (id, fname, lname) values (1, "test", "test");

select * from employee;
