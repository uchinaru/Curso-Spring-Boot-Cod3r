package cod3rspringboot_exercicios.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestePrimeiroControler {

	@Test
	public void verificaPrimeiroWB() {
		
		PrimeiroControler pc = new PrimeiroControler();
		
		Assertions.assertEquals("Olá Mundo!", pc.ola());
	}
	
}
