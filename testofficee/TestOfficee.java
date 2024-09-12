/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testofficee;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class TestOfficee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int totalMonths=input.nextInt();
        int totalProjects=input.nextInt();
        AdminOffice a1=new  AdminOffice(totalMonths,totalProjects);
        AdmissionOffice adminObj=new AdmissionOffice(a1);
        adminObj.checkPerformance(totalProjects, totalMonths);
        
        
    }
    
}
