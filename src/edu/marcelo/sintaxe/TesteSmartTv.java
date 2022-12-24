package edu.marcelo.sintaxe;

public class TesteSmartTv {
public static void main(String[] args) {
  //Bateria de Testes
  TesteSmartTv teste = new TesteSmartTv();
  teste.testarAlterarStatusTv();
  teste.testarAlterarCanal();
  teste.testarAlterarVolume();
}

  public TesteSmartTv(){} //Construtor
  
  //Testes
  public void testarAlterarStatusTv(){
    SmartTv tvQuarto = new SmartTv(false, 5, 12);
    boolean tvLigada = true;

    tvQuarto.alterarStatusTv();
    boolean resultado = tvQuarto.ligada;

    if(resultado == tvLigada){
      System.out.println( "Teste alterarStatTv() OK!");
    }else{
      System.out.println("Teste alterarStatTv() Falhou!");
    }
  }

  public void testarAlterarCanal(){
    SmartTv tvGaragem = new SmartTv(false, 7, 16);
    int canal2 = 2;//mock de uso opcional
    int canalNaoAlterado = tvGaragem.canal;

    tvGaragem.alterarCanal(canal2);
    int [] resultadosEsperados = {2, 8};
    

    for(int x = 0; x < 2; x++){
      if(resultadosEsperados[x] == tvGaragem.canal){
        System.out.println( "Teste alterarCanal() OK!");
      }
    }
    if(tvGaragem.canal == canalNaoAlterado) System.out.println("Teste alterarCanal() Falhou!");
  }

  public void testarAlterarVolume(){
    SmartTv tvSala = new SmartTv(true, 12, 60);
    int volume61 = 61;
    int volume60 = 60;

    tvSala.aumentarVolume();
    int resultado1 = tvSala.volume;
    tvSala.diminuirVolume();
    int resultado2 = tvSala.volume;

    if(resultado1 == volume61 && resultado2 == volume60){
      System.out.println( "Teste aumentarVolume() e diminuirVolume() OK!");
    }else{
      System.out.println("Teste aumentarVolume() e diminuirVolume() Falhou!");
    }
  }
}
