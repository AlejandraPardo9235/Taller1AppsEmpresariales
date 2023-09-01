package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import com.demo.repository.IVehiculoRepository;
import com.demo.models.Vehiculo;

@Controller
@RequestMapping("/vehiculo")
public class demoControllerVehiculo{

	@Autowired
	private IVehiculoRepository vehiculoRepository;
	
	@GetMapping("/vehiculos")
	
	public String listVehiculos(Model model) {
		
		List<Vehiculo> vehiculos = vehiculoRepository.findAll();
		model.addAttribute("vehiculos", vehiculos);
		return "vehiculo-list";
		
	}

	
}
