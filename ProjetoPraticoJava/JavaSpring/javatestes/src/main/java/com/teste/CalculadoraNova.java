package com.teste;

public class CalculadoraNova {

	//Obs: os ... equivalem a [], nos referimos a um array de valores
	public int somar(int ...valores) {
		int soma = 0;
		//Para cada valor soma recebe soma + valor do parâmetro
		for (int valor : valores) {
			soma += valor;
		}
		return soma;
	}

	public int subtrair(int valorA, int valorB) {
		return valorA - valorB;
	}

	public int multiplica(int valorA, int valorB) {
		return valorA * valorB;
	}
}
