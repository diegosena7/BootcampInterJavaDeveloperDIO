package aulas.recursividade;

/*
Fatorial é multiplicar um número n por pelos números inteiros positivos menor ou igual a n
Ex: Fatorial de 5 = 5 * 5 * 4 * 3 * 2 * 1 (Resultado = 120)
OBS: No JAVA não é possível trabalhar com Tail Call
 */
public class FatorialRecursivo {
    public static void main(String[] args) {
        System.out.println("Valor = " + fatorial(5));
    }

    public static int fatorial(int value){
        if (value == 1){
            return value;
        }else{
            return value * fatorial(value -1);
        }
    }
}
