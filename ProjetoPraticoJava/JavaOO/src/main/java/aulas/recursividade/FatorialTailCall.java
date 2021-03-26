package aulas.recursividade;
/*
Com o tail call, a cada chamada do método com a recursividade ele gera o valor e a cada rechamada
do método fatorialComTailCall dentro do método fatorialA ele executa novamente o cálculo.
Ex: 5 * 4 = 20 / 20 * 3 = 60 / 60 * 2 = 120 / 120 * 1 = 120 (Resultado 120)
OBS: No JAVA não é possível trabalhar com Tail Call
 */
public class FatorialTailCall {
    public static void main(String[] args) {
        System.out.println("Valor = " + fatorialA(5));
    }

    public static double fatorialA(double valor){
        return fatorialComTailCall(valor, 1);
    }

    public static double fatorialComTailCall(double valor, double numero){
        if (valor == 0){
            return numero;
        }
        return fatorialComTailCall(valor -1, numero * valor);
    }
}
