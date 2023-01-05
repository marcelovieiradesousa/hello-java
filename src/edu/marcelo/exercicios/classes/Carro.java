package edu.marcelo.exercicios.classes;
public class Carro extends Veiculo{
  //Attributes
  String cor;
  String modelo;
  int capacidadeTanque;

  //Constructors
  Carro(){}
  Carro(String cor, String modelo, int capTanque){
    this.cor = cor;
    this.modelo = modelo;
    this.capacidadeTanque = capTanque;
  }

  //Methods
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

  public static void main(String[] args) {
    Carro carrin = new Carro();
    carrin.setCor("Amarelo");
    carrin.setModelo("Fiat Uno");
    carrin.setCapacidadeTanque(120);

    double valorTanqueCheio = carrin.totalValorTanque(4.98);

    //Upcast
    Veiculo up = new Carro("vermelho", "Jaguar", 50);
    //Downcast
    //Carro down = (Carro) new Veiculo(); Error: java.lang.ClassCastException:
  }
}
