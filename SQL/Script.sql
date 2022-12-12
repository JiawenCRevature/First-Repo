-- dbeaver is currently set to send all queries I write to the public schema in the example databse

--we will be using Structured Query Language to interact with our database 
-- the queries we write to create/edit tables in our database are part of the Data Definition sublanguage of SQL

create table people(
	name varchar(50), --this creates a column called "name" in our table that allows 50 characters per entry.
	--varchar is string value in postgr
	age int -- this creates a column called "age" that accpets whole numbers
);

-- to add information into a table you use data manipulation language: this will let you add, read, update, and delete informatoin
-- inside a table. these kinds of operations are called the CRUD operations.

--Create
-- "varchar" values in a script should be wrapped in single quotes
insert into people values ('Billy Bob', 23);

-- Read
-- you can select one or more columns to get, or use * to get all column info
-- select tells the db what info we want
--where is used to filter what records should have their info returned
select * from people where name = 'Billy Bob';

-- update
 
update people -- this tells the db we are updating the people table
set age = 24, name = 'Teddy Rosevelt' --this tells the db what we want the new values to be
where name =  'Billy Bob'; -- this tells the db how to filter which entries are changed

-- delete 
delete from people -- what table are we removing records from
where age = 24; -- what data determines which records to delete 