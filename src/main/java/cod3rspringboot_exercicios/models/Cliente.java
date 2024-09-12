package cod3rspringboot_exercicios.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

@AllArgsConstructor
public class Cliente {
	
	private int id;
	private String nome;
	private String cpf;
	

}
