/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

import Deck.Card;
import Deck.Deck;
import Unit.Bot;
import pok_deng_v4.Compare;
import pok_deng_v4.Gameplay;
import Unit.Player;
import pok_deng_v4.Random;

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
        Rd.check();
        Deck D = new Deck();
        D.setNumberCard(Rd.RandomNumber());
        D.setTypeCard(Rd.RandomType());     
        Card C = new Card(Rd.RandomNumber() , Rd.RandomType());   
        Player P = new Player(D.getNumber(), D.getType());
        Bot B = new Bot(D.getNumber(), D.getType());      
        P.PrinthCardPlayer(C.StringNumber(),C.Stringtype());   
        boolean draw = Gp.Draw(P,C.StringNumber(),C.Stringtype());
        Compare Cp = new Compare(P.sumscorePlayer(draw), B.sumscoreBot(draw));
        Cp.Processing();
        }
    }

    
}
