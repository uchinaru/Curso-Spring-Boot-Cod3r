package cod3rspringboot_exercicios.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
//	@PostMapping
	@RequestMapping(method = {RequestMethod.POST,RequestMethod.PUT}) // Agora o metodo é capaz de salvar e alterar os produtos contendo as duas anotations 
	public Produto novoProduto(@Valid Produto produto) {
		
		produtoRep.save(produto);
		return produto;
	}
	
	@GetMapping()
	public List<Produto> getProdutos(){
		List<Produto> result = (List<Produto>) produtoRep.findAll();
		return result;
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Produto> getProdutoId(@PathVariable int id) {
		return produtoRep.findById(id);
	}
	
	// Metodo PUT para salvar o objeto por completo, caso queira alterar parcialmente utilize a anotation @PatchMapping
//	@PutMapping
//	public Produto alterarProduto(@Valid Produto produto) {
//		produtoRep.save(produto);
//		return produto;
//	}
	
	@DeleteMapping(path = "/{id}")
	public String deletaProduto(@PathVariable int id) {
		try {
			produtoRep.deleteById(id);
			return "Deletado com sucesso";
		} catch (Exception e) {
			return "Error ao deletar.";
		}
	}
	
	@GetMapping(path = "/nome/{nome}")
	public Iterable<Produto> obterProdutoPorNome(@PathVariable String nome){
		return produtoRep.findByNomeContainingIgnoreCase(nome);
	}
}
