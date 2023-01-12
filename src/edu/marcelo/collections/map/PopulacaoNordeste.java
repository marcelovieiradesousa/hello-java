package edu.marcelo.collections.map;

import java.text.CollationElementIterator;
import java.util.*;

public class PopulacaoNordeste {
  /*
   * Dada a população estimada de alguns estados do NE brasileiro, faça:
   * 
   * Estado = PE - População = 9.616.621
   * 
   * Estado = AL - População = 3.351.543
   * 
   * Estado = CE - População = 9.187.103
   * 
   * Estado = RN - População = 3.534.265
   * 
   * Crie um dicionário e relacione os estados e suas populações;
   * 
   * Substitua a população do estado do RN por 3.534.165;
   * 
   * Confira se o estado PB está no dicionário, caso não adicione: PB -
   * 4.039.277;
   * 
   * Exiba a população PE;
   * 
   * Exiba todos os estados e suas populações na ordem que foi informado;
   * 
   * Exiba os estados e suas populações em ordem alfabética;
   * 
   * Exiba o estado com o menor população e sua quantidade;
   * 
   * Exiba o estado com a maior população e sua quantidade;
   * 
   * Exiba a soma da população desses estados;
   * 
   * Exiba a média da população deste dicionário de estados;
   * 
   * Remova os estados com a população menor que 4.000.000;
   * 
   * Apague o dicionário de estados;
   * 
   * Confira se o dicionário está vazio.
   */
  public static void main(String[] args) {
    Map<String, Integer> regiaoNordeste = new HashMap<>();

    System.out.println("Crie um dicionário e relacione os estados e suas populações");
    regiaoNordeste.put("PE", 9616621);
    regiaoNordeste.put("AL", 3351543);
    regiaoNordeste.put("CE", 9187103);
    regiaoNordeste.put("RN", 3534265);
    System.out.println(regiaoNordeste);

    System.out.println("Substitua a população do estado do RN por 3.534.165");
    regiaoNordeste.put("RN", 3534165);
    System.out.println("População de RN: " + regiaoNordeste.get("RN"));

    System.out.println("Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277");
    System.out.println("Há o estado de PB? " + regiaoNordeste.containsKey("PB"));
    regiaoNordeste.put("PB", 4039277);

    System.out.println("Exiba a população PE");
    System.out.println(regiaoNordeste.get("PE"));

    System.out.println("Exiba todos os estados e suas populações na ordem que foi informado");
    Map<String, Integer> rN = new LinkedHashMap<>();
    rN.put("PE", 9616621);
    rN.put("AL", 3351543);
    rN.put("CE", 9187103);
    rN.put("RN", 3534265);
    System.out.println(rN);

    System.out.println("Exiba os estados e suas populações em ordem alfabética");
    Map<String, Integer> rNE = new TreeMap<>(regiaoNordeste);
    System.out.println(rNE);

    System.out.println("Exiba o estado com o menor população e sua quantidade");
    Map<String, Integer> menorPop = new HashMap<>();
    List<Integer> pop = new ArrayList<>();
    for (Map.Entry<String, Integer> estado : regiaoNordeste.entrySet()) {
      pop.add(estado.getValue());
    }
    for (Map.Entry<String, Integer> estado : regiaoNordeste.entrySet()) {
      if (estado.getValue() <= Collections.min(pop)) {
        menorPop.put(estado.getKey(), estado.getValue());
      }
    }
    System.out.println(menorPop);

    System.out.println("Exiba o estado com o maior população e sua quantidade");
    Map<String, Integer> maiorPop = new HashMap<>();
    List<Integer> pop1 = new ArrayList<>();
    for (Map.Entry<String, Integer> estado : regiaoNordeste.entrySet()) {
      pop1.add(estado.getValue());
    }
    for (Map.Entry<String, Integer> estado : regiaoNordeste.entrySet()) {
      if (estado.getValue() >= Collections.max(pop1)) {
        maiorPop.put(estado.getKey(), estado.getValue());
      }
    }
    System.out.println(maiorPop);

    System.out.println("Exiba a soma da população desses estados");
    int totalPop = 0;
    for (Map.Entry<String, Integer> estado : regiaoNordeste.entrySet()) {
      totalPop += (estado.getValue());
    }
    System.out.println(totalPop);

    System.out.println("Exiba a média da população deste dicionário de estados: " + (totalPop/regiaoNordeste.size()));

    System.out.println("Remova os estados com a população menor que 4.000.000");
    Iterator<Integer> iterator = regiaoNordeste.values().iterator();
    while(iterator.hasNext()){
      if (iterator.next() <= 4000000) iterator.remove();
    }
    
    System.out.println("Apague o dicionário de estados");
    regiaoNordeste.clear();

    System.out.println("Confira se o dicionário está vazio: "+regiaoNordeste.isEmpty());
  }
}
