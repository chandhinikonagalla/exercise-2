create database pens;
use pens;
create table books(
bookid integer(20),
title varchar(20),
topicid varchar(30),
publisher integer(20),
name varchar(20),
nameofpublication varchar(20),
price integer(20),
purchase integer(20),
shelfnum varchar(20));
insert into books(bookid,title,topicid,publisher,name,nameofpublication,price,purchase,shelfnum) values (8293,'dbms','db1','prenticehall','mumbai',255,'1/1/95','s11');
insert into books(bookid,title,topicid,publisher,name,nameofpublication,price,purchase,shelfnum) values (5645,'dbms','db1','pearson','mumbai',655,'1/05/93','s12');
insert into books(bookid,title,topicid,publisher,name,nameofpublication,price,purchase,shelfnum) values (6565,'c','c1','tmh','mumbai',840,'08/31/98','s66');
insert into books(bookid,title,topicid,publisher,name,nameofpublication,price,purchase,shelfnum) values (6566,'c++','c1','abc','delhi',300,'06/15/97','s87');
select * from books;