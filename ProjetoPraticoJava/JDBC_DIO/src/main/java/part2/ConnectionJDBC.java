package part2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Nesta classe criamos conexão usando o DriverManager, passando como parâmetros a string de conexão,
 * usuário e senha do usuário.
 * OBS: não precisamos fechar a conex~so, a partir do Java 7 o encerramento da conexão é feito
 * de forma implícita
 */
public class ConnectionJDBC {

    public static void main(String[] args){

        //Dados de conexão com o BD MySQL
        String driverConn = "jdbc:mysql://afiliados.mysql.dbaas.com.br:3306/afiliados";
        String nameDatabase = "afiliados";
        String passwordAccess = "Rodolfo.braga2";

        try (Connection connection = DriverManager.getConnection(driverConn, nameDatabase, passwordAccess)){
            System.out.println("SUCESSO ao se conectar ao banco MySQL!");
        }catch (SQLException e){
            System.out.println("FALHA ao se conectar ao banco MySQL!");
            e.printStackTrace();
        }

//--------------------------------Conexão de forma mais verbosa--------------------------------
//        StringBuilder sb = new StringBuilder("jdbc:")
//                .append(driver).append("://")
//                .append(dataBaseAddress).append("/")
//                .append(dataBaseName);
//
//        String connectionUrl = sb.toString(); //sb.toString() == "jdbc:mysql://afiliados.mysql.dbaas.com.br:3306/afiliados"
//
//        //Carregar a classe específica de implementação do driver na memória da JVM. (A partir da versão JDBC 4 não é mais necessário!!!)
//        //Class.forName("com.mysql.jdbc.Driver");
//
//        // 4 - Criar conexão usando o DriverManager, passando como parâmetros a string de conexão, usuário e senha do usuário.
//        try (Connection conn = DriverManager.getConnection(driverConn, nameDatabase, passwordAccess)) {
//            System.out.println("SUCESSO ao se conectar ao banco MySQL!");
//        } catch (SQLException e) {
//            System.out.println("FALHA ao se conectar ao banco MySQL!");
//            e.printStackTrace();
//        }
    }
}
