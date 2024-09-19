package cod3rspringboot_exercicios.models.repositories;

import org.springframework.data.repository.ListCrudRepository;

import cod3rspringboot_exercicios.models.entites.Produto;

public interface ProdutoRepository extends ListCrudRepository<Produto, Integer> {
	
	public Iterable<Produto> findByNomeContainingIgnoreCase(String search);
	

}
