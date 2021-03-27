package aulas.interfacesfuncionais;

import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        Consumer<String> imprimirUmaFrase = System.out::println;
        Consumer<String> imprimirUmaFrase2 = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello word, i'am Diego Sena!!!");
        imprimirUmaFrase2.accept("Imprimindo usando lambda...");
    }
}
