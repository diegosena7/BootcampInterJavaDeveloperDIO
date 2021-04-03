package aulas.Java10_Java11;

import java.util.function.Function;

//Usando um recurso do Java 11, podemos utilizar a palavra reservada var em funções lambda
public class InferenciaLambda {
    public static void main(String[] args) {
        Function<Integer,Double> divisaoPor2 = (var numero) -> numero / 2.0;

        System.out.println(divisaoPor2.apply(15));

    }
}
