/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gamerdemoo;

/**
 *
 * @author HP
 */
public class GamerDemoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gamer g1=new Gamer("noob",60,80);
        System.out.println(g1.gamerType);
        System.out.println(g1.totalScore);
        System.out.println(g1.calculateFinalScore());
    }
    
}
