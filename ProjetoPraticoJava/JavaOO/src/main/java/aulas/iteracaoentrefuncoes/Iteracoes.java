package aulas.iteracaoentrefuncoes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Usando os 3 pontinhos no método tem o mesmo efeito de passar os colchetes do array []
Ao usar o strem, nossa aplicação perde um pouco em questão de performance em relação ao for.
 */
public class Iteracoes {
    public static void main(String[] args) {

        String[] nomes = {"Diego", "Nayara", "Ryan", "Ted", "Maria", "Marlene"};
        Integer[] numeros = {1, 2, 3, 4, 5};
        imprimirNomesFiltrados(nomes);
        imprimirTodosNomes(nomes);
        imprimirNumeroEmDobro(numeros);

        //Testando stream com list
        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Tester");
        profissoes.add("QA");
        profissoes.add("Scrum Master");

        profissoes.stream().filter(profissao -> profissao.startsWith("Tester")).forEach(System.out::println);
    }

    //Método responsável por imprimir os nomes filtrados
    public static void imprimirNomesFiltrados(String... nomes){
        String nomesParaImprimir = "";
        for (int i = 0; i < nomes.length; i ++){
            if (nomes[i].equals("Diego")){
                nomesParaImprimir += " " + nomes[i];
            }
        }

        //Solução para percorrer o array usando stream ao invés do for
        Stream.of(nomes).filter(nome -> nome.equals("Diego")).collect(Collectors.joining());
        System.out.println("Nome com stream:" + nomesParaImprimir);
        System.out.println("Nome sem stream:" + nomesParaImprimir);
    }

    //Imprimindo todos os elementos do array
    public static void imprimirTodosNomes(String... nomes){
        System.out.println("----------------------------");
        for (String nome : nomes){
            System.out.println("Lista de nomes com for: " + nome);
        }

        //Solução para percorrer o array usando stream ao invés do for
        Stream.of(nomes).forEach(nome -> System.out.println("Lista de nomes com strem: " + nome));
    }

    //Método responsável por imprimir os valores do array numeros em dobro
    public static void imprimirNumeroEmDobro(Integer... numeros){
        System.out.println("----------------------------");
        for (Integer numero: numeros){
            System.out.println("Lista de números com for: " + numero * 2);
        }

        //Método responsável por imprimir os valores do array numeros em dobro
        Stream.of(numeros).forEach(numero -> System.out.println("Lista de números com stream: " + numero * 2));
        //Outra forma de imprimir os numeros do array em dobro
        Stream.of(numeros).map(numero -> numero * 2).forEach(System.out::println);
    }
}
