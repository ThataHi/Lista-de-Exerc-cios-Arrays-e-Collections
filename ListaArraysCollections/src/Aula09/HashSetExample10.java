package Aula09;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExample10 {
	public static void main(String[] args) {
        // Cria um conjunto de Strings com ordem de inserção preservada
        Set<String> fruits = new LinkedHashSet<>(); // Cria um conjunto de Strings com ordem de inserção preservada

        // Adiciona três frutas ao conjunto
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        fruits.add("Apple");  // Tenta adicionar "Apple" novamente (duplicado)

        System.out.println(fruits);  // Exibe os elementos do conjunto na ordem de inserção
    }
}
