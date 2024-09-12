/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamerdemoo;

/**
 *
 * @author HP
 */
public class Gamer {
    public String gamerType;
    public double totalScore;
    public double totalMatches;
    
    public Gamer(){
    gamerType=null;
    totalScore=-1.0;
    totalMatches=-1.0;
}
    public Gamer(String gamerType, double totalScore, double totalMatches)
    {
        this.gamerType=gamerType;
        this.totalScore=totalScore;
    }
    public double calculateFinalScore()
    {
        if("noob".equals(gamerType))
        {
            return 2*totalScore*totalMatches/(totalScore+totalMatches);
        }
        
            return totalScore/totalMatches;
        
    }
    
}
