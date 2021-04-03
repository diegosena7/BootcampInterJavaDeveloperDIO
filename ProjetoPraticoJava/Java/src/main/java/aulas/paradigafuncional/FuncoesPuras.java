package aulas.paradigafuncional;

import java.util.function.BiPredicate;

/*
Funções puras são aquelas que quando invocadas mais de uma vez, produzem o mesmo resultado.
 */
public class FuncoesPuras {
    public static void main(String[] args) {

        //Funcção lambda que verifica se o o parâmetro passado é maior que o valor para comparação
        BiPredicate<Integer, Integer> verificaSeMaior = (parametro, valorComparacao) -> parametro > valorComparacao;

        System.out.println(verificaSeMaior.test(13, 12));
        System.out.println(verificaSeMaior.test(13, 12));
    }
}
