/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testbus;

/**
 *
 * @author HP
 */
public class Bus {
    double ticketPrice;
    String destination;
    double distance;
    public Bus()
    {
        ticketPrice=0.0;
        destination="empty";
        distance=0.0;
        
    }
    public Bus(double ticketPrice, String destination,double distance)
    {
        this.ticketPrice=ticketPrice;
        this.destination=destination;
        this.distance=distance;
        
    }
    public double giveDiscount()
    {
        if(distance>=80)
        {
            ticketPrice=ticketPrice*0.75;
            return ticketPrice;
        }
       
        return ticketPrice;
        
    }
    
}
