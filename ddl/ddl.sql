-- 出品者
create table sellers (
    seller_id int primary key auto_increment,
    email_address varchar(255) not null unique,
    seller_name varchar(255) not null,
    telephone_number  varchar(13)  not null,
    password  varchar(255)  not null
);
-- 商品
create table Items (
    item_id int primary key auto_increment,
    seller_id int not null,
    item_name varchar(1000) not null,
    tax_included_tax int not null
);
-- 注文者
create table orderers (
    orderer_id int primary key auto_increment,
    email_address varchar(500) not null,
    orderer_name varchar(500) not null,
    address varchar(500) not null
);
