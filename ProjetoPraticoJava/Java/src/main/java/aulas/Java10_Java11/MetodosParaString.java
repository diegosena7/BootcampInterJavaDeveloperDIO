package aulas.Java10_Java11;

import java.util.stream.Collectors;

public class MetodosParaString {
    public static void main(String[] args) {
        //Método para repetir a string
        String nome = "Diego";
        System.out.println("Repetindo a String: " + nome.repeat(10));

        //Método para verificar se contém espaço na string (isBlank)
        String espaco = "           ";
        System.out.println("Tem espaço? " + espaco.isBlank());

        //Método para maperar linhas na string (lines)
        String html = "<html>\n<head>\n</head>\n <body> \n <body> \n<html>";
        System.out.println(html.lines().map(s -> "[TAG] :: " +s).collect(Collectors.toList()));
    }
}
