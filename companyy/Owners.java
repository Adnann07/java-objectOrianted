/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package companyy;

/**
 *
 * @author HP
 */
public class Owners extends CommonShares{
   private int ownerID;
   public Owners(int ownerID,double price)
   {
       super(price);
       this.ownerID=ownerID;
   }
   public int getOwnerID()
   {
       return ownerID;
   }
   
   public void setOwnerID(int ownerID)
   {
       this.ownerID=ownerID;
   }
   
   public static double priceRise(double percentage)
   {
       double price=CommonShares.getPrice();
       return price+(price*percentage);
   }
   
    public static double priceFall(double percentage)
   {
       double price=CommonShares.getPrice();
       return price-(price*percentage);
   }
   
}
