package com.example.demo.dto;

import jakarta.persistence.*;

@Entity
@Table(name="salas")
public class Sala {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	
	@ManyToOne
    @JoinColumn(name="id_pelicula")
	private Pelicula pelicula;
	
	public Sala() {
	}

	public Sala(int codigo, String nombre, Pelicula pelicula) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.pelicula = pelicula;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

}