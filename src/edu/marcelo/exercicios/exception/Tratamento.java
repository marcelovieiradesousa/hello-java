package edu.marcelo.exercicios.exception;

import javax.swing.*;

public class Tratamento {
  public static void main(String[] args) {
    int[] numerador = { 4, 5, 8, 10 };
    int[] denominador = { 2, 4, 0, 2, 8 };

    for (int i = 0; i < denominador.length; i++) {
      try {
        if (numerador[i] % 2 != 0)
          throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);
        if (numerador[i] == 0 | denominador[i] == 0)
          throw new DivisaoPorZeroException("Divisão por zero não operável", numerador[i], denominador[i]);
        if (i >= (numerador.length) | i >= (denominador.length))
          throw new IndiceForaLimite(
              String.format("Divisão sem número existente. Índice %s fora dos limites", i),
              numerador[i], denominador[i]);

        int resultado = numerador[i] / denominador[i];
        System.out.println(resultado);
      } catch (DivisaoNaoExataException | DivisaoPorZeroException | IndiceForaLimite exception) {
        exception.printStackTrace();
        JOptionPane.showMessageDialog(null, exception.getMessage());
      }
    }

    System.out.println("O programa continua...");
  }
}
