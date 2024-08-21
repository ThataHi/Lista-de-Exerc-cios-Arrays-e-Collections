package Aula09;
import java.util.Stack;

public class StackExample4 {
	public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Element 10");
        stack.push("Element 20");
        stack.push("Element 30");

        System.out.println("Top of the stack: " + stack.peek());  // Exibe o topo da pilha: "Element 30"
        System.out.println("Popped from stack: " + stack.pop());  //  Remove e exibe "Element 30"
    }
}
