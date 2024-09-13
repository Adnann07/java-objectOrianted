/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main2;

/**
 *
 * @author HP
 */
abstract class SocialMediaApp implements ImageEditor,MusicEditor {
    
       public abstract void editImages(String Tool,String Image);
       
           
       
         public abstract void open(String FileName);
         
         
         

    public abstract void crop(double startTime, double endTime);
    
        
    
    public void addCaptions(String c,String F)
    {
        System.out.println("adding caption to"+c+" "+F);
    }
    public void Post(String F)
    {
        System.out.println("posting "+F);
    }

    
}
