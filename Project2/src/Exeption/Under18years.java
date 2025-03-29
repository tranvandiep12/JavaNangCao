package Exeption;

public class Under18years extends RuntimeException{
    public Under18years(String message) {
        super(message);
    }
}
