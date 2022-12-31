package edu.marcelo.exercicios.metodos;

import java.time.LocalTime;

public class Saudacao {
  public static void momentoSaudacao(){
    LocalTime horaAgora = LocalTime.now();

    switch(horaAgora.getHour()){
      case 0, 1, 2, 3, 4, 5, 6, 18, 19, 20, 21, 22, 23 : 
        System.out.println("Bom noite!");
        break;
      case 7, 8, 9, 10, 11 : 
        System.out.println("Bom dia!");
        break;
      case 12, 13, 14, 15, 16, 17 : 
        System.out.println("Boa tarde!");
        break;
      
    }
  }
  public static void main(String[] args) {
    momentoSaudacao();
  }
}
