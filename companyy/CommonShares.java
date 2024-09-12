/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package companyy;

/**
 *
 * @author HP
 */
public class CommonShares {
    private static double price;
    public CommonShares(double price)
    {
        CommonShares.price=price;
    }
    public static double getPrice()
    {
        return price;
    }
    public static void setPrice(double price)
    {
        CommonShares.price=price;
    }
}
