package aulas.collections_streams.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Comparable e comparator são classes auxiliares para trabalharmos com ordenação de coleções/listas.
public class ComparatorsExemploList {
    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        //Adicionando estudantes na lista
        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));
        System.out.println("----- Ordem de Inserção -----");
        System.out.println("Lista de estudantes: " + estudantes);

        //Ordena do menor para o maior (idade) com função lambda
        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println("---- Ordem natural dos números - idade -----");
        System.out.println("Lista atualizada ordem natural dos números: " + estudantes);

        //Ordena do maior para o menor (idade) com função lambda
        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println("---- Ordem reversa dos números - idade -----");
        System.out.println("Lista atualizada ordem reversa dos números: " + estudantes);

        //Usando a classe comparator, compara os objetos e retorna em ordem crescente
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("----- Ordem natural dos números - idade (method reference) -----");
        System.out.println("Lista atualizada ordem de número e idade natural: " + estudantes);

        //Usando a classe comparator, compara os objetos e retorna em ordem decrescente com o método reversed
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("----- Ordem reversa dos números - idade (method reference) -----");
        System.out.println("Lista atualizada ordem de número e idade reversa: " + estudantes);

        Collections.sort(estudantes);//Recebe um objeto de uma classe que extends a classe Comparable
        System.out.println("----- Ordem natural dos números - idade (Interface Comparator) -----");
        System.out.println("Lista atualizada ordem de número e idade natural (Comparator): " + estudantes);

        //Recebe o objeto estudantes e a classe que implementa a classe Comparator como argumento
        Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator());
        System.out.println("----- Ordem reversa dos números - idade (Interface Comparator) -----");
        System.out.println("Lista atualizada ordem de número e idade reversa (Comparator): " + estudantes);
    }
}
