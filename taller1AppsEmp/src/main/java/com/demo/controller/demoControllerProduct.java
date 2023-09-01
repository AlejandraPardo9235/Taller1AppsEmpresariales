package com.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.demo.repository.IProductoRepository;
import org.springframework.ui.Model;
import com.demo.models.Producto;



@Controller
@RequestMapping("/producto")


public class demoControllerProduct {
	
	@Autowired
	private IProductoRepository iProductoRepository;
	
	@GetMapping("/products")
	public String listProductos(Model model) {
		List<Producto> productos = iProductoRepository.findAll();
		model.addAttribute("productos", productos);
		return "producto-list";
	}

}
