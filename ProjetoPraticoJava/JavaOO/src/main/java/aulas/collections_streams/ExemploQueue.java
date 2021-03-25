package aulas.collections_streams;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/*Usamos o conceito de fila, logo, o primeiro elemento a entrar na lista deve ser o primeiro elemento a sair da fila,
garante a ordem de inserção, mas não permite a alteração da ordenação dos elementos*/
public class ExemploQueue {
    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Diego");
        filaBanco.add("Nayara");
        filaBanco.add("Ryan");
        filaBanco.add("Ted");
        filaBanco.add("Brancão");
        System.out.println("Segue os elementos da lista: " + filaBanco);

        //O método poll, retorna e remove o primeiro elemento da fila, retorna null se a fila estiver vazia.
        String clienteAtendido = filaBanco.poll();
        System.out.println("Cliente a ser atendido é: " + clienteAtendido);
        System.out.println("Lista atualizada após o atendimento do cliente: " + filaBanco);

        //clear é o método responsável por limpar a lista
        //filaBanco.clear();

        //O método peek, retorna e não remove o primeiro elemento da fila, retorna null se a fila estiver vazia.
        String primeiroCliente = filaBanco.peek();
        System.out.println("O primeiro elemento da fila é: " + primeiroCliente);
        System.out.println("Lista atual: " + filaBanco);

        //O método element, retorna e não remove o primeiro elemento da fila, retorna uma exception se a fila estiver vazia.
        String clienteErroTratado = filaBanco.element();
        System.out.println("O primeiro cliente atualmente é: " + clienteErroTratado);
        System.out.println("Fila atualizada: " + filaBanco);

        for (int i = 0; i <= filaBanco.size(); i ++){
            System.out.println("Lista toda: "+ filaBanco);
        }
        for (String client: filaBanco) {
            System.out.println("Elemento lista: " + client);
        }

        /*Usando o Iterator para percorrer a lista, assim como o forEach
        hasNext retorna true sempre que existir mais um elemento na lista
        next retorna o elemento que está sendo iterado */
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while (iteratorFilaBanco.hasNext()){
            System.out.println("Usando hasNext e next com Iterator: " + iteratorFilaBanco.next());
        }

        System.out.println("Quantos elementos possui na fila? " + filaBanco.size());
        System.out.println("Nossa fila está vazia? " + filaBanco.isEmpty());

        filaBanco.add("Joaquim");
        System.out.println("Fila atualizada, novo elemento inserido no fim da fila: " + filaBanco);
        System.out.println("Fila atualizada, quantos elementos possui na fila? " + filaBanco.size());
    }
}
