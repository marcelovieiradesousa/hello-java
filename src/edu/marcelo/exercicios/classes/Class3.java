package edu.marcelo.exercicios.classes;

import edu.marcelo.exercicios.visibilidade.Class1;

public class Class3 {
  Class1 class1; //importado

  void met(){
    int a = class1.atributo3; // apenas esse pode ser visto fora da classe e pacote
    class1.metodo3();// apenas esse pode ser visto fora da classe e pacote
  }
}
