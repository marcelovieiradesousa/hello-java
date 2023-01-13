package edu.marcelo.collections.map;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class DesafioDado {
  /*
   * Faça um programa que simule um lançamento de dados.
   * 
   * Lance o dado 100 vezes e armazene.
   * 
   * Depois, mostre quantas vezes cada valor foi inserido.
   */
  public static void main(String[] args) {
    Random lance = new Random();
    int[] dado = new int[100];
    Map<Integer, Integer> dic = new TreeMap<>();

    dic.put(1, 0);
    dic.put(2, 0);
    dic.put(3, 0);
    dic.put(4, 0);
    dic.put(5, 0);
    dic.put(6, 0);

    for (int i = 0; i < 100; i++) {
      dado[i] = lance.nextInt(1, 7);
      int qtd = dic.get(dado[i]);
      switch (dado[i]) {
        case 1:
          dic.put(1, ++qtd);
          break;
        case 2:
          dic.put(2, ++qtd);
          break;
        case 3:
          dic.put(3, ++qtd);
          break;
        case 4:
          dic.put(4, ++qtd);
          break;
        case 5:
          dic.put(5, ++qtd);
          break;
        case 6:
          dic.put(6, ++qtd);
          break;
      }
    }
    System.out.println("Face | Qtd de vezes");
    System.out.println(dic);
  }
}
