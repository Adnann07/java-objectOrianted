/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VLC v1=new VLC();
        v1.addSubtitles("abc");
        v1.view("hdsong");
        WindowsMediaPlayer w1=new WindowsMediaPlayer();
        w1.playFile("xyz.mp3");
        w1.view("hdsong");
    }
    
}
