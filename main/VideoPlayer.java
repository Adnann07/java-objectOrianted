/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author HP
 */
abstract class VideoPlayer implements Player {
    @Override
    public void view(String V) {
        System.out.println("Viewing Video: " + V);
    }

    public void addSubtitles(String S) {
        System.out.println("Adding subtitle: " + S);
    }
}
