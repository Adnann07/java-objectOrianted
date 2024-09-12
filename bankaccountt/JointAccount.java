package bankaccountt;
public class JointAccount {
    private static double balance;

    // Constructors
    public JointAccount() {
        balance = 0.0; // Default balance
    }

    // Getter and setter for balance
    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        JointAccount.balance = balance;
    }
}
