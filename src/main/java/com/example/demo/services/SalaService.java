package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ISalaDAO;
import com.example.demo.dto.Sala;

@Service
public class SalaService implements ISalaService{
	
	@Autowired
	ISalaDAO iSalaDAO;

		//Listar todos
		public List<Sala> listarSalas(){
			return iSalaDAO.findAll();
		};
		
		//Listar por id
		public Sala salaXID(Integer id) {
			return iSalaDAO.findById(id).get();
		}; 
		
		//Guardar
		public Sala guardarSala(Sala sala) {
			return iSalaDAO.save(sala);
		};
		
		//Actualizar
		public Sala actualizarSala(Sala sala) {
			return iSalaDAO.save(sala);
		};
		
		//Eliminar
		public void eliminarSala(Integer id) {
			iSalaDAO.deleteById(id);
		}		

}