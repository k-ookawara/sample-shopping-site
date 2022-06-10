create database shop default character set utf8mb4;
use shop;
-- 出品者
create table sellers (
    seller_id int primary key auto_increment,
    email_address varchar(255) not null unique,
    seller_name varchar(255) not null,
    telephone_number  varchar(13)  not null,
    password  varchar(255)  not null
);