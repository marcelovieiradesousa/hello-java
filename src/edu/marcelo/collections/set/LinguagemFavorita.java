package edu.marcelo.collections.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.management.monitor.StringMonitorMBean;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

   public static void main(String[] args) {
      List<LinguagemFavorita> fav = new ArrayList<>(Arrays
            .asList(
                  new LinguagemFavorita("Python", 1989, "pyCharm"),
                  new LinguagemFavorita("Java", 1991, "intellij"),
                  new LinguagemFavorita("Kotlin", 2011, "Android Studio")));

      System.out.println("Ordem Natural (nome): ");
      Set<LinguagemFavorita> linguagemFavoritasTree = new TreeSet<>(fav);
      System.out.println(linguagemFavoritasTree);

      System.out.println("Ordem de Inserção");
      Set<LinguagemFavorita> linguagensFavoritasLnkd = new LinkedHashSet<>(fav);
      System.out.println(linguagensFavoritasLnkd);

      System.out.println("Ordem de IDE");
      Set<LinguagemFavorita> lFI = new TreeSet<>(new ComparatorIDE()); // Add class por ordem de IDE
      lFI.addAll(fav);
      System.out.println(lFI);

      System.out.println("Ano de criação e nome");
      Set<LinguagemFavorita> lFAN = new TreeSet<>(new ComparatorAnoENome());
      lFAN.addAll(fav);
      System.out.println(lFAN);

      System.out.println("Nome, ano de criacao e IDE");
      Set<LinguagemFavorita> lFNAI = new TreeSet<>(new ComparatorNomeAnoIde());
      lFNAI.addAll(fav);
      System.out.println(lFNAI);

      System.out.println("Ao final, exiba as linguagens no console, um abaixo da outra.");
      for(LinguagemFavorita ling : lFNAI){
         System.out.println(ling.nome);
      }
   }

   // props
   private String nome;
   private int anoDeCriacao;
   public String ide;

   LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
      this.nome = nome;
      this.anoDeCriacao = anoDeCriacao;
      this.ide = ide;
   }

   public String getNome() {
      return nome;
   }

   public int getAnoDeCriacao() {
      return anoDeCriacao;
   }

   public String getIde() {
      return ide;
   }

   @Override
   public String toString() {
      return "{" +
            "Nome = " + nome +
            " | Ano Criação = " + anoDeCriacao +
            " | IDE = " + ide +
            "}\n";
   }

   @Override
   public int compareTo(LinguagemFavorita o) {
      return this.nome.compareToIgnoreCase(o.getNome());
   }

}

class ComparatorIDE implements Comparator<LinguagemFavorita> {

   @Override
   public int compare(LinguagemFavorita fav1, LinguagemFavorita fav2) {

      return fav1.getIde().compareToIgnoreCase(fav2.getIde());
   }

}

class ComparatorAnoENome implements Comparator<LinguagemFavorita> {

   @Override
   public int compare(LinguagemFavorita fav1, LinguagemFavorita fav2) {
      int compareAno = Integer.compare(fav1.getAnoDeCriacao(), fav2.getAnoDeCriacao());
      if (compareAno != 0)
         return compareAno;
      return fav1.getNome().compareToIgnoreCase(fav2.getNome());
   }

}
class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita>{

   @Override
   public int compare(LinguagemFavorita fav1, LinguagemFavorita fav2) {
      int compareNome = fav1.getNome().compareToIgnoreCase(fav2.getNome());
      int compareAno = Integer.compare(fav1.getAnoDeCriacao(), fav2.getAnoDeCriacao());
      if (compareNome != 0)
         return compareNome;
      else if(compareAno != 0) return compareAno;
      return fav1.ide.compareToIgnoreCase(fav2.ide);
   }

}
