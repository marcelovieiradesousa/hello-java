package edu.marcelo.exercicios.metodos;

public class Emprestimo {
  public static void calcularEmprestimo(double valor){
    double [] taxas = {0.2, 0.5, 0.7};
    double valorFinal = 0;
    if(valor < 0){
      System.out.println("Empréstimo não aceita doações 🤡");
    }else if( valor >= 1 && valor < 500){
      valorFinal = valor + (taxas[0] * valor);
      exibirEmprestimo(valorFinal);
    }else if(valor >= 500 && valor < 1000){
      valorFinal = valor + (taxas[1] * valor);
      exibirEmprestimo(valorFinal);
    }else{
      valorFinal = valor + (taxas[2] * valor);
      exibirEmprestimo(valorFinal);
    }
  }
  public static void exibirEmprestimo(double valor){
    System.out.println("Valor do empréstimo é "+valor);
  }
  public static void main(String[] args) {
    calcularEmprestimo(-10);
  }
}
