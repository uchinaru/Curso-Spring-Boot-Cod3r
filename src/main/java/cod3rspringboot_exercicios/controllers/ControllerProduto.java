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
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@RestController
@RequestMapping("/api/produtos")
public class ControllerProduto {

	@Autowired //Injeção de dependencia embutida do Spring
	private ProdutoRepository produtoRep;

//	METODO QUE RECEBE VALORES POR PARAMETRO PARA O OBJETO
//	@PostMapping("/novo")
//	public Produto novoProduto(@RequestParam String nome, @RequestParam double preco, @RequestParam double desconto) {
//		
//		Produto pd = new Produto(nome, preco, desconto);
//		produtoRep.save(pd);
//		return pd;
//	}
	
//	METODO QUE RECEBE O OBJETO POR COMPLETO
	@PostMapping("/novo")
	public Produto novoProduto(@Valid Produto produto) {
		
		produtoRep.save(produto);
		return produto;
	}
	
	@GetMapping()
	public List<Produto> getProdutos(){
		List<Produto> result = (List<Produto>) produtoRep.findAll();
		return result;
	}
}
