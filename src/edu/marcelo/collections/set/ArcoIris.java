package edu.marcelo.collections.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArcoIris {

     public static void main(String[] args) {
          String[] coresOrdemCorreta = { "vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta" };
          String[] coresOrdemAdd = { "vermelho", "amarelo", "verde", "anil", "violeta", "azul", "laranja" };

          Set<String> arcoIris = new HashSet<>();
          arcoIris.add("vermelho");
          arcoIris.add("amarelo");
          arcoIris.add("verde");
          arcoIris.add("anil");
          arcoIris.add("violeta");
          arcoIris.add("azul");
          arcoIris.add("laranja");

          System.out.println("Exiba todas as cores uma abaixo da outra: ");
          for (String cor : arcoIris)
               System.out.println(cor);

          System.out.println("=========================");

          System.out.println("A quantidade de cores que o arco-íris tem: " + arcoIris.size());

          System.out.println("=========================");

          Set<String> arcoIris2 = new TreeSet<>(arcoIris);
          System.out.println("Exiba as cores em ordem alfabética: " + arcoIris2);

          System.out.println("=========================");

          System.out.println("Exiba as cores na ordem inversa da que foi informada: ");
          Set<String> arcoIris3 = new LinkedHashSet<>(Arrays.asList(coresOrdemAdd));
          List arcoIrisList = new LinkedList<>(arcoIris3);
          System.out.println("Ordem original: " + arcoIrisList);
          Collections.reverse(arcoIrisList);
          System.out.println("Ordem reverse: " + arcoIrisList);

          System.out.println("=========================");

          System.out.println("Exiba todas as cores que começam com a letra ”v”");
          for (String cor : arcoIris) {
               if (cor.startsWith("v")) {
                    System.out.println(cor);
               }
          }

          System.out.println("=========================");

          System.out.println("Remova todas as cores que não começam com a letra “v”");
          Iterator<String> iterator = arcoIris.iterator();
          while (iterator.hasNext()) {
               if (!iterator.next().startsWith("v"))
                    iterator.remove();
          }
          System.out.println(arcoIris);

          System.out.println("=========================");

          System.out.println("Limpe o conjunto");
          arcoIris.clear();

          System.out.println("=========================");

          System.out.println("Confira se o conjunto está vazio: " + arcoIris.isEmpty());

     }
}
