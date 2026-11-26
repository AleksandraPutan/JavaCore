package lesson13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Задача 2");
        List<String> words = new ArrayList<>(List.of("яблоко", "кот", "собака", "дом", "машина"));
        Comparator<String> comparator = (word1, word2) -> (word1.length() < word2.length()) ? -1 : ((word1.length() == word2.length()) ? 0 : 1);
        Comparator<String> comparator2 = (word1, word2) -> word1.compareTo(word2);
        words.sort(comparator);

        System.out.println("Сортировка по длине слова:");
        for (String word : words) {
            System.out.print(word + ";");
        }
        words.sort(comparator2.reversed());

        System.out.println("\nСортировка по алфавиту:");
        for (String word : words) {
            System.out.print(word + ";");
        }
    }
}
