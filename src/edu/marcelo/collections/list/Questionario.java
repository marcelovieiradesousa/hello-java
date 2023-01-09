package edu.marcelo.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questionario {
  /*
   * Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa
   * sobre um crime. As perguntas são:
   * 1. "Telefonou para a vítima?"
   * 2. "Esteve no local do crime?"
   * 3. "Mora perto da vítima?"
   * 4. "Devia para a vítima?"
   * 5. "Já trabalhou com a vítima?"
   * 
   * Se a pessoa responder positivamente a 2 questões ela deve ser classificada
   * como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassina". Caso contrário, ela será classificado como "Inocente".
   */

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<String> questoes = new ArrayList<>();
    questoes.add("Telefonou para a vítima?");
    questoes.add("Esteve no local do crime?");
    questoes.add("Mora perto da vítima?");
    questoes.add("Devia para a vítima?");
    questoes.add("Já trabalhou com a vítima?");

    System.out.println("Iremos fazer umas perguntas: 0 para NÃO | 1 para SIM");


    while (true) {
      int resposta;
      String classificacao = "Inocente até qie se prove o contrário";
      for (String pergunta : questoes) {
        System.out.println(pergunta);
        resposta = scan.nextInt();
        if (resposta == 1) {
          switch (questoes.indexOf(pergunta)) {
            case 0, 1:
              classificacao = "Suspeita";
              break;
            case 2, 3:
              classificacao = "Cúmplice";
              break;
            case 4:
              classificacao = "Assassina";
              break;
            default:
              classificacao = "Inocente";
              break;
          }
        }
      }
      System.out.println("Resultado -> " + classificacao);
      return;
    }
  }
}
