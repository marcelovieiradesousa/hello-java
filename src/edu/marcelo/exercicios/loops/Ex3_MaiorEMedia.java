package edu.marcelo.exercicios.loops;

import java.util.Scanner;
/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n1;
    double soma = 0;
    int maior = 0;
    int count = 0;
    double media;
    while(count < 5){
      System.out.println("Digite um número inteiro: ");
      n1 = scanner.nextInt();
      soma += n1;
      if(n1 > maior) maior = n1;
      ++count;
    }

    System.out.println("Maior número digitado foi " + maior);
    media = (soma/5);
    System.out.println("A media dos numeros foi " + media);
  }
}
// 48 linhas