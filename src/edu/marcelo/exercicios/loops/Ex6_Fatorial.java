package edu.marcelo.exercicios.loops;
/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite um fatorial: ");
      int fat = scanner.nextInt();
      int result = 1;
      System.out.print(fat + "! = ");
      while(fat > 1){
        result = result * fat;
        --fat; 
      }
      System.out.print(result);
    }
}
