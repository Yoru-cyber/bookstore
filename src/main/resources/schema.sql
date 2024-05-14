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
insert into books (name, author, release_year) values ('The Lord of the Rings', 'J. R. R. Tolkien', 1954);
insert into books (name, author, release_year) values ('Pride and Prejudice', 'Jane Austen', 1813);
insert into books (name, author, release_year) values ('To Kill a Mockingbird', 'Harper Lee', 1960);
insert into books (name, author, release_year) values ('One Hundred Years of Solitude', 'Gabriel García Márquez', 1967);
insert into books (name, author, release_year) values ('The Great Gatsby', 'F. Scott Fitzgerald', 1925);
insert into books (name, author, release_year) values ('In Search of Lost Time', 'Marcel Proust', 1913);
insert into books (name, author, release_year) values ('Crime and Punishment', 'Fyodor Dostoevsky', 1866);
insert into books (name, author, release_year) values ('Frankenstein', 'Mary Shelley', 1818);
insert into books (name, author, release_year) values ('The Catcher in the Rye', 'J. D. Salinger', 1951);
insert into books (name, author, release_year) values ('Beloved', 'Toni Morrison', 1987);
insert into books (name, author, release_year) values ('Jane Eyre', 'Charlotte Brontë', 1847);
insert into books (name, author, release_year) values ('The Metamorphosis', 'Franz Kafka', 1915);
insert into books (name, author, release_year) values ('The God of Small Things', 'Arundhati Roy', 1997);
insert into books (name, author, release_year) values ('Things Fall Apart', 'Chinua Achebe', 1958);
insert into books (name, author, release_year) values ('The Wind in the Willows', 'Kenneth Grahame', 1908);
insert into books (name, author, release_year) values ('The Remains of the Day', 'Kazuo Ishiguro', 1989);
insert into books (name, author, release_year) values ('Moby Dick', 'Herman Melville', 1851);
insert into books (name, author, release_year) values ('The Count of Monte Cristo', 'Alexandre Dumas', 1844);
insert into books (name, author, release_year) values ('Les Misérables', 'Victor Hugo', 1862);
insert into books (name, author, release_year) values ('War and Peace', 'Leo Tolstoy', 1869);
insert into books (name, author, release_year) values ('Anna Karenina', 'Leo Tolstoy', 1878);
insert into books (name, author, release_year) values ('Don Quixote', 'Miguel de Cervantes', 1605);