package aulas.interfacesfuncionais;

import java.util.function.Supplier;
/*
Suppliers é uma interface funcional, não recebe parâmetros e retorna o seu tipo passado entre <>
No exemplo abaixo nosso suprido retorna uma instancia de pessoa através da variável instanciaPessoa
Além de usar lambda, funciona com method reference
 */
public class Supridores {
    public static void main(String[] args) {
        Supplier<PessoaNew> instanciaPessoa = () -> new PessoaNew();
        Supplier<Pessoa> instanciaPessoaMethodReference = Pessoa::new;
        System.out.println(instanciaPessoa.get());
        System.out.println("Usando Method Reference - " + instanciaPessoa.get());
    }
}
class PessoaNew{
    private String nome;
    private Integer idade;

    //Construtor de PessoaNew
    public PessoaNew (){
        nome = "Diego";
        idade = 32;
    }

    //Transforma o objeto em String
    @Override
    public String toString() {
        return String.format("Nome: %s, idade: %d ",nome, idade );
    }
}