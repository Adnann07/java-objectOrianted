package bankaccountt;

 import java.util.Scanner;

public class BankAccountt {
    public static void main(String[] args) {
        // Assign value to balance variable of JointAccount
        try (Scanner scanner = new Scanner(System.in)) {
            // Assign value to balance variable of JointAccount
            System.out.print("Enter initial balance for JointAccount: ");
            
            
            double balance=scanner.nextDouble();
            JointAccount.setBalance(balance);
            
            int userId1=scanner.nextInt();
            
            User user1=new User(userId1);
            
             int userId2=scanner.nextInt();
            
            User user2=new User(userId2);
            
            
            double debit1=scanner.nextDouble();
            double newbalance1=User.Debit(debit1);
            
            double debit2=scanner.nextDouble();
            double newbalance2=User.Debit(debit2);
            
            System.out.println("User Id= "+user1.getUserID() + "balance= "+newbalance1+debit1);
                        System.out.println(user2.getUserIdD()+"User Id= "+newbalance2+debit2);

        }
    }
}
