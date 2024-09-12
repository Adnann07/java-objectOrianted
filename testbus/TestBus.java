/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testbus;

/**
 *
 * @author HP
 */
public class TestBus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bus b1=new Bus(1000,"dhaka",150);
        System.out.println(b1.ticketPrice);
        System.out.println(b1.giveDiscount());
    }
    
}
