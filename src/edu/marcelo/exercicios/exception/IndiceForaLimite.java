package edu.marcelo.exercicios.exception;

public class IndiceForaLimite extends Exception{

  private int numerador;
  private int denominador;

  public IndiceForaLimite(String message, int numerador, int denominador) {
    super(message);
    this.numerador = numerador;
    this.denominador = denominador;
  }
  
}
