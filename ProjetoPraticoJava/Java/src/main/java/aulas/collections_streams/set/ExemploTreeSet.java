package aulas.collections_streams.set;

import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
//        treeCapitais.add("Belo Horizonte");
        System.out.println("Lista de capitais: " + treeCapitais);

        //Retorna a primeira capital da árvore
        System.out.println("Primeira capital da lista: " + treeCapitais.first());

        //Retorna a última capital da árvore
        System.out.println("Última capital da lista: " + treeCapitais.last());

        //Retorna o elemento abaixo do parâmetro informado da lista
        System.out.println("Elemento abaixo = " + treeCapitais.lower("Florianópolis"));

        //Retorna o elemento acima do parâmetro informado da lista
        System.out.println("Elemento acima = " + treeCapitais.higher("Florianópolis"));

        //Retorna a primeira capital no topo da árvore, removendo o elemento
        System.out.println("Primeira capital no topo da árvore: " + treeCapitais.pollFirst());

        //Retorna a primeira capital no final da árvore, removendo o elemento
        System.out.println("Primeira capital no final da árvore: " + treeCapitais.pollLast());

        System.out.println("Lista de capitais atualizada: " + treeCapitais);

    }
}
