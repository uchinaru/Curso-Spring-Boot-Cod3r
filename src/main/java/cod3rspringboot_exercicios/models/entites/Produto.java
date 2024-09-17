package cod3rspringboot_exercicios.models.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@EqualsAndHashCode
@ToString

@Entity //Mapeando como entidade do hibernate
@RequiredArgsConstructor //Construtor que requer os campos com a anotação @NonNull que nesse caso eu coloquei a var nome
@NoArgsConstructor //Construtor vazio
public class Produto {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@NonNull
	private String nome;
	
	private long valor;
}
