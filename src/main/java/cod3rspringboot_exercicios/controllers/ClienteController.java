package cod3rspringboot_exercicios.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cod3rspringboot_exercicios.models.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {
	
	@GetMapping(path = "/qualquer")
	public Cliente retornaCliente() {
		return new Cliente(1, "José Alvez", "128.548.568-65");
	}

}
