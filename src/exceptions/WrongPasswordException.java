package exceptions;

public class WrongPasswordException extends RuntimeException{
    public WrongPasswordException(String s) {
        super(s);
    }
}
