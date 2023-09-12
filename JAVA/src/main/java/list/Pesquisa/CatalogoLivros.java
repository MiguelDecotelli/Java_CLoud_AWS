package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
  //atributo
  private List<Livro> livroList;

  public CatalogoLivros() {
    this.livroList = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    livroList.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> livrosPorAutor = new ArrayList<>();
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getAutor().equalsIgnoreCase(autor)) {
          livrosPorAutor.add(l);
        }
      }
      return livrosPorAutor;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
    List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
          livrosPorIntervaloAnos.add(l);
        }
      }
      return livrosPorIntervaloAnos;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public Livro pesquisarPorTitulo(String titulo) {
    Livro livroPorTitulo = null;
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getTitulo().equalsIgnoreCase(titulo)) {
          livroPorTitulo = l;
          break;
        }
      }
      return livroPorTitulo;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

public static void main(String[] args) {
    // Criar uma instância do CatalogoLivros
    CatalogoLivros catalogo = new CatalogoLivros();

    // Adicionar alguns livros ao catálogo
    catalogo.adicionarLivro("Java for Beginners", "John Doe", 2020);
    catalogo.adicionarLivro("Python Programming", "Jane Smith", 2019);
    catalogo.adicionarLivro("Web Development with JavaScript", "Alice Johnson", 2021);

    // Pesquisar livros por autor
    String autor = "John Doe";
    List<Livro> livrosPorAutor = catalogo.pesquisarPorAutor(autor);
    System.out.println("Livros por autor '" + autor + "':");
    for (Livro livro : livrosPorAutor) {
      System.out.println(livro);
    }

    // Pesquisar livros por intervalo de anos
    int anoInicial = 2019;
    int anoFinal = 2021;
    List<Livro> livrosPorIntervalo = catalogo.pesquisarPorIntervaloAnos(anoInicial, anoFinal);
    System.out.println("\nLivros no intervalo de anos " + anoInicial + " a " + anoFinal + ":");
    for (Livro livro : livrosPorIntervalo) {
      System.out.println(livro);
    }

    // Pesquisar livro por título
    String titulo = "Java for Beginners";
    Livro livroPorTitulo = catalogo.pesquisarPorTitulo(titulo);
    System.out.println("\nLivro com título '" + titulo + "':");
    System.out.println(livroPorTitulo);
  }
}