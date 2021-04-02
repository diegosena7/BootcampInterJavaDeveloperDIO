package aulas.Java10_Java11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

/*
Nesta classe estamos fazendo uma requisição na URL (como se fosse uma requisição num endpoint).
Através do openConnection, abrimos uma conexão com a URL passada como parâmetro (linha 17)
No método getInputStream recebemos os bytes contidos na variável urlConnection
Com o BufferedReader transformamos os caracteres da InputStreamReader em linhas.

Podemos utilizar a declaração de variáveis usando o var a partir do Java 10, porém só pode ser
usado dentro do escopo de um método ou um for, while, try e etc, nunca em nível de classe e/ou
utilizado com um parâmetro, não pode ser utilizada em variável local que não for inicializada...
Exemplo abaixo:
 */
public class InferenciaExemplo {
    public static void main(String[] args) throws IOException {
        printaNomeCompleto("Diego", "Sena");
        printaSoma(10, 7, 12);
        printaSubtracao(10, 2, 2);
    }

    private static void connectAndPrintURL() throws IOException {
        var url = new URL("https://translate.google.com.br/");
        var urlConnection = url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
    }

    /*
    Usando var para atribuir valor a variável e imprimir nome completo
     */
    public static void printaNomeCompleto(String nome, String sobrenome){
        var nomeCompleto = nome + " " + sobrenome;
        System.out.println("O nome completo é: " + nomeCompleto);
    }

    /*
    Percorre os números e retorna a soma deles, usando var para atribuir valor a variável.
     */
    public static void printaSoma(int ... numeros){
        var soma = 0;
        if (numeros.length > 0){
            for (int numero : numeros) {
                soma = soma + numero;
            }
            System.out.println("A soma é: " + soma);
        }
    }

    /*
    Percorre os números e retorna a subtração deles, usando var para atribuir valor a variável dentro do for.
     */
    public static void printaSubtracao(int ... numeros){
        int sub = 20;
        if (numeros.length > 0){
            for (var numero : numeros) {
                sub = sub - numero;
            }
            System.out.println("A subtração é: " + sub);
        }
    }
}
