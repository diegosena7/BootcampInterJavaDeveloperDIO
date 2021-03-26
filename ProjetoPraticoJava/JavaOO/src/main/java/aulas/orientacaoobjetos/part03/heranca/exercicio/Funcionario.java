package aulas.orientacaoobjetos.part03.heranca.exercicio;

public class Funcionario {

    private String nome;
    private String cargo;
    private Double salario;
    private Double imposto;

    //Construtor padrão
    public Funcionario() {
    }

    //Construtor com parâmetros
    public Funcionario(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    //Getters and seters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getImposto() {
        return imposto;
    }
}
