package livecode;

import java.util.Scanner;

public class MangosNaranjas {
	
	double mangos, naranjas = 0;
	double cajas = 0;

	public MangosNaranjas(double mangos, double naranjas) {
		this.mangos = mangos;
		this.naranjas = naranjas;
	};

	public void imprimir() {
		this.cajas = maximoComunDivisorRecursivo(this.mangos, this.naranjas);
		int numeroMangos = (int) (mangos / cajas);
		int numeroNaranjas = (int) (naranjas / cajas);
		System.out.println("El numero de cajas es: " + this.cajas);
		System.out.println("Cada caja tiene " + numeroMangos + " mangos");
		System.out.println("Cada caja tiene " + numeroNaranjas + " naranjas");
	}

	public static double maximoComunDivisorRecursivo(double mangos, double naranjas) {
		if (naranjas == 0)
			return mangos;
		return maximoComunDivisorRecursivo(naranjas, mangos % naranjas);
	}
	
	public static void main(String[] args) {
		MangosNaranjas ejemp= new MangosNaranjas(12028 , 12772);
		ejemp.imprimir();
	}
	
	

}
