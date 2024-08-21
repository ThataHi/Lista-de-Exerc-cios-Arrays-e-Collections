package Aula09;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterfaceExample8 {
	public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();// Cria uma coleção de Strings usando ArrayList
        
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Total numbers: " + numbers.size()); // Exibe o número de itens na coleção: 5
    }
}
