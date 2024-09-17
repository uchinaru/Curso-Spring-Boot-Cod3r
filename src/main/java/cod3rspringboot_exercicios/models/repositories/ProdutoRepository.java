package cod3rspringboot_exercicios.models.repositories;

import org.springframework.data.repository.CrudRepository;

import cod3rspringboot_exercicios.models.entites.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
	

}
