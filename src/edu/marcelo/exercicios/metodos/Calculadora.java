package edu.marcelo.exercicios.metodos;

public class Calculadora {
  public static void somar(int ... nums){
    int soma = 0;
    for(int i : nums){
      soma += i;
    }
    System.out.println("Resultado da soma: "+soma);
  }
  public static void subtrair(int ... nums){
    int subtracao = nums[0]+nums[0];
    for(int i : nums){
      subtracao -= i;
    }
    System.out.println("Resultado da subtração: "+subtracao);
  }
  public static void multiplicar(double ... nums){
    double multiplicacao = 1;
    for(double i : nums){
      multiplicacao *= i;
    }
    System.out.println("Resultado da multiplicação: "+multiplicacao);
  }
  public static void dividir(double ... nums){
    double quociente = nums[0];
    for(int i = 1; i < nums.length; i++){
      quociente /= nums[i];
    }
    System.out.println("Resultado da divisão: "+quociente);
  }

  public static void main(String[] args) {
    int a= 1;
    int b = 2;
    int c = 3;
    somar(a, b);
    subtrair(c, a, b);
    multiplicar(a, c, 2.5);
    dividir(8, 2, b);
  }
}
