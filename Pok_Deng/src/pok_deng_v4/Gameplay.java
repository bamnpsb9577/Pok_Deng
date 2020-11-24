/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pok_deng_v4;

import Unit.Player;
import Deck.Card;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author thatphum
 */
public class Gameplay {
    Card C;
    public boolean Start(){
        Scanner sc = new Scanner(System.in);
        while (true) {            
          System.out.print("Welcome to PokDeng Game ♠♥♦♣"
                                        + "\n\t1.Play!"
                                        + "\n\t2.Exit");
        System.out.print("\nchoose : ");
        int choose = sc.nextInt();
        switch(choose){
            case 1 : return true;
            case 2 : return false;
            default: break;
            }  
        }
    }
    public boolean Draw(Player P , String[] Number , String[] Type){
        Scanner sc = new Scanner(System.in);
        while (true) {       
        System.out.println("\n---------------------------"
                + "\n\t 1.Draw "
                + "\n\t 2.Pass");
        System.out.print("choose : ");
        int choose = sc.nextInt();
        System.out.println("---------------------------");
        switch(choose){
            case 1 : P.PrinthCardPlayer(Number , Type);
                        System.out.print( "|"+Type[2]+Number[2] +"|\n" );
                return true;
            case 2 : 
                return false;
            default: break;
            }  
        }
    }

    
}
