/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieee;

/**
 *
 * @author HP
 */
import movieexception.CardNotWorkingException;
public class BookTicket extends Eligibility{
    public void addCard(String cardNo) throws CardNotWorkingException
    {
        if(cardNo.length()<16 || cardNo.contains(" "))
        {
            throw new CardNotWorkingException("invalid card");
        }
        else
        {
            System.out.println("valid");
        }
    }
    
}
