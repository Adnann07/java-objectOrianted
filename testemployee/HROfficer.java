/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testemployee;

/**
 *
 * @author HP
 */
public class HROfficer {
    public Developer devObj;
    public HROfficer(Developer devObj)
    {
         this.devObj=devObj;
    }
    public void checkPerformance()
    {
        int totalProjects=devObj.gettotalProjects();
        int totalMonths=devObj.gettotalMonths();
        int performance=totalProjects*totalMonths+100;
        System.out.println("performance : "+performance);
        if(performance%2==0)
        {
            System.out.println("performance is BAD");
        }
        else
        {
            System.out.println("performance is GOOD");
        }
    }
    
}
