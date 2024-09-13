/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieee;

/**
 *
 * @author HP
 */
import movieexception.NotApplicableForChildrenException;
public class Eligibility {
    public void checkAge(int age,String rating) throws NotApplicableForChildrenException
    {
        if(age<18 && "R".equals(rating))
        {
            throw new NotApplicableForChildrenException("Not applicable for people under 18");        }
        else if(age<15 && "M".equals(rating))
        {
            throw new NotApplicableForChildrenException("not under 15");
        }
        else if(age<18 && "G".equals(rating)||"PG".equals(rating))
        {
            System.out.println("ok");
            
        }
    }
    
}
