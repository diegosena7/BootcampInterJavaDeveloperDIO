package strings;

public class StringFormat {

  public static void main(String[] args) {

    var nome = "André";
    var sobreNome = "Gomes";
    final var nomeCompleto = nome + sobreNome;

    System.out.println(nome);
    System.out.println("Nome do cliente : " + nome);
    System.out.println("Nome completo do cliente : " + nomeCompleto);
    final var mensagem = String.format("O cliente %s possui sobre nome %s ", nome, sobreNome);
    System.out.println(mensagem);

    System.out.println(String.format("Retorna o valor com o número de casas decimais após o ponto %.2f ", 1.2375d));
    System.out.println(String.format("Retorna o valor com o número de casas decimais após o ponto %.4f ", 1.2375d));
  }
}
