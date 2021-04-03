package aulas.paradigafuncional;

/*
Chama o método gerar na interface Funcao para inserir a palavra Sr na String recebida como parâmetro na função lambda
 */
public class FuncaoComLambda {
    public static void main(String[] args) {
        Funcao colocarPrefixoSenhorNaString = valor -> "Sr. " + valor;
        System.out.println(colocarPrefixoSenhorNaString.gerar("Diego Sena"));
    }
}
