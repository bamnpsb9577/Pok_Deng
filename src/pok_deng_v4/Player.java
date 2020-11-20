/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pok_deng_v4;

import java.util.Arrays;

/**
 *
 * @author thatphum
 */
public class Player {
    private int[] Number;
    private int[] Type;
    int[] SumCard;
    public Player(Deck GetNumber,Deck GetType){
        Number = GetNumber.getNumber();
        Type = GetType.getType();
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
    public void PrinthCardPlayer(Card C){
        System.out.print("(\\_/)" +
                               "\n(•_•)" +
                               "\n/ >|"+C.Stringtype()[0]+C.StringNumber()[0]+"|"+ "|"+C.Stringtype()[1]+C.StringNumber()[1] +"|" );
    }

    
}
