package aulas.paradigafuncional;

/*
Chama o método gerar na interface Funcao para inserir a palavra Sr na String recebida como parâmetro
 */
public class FuncaoComClasseAnonima {
    public static void main(String[] args) {

        Funcao colocarPrefixoSenhorNaString = new Funcao() {
            @Override
            public String gerar(String valor) {
                return "Sr. " + valor;
            }
        };
        System.out.println(colocarPrefixoSenhorNaString.gerar("João"));
    }
}
