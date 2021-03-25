package aulas.oo.part03.heranca.exercicio;

public class ExecutaFuncionarios {
    public static void main(String[] args) {

        System.out.println("----------------------CÁLCULA IMPOSTO---------------------");
        Gerente ger = new Gerente();
        ger.setCargo("Gerente");
        ger.setNome("Osvaldo");
        ger.setSalario(9500.0);
        System.out.println("Cargo: " + ger.getCargo() + " - Nome: " + ger.getNome() + " - Salário R$: " + ger.getSalario());
        System.out.println("Imposto sobre o salário R$: " + ger.calculaImposto());

        System.out.println("----------------------------------------------------------");
        Supervisor sup = new Supervisor();
        sup.setCargo("Supervisor");
        sup.setNome("Leonardo");
        sup.setSalario(7000.0);
        System.out.println("Cargo: " + sup.getCargo() + " - Nome: " + sup.getNome() + " - Salário R$: " + sup.getSalario());
        System.out.println("Imposto sobre o salário R$: " + sup.calculaImposto());

        System.out.println("----------------------------------------------------------");
        Analista analista = new Analista();
        analista.setCargo("Analista");
        analista.setNome("Jéssica");
        analista.setSalario(4500.0);
        System.out.println("Cargo: " + analista.getCargo() + " - Nome: " + analista.getNome() + " - Salário R$: " + analista.getSalario());
        System.out.println("Imposto sobre o salário R$: " + analista.calculaImposto());
    }
}
