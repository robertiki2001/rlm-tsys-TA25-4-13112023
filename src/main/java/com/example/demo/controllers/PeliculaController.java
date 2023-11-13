package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Pelicula;
import com.example.demo.services.PeliculaService;

@RestController
@RequestMapping("/api")
public class PeliculaController {

	@Autowired
	PeliculaService peliculaService;

	@GetMapping("/peliculas")
	public List<Pelicula> listarPeliculas() {
		return peliculaService.listarPeliculas();
	}

	@GetMapping("/pelicula/{id}")
	public Pelicula peliculaXID(@PathVariable(name = "id") Integer id) {
		return peliculaService.peliculaXID(id);
	}

	@PostMapping("/pelicula")
	public Pelicula guardarPelicula(@RequestBody Pelicula pelicula) {
		return peliculaService.guardarPelicula(pelicula);
	}

	@PutMapping("/pelicula/{id}")
	public Pelicula actualizarPelicula(@PathVariable(name = "id") Integer id, @RequestBody Pelicula pelicula) {

		Pelicula pelicula_seleccionado = peliculaService.peliculaXID(id);
		Pelicula pelicula_actualizado = new Pelicula();

		pelicula_seleccionado.setNombre(pelicula.getNombre());
		pelicula_seleccionado.setCalificacion_edad(pelicula.getCalificacion_edad());

		pelicula_actualizado = peliculaService.actualizarPelicula(pelicula_seleccionado);

		return pelicula_actualizado;
	}

	@DeleteMapping("/pelicula/{id}")
	public void eliminarPelicula(@PathVariable Integer id) {
		peliculaService.eliminarPelicula(id);
	}

}
