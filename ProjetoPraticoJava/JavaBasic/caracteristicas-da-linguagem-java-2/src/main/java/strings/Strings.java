package strings;

public class Strings {

  public static void main(String[] args) {

    var nome = "André";
    var sobreNome = "Gomes";
    final var nomeCompleto = nome + sobreNome;

    //Concatenação de Strings
    System.out.println(nome);
    System.out.println("Nome do cliente : " + nome);
    System.out.println("Nome completo do cliente : " + nomeCompleto);
    var string = new String(" Minha  String ");

    System.out.println("Informa qual o caracter na posição informada : " + string.charAt(5));
    System.out.println("Informa a quantidade de caracteres da string= " + string.length());
    System.out.println("Sem Trim [" + string + "]");
    System.out.println("Retira espaços e branco nas estremidades com Trim [" + string.trim() + "]");
    System.out.println("Transforma a string em minúsculo" + string.toLowerCase());
    System.out.println("Transforma a string em maiúsculo " + string.toUpperCase());
    System.out.println("Retorna true/false de acordo com a condição informada " + string.contains("M"));
    System.out.println("Retorna true/false de acordo com a condição informada " + string.contains("X"));
    System.out.println("Substitui caracteres na string: " + string.replace("n", "$"));
    System.out.println("Compara se a string informada é igual a atribuida a variável string " + string.equals(" Minha String "));
    System.out.println("Recorta a string de acordo com os indices passados como parâmetro: " + string.substring(1, 6));
  }
}
