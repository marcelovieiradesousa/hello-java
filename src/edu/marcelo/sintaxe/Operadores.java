package edu.marcelo.sintaxe;

public class Operadores {
  //Material de Estudo
  //https://felipe-silva-aguiar.gitbook.io/dio-java/gitbook/sintaxe/operadores
  public static void main(String[] args) {
    //Unários
    int numero = 0;
    System.out.println(numero--);
    System.out.println(numero);System.out.println(--numero);

    //Relacionais
    if(numero < 0.3){
      System.out.println("numero menor que 0.3");
    }


    //OPERADORES RELACIONAIS + LOGICOS
    double salarioMensal = 1320.50d;
    double mediaSalario = 2023.50d;
    int quantidadeDependentes = 4;
    int mediaDependentes = 2;

    /*MODO: hard */
    System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

    /*MODO: medium */
    boolean salarioBaixo = salarioMensal < mediaSalario;
    boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
    System.out.println(salarioBaixo && muitosDependentes);

    /*MODO: eeeeasy */
    boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
    System.out.println("Recebe auxílio? " + recebeAuxilio);

  }

}
