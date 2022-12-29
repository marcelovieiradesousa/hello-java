package edu.marcelo.exercicios.arrays;

import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/
public class Ex4_ArrayMultidimensional {
  public static void main(String[] args) {
    Random random  = new Random();
    int[][] matriz = new int[4][4]; //[] representa o tamanho!
    // int [] vetor = new int[5];//[] representa o tamanho!
    // vetor[4] = 90; // [] representa o index
    
    for(int x = 0; x < matriz.length; x++){
      for(int y = 0; y < matriz[x].length; y++){
        matriz[x][y] = random .nextInt(9);
      }
    }
    System.out.println("Matriz 4x4: ");
    for(int[] x : matriz){
      for(int y : x){
        System.out.print(y + " ");
      }
      System.out.println();
    }

  }
}
