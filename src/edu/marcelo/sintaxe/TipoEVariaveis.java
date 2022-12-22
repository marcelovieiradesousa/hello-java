package edu.marcelo.sintaxe;

public class TipoEVariaveis {
  public static void main(String[] args) throws Exception {
    double salarioMinimo = 2500;
    short numeroCurto = 1;
    int numeroNorma1 = numeroCurto;
    short numeroCurt02 = (short) numeroNorma1;

    int numero = 5;
    numero = 18;

    System.out.print(numero);
    final double VALOR_DE_PI = 3.14;
  }

}
