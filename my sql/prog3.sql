create database chand;
use chand;
create table weathe(
city varchar(20),
state varchar(20),
high integer(30),
low integer(20));
insert into weathe(city,state,high,low) values ('calcutta','westbengal',105,90);
insert into weathe(city,state,high,low) values ('trivendram','kerala',101,92);
insert into weathe(city,state,high,low) values ('mumbai','maharashtra',88,69);
insert into weathe(city,state,high,low) values ('bangalore','karnataka',88,60);
select * from weathe;
