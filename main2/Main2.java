/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main2;

/**
 *
 * @author HP
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Instagram i=new Instagram();
        i.Record("abs");
        i.Post("xyz");
        i.crop(2, 3);
        i.editImages("x", "y");
        PicsArt p=new PicsArt();
        p.editImages("xyz", "random pic");
    }
    
}
