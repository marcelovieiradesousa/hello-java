package edu.marcelo.exercicios.metodos;

//Utilizando Sobrecarga em métodos!
public class Quadrilatero {
  /**
   * @param lado determina valores positivos para um Quadrado.
   * <p>
   * Assinatura: {@code area(double lado)}
   */
  public static double area(double lado) {

    return (lado * lado);
  }

  /**
   * @param lado1 determina valores positivos para um Retângulo.
   * @param lado2 determina valores positivos para um Retângulo.
   * <p>
   * Assinatura: {@code area(double lado, double lado)}
   */
  public static double area(double lado1, double lado2) {
    return (lado2 * lado2);
  }

  /**
   * @param baseMaior determina valores positivos para a base maior do Trapézio.
   * @param baseMenor determina valores positivos para a base menor do Trapézio.
   * @param altura determina valores positivos para a altura do Trapézio
   * <p>
   * Assinatura: {@code area(double baseMaior, double baseMenor, double altura)}
   */
  public static double area(double baseMaior, double baseMenor, double altura) {
    return (((baseMaior + baseMenor) * altura) / 2);
  }

  /**
   * @param diagonal1 determina valores positivos para uma diagonal do Losango.
   * @param diagonal2 determina valores positivos para uma diagonal do  Losango.
   * <p>
   * Assinatura: {@code area(float diagonal1, float diagonal2)}
   */
  public static float area(float diagonal1, float diagonal2) {
    return ((diagonal1 * diagonal2) / 2);
  }

  public static void main(String[] args) {
    //Retornos
    /*
     Retornos são tipos de dados definidos no método semelhantes aos valores inseridos após a key-word 'return'
     */
    double areaQuadrado = Quadrilatero.area(5);
    double areaRetangulo = Quadrilatero.area(5d, 4d);
    double areaTrapezio = Quadrilatero.area(10, 15, 20);
    float areaLosango = Quadrilatero.area(5f, 7f);

    System.out.println("Área do Quadrado: " + areaQuadrado);
    System.out.println("Área do Retângulo: " + areaRetangulo);
    System.out.println("Área do Trapézio: " + areaTrapezio);
    System.out.println("Área do Losango: " + areaLosango);
  }
}