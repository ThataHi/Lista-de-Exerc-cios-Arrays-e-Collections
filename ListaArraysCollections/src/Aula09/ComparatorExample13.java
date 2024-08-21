package Aula09;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Produto implements Comparable<Produto> {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.preco, outro.preco);  // Compara os preços para ordenar os produtos
    }

    @Override
    public String toString() {
        return nome + " - " + preco;
    }
}

class NomeComparator implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return p1.nome.compareTo(p2.nome);  // Compara os nomes para ordenar os produtos
    }
}
public class ComparatorExample13 {
	public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();  // Cria uma lista de produtos
        produtos.add(new Produto("Arroz", 5.99));     // Adiciona um novo produto à lista
        produtos.add(new Produto("Feijão", 3.49));    // Adiciona um novo produto à lista
        produtos.add(new Produto("Macarrão", 4.89));   // Adiciona um novo produto à lista
        produtos.add(new Produto("Açúcar", 2.99));     // Adiciona um novo produto à lista

        Collections.sort(produtos);  // Usa o compareTo() para ordenar por preço
        System.out.println("Ordenado por preço:");
        System.out.println(produtos);  // Exibe a lista ordenada por preço

        Collections.sort(produtos, new NomeComparator());  // Usa o NomeComparator para ordenar por nome
        System.out.println("Ordenado por nome:");
        System.out.println(produtos);  // Exibe a lista ordenada por nome
    }
}
