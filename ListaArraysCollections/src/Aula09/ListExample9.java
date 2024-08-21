package Aula09;
import java.util.ArrayList;
import java.util.List;

public class ListExample9 {
	public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        // Adiciona três cores à lista
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Cor no índice 1: " + colors.get(1));  // Exibe o segundo elemento: Green
    }
}
