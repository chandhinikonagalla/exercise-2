create database coll;
use coll;
create table pr(
empno integer(52),
lastname varchar(20),
firstname varchar(20),
hiredate date,
language varchar(20),
taskno varchar(15),
previlige integer(20),
projectid varchar(50));
insert into pr(empno,lastname,firstname,hiredate,language,taskno,previlige,projectid) values (201,'guptha','saurav','1995/01/01','npr','vb',52,'secret');
insert into pr(empno,lastname,firstname,hiredate,language,taskno,previlige,projectid) values (390,'ghosh','pinky','1993/05/01','kcw','java',11,'topsecret');
insert into pr(empno,lastname,firstname,hiredate,language,taskno,previlige,projectid) values (789,'agarval','praveen','1998/08/31','rnc','vb',11,'secret');
insert into pr(empno,lastname,firstname,hiredate,language,taskno,previlige,projectid) values (134,'chaudary','supriya','1995/07/15','tipps','c++',52,'secret');
insert into pr(empno,lastname,firstname,hiredate,language,taskno,previlige,projectid) values (896,'jah','ranjith','1998/08/31','kcv','java',10,'secret');
insert into pr(empno,lastname,firstname,hiredate,language,taskno,previlige,projectid) values (345,'john','peter','1995/11/15','java','vb',92,'topsecret');
insert into pr(empno,lastname,firstname,hiredate,language,taskno,previlige,projectid) values (563,'andron','andy','1994/08/15','nits','c++',89,'confidential');
select * from  pr;
