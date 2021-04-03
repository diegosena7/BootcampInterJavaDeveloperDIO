package aulas.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

//Parallel agiliza a execução das threads
public class ParallelStreamExemplo {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        IntStream.range(1, 100000).parallel().forEach(num -> fatorial(num));//Parallel
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução com PARALLEL:: " + (fim - inicio));

        inicio = System.currentTimeMillis();
        IntStream.range(1, 10000).forEach(num -> fatorial(num));//Serial
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (fim - inicio));

        //Usando parallel stream com listas
        List<String> nomes = new ArrayList<>();
        nomes.add("Diego");
        nomes.add("Ryan");
        nomes.add("Nayara");
        nomes.parallelStream().forEach(System.out::println);
    }

    public static long fatorial(long num) {
        long fatorial = 1;

        for (long i = 2; i <= num; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}

