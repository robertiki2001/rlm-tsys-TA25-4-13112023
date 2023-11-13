package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Sala;


public interface ISalaService {
	
		//Listar todos
		public List<Sala> listarSalas();
		
		//Listar por id
		public Sala salaXID(Integer id); 
		
		//Guardar
		public Sala guardarSala(Sala sala);
		
		//Actualizar
		public Sala actualizarSala(Sala sala);
		
		//Eliminar
		public void eliminarSala(Integer id);

}