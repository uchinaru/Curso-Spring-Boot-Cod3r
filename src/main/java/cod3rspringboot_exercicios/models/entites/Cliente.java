package cod3rspringboot_exercicios.models.entites;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

@AllArgsConstructor
public class Cliente {
	
	private int id;
	private String nome;
	private String cpf;
	

}
