package aulas.collections_streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Diego");
        nomes.add("Ryan");
        nomes.add("Nayara");
        nomes.add("Ted");
        nomes.add("Maria");
        nomes.add("Marlene");
        System.out.println(nomes);//Imprime a lista de nomes

        Collections.sort(nomes);//Ordena a lista por ordem alfabética
        System.out.println(nomes);

        nomes.set(0, "Diego Sena");//Alterando o nome na posição 0 da lista
        System.out.println(nomes);

        nomes.remove(3);//Remove o item na posição do índice informado
        System.out.println(nomes);
        nomes.remove("Marlene");//Remove o objeto da lista

        String nome = nomes.get(1);//Pega o valor informado pelo índice da lista
        System.out.println("Qual o elemento da lista na posição get(1): " + nome);

        int posicaoElemento = nomes.indexOf("Diego");//Retorna a posição do elemento na lista
        System.out.println("A posição do elemento Diego Sena na lista é: " + posicaoElemento);

        int tamamho = nomes.size();//Retorna a qtidade de elementos da lista
        System.out.println("Quantos elementos temos na lista? " + tamamho);

        boolean temNome = nomes.contains("Ryan");//Retorna true ou false se na lista conter o parâmettro informado
        System.out.println("Contém o nome Ryan na lista? " + temNome);

        boolean listaVazia = nomes.isEmpty();//Retorna true ou false se a lista contem ou não dados
        System.out.println("Lista está vazia? " + listaVazia);

        //ForEach para percorrer todos os elementos da lista, para cada elemento do tipo nomes, faça:
        for (String elemento: nomes) {
            System.out.println("Elementos percorridos pelo forEach: " + elemento);
        }

        /*Usando o Iterator para percorrer a lista, assim como o forEach
        hasNext retorna true sempre que existir mais um elemento na lista
        next retorna o elemento que está sendo iterado */
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println("Usando hasNext e next com Iterator: " + iterator.next());
        }
    }
}
