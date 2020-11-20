/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pok_deng_v4;

import java.util.Scanner;

/**
 *
 * @author thatphum
 */
public class Gameplay {
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
    public boolean Draw(Player P , Card C){
        Scanner sc = new Scanner(System.in);
        while (true) {       
        System.out.println("\n---------------------------"
                + "\n\t 1.Draw "
                + "\n\t 2.Pass");
        System.out.print("choose : ");
        int choose = sc.nextInt();
        System.out.println("---------------------------");
        switch(choose){
            case 1 : P.PrinthCardPlayer(C);
                        System.out.print( "|"+C.Stringtype()[2]+C.StringNumber()[2] +"|\n" );
                return true;
            case 2 : 
                return false;
            default: break;
            }  
        }
    }

    
}
