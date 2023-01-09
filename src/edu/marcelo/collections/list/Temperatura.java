package edu.marcelo.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Temperatura {
  /** 
   * Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
   * 
   * Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 - Fevereiro e etc).
   */
  public static void main(String[] args) {
    List<Integer> temperaturas = new ArrayList<Integer>();
    temperaturas.add(27);
    temperaturas.add(21);
    temperaturas.add(25);
    temperaturas.add(28);
    temperaturas.add(26);
    temperaturas.add(30);

    int soma = 0;
    for (int temperatura : temperaturas) {
      soma += temperatura;
    }
    double mediaSemestral = soma / temperaturas.size();

    System.out.println("Temperaturas acima da média: Mês | Temp.");
    for (Integer temperatura : temperaturas) {
      if(temperatura > mediaSemestral){
        switch (temperaturas.indexOf(temperatura)) {
          case 0:
            System.out.println("Janeiro | " + temperatura.toString());
            break;
          case 1:
            System.out.println("Fevereiro | " + temperatura.toString());
            break;
          case 2:
            System.out.println("Março | " + temperatura.toString());
            break;
          case 3:
            System.out.println("Abril | " + temperatura.toString());
            break;
          case 4:
            System.out.println("Maio | " + temperatura.toString());
            break;
          case 5:
            System.out.println("Junho | " + temperatura.toString());
            break;
          case 6:
            System.out.println("Julho | " + temperatura.toString());
            break;
          case 7:
            System.out.println("Agosto | " + temperatura.toString());
            break;
          case 8:
            System.out.println("Setembro | " + temperatura.toString());
            break;
          case 9:
            System.out.println("Outubro | " + temperatura.toString());
            break;
          case 10:
            System.out.println("Novembro " + temperatura.toString());
            break;
          case 11:
            System.out.println("Dezembro " + temperatura.toString());
            break;
  
        }
      }
    }
  }
}
