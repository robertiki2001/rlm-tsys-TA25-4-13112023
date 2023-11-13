package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPeliculaDAO;
import com.example.demo.dto.Pelicula;

@Service
public class PeliculaService implements IPeliculaService {

	@Autowired
	IPeliculaDAO iPeliculaDAO;

	// Listar todos
	public List<Pelicula> listarPeliculas() {
		return iPeliculaDAO.findAll();
	};

	// Listar por id
	public Pelicula peliculaXID(Integer id) {
		return iPeliculaDAO.findById(id).get();
	};

	// Guardar
	public Pelicula guardarPelicula(Pelicula pelicula) {
		return iPeliculaDAO.save(pelicula);
	};

	// Actualizar
	public Pelicula actualizarPelicula(Pelicula pelicula) {
		return iPeliculaDAO.save(pelicula);
	};

	// Eliminar
	public void eliminarPelicula(Integer id) {
		iPeliculaDAO.deleteById(id);
	}

}