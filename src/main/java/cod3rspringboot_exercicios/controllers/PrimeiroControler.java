package cod3rspringboot_exercicios.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroControler {
	
	//@RequestMapping(method = RequestMethod.GET, path = "ola")
	//@GetMapping(path = "/ola") 
	@GetMapping(path = {"/ola","/ola2"}) 
	public String ola() {
		return "Olá Mundo!";
	}

}
