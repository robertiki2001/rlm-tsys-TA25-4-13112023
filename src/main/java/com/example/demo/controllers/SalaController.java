package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.dto.Sala;
import com.example.demo.services.SalaService;

@RestController
@RequestMapping("/api")
public class SalaController {

	@Autowired
	SalaService salaService;

	@GetMapping("/salas")
	public List<Sala> listarSalas() {
		return salaService.listarSalas();
	}

	@GetMapping("/sala/{id}")
	public Sala salaXID(@PathVariable(name = "id") Integer id) {
		return salaService.salaXID(id);
	}

	@PostMapping("/sala")
	public Sala guardarSala(@RequestBody Sala sala) {
		return salaService.guardarSala(sala);
	}

	@PutMapping("/sala/{id}")
	public Sala actualizarSala(@PathVariable(name = "id") Integer id, @RequestBody Sala sala) {

		Sala sala_seleccionado = salaService.salaXID(id);
		Sala sala_actualizado = new Sala();

		sala_seleccionado.setNombre(sala.getNombre());
		sala_seleccionado.setPelicula(sala.getPelicula());

		sala_actualizado = salaService.actualizarSala(sala_seleccionado);

		return sala_actualizado;
	}

	@DeleteMapping("/sala/{id}")
	public void eliminarSala(@PathVariable Integer id) {
		salaService.eliminarSala(id);
	}

}
