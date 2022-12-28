package edu.marcelo.exercicios.loops;

import java.util.Scanner;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de numeros inteiros a serem digitados: ");
    int n = scanner.nextInt();
    int qtdPares = 0;
    int qtdImpares = 0;
    for(int q = 0; q < n; q++){
      System.out.println("Digite um numero inteiro");
      int inteiro = scanner.nextInt();

      if(inteiro % 2 == 0){
        ++qtdPares;
      }else ++qtdImpares;
    }
    
    System.out.println("Quantidade de números pares são: " + qtdPares);    
    System.out.println("Quantidade de números ímpares são: " + qtdImpares);
  }
}
