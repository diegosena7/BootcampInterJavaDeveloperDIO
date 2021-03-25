package aulas.collections_streams.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*A implementtação com HashSet não garante a ordem de inserção, facilitando a performance de
 adição, remoção e leitura de dados*/
public class ExemploHashSet {
    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();

        //Adicionando notas
        notasAlunos.add(7.5);
        notasAlunos.add(5.9);
        notasAlunos.add(8.5);
        notasAlunos.add(7.9);
        notasAlunos.add(9.2);
        notasAlunos.add(6.8);
        notasAlunos.add(9.5);
        notasAlunos.add(3.8);
        notasAlunos.add(2.7);
        System.out.println("Notas alunos: " + notasAlunos);

        //Removendo notas
        notasAlunos.remove(6.8);
        System.out.println("Notas atualizadas: " + notasAlunos);

        //Retorna a qtidade de elementos
        System.out.println("Qual a quantidade de elementos na lista? " + notasAlunos.size());

        /*Usando o Iterator para percorrer a lista, assim como o forEach
        hasNext retorna true sempre que existir mais um elemento na lista
        next retorna o elemento que está sendo iterado */
        Iterator<Double> iterator = notasAlunos.iterator();
        while (iterator.hasNext()){
            System.out.println("As notas são: " + iterator.next());
        }

        //Percorre a lista com forEach
        for (Double nota : notasAlunos) {
            System.out.println("Notas com forEach: " + nota);
        }

        System.out.println("A lista de notas esta vazia? " + notasAlunos.isEmpty());
    }
}
