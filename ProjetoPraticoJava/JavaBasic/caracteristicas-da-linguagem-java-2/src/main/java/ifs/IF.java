package ifs;

public class IF {

  public static void main(String[] args) {

    final var condicao = false;

    if (condicao) {
      System.out.println("A condição é verdadeira");
    } else {
      System.out.println("A condição é falsa");
    }

    //Se não tiver outra condição não precisa de chaves
    if (condicao == false)
      System.out.println("Uma única linha...");

    //if ternário (a ? verifica a condição)
    final var ternario = condicao ? "é verdadeira" : "é falsa";
    System.out.println(ternario);
  }
}
