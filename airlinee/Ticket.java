package airlinee;

import airlineexception.NotApplicableForDiscountException;

public class Ticket {
    public void giveDiscount(int age, double price) throws NotApplicableForDiscountException {
        if (age >= 60) {
            System.out.println("Giving 6% discount");
            price = price * 0.94;
            System.out.println("Final price: " + price);
        } else if (age <= 10) {
            System.out.println("Giving 5% discount");
            price = price * 0.95;
            System.out.println("Final price: " + price);
        } else {
            throw new NotApplicableForDiscountException("Age group not included in discount offer");
        }
    }
}
