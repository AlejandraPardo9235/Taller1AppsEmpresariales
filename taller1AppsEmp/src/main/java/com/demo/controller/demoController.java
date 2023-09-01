package com.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.demo.repository.IUserRepository;
import com.demo.models.User;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/user") //direccionar la clase: localhost:8080/demo/user

public class demoController {

	@Autowired  //para que la interface se instancie una sola vez
	private IUserRepository usuarioRepository;
	
	@GetMapping("/users")	//direccionar el metodo 
	public String listUsers(Model model) { //con el model hacemos referencia a la plantilla html
		//obtenemos los usuarios de la base de datos
		List<User> usuarios = usuarioRepository.findAll();
		model.addAttribute("usuarios", usuarios);
		return "user-list"; //retorna el nombre del archivo html del template
	}
	
	
}
