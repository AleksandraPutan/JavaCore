package lesson11.main;

import lesson11.exception.InvalidAgeException;
import lesson11.exception.NullNameException;
import lesson11.exception.SpecialWordEnd;
import lesson11.model.Person;

import java.util.Scanner;

public class Main {

    public static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        Person person = new Person();

        System.out.println("Введите ваше имя");
        String name = SCANNER.next();
        System.out.println("Введите ваш возраст:");
        int age = SCANNER.nextInt();
        /*person.setName(name);*/
        person.setAge(age);

        try {
            person.validData(person.getName(), person.getAge());
        } catch (NullNameException e) {
            System.err.println("Поймали ошибку NullNameException. " + e.getMessage());
        }
        catch (InvalidAgeException e) {
            System.err.println("Поймали ошибку InvalidAgeException. " + e.getMessage());
        }finally {
            System.out.println("Блок finally после validName() выполнен.");
        }

        System.out.println("Введите любое слово:");
        String word = SCANNER.next();

        if (word.equals("Стоп")) {
            throw new SpecialWordEnd();
        } else System.out.println("Вы ввели " + word);

        System.out.println("Метод после ошибки SpecialWordEnd.");
    }

}
