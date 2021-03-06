package com.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.entity.TipoLibro;
import com.examen.service.TipoLibroService;

@RestController
@RequestMapping("/api/rest/tipolibro/")
public class TipoLibroController {
	
	
	@Autowired
	private TipoLibroService service;
	
	@GetMapping
	public ResponseEntity<List<TipoLibro>> listaTodosTipoLibros(){
		return ResponseEntity.ok(service.listaTipoLibro());
	}
}
