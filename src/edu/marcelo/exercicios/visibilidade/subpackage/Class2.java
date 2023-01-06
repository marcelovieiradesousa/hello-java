package edu.marcelo.exercicios.visibilidade.subpackage;

import edu.marcelo.exercicios.visibilidade.Class1;

public class Class2 extends Class1 {

  void met(){
    int a = atributo2; //visível apenas para Class1, filhos e subpackages
    int b = atributo3; 
  }
  @Override
  protected void metodo2() { //visível apenas para Class1, filhos e subpackages
    // TODO Auto-generated method stub
    super.metodo2();
  }
  @Override
  public void metodo3() {
    // TODO Auto-generated method stub
    super.metodo3();
  }
}
