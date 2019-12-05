package com.elorrieta;

public class Libro {

	private String titulo;
	private String puesto;
	
	
	public String gettitulo() {
		return titulo;
	}

	public void settitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	
	public Libro(String titulo, String puesto) {
		super();
		this.titulo = titulo;
		this.puesto = puesto;
	}

	public Libro() {
		super();
		this.titulo = "";
		this.puesto = "";
	}

	
}
