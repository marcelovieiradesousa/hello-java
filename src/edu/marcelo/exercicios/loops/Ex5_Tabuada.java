package edu.marcelo.exercicios.loops;

import java.util.Scanner;
/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class Ex5_Tabuada {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um numero de 1 a 10 para saber sua tabuada: ");
    int num = scanner.nextInt();

    //5 x i = result
    for(int i = 1; i < 11; i++){
      int result = num * i;
      System.out.println(String.format("%s x %s = %s", num, i, result)); //interpolação de string!
    }
  }
}
