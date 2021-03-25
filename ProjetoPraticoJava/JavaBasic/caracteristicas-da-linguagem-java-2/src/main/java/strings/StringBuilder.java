package strings;

public class StringBuilder {

  public static void main(String[] args) {

    var nome = "André";

    final var builder = new java.lang.StringBuilder(nome);
    //O método appen adiciona valores passados como parâmetros
    System.out.println(builder.append("Luis"));

    //O método reverse retorna a variável na forma reversa
    final var reverse = builder.reverse();
    System.out.println(reverse);

    //O método insert insere valores na posição passada como parâmetro
    final var insert = reverse.insert(0, "#");
    final var insert1 = reverse.insert(4, "$");
    System.out.println(insert);
    System.out.println(insert1);

    //Concatenando Strings
    System.out.println("Aula".concat(" de Java do Diego"));

  }
}
