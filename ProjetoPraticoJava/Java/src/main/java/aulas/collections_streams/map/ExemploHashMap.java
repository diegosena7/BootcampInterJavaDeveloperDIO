package aulas.collections_streams.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {

        Map<String, Integer> campeoesDoMundo = new HashMap<>();

        //Adiciona as Seleções
        campeoesDoMundo.put("Brasil", 5);
        campeoesDoMundo.put("Alemanha", 4);
        campeoesDoMundo.put("Itália", 4);
        campeoesDoMundo.put("Uruguai", 2);
        campeoesDoMundo.put("Argentina", 2);
        campeoesDoMundo.put("França", 2);
        campeoesDoMundo.put("Inglaterra", 1);
        campeoesDoMundo.put("Espanha", 1);
        System.out.println("Seleções campeãs do Mundo: " + campeoesDoMundo);

        //Atualizando o parâmetro e sua posição/chave
        campeoesDoMundo.put("Brasil", 6);
        System.out.println("Lista de Seleções campeãs do Mundo atualizada: " + campeoesDoMundo);

        //Retorna o parâmetro informado se existir
        System.out.println("Contém a França entre as campeãs? " + campeoesDoMundo.containsKey("França"));

        //Remove o parâmetro informado
        System.out.println("Excluindo... " + campeoesDoMundo.remove("Argentina"));
        System.out.println("Contém a Argentina entre as campeãs? " + campeoesDoMundo.containsKey("Argentina"));

        //Retorna o objeto do parâmetro informado
        System.out.println("Existe seleção com 6 títulos? " + campeoesDoMundo.containsValue(6));

        //Retorna o tamanho da lista
        System.out.println("Lista = " + campeoesDoMundo.size());

        //Percorrendo a lista com for e forEach
        for (Map.Entry<String, Integer> entry: campeoesDoMundo.entrySet()) {
            System.out.println("Elementos da lista = " + entry.getKey() + " - " + entry.getValue());
        }
        for (String key : campeoesDoMundo.keySet()) {
            System.out.println("Elementos: " + key + " = " + campeoesDoMundo.get(key));
        }
    }
}
