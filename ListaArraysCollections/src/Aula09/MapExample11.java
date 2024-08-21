package Aula09;
import java.util.HashMap;
import java.util.Map;

public class MapExample11 {
	public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>(); // Cria um mapa de Strings (nomes) para Integers (idades)

        // Adiciona três pares chave-valor ao mapa
        ageMap.put("Alice", 28);
        ageMap.put("Bob", 35);
        ageMap.put("Charlie", 22);

        // Exibe a idade de uma pessoa específica
        String personToFind = "Bob"; // Nome da pessoa cuja idade queremos encontrar
        Integer age = ageMap.get(personToFind); // Recupera a idade associada ao nome

        if (age != null) {
            System.out.println(personToFind + "'s age: " + age);
        } else {
            System.out.println(personToFind + " not found in the map.");
        }
    }
}
