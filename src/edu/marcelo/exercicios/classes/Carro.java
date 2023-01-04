package edu.marcelo.exercicios.classes;

public class Carro {
  String cor;
  String modelo;
  int capacidadeTanque;

  //Construtor
  void setCor(String cor){
    this.cor = cor;
  }
  public String getCor() {
    return cor;
  }
  void setModelo(String modelo){
    this.modelo = modelo;
  }
  public String getModelo() {
    return modelo;
  }
  public void setCapacidadeTanque(int capacidadeTanque) {
    this.capacidadeTanque = capacidadeTanque;
  }
  public int getCapacidadeTanque() {
    return capacidadeTanque;
  }

  double totalValorTanque(double valorCombustivel){
    return capacidadeTanque * valorCombustivel;
  }
}
