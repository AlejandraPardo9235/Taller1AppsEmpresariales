package com.demo.models;

public class Materia {

	
	private String nombre;
	private String codigo;
	private String jornada;
	
	public Materia(String nombre, String codigo, String jornada) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.jornada = jornada;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getJornada() {
		return jornada;
	}
	public void setJornada(String jornada) {
		this.jornada = jornada;
	}
	
	
	
}
