package desafios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntrevistaEmbaracosa {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String proximaPalavra;

        while((proximaPalavra = br.readLine()) != null) {
            boolean encontrouRepeticao = false;
            for(int i=0; i <= proximaPalavra.length() - 1; i++) {
                if( proximaPalavra.substring(0, i).endsWith(proximaPalavra.substring(i)) ) {
                    System.out.println(proximaPalavra.substring(0, i));
                    encontrouRepeticao = true;
                }
            }
            if(!encontrouRepeticao)
                System.out.println(proximaPalavra);
        }
    }
}
