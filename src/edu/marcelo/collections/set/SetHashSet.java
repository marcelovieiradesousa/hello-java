package edu.marcelo.collections.set;

import java.util.Set;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class SetHashSet {
  public static void main(String[] args) {
    Game jogo1 = new Game("Def Jam Fight NY", 18, false);
    Game jogo2 = new Game("Mortal Kombat Shaolin Monks", 12, false);
    Game jogo3 = new Game("God of War", 8, true);
    Game jogo4 = new Game("Mario Bros", 0, false);

    System.out.print("Crie um conjunto e adicione as os jogos:");
    Set<Game> myGames = new HashSet<>(Arrays.asList(jogo1, jogo2, jogo3, jogo4));

    // Todas essas questões são apenas aplicadas ao List!
    System.out.println("Exiba a posicäo do jogo3");// indexOf
    System.out.println("Adicione na lista o jogo GOTY de 2021 na posição 2");// add
    System.out.println("Substitua o jogo GOTY de 2021 pelo jogo de 2022"); // set

    System.out.println("Confira se o jogo2 está no conjunto");
    System.out.println("Jogo2 está no conjunto? " + myGames.contains(jogo2));

    System.out.println("Exiba o jogo com a maioridade maior para se jogar: " + Collections.max(myGames));

    System.out.println("Exiba o jogo com a maioridade menor para se jogar: " + Collections.min(myGames));
    // Iterator<Double> iterator = notas.iterator();
    // Double soma = 0.0;
    // while (iterator.hasNext()) {
    //   Double next = iterator.next();
    //   soma += next;
    // }
    System.out.println("Exiba a soma dos valores: ");
    System.out.println("Exiba a média das notas" );
    System.out.println("Remova a nota da posição 0");//indexOf
    System.out.println("Remova as notas menores que 7 e exiba a lista: ");
    System.out.println("Exiba todas as notas na ordem em que foram informados");//toString, porem não funciona com HashSet, apenas com LinkedHashSet, que guarda a ordem de inserção, e com TreeSet.
    System.out.println("Exiba todas as notas na ordem crescente: ");//toString() + compareTo() ambos sobrescritos na class do construtor se precisar;
    System.out.println("Apaque todo o conjunto");//clear
  }
}
