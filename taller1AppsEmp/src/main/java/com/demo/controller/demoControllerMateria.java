package com.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import com.demo.repository.IMateriaRepository;
import com.demo.models.Materia;

@Controller
@RequestMapping("/Materia")
public class demoControllerMateria {

	@Autowired
	private IMateriaRepository materiaRepository;
	
	@GetMapping("/materias")
	
	public String listMaterias(Model model) {
		
		List<Materia> materias = materiaRepository.findAll();
		model.addAttribute("materias", materias);
		return "materia-list";
		
		
	}
	
}
