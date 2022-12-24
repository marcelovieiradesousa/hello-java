package edu.marcelo.sintaxe;

import java.util.Optional;

public class SmartTv {
  public boolean ligada;
  public int canal;
  public int volume;

  public SmartTv() {
  } // Construtor

  public SmartTv(boolean ligada, int canal, int volume) {
    this.ligada = ligada;
    this.canal = canal;
    this.volume = volume;
  }

  public void alterarStatusTv() {
    this.ligada = !ligada;
  }

  public void alterarCanal(int... alt) {
    this.canal = (alt.length > 0) ? alt[0] : ++this.canal;
  }

  public void aumentarVolume() {
    this.volume++;
  }

  public void diminuirVolume() {
    this.volume--;
  }

}
