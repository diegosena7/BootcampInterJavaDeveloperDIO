package aulas.collections_streams.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<Integer> seqNumerica = new LinkedHashSet<>();

        //Adicionando números no set
        seqNumerica.add(1);
        seqNumerica.add(3);
        seqNumerica.add(5);
        seqNumerica.add(7);
        seqNumerica.add(13);
        seqNumerica.add(77);
        seqNumerica.add(99);
        System.out.println("Lista de números: " + seqNumerica);

        //Removendo elemento
        seqNumerica.remove(5);
        System.out.println("Lista de números atualizada após a remoção do elemento: " + seqNumerica);

        //Retorna a qtidade de elementos
        System.out.println("Quantidade de elementos = " + seqNumerica.size());

        /*Usando o Iterator para percorrer a lista, assim como o forEach
        hasNext retorna true sempre que existir mais um elemento na lista
        next retorna o elemento que está sendo iterado */
        Iterator<Integer> iterator = seqNumerica.iterator();
        while (iterator.hasNext()){
            System.out.println("Percorre os elementos da lista com Iterator: " + iterator.next());
        }
        for (Integer num : seqNumerica) {
            System.out.println("Percorre os elementos da lista com forEach: " + num);
        }

        //seqNumerica.clear();

        //Verifica se a lista está vazia
        System.out.println("A lista está vazia? " + seqNumerica.isEmpty());

        //Adiciona elemento na última posição da lista
        seqNumerica.add(9);
        System.out.println("Lista atualizada após a inserção de novo elemento: " + seqNumerica);
    }
}
