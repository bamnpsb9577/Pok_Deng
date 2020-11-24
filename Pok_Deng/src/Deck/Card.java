/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deck;

import java.util.Arrays;

/**
 *
 * @author thatphum
 */
public class Card {
    int[] number = new int[6];
    public int[] type = new int[6];
    String[] name = new String[6];
    String[] nametype = new String[6];
    public Card(int[] getnumber , int[] gettype){
        number = getnumber;
        type = gettype;
    }
    public int[] getNumber() {
        return number;
    }

    public int[] getType() {
        return type;
    }
    public String[] StringNumber(){
        for(int i = 0;i < 6;i++){
            switch(number[i]){
                                case 11:name[i] = "J";
                                            number[i] = 10;
                                            break;
                                case 12:name[i] = "Q";
                                            number[i] = 10;
                                            break;
                                case 13:name[i] = "K";
                                            number[i] = 10;
                                            break;
                                default: name[i] =Integer.toString(number[i]) ;break;
                    }}
        return name;
    }
    public String[] Stringtype(){
        for(int i = 0;i < 6;i++){
            switch(type[i]){
                                case 0:nametype[i] = "♣";break;
                                case 1:nametype[i] = "♦";break;
                                case 2:nametype[i] = "♥";break;
                                case 3:nametype[i] = "♠️";break;
            }}
        return  nametype;
    }

    public String[] getName() {
        return name;
    }

    public String[] getNametype() {
        return nametype;
    }
    

}
