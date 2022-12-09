/*joins*/
select * from productos;
select * from categoria;

select * from productos, categoria where idCategoria=id;

select p.nombre,p.precio,p.existencia,c.nombre from productos as p inner join categoria as c on p.idCategoria=c.id;

select p.nombre,p.precio,p.existencia,t.nombre from productos as p left join temporal as t on p.idCategoria=t.id;

select p.nombre,p.precio,p.existencia,t.nombre from productos as p right join temporal as t on p.idCategoria=t.id;

select * from proveedores;
select * from categoria union select * from proveedores;

/*multi consulta*/

select p.nombre,p.precio,p.existencia,c.nombre as nom_categoria from productos as p inner join categoria as c on p.idCategoria=c.id;

select * from categoria;

