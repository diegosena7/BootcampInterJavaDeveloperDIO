package aulas.oo.part01.paradigma.exemplo001;

public class InstanciaCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        System.out.println("Dados do veículo: ");
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Cor: " + meuCarro.getCor());
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Cambio: " + meuCarro.getCambio());
        System.out.println("Status venda: " + meuCarro.statusVenda());
        System.out.println("Foi adicionado " + meuCarro.addPassageiros(2) + " passageiros no veículo.");
        System.out.println("Foi removido " + meuCarro.removePassageiros(1) + " passageiros no veículo.");

        //Alterando o status da venda do veículo
        meuCarro.setStatus(false);
        System.out.println("Status venda: " + meuCarro.statusVenda());
    }
}
