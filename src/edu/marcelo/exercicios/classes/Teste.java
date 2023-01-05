package edu.marcelo.exercicios.classes;

public class Teste {
  public static void main(String[] args) {
    // Funcionario[] classes = new Funcionario[]{new Faxineiro(), new Vendedor(), new Funcionario()};
  
    // for(Funcionario classe : classes){
    //   classe.metodo2();
    //   System.out.println(classe.getClass());
    // }

    System.out.println(" ================ mesma coisa que ↓");

    Funcionario fax = new Faxineiro();
    Funcionario ven = new Vendedor();
    Funcionario fun = new Funcionario();
    Faxineiro objFax = new Faxineiro();

    fax.metodo2(); //Herança
    System.out.println(fax.getClass());
    ven.metodo2(); //Polimorfismo
    System.out.println(ven.getClass());
    fun.metodo2(); //Metodo comum a instancia da classe
    System.out.println(fun.getClass());
    objFax.metodo2(); //Sobrescrita 
    System.out.println(objFax.getClass());

  }  


}
