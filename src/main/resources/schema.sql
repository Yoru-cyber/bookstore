create table if not exists books (
id serial primary key,
name varchar(30) not null,
author varchar(30) not null,
release_year int not null
);
delete from books;
insert into books (name, author, release_year) values ('Dune', 'Frank Herbert', 1965);
insert into books (name, author, release_year) values ('Dune Messiah', 'Frank Herbert', 1969);
insert into books (name, author, release_year) values ('Sons of Dune', 'Frank Herbert', 1976);