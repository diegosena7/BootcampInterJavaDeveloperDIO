package one.digitalinnovation.tipos.tipagem;
/*
A partir da versão 10 do Java, podemos atribuir tipos de maneira implícita as variáveis
devemos utilizar a palavra reservada var
 */
public class TipoInferido {

    public static void main(String[] args) {

        var numero = Integer.valueOf("123456");

        var texto = "O Numero é: " ;

        System.out.println(texto + numero);
    }
}
