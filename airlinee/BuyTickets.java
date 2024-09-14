package airlinee;

import airlineexception.IDNumberInvalidException;

public class BuyTickets extends Ticket {

    public void checkID(String id, String type) throws IDNumberInvalidException {
        if (type.equals("passport")) {
            if (id.length() != 9) {
                throw new IDNumberInvalidException("Passport number is invalid");
            }
        } else if (type.equals("nid")) {
            if (id.length() != 10) {
                throw new IDNumberInvalidException("NID is invalid");
            }
        }
        System.out.println("ID is valid");
    }
}
