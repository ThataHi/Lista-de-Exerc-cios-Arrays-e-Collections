package Aula09;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample12 {
	 public static void main(String[] args) {
	        List<Integer> numbers = new ArrayList<>(); // Cria uma lista de Strings
	        
	        // Adiciona alguns números à lista
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        numbers.add(50);
	        
	        Iterator<Integer> iterator = numbers.iterator(); // Obtém um iterador para a lista
	        
	        while (iterator.hasNext()) { // Verifica se há mais elementos na lista
	            Integer number = iterator.next();
	            System.out.println(number); // Exibe o próximo elemento e avança o iterador
	        }
	    }
}
