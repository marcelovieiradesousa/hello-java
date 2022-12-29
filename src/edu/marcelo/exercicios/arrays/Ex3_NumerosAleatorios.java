package edu.marcelo.exercicios.arrays;

import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class Ex3_NumerosAleatorios {
  public static void main(String[] args) {
    Random random = new Random();
    int[] numerosAleatorios = new int[20];

    System.out.print("Numeros aleatorios: ");
    for(int i = 0; i < 20; i++){
      numerosAleatorios[i] = random.nextInt(0,100);
      System.out.print(numerosAleatorios[i]+ " ");
    }

    System.out.print("\nNumeros sucessores: ");
    for(int num : numerosAleatorios){
      System.out.print((num+1) + " " );
    }
    
    System.out.print("\nNumeros antecessores: ");
    for(int num : numerosAleatorios){
      System.out.print((num-1) + " " );
    }
  }
}
