/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accountdemoo;

/**
 *
 * @author HP
 */
public class Account {
    public int accountID;
    public double balance;
    String transactionType;
    
    public Account()
    {
        accountID=0;
        balance=-1.0;
        transactionType=null;
    }
    public Account( int accountID,double balance,String transactionType)
    {
        this.accountID=accountID;
        this.balance=balance;
        this.transactionType=transactionType;
        
    }
    public double changeBalance(double x)
    {
        if("debit".equals(transactionType))
        {
            balance=balance-x;
           
        }
        else if("credit".equals(transactionType))
        {
            balance=balance+x;
        } 
        return this.balance;
       
    }
    
}
