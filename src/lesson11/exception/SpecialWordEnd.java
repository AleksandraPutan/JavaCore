package lesson11.exception;

public class SpecialWordEnd extends RuntimeException{
    public SpecialWordEnd(){
        super("Введено специальное слово, программа завершена досрочно.");
    }
}
