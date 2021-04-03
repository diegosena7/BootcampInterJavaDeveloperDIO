package com.dssena.springbootconfig.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/*
Classe responsável pelas conexões
Usamos as anotações @Configuration para informar que é uma classe de configuração, usamos também
a anotação @ConfigurationProperties passando o caminho como parâmetro do nosso arquivo com as
configurações de conexão.
Utilizamos as anotações @Profile informando a qual perfil ele deve buscar as conigurações
e também a anotação @Bean para permitir que o objeto retornado pelo método seja gerenciado pelo Spring.
Usamos o Lombok (pom.xml) para gerar nossos getters and setters usando suas anotações na classe.
 */
@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DBConfiguration {

    private String driverClassName;
    private String url;
    private String userName;
    private String password;

    @Profile("dev")
    @Bean
    public String devDatabaseConextion(){
        System.out.println("DB Conection for DEV - H2");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Conection to H2_TEST - Test instance";
    }

    @Profile("prod")
    @Bean
    public String prodDatabaseConection(){
        System.out.println("DB Conection for PROD - MYSQL");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Conection to MYSQL_PROD - Prod instance";
    }
}
