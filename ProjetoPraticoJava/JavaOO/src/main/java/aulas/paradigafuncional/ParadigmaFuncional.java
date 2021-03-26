package aulas.paradigafuncional;

import java.util.function.UnaryOperator;

/*
Programação funcional é o processo de consturir softwares usando funções puras, evitando o compartilhamento
de dados, efeitos colaterais e estados.
Ou seja, passamos para nossa função lambda o comportamento que ela terá no nosso código.
Através da composição de funções, cria-se uma nova função através da composição de outras.
Usado o conceito do paradigma funcional cria a variável valor e declara o seu comportamento antes de usá-la.
Passa uma função (lambda) para a variável valor antes dela ser executada.
 */
public class ParadigmaFuncional {
    public static void main(String[] args) {

        UnaryOperator<Integer> calcularValorVezesTrinta = valor -> valor * 3;
        int valor = 10;
        System.out.println("O resultado é: " + calcularValorVezesTrinta.apply(10));
    }
}
