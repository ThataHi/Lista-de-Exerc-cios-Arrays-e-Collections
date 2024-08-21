package Aula09;
import java.util.Iterator;

//Classe personalizada que implementa Iterable
class ColecaoPersonalizada<T> implements Iterable<T> {
 private T[] elementos;
 private int tamanho;

 @SuppressWarnings("unchecked")
 public ColecaoPersonalizada(int capacidade) {
     elementos = (T[]) new Object[capacidade];
     tamanho = 0;
 }

 public void adicionar(T elemento) {
     if (tamanho < elementos.length) {
         elementos[tamanho++] = elemento;
     } else {
         System.out.println("Coleção cheia.");
     }
 }

 public int getTamanho() {
     return tamanho;
 }

 @Override
 public Iterator<T> iterator() {
     return new Iterator<T>() {
         private int indiceAtual = 0;

         @Override
         public boolean hasNext() {
             return indiceAtual < tamanho;
         }

         @Override
         public T next() {
             return elementos[indiceAtual++];
         }
     };
 }
}

public class InterableExample6 {
	public static void main(String[] args) {
        ColecaoPersonalizada<String> colecao = new ColecaoPersonalizada<>(5);
        colecao.adicionar("Elemento 1");
        colecao.adicionar("Elemento 2");
        colecao.adicionar("Elemento 3");

        // Iterando sobre os elementos usando for-each
        for (String elemento : colecao) {
            System.out.println(elemento);
        }
    }
}
