package Task_1;

public class WrongPasswordException extends RuntimeException{
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}