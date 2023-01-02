package edu.marcelo.exercicios.metodos;

//Utilizando Sobrecarga em métodos!
public class Quadrilatero {
  /**
   * @param lado determina valores positivos para um Quadrado.
   * <p>
   * Assinatura: {@code area(double lado)}
   */
  public static void area(double lado) {

    System.out.println("Área do Quadrado: " + lado * lado);
  }

  /**
   * @param lado1 determina valores positivos para um Retângulo.
   * @param lado2 determina valores positivos para um Retângulo.
   * <p>
   * Assinatura: {@code area(double lado, double lado)}
   */
  public static void area(double lado1, double lado2) {
    System.out.println("Área do Retângulo: " + lado2 * lado2);
  }

  /**
   * @param baseMaior determina valores positivos para a base maior do Trapézio.
   * @param baseMenor determina valores positivos para a base menor do Trapézio.
   * @param altura determina valores positivos para a altura do Trapézio
   * <p>
   * Assinatura: {@code area(double baseMaior, double baseMenor, double altura)}
   */
  public static void area(double baseMaior, double baseMenor, double altura) {
    System.out.println("Área do Trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
  }

  /**
   * @param diagonal1 determina valores positivos para uma diagonal do Losango.
   * @param diagonal2 determina valores positivos para uma diagonal do  Losango.
   * <p>
   * Assinatura: {@code area(float diagonal1, float diagonal2)}
   */
  public static void area(float diagonal1, float diagonal2) {
    System.out.println("Área do Losango: " + (diagonal1 * diagonal2) / 2);
  }

  public static void main(String[] args) {
    Quadrilatero.area(5);
    Quadrilatero.area(5d, 4d);
    Quadrilatero.area(10, 15, 20);
    Quadrilatero.area(5f, 7f);
  }
}