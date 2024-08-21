package Aula09;
import java.util.Vector;

public class VectorExemple3 {
	public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);

        // Exibe o conteúdo do vetor
        System.out.println("Vector: " + vector);  // Exibe o vetor: [10, 20, 30, 40]
    }
}
