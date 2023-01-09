package edu.marcelo.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class SetTreeSet {
  // TreeSet necessita do Comparetor para o toString
  public static void main(String[] args) {
    Game jogo1 = new Game("Def Jam Fight NY", 18, false);
    Game jogo2 = new Game("Mortal Kombat Shaolin Monks", 12, false);
    Game jogo3 = new Game("God of War", 18, true);
    Game jogo4 = new Game("Mario Bros", 18, true);
    Set<Game> myGames = new TreeSet<>();
    myGames.add(jogo1);
    myGames.add(jogo2);
    myGames.add(jogo3);
    myGames.add(jogo4);

    System.out.println(myGames.toString());
  }
 
  
}