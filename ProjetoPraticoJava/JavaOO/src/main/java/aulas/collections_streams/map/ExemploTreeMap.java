package aulas.collections_streams.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {

        TreeMap<String, String> treeCapitais = new TreeMap<>();

        //Cria a árvore com as capitais
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "Belo Horizonte");
        System.out.println("Capitais: " + treeCapitais);

        treeCapitais.get("TESSSSTEEEE" + " SC");

        //Retorna a primeira capital do topo da árvore
        System.out.println("Primeira capital da estrutura = " + treeCapitais.firstKey());

        //Retorna a última capital do final da árvore
        System.out.println("Última capital da estrutura = " + treeCapitais.lastKey());

        //Retorna a primeira capital abaixo do parâmetro informado para o método
        System.out.println("Capital abaixo de SC = " + treeCapitais.lowerKey("SC"));

        //Retorna a primeira capital acima do parâmetro informado para o método
        System.out.println("Capital acima de SC = " + treeCapitais.higherKey("SC"));

        //Retorna o objeto de acordo com o parâmetro do topo da árvore
        System.out.println("Primeira capital do topo da árvore = " + treeCapitais.firstEntry().getKey() + " - " + treeCapitais.firstEntry().getValue());

        //Retorna o objeto de acordo com o parâmetro do final da árvore
        System.out.println("Primeira capital do topo da árvore = " + treeCapitais.lastEntry().getKey() + " - " + treeCapitais.lastEntry().getValue());

        //Retorna a primeira capital abaixo na árvore da capital passada como parâmetro ao método
        System.out.println("Capital abaixo de SC " + treeCapitais.lowerEntry("SC") + " - " + treeCapitais.lowerEntry("SC").getValue());

        //Retorna a primeira capital acima na árvore da capital passada como parâmetro ao método
        System.out.println("Capital acima de SC " + treeCapitais.higherEntry("SC").getKey() + " - " + treeCapitais.higherEntry("SC").getValue());

        //Retorna e remove a primeira capital no topo da árvore
        System.out.println(treeCapitais.pollFirstEntry().getKey() + " - " + treeCapitais.pollFirstEntry().getValue());

        System.out.println("Capitais atualizadas: " + treeCapitais);

        Iterator<String> iterator = treeCapitais.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println("Capitais = " + key + " - " + treeCapitais.get(key));
        }
        for (String capital : treeCapitais.keySet()) {
            System.out.println("Capital = " + capital + " - " + treeCapitais.get(capital));
        }
        for (Map.Entry<String, String> capital : treeCapitais.entrySet()) {
            System.out.println("CapitalForEach = " + capital.getKey() + " - " + capital.getValue());
        }

        treeCapitais.put("AM", "Manaus");
        System.out.println("CAPIIIITAAATIISSS: " + treeCapitais);
    }
}
