/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

import Deck.Card;
import Deck.Deck;
import Unit.Bot;
import Interface.Compare;
import Interface.Gameplay;
import Unit.Player;
import java.util.Arrays;
import Deck.Random;

/**
 *
 * @author thatphum
 */
public class Pok_Deng_V4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gameplay Gp = new Gameplay();
        while(Gp.Start()){
        Random Rd = new Random();
        Rd.checkSameCard();
        Deck D = new Deck();    
        Card C = new Card(Rd.RandomNumber() , Rd.RandomType());   
        D.setNumberCard(C.getNumber());
        D.setTypeCard(C.getType()); 
        Player P = new Player(D.getNumber(), D.getType());
        Bot B = new Bot(D.getNumber(), D.getType());      
        P.PrinthCardPlayer(C.StringNumber(),C.Stringtype());   
        boolean draw = Gp.Draw(P,C.getName(),C.getNametype());
        Compare Cp = new Compare(P.sumscorePlayer(draw), B.SumScoreBot(draw));
        Cp.Processing();
            System.out.println("-------------------------------------");
        }
    }
}
