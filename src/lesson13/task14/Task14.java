package lesson13.task14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Task14 {
    public static void main(String[] args) {
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("Алёша", 33));
        listPerson.add(new Person("Наташа", 12));
        listPerson.add(new Person("Тимофей", 19));
        listPerson.add(new Person("Дима", 14));
        listPerson.add(new Person("Аля", 19));

        System.out.println("Вывод всех имён: ");
        listPerson.stream()
                .forEach(x -> System.out.println(x.getName()));

        System.out.println("Вывод совершеннолетних:");
        listPerson.stream()
                .filter(x -> x.getAge() > 18)
                .forEach(x -> System.out.println(x.getName()));

        int sum = listPerson.stream()
                .mapToInt(x -> x.getAge())
                .sum();
        long count = listPerson.stream()
                .count();
        System.out.println("Средний возраст: " + sum / count);

        OptionalInt max = listPerson.stream()
                .mapToInt(x -> x.getAge())
                .max();

        System.out.println("Самый старший: " + max.getAsInt());

        System.out.println("Список, отсортированный по возрасту: ");
        listPerson.stream()
                .sorted((x, y) -> Integer.compare(x.getAge(), y.getAge()))
                .forEach(x -> System.out.println(x.getName()));


    }

}
