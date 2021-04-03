package aulas.interfacesfuncionais;

/*
Função de alta ordem é uma função que recebe ou retorna uma função por parâmetro
No caso abaixo, o método executarOperacao recebe a função lambda como parâmetro e os valores para
executar as operações descritas nos métodos
 */
public class FuncaoAltaOrdem {
    public static void main(String[] args) {

        Calculo soma = ((valor1, valor2) -> valor1 + valor2);//Comportamento da função lambda ao ser acionada
        Calculo subtracao = ((valor1, valor2) -> valor1 - valor2);
        Calculo multiplicacao = ((valor1, valor2) -> valor1 * valor2);
        Calculo divisao = ((valor1, valor2) -> valor1 / valor2);


        System.out.println("Soma = " + executarOperacao(soma, 1, 3));
        System.out.println("Subtracao = " + executarOperacao(subtracao, 6, 3));
        System.out.println("Multiplicacao = " + executarOperacao(multiplicacao, 9, 3));
        System.out.println("Divisao = " + executarOperacao(divisao, 12, 3));
    }

    public static int executarOperacao(Calculo calculo, int valor1, int valor2) {
        return calculo.calcular(valor1, valor2);
    }
}

//Interface funcional que possui apenas 1 método abstrato
@FunctionalInterface
interface Calculo {
    public int calcular(int valor1, int valor2);
}