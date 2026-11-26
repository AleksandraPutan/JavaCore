package lesson11.exception;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(int age) {
        super("Неправильный возраст, вы указали " + age + ", а нужно > 0 и < 125!!");
    }
}
