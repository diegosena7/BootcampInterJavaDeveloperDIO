package com.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraNovaTest {

	//Testa a soma com 2 valores
	@Test
	public void deveSomarDoisValores() {
		int valorA = 1;
		int valorB = 2;
		
		CalculadoraNova calc = new CalculadoraNova();
		int soma = calc.somar(valorA, valorB);
		
		assertEquals(3, soma);
	}

	//Testa a soma com 3 valores
	@Test
	public void deveSomarTresValores() {
		int valorA = 1;
		int valorB = 2;
		int valorC = 3;
		
		CalculadoraNova calc = new CalculadoraNova();
		int soma = calc.somar(valorA, valorB, valorC);
		
		assertEquals(6, soma);
	}

	//Testa subtração
	@Test
	public void devesubtrair(){
		int valorA = 30;
		int valorB = 10;

		CalculadoraNova calculadoraNova = new CalculadoraNova();
		int sub = calculadoraNova.subtrair(valorA, valorB);

		assertEquals(20, sub);
	}

	@Test
	public void deveMultiplicar(){
		int valorA = 10;
		int valorB = 5;

		CalculadoraNova calculadoraNova = new CalculadoraNova();
		int mult = calculadoraNova.multiplica(valorA, valorB);

		assertEquals(50, mult);
	}
}
