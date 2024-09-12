/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testofficee;

/**
 *
 * @author HP
 */
public class AdmissionOffice {
    public AdminOffice adminObj;
    public AdmissionOffice(AdminOffice adminObj)
    {
        this.adminObj=adminObj;
    }
    
    public void checkPerformance(int totalProjects,int totalMonths)
    {
        double x=(totalProjects*totalMonths)+100;
        System.out.println(x);
        if(x<500)
        {
            System.out.println("AdminOffice's performance is bad");
        }
        else
        {
            System.out.println("Performance is Good");
        }
    }
    
}
