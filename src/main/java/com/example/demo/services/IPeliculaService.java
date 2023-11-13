package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Pelicula;


public interface IPeliculaService {
	
		//Listar todos
		public List<Pelicula> listarPeliculas();
		
		//Listar por id
		public Pelicula peliculaXID(Integer id); 
		
		//Guardar
		public Pelicula guardarPelicula(Pelicula pelicula);
		
		//Actualizar
		public Pelicula actualizarPelicula(Pelicula pelicula);
		
		//Eliminar
		public void eliminarPelicula(Integer id);

}