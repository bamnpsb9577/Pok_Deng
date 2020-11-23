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
public class Random {
    private int[] Number;
    private int[] Type;
    private int[] Sum;
    public Random(){
        Number = new int[6];
        Type = new int[6];
        Sum = new int[6];
    }

    public int[] RandomNumber() {
        for(int i = 0; i < Number.length;i++){
            Number[i] = (int) ((Math.random() * 13) *+1);
        }
        return Number;
    }

    public int[] RandomType() {
        for(int i = 0; i < Type.length;i++){
            Type[i] = (int) (Math.random() * 3);
        }
        return Type;
    }
    public void checkSameCard(){
        for(int i = 0; i < 6;i++){
            for(int j = 0; j < Sum.length-1; j++){
                if((Sum[i]==Sum[j])&&i!=j){
                    Number[i] = (int) ((Math.random() * 13)+1);
                    Type[i] = (int) (Math.random() * 3);
                    Sum[i] = Number[i] + (Type[i]*100);
                }
            }
        }
    }
    
}
