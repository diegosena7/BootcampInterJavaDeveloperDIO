package aulas.orientacaoobjetos.part03.heranca.exercicio;

public class Analista extends Funcionario{

    public double calculaImposto(){
        return this.getSalario() * 0.001;
    }
}
