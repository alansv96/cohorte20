package com.generation.aisv.myappdb.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalleOrden")
public class DetalleOrdenModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	private String nombreDetalle;
	
	
	/*******************relaciones************/
	
	@OneToOne // muchas ordenes con un usuario 
	private OrdenModel ordenes;
	@OneToOne
	private ProductoModel productos;
	
	
	
	/******************************************/
	
	
	
	public DetalleOrdenModel() {
		super();
	}
	public DetalleOrdenModel(Long id, String nombreDetalle, OrdenModel ordenes, ProductoModel productos) {
		super();
		this.id = id;
		this.nombreDetalle = nombreDetalle;
		this.ordenes = ordenes;
		this.productos = productos;
	}
	public OrdenModel getOrdenes() {
		return ordenes;
	}
	public void setOrdenes(OrdenModel ordenes) {
		this.ordenes = ordenes;
	}

	public ProductoModel getProductos() {
		return productos;
	}
	public void setProductos(ProductoModel productos) {
		this.productos = productos;
	}
	public DetalleOrdenModel(Long id, String nombreDetalle) {
		super();
		this.id = id;
		this.nombreDetalle = nombreDetalle;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreDetalle() {
		return nombreDetalle;
	}
	public void setNombreDetalle(String nombreDetalle) {
		this.nombreDetalle = nombreDetalle;
	}
	
	
}
