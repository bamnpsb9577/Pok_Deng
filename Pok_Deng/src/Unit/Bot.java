/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit;

/**
 *
 * @author thatphum
 */
public class Bot {
    private int[] Number;
    private int[] Type;
    private int[] SumCard;
    public Bot(int[] GetNumber,int[] GetType){
        Number = GetNumber;
        Type = GetType;
        SumCard = new int[3];
    }
    public int[] SumCard(){
        for(int i = 0; i < SumCard.length; i++){
            SumCard[i] = (Type[i+3] * 100) + Number[i+3];
        }
        return SumCard;
    }
    public int SumScoreBot(boolean Draw){
        SumCard();
        int t = 1;
        int sum = 0;
        if(Draw)
            t=0;
        for(int i = 0;i < SumCard.length - t; i++){
            sum +=  SumCard[i];
        }
        return sum % 10;
    }
}
