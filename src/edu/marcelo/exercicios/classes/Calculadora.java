package edu.marcelo.exercicios.classes;

public class Calculadora implements OperacoesMatematicas {

  @Override
  public void somar(double x, double y) {
    System.out.println(x + y);
  }

  @Override
  public void subtrair(double x, double y) {
    System.out.println(x - y);
  }

  @Override
  public void multiplicar(double x, double y) {
    System.out.println(x * y);  
  }

  @Override
  public void dividir(double x, double y) {
    System.out.println(x / y);
  }
  
}
