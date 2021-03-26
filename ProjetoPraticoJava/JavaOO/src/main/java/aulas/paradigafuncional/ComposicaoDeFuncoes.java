package aulas.paradigafuncional;

import java.util.Arrays;

public class ComposicaoDeFuncoes {

    public static void main(String[] args) {

        //Percorrendo os valores do array, usando o paradigma funcional com função lambda
        int [] valores = {1, 2, 3, 4};
        Arrays.stream(valores).filter(numero -> numero % 2 == 0)//verifica se o valor da variável número dividido por 2 é igual a 0
                .map(numero -> numero * 2)//se for, ele multiplica o valor por 2
                .forEach(numero -> System.out.println("Valor do paradigma funcional: " + numero));//imprime os números que atingirem o resultado esperado

        //Percorrendo os valores do array, usando o paradigma imperativo, dando uma instrução por vez
        for (int i = 0; i < valores.length; i ++){
            int valor = 0;
            if (valores[i] % 2 == 0){
                valor = valores[i] * 2;
                if (valor != 0){
                    System.out.println("Valor do paradigma imperativo = " + valor);
                }
            }
        }
    }
}
