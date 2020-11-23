/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deck;

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
    public void setNumberCard(int[] Number) {
        this.Number = Number;
    }

    public void setTypeCard(int[] Type) {
        this.Type = Type;
    }
    public int[] getNumber() {
        return Number;
    }

    public int[] getType() {
        return Type;
    }
    
}
