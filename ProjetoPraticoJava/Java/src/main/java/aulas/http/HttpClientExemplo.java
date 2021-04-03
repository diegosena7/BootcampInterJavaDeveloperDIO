package aulas.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class HttpClientExemplo {
    public static void main(String[] args) throws IOException {

    }

    private static void connectAndPrintURL() throws IOException {
        var url = new URL("https://translate.google.com.br/");
        var urlConnection = url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
    }
}
