/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit;

import Deck.Card;
import java.util.Arrays;

/**
 *
 * @author thatphum
 */
public class Player {
    private int[] Number;
    private int[] Type;
    int[] SumCard;
    public Player(int[] GetNumber,int[] GetType){
        Number = GetNumber;
        Type = GetType;
        SumCard = new int[3];
    }
    public int[] SumCard(){
        for(int i = 0; i < SumCard.length; i++){
            SumCard[i] = (Type[i] * 100) + Number[i];
        }
        return SumCard;
    }
    public int sumscorePlayer(boolean Draw){
        SumCard();
        int t = 1;
        int sum = 0;
        if(Draw){
            t=0;}
        for(int i = 0;i < SumCard.length - t ; i++){
            sum +=  SumCard[i];
        }
        return sum % 10;
    }
    public void PrinthCardPlayer(String[] number , String[] Type){
        System.out.print("(\\_/)" +
                               "\n(•_•)" +
                               "\n/ >|"+Type[0]+number[0]+"|"+ "|"+Type[1]+number[1] +"|" );
    }

    
}
