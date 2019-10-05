package com.trifulcas.id;

import java.util.Arrays;
import java.util.Scanner;

public class Teclado implements IJugada {

	private IMostrar iMostrar;
	
	public Teclado() {
		this.iMostrar = new Consola();
	}
	
	public Teclado(IMostrar iMostrar) { 
		this.iMostrar = iMostrar;
	}

	@Override
	public String pedirJugada(String[] validas) {
		Scanner entrada = new Scanner(System.in);
		String jugada;
		do {
			iMostrar.mostrar("Introduzca la jugada");
			jugada = entrada.nextLine();
		} while(!Arrays.asList(validas).contains(jugada));
		entrada.close();
		return jugada;
	}

}
