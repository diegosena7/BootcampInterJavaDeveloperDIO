package one.digitalinnovation.enums;

public class Programa {

    public static void main(String[] args) {
        //final TipoVeiculo tipoVeiculo = new TipoVeiculo();

        System.out.println("-------------Imprime o tipo de veículo da classe TipoVeiculo-------------");
        System.out.println(TipoVeiculo.TERRESTRE);
        System.out.println(TipoVeiculo.AQUATICO);

        //System.out.println(TipoVeiculo.valueOf("aero"));
        System.out.println(TipoVeiculo.valueOf("AEREO"));

        System.out.println("-------------Imprime os tipos de veívulos da classe TipoVeiculo-------------");
        //Percorre o atributo do tipo Enum, imprime o tipo dele
        for (TipoVeiculo tipo : TipoVeiculo.values()) {
            System.out.println("Tipo: "+tipo);
        }

        System.out.println("-------------Imprime código e texto da classe Status-------------");
        System.out.println("Código do Status CLOSE :"+Status.CLOSE.getCod());
        System.out.println("Texto do Status OPEN :"+Status.OPEN.getTexto());
    }
}
