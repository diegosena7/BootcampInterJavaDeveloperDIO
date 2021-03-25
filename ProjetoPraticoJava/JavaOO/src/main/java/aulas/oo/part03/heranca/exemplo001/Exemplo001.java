package aulas.oo.part03.heranca.exemplo001;

public class Exemplo001 {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.setMarca("Nissan");
        carro.setModelo("March");
        carro.setQuantidadeDePortas(4);

        System.out.println("----- Dados do Carro -----");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Portas: " + carro.getQuantidadeDePortas());

        Motocicleta moto = new Motocicleta();
        moto.setMarca("DUCATI");
        moto.setModelo("STREETFIGHTER");
        moto.setCilindradas("850");

        System.out.println("----- Dados da moto -----");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Cilindradas: " + moto.getCilindradas());
    }
}
