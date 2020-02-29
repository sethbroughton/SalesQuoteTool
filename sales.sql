

CREATE TABLE sale
(
	sale_id serial,
	sales_rep_id integer not null,
	amount decimal(20,2) not null,
	sales_terms varchar(64) not null, 
	customer_id integer not null,
	quote_id integer not null, 
	item_id date not null 

);

CREATE TABLE quote
(
        quote_id serial, 
        sales_rep_id integer not null, 
        date_created date not null, 
        sales_terms varchar(64) not null, 
        customer_id integer not null
);

CREATE TABLE sales_rep
(
        sales_rep_id serial, 
        last_name varchar(64) not null, 
        first_name varchar(64) not null

);

CREATE TABLE item
(
        item_id serial, 
        name varchar(64) not null, 
        unit_of_measure varchar(64) not null, 
        last_sold date not null
);

CREATE TABLE customer
(
        customer_id serial, 
        address_id integer,
        customer_tier integer
      
);

