package edu.marcelo.collections.map;

import java.util.HashMap;
import java.util.Map;

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
    System.out.println(regiaoNordeste.get("PB"));
  }
}
