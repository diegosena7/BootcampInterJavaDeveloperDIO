package aulas.interfacesfuncionais;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {

        Function<String, String> retornaNomeAoCOntrario = texto -> new StringBuilder(texto).reverse().toString();//Recebe string e devolve string
        Function<String, Integer> converteStringParaInteiroCalculaDobro = string -> Integer.valueOf(string) * 2;//Recebe string e devolve int
        System.out.println("Nome ao contrário: " + retornaNomeAoCOntrario.apply("Diego"));
        System.out.println("String convertido para inteiro vezes 2 = " + converteStringParaInteiroCalculaDobro.apply("20"));
    }
}
