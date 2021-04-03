package com.teste;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Test;

/*
Nesta classe estamos testando os métodos
Usamos o método assertEquals que indica se o resultado da expressão coincide com o esperado
podemos usar esse método com tipos primitivos, objetos e arrays, fazemos a comparação
com a sintaxe: valor esperado x valor atual.
 */
public class CalculadoraTest {

	@Test
	public void testSomar() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar("1+1+2");
		assertEquals(4, soma);
	}

	//Usamos o método estático mock ára "forçar" o retorno a ser igual ao esperado, independente o valor do parâmetro.,
	@Test
	public void testeSomarComMock() {
		//Instancia o objeto calculadora usando o método estático mock
		Calculadora calculadora = mock(Calculadora.class);

		//Quando (when) calculadora.somar então  (then) thenReturn 10
		when(calculadora.somar("1+2")).thenReturn(10);
		
		int resultado = calculadora.somar("1+2");
		
		assertEquals(10, resultado);
	}
}
