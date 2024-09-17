package cod3rspringboot_exercicios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cod3rspringboot_exercicios.models.entites.Produto;
import cod3rspringboot_exercicios.models.repositories.ProdutoRepository;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@RestController
@RequestMapping("/api/produtos")
public class ControllerProduto {

	@Autowired //Injeção de dependencia embutida do Spring
	private ProdutoRepository produtoRep;

	@PostMapping("/novo")
	public Produto novoProduto(@RequestParam String nome) {
		
		Produto pd = new Produto(nome);
		produtoRep.save(pd);
		
		return pd;
	}
	
	@GetMapping()
	public List<Produto> getProdutos(){
		List<Produto> result = (List<Produto>) produtoRep.findAll();
		return result;
	}
}
