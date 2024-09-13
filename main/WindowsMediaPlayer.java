/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author HP
 */
public class WindowsMediaPlayer implements Music{
    @Override
     public void view(String fileName)
     {
         System.out.println("playing music: "+fileName);
     }
     @Override
    public void playFile(String musicFile)
    {
        System.out.println("viewing file :"+musicFile);
    }
    
}
