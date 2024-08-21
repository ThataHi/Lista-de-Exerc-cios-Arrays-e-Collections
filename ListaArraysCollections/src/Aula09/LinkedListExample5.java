package Aula09;
import java.util.LinkedList;

public class LinkedListExample5 {
	 public static void main(String[] args) {
	        LinkedList <String> list = new LinkedList<>();
	        list.add("Element A");
	        list.add("Element B");
	        list.add("Element C");
	        list.addFirst("Element 0");  // Adiciona ao início da lista

	        System.out.println(list);  // Exibe a lista: [Element 0, Element A, Element B, Element C]
	    }
	}