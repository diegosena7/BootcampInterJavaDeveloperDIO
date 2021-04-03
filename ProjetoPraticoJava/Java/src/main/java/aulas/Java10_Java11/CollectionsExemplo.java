package aulas.Java10_Java11;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CollectionsExemplo {
    public static void main(String[] args) {

        /*
        Usando o Set.of para instanciar a lista
        Obs: O Set list não ordena os valores na lista
         */
        Collection<String> nomes = Set.of("Diego", "Da", "Silva", "Sena");
        System.out.println("Nomes: " + nomes);

        /*
        Usando o List.of para instanciar a lista
         */
        Collection<Integer> numeros = List.of(1, 3, 5, 7, 9, 11);
        System.out.println("Números: " + numeros);
    }
}
