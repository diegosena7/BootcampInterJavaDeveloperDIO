package one.digitalinnovation.tipos.tipagem;

//Após atribuir um tipo para uma variável, não podemos alterar o tipo
public class TipagemForte {

    public static void main(String[] args) {

        String texto = "meu texto";

        //texto = 1000; //NOK

        Integer numero = Integer.valueOf("1024");

        numero = 512; //OK
    }
}
