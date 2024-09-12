/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package companyy;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Companyy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        double price=input.nextDouble();
        CommonShares.setPrice(price);
        Owners o1=new Owners(1,price);
    
        double risePercentage=input.nextDouble();
                double fallPercentage=input.nextDouble();

        double newPriceRise=Owners.priceRise(risePercentage);
        double newPriceFall=Owners.priceFall(fallPercentage);
        
        System.out.println(o1.getOwnerID());
        System.out.println(newPriceRise);
        System.out.println(newPriceFall);
        
    }
    
}
