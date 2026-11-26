package lesson12.exception;

public class InvalidProductDateException extends RuntimeException {
    public InvalidProductDateException(String message) {
        super(message);
    }
}
