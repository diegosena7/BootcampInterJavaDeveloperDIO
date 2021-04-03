package com.teste;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
/*
Nesta classe estamos testando exceções
Começamos pelo teste onde instanciamos uma lista vazio, em seguida tentamos pegar o
primeiro elemento desta lista (que não existe), deverá retornar uma exeption, que
passamos como esperado no método empty.

Usamos a classe ExpectedException que é uma rule (regra) que nos permite verificar
se o nosso código lança uma determinada exceção.
ExpectedException é inicializada com o o valor ExpectedException.none(); essa inicialização
é para informar que, por padrão, nenhuma exceção é esperada.
 */
public class ExceptionTest {

	//Testa a exceção, que deve ser lançada pois nossa lista não tem elementos
	@Test(expected = IndexOutOfBoundsException.class) 
	public void empty() { 
	     List<String> lista = new ArrayList<String>();
	     lista.get(0);
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {
	    List<Object> list = new ArrayList<Object>();

	    thrown.expect(IndexOutOfBoundsException.class);
	    thrown.expectMessage("Index: 0, Size: 0");
	    list.get(0); 
	}

	@Test
	public void testExceptionMessage() {
	    try {
	        new ArrayList<Object>().get(0);
	        fail("Esperado que IndexOutOfBoundsException seja lan�ada");
	    } catch (IndexOutOfBoundsException ex) {
	        assertThat(ex.getMessage(), is("Index: 0, Size: 0"));
	    }
	}
}
