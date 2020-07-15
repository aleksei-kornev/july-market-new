drop table if exists categories cascade;
create table categories (id bigserial, title varchar(255), description varchar(5000), primary key(id));
insert into categories
(title, description) values
('Dairy', 'Fresh dary products'),
('Meat', 'Fresh meat'),
('Fruits', 'Fresh fruits'),
('Preserves', 'Canned products');

drop table if exists products cascade;
create table products (id bigserial, title varchar(255), description varchar(5000), price int, id_categories int, constraint fk_id_categories foreign key (id_categories) references categories(id), primary key(id));
insert into products
(title, description, price, id_categories) values
('Cheese', 'Fresh cheese', 320, 1),
('Milk', 'Fresh milk', 80, 1),
('Apples', 'Fresh apples', 80, 3),
('Bread', 'Fresh bread', 30, 1),
('A1', '', 1, 2),
('A2', '', 2, 3),
('A3', '', 3, 3),
('A4', '', 4, 4),
('A5', '', 5, 3),
('A6', '', 6, 3),
('A7', '', 7, 4),
('A8', '', 8, 4),
('A9', '', 9, 2),
('A10', '', 10, 2),
('A11', '', 11, 3),
('A12', '', 12, 3),
('A13', '', 13, 2),
('A14', '', 14, 3),
('A15', '', 15, 2),
('A16', '', 16, 4),
('A17', '', 17, 4),
('A18', '', 18, 4),
('A19', '', 19, 4),
('A20', '', 20, 2);