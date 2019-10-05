package com.trifulcas.pptls;

public abstract class Jugador {
	private String nombre;
	private String jugada;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getJugada() {
		return jugada;
	}

	public void setJugada(String jugada) {
		this.jugada = jugada;
	}

	public Jugador(String nombre) {
		this.nombre=nombre;
	}

	public abstract void pedirJugada(String[] validas) ;
}
