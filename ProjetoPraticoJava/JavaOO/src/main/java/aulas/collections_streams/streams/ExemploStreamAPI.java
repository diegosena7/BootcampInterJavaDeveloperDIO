package aulas.collections_streams.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String[] args) {

        //Cria a lista de estudantes
        List<String> estudantes = new ArrayList<>();

        //Adiciona estudantes na lista
        estudantes.add("Leandro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        //Retorna a contagem de elementos
        System.out.println("Contagem: " + estudantes.stream().count());

        //Retorna o elemento com maior número de letras, usa o método Comparator para ordenar a coleção através dos parâmetros informados
        System.out.println("Elemento com maior número de letras = " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        //Retorna o elemento com menor número de letras, usa o método Comparator para ordenar a coleção através dos parâmetros informados
        System.out.println("Elemento com menor número de letras = " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        //Retorna os elementos que contem a letra R no nome
        System.out.println("Elementos com a letra E: " + estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("e")).collect(Collectors.toList()));

        //Retorna uma nova coleção com os nomes concatenados a quantidade de letra de cada nome
        System.out.println("Nova coleção com a qtidade de letras: " + estudantes.stream().map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        //Retorna somente os 3 primeiros elementos da coleção
        System.out.println("3 primeiros itens da coleção: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        //Exibe cada elemento no console e depois retorna a coleção
        System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        //Exibe cada elemento no console sem retornar outra coleção
        System.out.println("Retorna os elementos novamente: ");
        estudantes.stream().forEach(System.out::println);

        //Retorna true se todos os elementos possuem a letra A no nome
        System.out.println("Possui elemento com a letra A no nome? " + estudantes.stream().allMatch((elemento) -> elemento.contains("a")));

        //Retorna true se nenhum elemento possui letra minúscula no nome
        System.out.println("Não possui nenhum elemento com letra a minúscula no nome? " + estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));

        //Retorna o primeiro elemento da coleção, se existir exibe no console o primeiro elemento no console
        System.out.println("Primeiro elemento: " );
        estudantes.stream().findFirst().ifPresent(System.out::println);

        //Exemplo de operação encadeada
        System.out.println("Operação encadeada: ");
        System.out.println(estudantes.stream().peek(System.out::println).map((estudante) -> estudante.concat(" - ").concat(
                String.valueOf(estudante.length()))).peek(System.out::println).filter((estudante) -> estudante.toLowerCase().contains("r"))
               // .collect(Collectors.toList()));
                 //.collect(Collectors.joining(", ")));
                //.collect(Collectors.toSet()));
                .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf(" - ") + 1))));

        System.out.println("TESTEEEE: " + estudantes.stream().collect(Collectors.groupingBy(estudante -> estudante.substring(0,1))));
    }
}
