package bankaccountt;


public class User extends JointAccount {
    private int userID;

    
    public User(int userID) {
        this.userID = userID;
    }

    // Getter and setter for userID
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    // Static methods Debit and Credit as per requirement
    public static double Debit(double amount) {
        return getBalance() - amount;
    }

    public static double Credit(double amount) {
        return getBalance() + amount;
    }

    String getUserIdD() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
