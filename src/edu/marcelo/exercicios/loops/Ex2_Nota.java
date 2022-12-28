package edu.marcelo.exercicios.loops;

import java.util.Scanner;
/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo até que o usuário informe um valor válido.
*/

public class Ex2_Nota {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int nota;

    do {
      System.out.println("Digite um valor válido entre 0 e 10: ");
      nota = scanner.nextInt();
    }while(nota < 0 || nota > 10); 
    
  }
}
