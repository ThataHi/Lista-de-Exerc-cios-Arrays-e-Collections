package Aula09;
import java.util.Arrays;

public class ArraysExemple1 {
	public static void main(String[] args) {
        String[] cities = {"Campinas", "Jaguariúna", "São Paulo", "Hotolândia"};

        Arrays.sort(cities);
        System.out.println(Arrays.toString(cities)); // Exibe o array ordenado
        
        int index = Arrays.binarySearch(cities, "Jaguariúna"); // Busca binária
        System.out.println("Index of 'Jaguariúna': " + index);  // Exibe a cidade
    }
}
