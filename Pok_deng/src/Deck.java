/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pok_Deng_V4;

/**
 *
 * @author thatphum
 */
public class Deck {
    private int[] Number;
    private int[] Type;
    private int[][] Card;
    public Deck(){
    }
    public void setNumberCard(Random Number) {
        this.Number = Number.RandomNumber();
    }

    public void setTypeCard(Random Type) {
        this.Type = Type.RandomType();
    }
    public int[] getNumber() {
        return Number;
    }

    public int[] getType() {
        return Type;
    }
    
}
