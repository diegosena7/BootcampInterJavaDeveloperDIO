package aulas.collections_streams;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        //Adicionando elementos
        esportes.add("Futebol");
        esportes.add("Handebol ");
        esportes.add("Vôlei");
        esportes.add("Basquete");
        System.out.println("Segue os elementos da lista: " + esportes);

        //altera a posição do elemento
        esportes.set(1, "Futsal");

        //Remove o elemento na posição x, no caso posição 2 (Vôlei)
        esportes.remove(2);

        System.out.println("Lista atualizada: " + esportes);

        //Busca o elemento na posição x, no caso posição 0 (Futebol)
        System.out.println("Qual o esporte na posição 0? " + esportes.get(0));

        //Percorre a lista de esportes, para cada esporte do tipo esportes, faça:
        for (String esporte: esportes) {
            System.out.println("Percorrendo os esportes com forEach: " + esporte);
        }
    }
}
