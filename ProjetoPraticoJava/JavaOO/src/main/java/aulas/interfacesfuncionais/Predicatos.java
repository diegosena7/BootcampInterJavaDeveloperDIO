package aulas.interfacesfuncionais;

import java.util.function.Predicate;

/*
é uma interface funcional que pode ser utilizada como alvo para uma atribuição de expressão lambda ou métodode referência.
A interface funcional refere-se ao método test(T t) que retorna um booleano
 */
public class Predicatos {
    public static void main(String[] args) {

        Predicate<String> estaVazio = valor -> valor.isEmpty();//lambda
        Predicate<String> isVazio = String::isEmpty;//Method Reference
        System.out.println("Usando method reference... Está vazio? " + isVazio.test("Não tá!!!"));
        System.out.println("Está vazio? " + estaVazio.test(""));
        System.out.println("Está vazio? " + estaVazio.test("Diego Sena"));
        System.out.println(" -------------------- ");

        //Verifica maioridade
        Pessoa autor = new Pessoa();
        autor.setNome("Diego Sena");
        autor.setIdade(32);
        autor.setNacionalidade("Brasileiro");

        Predicate<Pessoa> maioridade = pessoa -> pessoa.getIdade() > 18;
        boolean teste = maioridade.test(autor);
        System.out.println(autor.getNome() + " é maior ou menor de idade? ");
        System.out.println(teste ? "Maior" : "Menor");
    }
}
