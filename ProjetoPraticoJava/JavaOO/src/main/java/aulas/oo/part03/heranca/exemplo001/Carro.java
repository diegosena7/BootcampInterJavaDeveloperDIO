package aulas.oo.part03.heranca.exemplo001;

public class Carro extends Veiculo {

    private int quantidadeDePortas;

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "quantidadeDePortas=" + quantidadeDePortas +
                '}';
    }
}
