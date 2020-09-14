
use candi;
create table worldc(
city varchar(50),
country varchar(50),
continent varchar(50),
latitude float(50),
Northsouth varchar(50),
longitude float(50),
Eastwest varchar(50));
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Athens','Greece','Europe',37.59,'N',23.44,'E');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Atlanta','UnitedStates','NorthAmerica',33.45,'N',84.23,'W');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Dallas','UnitedStates','NorthAmerica',32.47,'N',96.47,'W');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Nashville','UnitedStates','NorthAmerica',36.09,'N',86.46,'W');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Victoria','Canada','NorthAmerica',48.25,'N',123.21,'W');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('peterboroguh','Canada','NorthAmerica',44.18,'N',79.18,'W');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Vancouver','Canada','Northamerica',49.18,'N',123.04,'W');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Toledo','UnitedStates','Northamerica',41.39,'N',83.82,'W');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Warsaw','Poland','Europe',52.15,'N',21.00,'E');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Lima','Peru','Southamerica',12.03,'S',77.03,'W');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Rio de janeiro','Brazil','Southamerica',22.43,'S',43.13,'W');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Santiago','Chile','Southamerica',37.59,'S',70.40,'W');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Bogoto','Columbia','Southamerica',37.59,'N',74.05,'W');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Buenos Aires','Argentina','Southamerica',34.36,'S',58.28,'W');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Quito','Ecuador','Southamerica',37.59,'S',78.30,'W');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Caracas','Venezuela','Southamerica',10.30,'N',66.56,'W');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Madras','India','Asia',28.36,'N',77.12,'E');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Bombay','India','Asia',18.58,'N',72.50,'E');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Manchester','England','Europe',51.30,'N',0.0,'NULL');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Moscow','Russia','Europe',55.45,'N',37.35,'E');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Paris','France','Europe',48.52,'N',2.20,'E');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Shenyang','China','Asia',41.48,'N',123.27,'E');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Cairo','Egypt','Africa',30.03,'N',31.15,'E');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Tripoli','Lybia','Africa',32.54,'N',13.11,'E');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Beijing','China','Asia',39.56,'N',116.24,'E');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Rome','Italy','Europe',41.54,'N',12.29,'E');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Tokyo','Japan','Asia',35.42,'N',139.44,'E');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Sydney','Australia','Australia',33.52,'S',151.13,'E');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Sparta','Greece','Europe',37.05,'N',22.27,'E');
insert into worldc(city,country,continent,latitude,NorthSouth,longitude,Eastwest) values('Madrid','Spain','Europe',40.24,'N',3.41,'W');
select * from worldc;
select continent,country from worldc order by country;
SELECT DISTINCT Country FROM worldc;
select city,country from worldc WHERE COUNTRY LIKE 'R%';
select city,country from worldc WHERE COUNTRY LIKE '%A';
select city,country from worldc where country like 'm         %a';
select city,country from worldc where city like '_A%';
