package airlinee;

import airlineexception.IDNumberInvalidException;
import airlineexception.NotApplicableForDiscountException;
import java.util.Scanner;

public class Airlinee {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BuyTickets t1 = new BuyTickets();

        try {
            System.out.print("Enter age: ");
            int age = input.nextInt();
            
            System.out.print("Enter ticket price: ");
            double price = input.nextDouble();
            input.nextLine();  // Consume newline

            System.out.print("Enter ID: ");
            String ID = input.nextLine();
            
            System.out.print("Enter ID type (passport/nid): ");
            String idType = input.nextLine();

            t1.checkID(ID, idType);
            t1.giveDiscount(age, price);

        } catch (IDNumberInvalidException | NotApplicableForDiscountException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}
