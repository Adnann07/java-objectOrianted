/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movieee;

/**
 *
 * @author HP
 */
import java.util.Scanner;
import movieexception.CardNotWorkingException;
import movieexception.NotApplicableForChildrenException;
public class Movieee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        BookTicket b1=new BookTicket();
        try{
        String cardNo=input.next();
        b1.addCard(cardNo);
        int age=input.nextInt();
        String rating=input.next();
        b1.checkAge(age, rating);
        } catch(NotApplicableForChildrenException | CardNotWorkingException e)
        {
            System.out.println("exception "+e.getMessage());
        }
        
        
        
      
        finally
        {
           input.close(); 
        }
        
    }
    
}
