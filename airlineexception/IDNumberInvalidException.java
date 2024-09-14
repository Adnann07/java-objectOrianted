package airlineexception;

public class IDNumberInvalidException extends Exception {
    public IDNumberInvalidException(String message) {
        super(message);
        System.out.println(message);
    }
}
