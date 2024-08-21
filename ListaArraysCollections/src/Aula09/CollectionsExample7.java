package Aula09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample7 {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Banana");
        items.add("Apple");
        items.add("Orange");

        Collections.sort(items, Collections.reverseOrder());  // Ordena a ordem decrescente

        System.out.println(items);  // Saída: [Pineapple, Orange, Grape, Banana, Apple]
    }
}

