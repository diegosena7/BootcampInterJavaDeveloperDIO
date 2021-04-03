package aulas.paradigafuncional;

import java.util.function.UnaryOperator;

/*
Imutabilidade é quando uma variável recebe um valor e esse valor não pode ser alterado, assim como um objeto
quando criado não pode ser modificado dentro da programação funcional e em uma função lambda.
 */
public class Imutabilidade {
    public static void main(String[] args) {

        int valor = 20;
        UnaryOperator<Integer> retornaDobro = calcula -> calcula * 2;//Função lamba, multiplica o valor recebido na variável calcula por 2
        System.out.println(retornaDobro.apply(valor));//Resultado do cálculo de valor vezes 2
        System.out.println(valor);//Valor original da variável valor
    }
}
