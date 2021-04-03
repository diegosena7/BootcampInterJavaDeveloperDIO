package com.teste;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;


public class AssertJTest {

	//Verifica se os objetos são iguais
	@Test
	public void checkEquality() {
		Person person= new Person("Diego", "Sena");
		Person personClone = new Person("Diego", "Sena");
	    
		assertThat(person).isEqualTo(personClone);
	}
}
