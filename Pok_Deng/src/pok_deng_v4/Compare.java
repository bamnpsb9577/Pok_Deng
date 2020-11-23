/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pok_deng_v4;

/**
 *
 * @author thatphum
 */
public class Compare {
    private int ScorePlayer;
    private int ScoreBot;
    public Compare(int scoerPlayer , int scoreBot){
        ScorePlayer = scoerPlayer;
        ScoreBot = scoreBot;
    }
    public  void Processing(){
        if(ScorePlayer > ScoreBot){
            System.out.println("----------Win----------");
        }else if (ScorePlayer == ScoreBot){
            System.out.println("----------เสมอ----------");
        }
        else{
           System.out.println("----------lose----------");
        }
        System.out.println("Player  =   "+ScorePlayer);
        System.out.println("Bot  =   "+ScoreBot);
   }
    
}
