/* joins*/
select * from productos;

select * from categoria;

select * from productos, categoria
where idCategoria = id;

select p.nombre, p.precio, p.existencia, c.nombre from productos as p INNER join categoria as c
ON p.idCategoria = c.id;





select p.nombre, p.precio, p.existencia, t.nombre from productos as p left join temp as t
ON p.idCategoria = t.id;

select p.nombre, p.precio, p.existencia, t.nombre from productos as p right join temp as t
ON p.idCategoria = t.id;

SELECT * FROM proveedores;

select * from categoria UNION 
SELECT nombre, precio FROM productos;


/* milti consulta*/
select p.nombre as nom_producto, p.precio, p.existencia from productos as p;

select idCategoria from productos;
select * from detalle_producto_proveedor;
select * from proveedores;

SELECT p.nombre as nom_producto, c.nombre as nom_categoria, pv.nombre as nom_proveedor
FROM productos AS p 
inner JOIN categoria AS c 
ON p.idCategoria = c.id
inner join detalle_producto_proveedor as det
on p.idProducto=det.idProducto
inner join proveedores as pv
on det.idProveedor = pv.id
where p.existencia > 20;



