package cod3rspringboot_exercicios.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cod3rspringboot_exercicios.models.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {
	
	@GetMapping(path = "/qualquer")
	public Cliente retornaCliente() {
		return new Cliente(1, "José Alvez", "128.548.568-65");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClienteID1(@PathVariable int id) {
		return new Cliente(id, "Maria", "213.432.543-00");
	}
	
	@GetMapping
	public Cliente obterClienteID2(@RequestParam(name = "id") int id) {
		return new Cliente(id, "Joao", "213.432.543-00");
	}
}
