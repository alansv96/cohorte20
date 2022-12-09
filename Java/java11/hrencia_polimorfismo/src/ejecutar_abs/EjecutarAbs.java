package ejecutar_abs;

import polimorfismo.*;

public class EjecutarAbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FigurasGeometricas t=new Triangulo();
		FigurasGeometricas c =new Cuadrado();
		FigurasGeometricas ci=new Circulo();
		FigurasGeometricas r=new Rectangulo();
		t.pedirDatos();
		t.area();
		t.vsializar();
		
		c.pedirDatos();
		c.area();
		c.vsializar();
		
		ci.pedirDatos();
		ci.area();
		ci.vsializar();
		
		r.pedirDatos();
		r.area();
		r.vsializar();
	}

}
