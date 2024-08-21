package Aula09;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample2 {
	 public static void main(String[] args) {
	        Deque<String> queue = new ArrayDeque<>();
	        
	        queue.offer("First");
	        queue.offer("Second");
	        queue.offer("Third");

	        // Removendo e exibindo o primeiro elemento inserido (FIFO)
	        System.out.println("Removed: " + queue.poll());  // Exibe "First"
	    }
}
