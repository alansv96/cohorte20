/*operadores*/
select * from productos;
select * from productos where idCategoria=1 and precio=10 and existencia=10;
select * from productos where idCategoria =1 or precio=10;
select * from productos where idCategoria !=3;
/* los null y not null*/
select * from productos where precio is not null;
/* between and*/
select * from productos where precio between 5 and 10;
select * from productos where precio not  between 5 and 10;
