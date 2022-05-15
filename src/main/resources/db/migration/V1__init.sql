create table if not exists products (id bigserial primary key , title varchar(255), cost int);

insert into products (title, cost)
values ( 'Apple', 25 ),
       ( 'Сoconut', 35 ),
       ( 'Melon', 45 ),
       ( 'Watermelon', 55 ),
       ( 'Orange', 65 ),
       ( 'Orange', 95 ),
       ( 'Tomatoes', 135 ),
       ( 'Bananas', 75 ),
       ( 'Broomstick', 85 ),
       ( 'Mango', 125 );