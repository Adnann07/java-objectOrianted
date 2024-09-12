/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testemployee;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class TestEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter total projects: ");
        int projects=sc.nextInt();
        System.out.println("enter months: ");
        int months=sc.nextInt();
        Developer d=new Developer(projects,months);
        HROfficer hr1=new HROfficer(d);
        hr1.checkPerformance();
        sc.close();
    }
    
}
