package part3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por executar as queries e mostrar os retornos no console.
 */
public class QueriesExecution {

    public static void main(String[] args) {

        AlunoDAO alunoDAO = new AlunoDAO();

        // =========================== Busca Todos =================================================
        List<Aluno> alunos = alunoDAO.list();

        alunos.stream().forEach(System.out::println);


        // ======================= Busca por id ========================================
        Aluno alunoParaConsulta = alunoDAO.getById(1);//Id do aluno para busca

        System.out.println("Aluno com o id: " + alunoParaConsulta);


        // =========================== Inserir Aluno =================================================
//        Aluno alunoParaInsercao = new Aluno("Matheus",43,"SP");
//        Aluno alunoParaInsercao1 = new Aluno("Jefsuuu",19,"RS");
//        alunoDAO.create(alunoParaInsercao);
//        alunoDAO.create(alunoParaInsercao1);
//        System.out.println("Novo aluno: " + alunoParaInsercao);
//        System.out.println("Novo aluno: " + alunoParaInsercao1);

        // =========================== Excluir Aluno por id ===================================================

//        alunoDAO.delete(6);

        // =========================== Atualizar ALuno ================================================
        Aluno alunoParaAtualizar = alunoDAO.getById(2);
        alunoParaAtualizar.setNome("Joaquim");
        alunoParaAtualizar.setIdade(18);
        alunoParaAtualizar.setEstado("RS");

        alunoDAO.update(alunoParaAtualizar);
        System.out.println("Aluno atualizado: " + alunoParaAtualizar);
    }
}


