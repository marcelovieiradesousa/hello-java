package edu.marcelo.collections.set;

public class Game implements Comparable<Game> {
  String name;
  int mature;
  Boolean singlePlayer;

  public Game(String name, int mature, Boolean singlePlayer) {
    this.name = name;
    this.mature = mature;
    this.singlePlayer = singlePlayer;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "{" + 
    "Nome='" + name + '\'' +
    " | Classificação Indicativa='" + mature + '\'' +
    " | Apenas SinglePlayer=" + singlePlayer  +
    "}\n";
  }

  public String getName() {
    return name;
  }

  public int getMature() {
    return mature;
  }

  public Boolean getSinglePlayer() {
    return singlePlayer;
  }

    /**
   * <p>
   * Ordem de comparação: {@code singlePlayer} > {@code mature} > {@code name}
   */
  @Override
  public int compareTo(Game o) {
    
    int compareSinglePlayer = Boolean.compare(this.singlePlayer, o.singlePlayer);
    if(compareSinglePlayer != 0) return compareSinglePlayer;

    int compareMature = Integer.compare(this.mature, o.mature);
    if(compareMature != 0) return compareMature;

    int compareName = this.name.compareToIgnoreCase(o.getName());
    return compareName;
  }
}