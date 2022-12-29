package edu.marcelo.exercicios.arrays;
/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

public class Ex2_Consoantes {
  public static void main(String[] args) {
    String [] vetor = {"m","a","r","c","e","l","o"};
    int qtdConsoante = 0;

    for(int i = 0; i < vetor.length; i++){
      switch(vetor[i]){
        case "a": 
          qtdConsoante++;
          System.out.println("Consoante: "+vetor[i]);
          break;
        case "e": 
          qtdConsoante++;
          System.out.println("Consoante: "+vetor[i]);
          break;
        case "i":
          qtdConsoante++;
          System.out.println("Consoante: "+vetor[i]);
          break;
        case "o":
          qtdConsoante++;
          System.out.println("Consoante: "+vetor[i]);
          break;
        case "u":
          qtdConsoante++;
          System.out.println("Consoante: "+vetor[i]);
          break;
      }
    }
    System.out.println("Quantidade de Consoantes: "+qtdConsoante);
  }
}
