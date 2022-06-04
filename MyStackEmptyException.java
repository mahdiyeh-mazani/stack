package seri5;

public class MyStackEmptyException extends RuntimeException {

    public MyStackEmptyException() {
        super("empty");
    }
}
