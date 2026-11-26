package lesson11.exception;

public class NullNameException extends Exception{
    public NullNameException() {
        super("Пустое имя.");
    }
}
