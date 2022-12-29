package edu.marcelo.exercicios.arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
  public static void main(String[] args) {
    int [] vetor = {4,6,9,8,5,4};
    int index = vetor.length - 1; 

    for(int i = -1; i < index; index--){
      System.out.println(String.format("Ordem inversa do vetor |  Índice %s - Valor: %s", index, vetor[index]));
    }
  } 
}
