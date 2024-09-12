/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accountdemoo;

/**
 *
 * @author HP
 */
public class AccountDemoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account a1=new Account(2020,5000,"debit");
        System.out.println(a1.accountID);
        System.out.println(a1.changeBalance(50));
        
                
    }
    
}
