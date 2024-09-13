/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main2;

/**
 *
 * @author HP
 */
public class Instagram extends SocialMediaApp{
    
       @Override
       public  void editImages(String Tool,String Image)
       {
           System.out.println(Tool+Image);
       }
       
           
       
       @Override
         public  void open(String FileName)
         {
             System.out.println(FileName);
         }
         
         
         

       @Override
    public  void crop(double startTime, double endTime)
    {
        System.out.println(startTime+endTime);
    }
    
    public void Record(String Z)
    {
        System.out.println("recording a "+Z+" video");
    }
    
}
