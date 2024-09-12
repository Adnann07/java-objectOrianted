/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testemployee;

/**
 *
 * @author HP
 */
public class Developer {
    private int totalProjects;
    private int totalMonths;
    public Developer(int totalProjects,int totalMonths)
    {
        this.totalProjects=totalProjects;
        this.totalMonths=totalMonths;
    }

   public int gettotalProjects()
   {
       return totalProjects;
   }
   public void settotalProjects(int totalProjects)
   {
       this.totalProjects=totalProjects;
   }
   public int gettotalMonths()
   {
       return totalMonths;
   }
   public void settotalMonths(int totalMonths)
   {
       this.totalMonths=totalMonths;
   }
}
