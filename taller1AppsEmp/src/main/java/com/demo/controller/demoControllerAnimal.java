package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import com.demo.repository.IAnimalRepository;

import org.springframework.ui.Model;
import com.demo.models.Animal;


@Controller
@RequestMapping("/animal")
public class demoControllerAnimal {
	
	@Autowired
	private IAnimalRepository animalRepository; 
	
	@GetMapping("/animales")
	public String listAnimales(Model model) {
		
		List<Animal> animales = animalRepository.findAll();
		model.addAttribute("animales", animales);
		return "animal-list";
		
		
	}
	
	

}
