package airlineexception;

public class NotApplicableForDiscountException extends Exception {
    public NotApplicableForDiscountException(String message) {
        super(message);
        System.out.println(message);
    }
}
