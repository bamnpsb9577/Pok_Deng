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
        D.setNumberCard(Rd);
        D.setTypeCard(Rd);     
        Card C = new Card(Rd);   
        Player P = new Player(D, D);
        Bot B = new Bot(D, D);      
        P.PrinthCardPlayer(C);   
        boolean draw = Gp.Draw(P, C);
        Compare Cp = new Compare(P.sumscorePlayer(draw), B.sumscoreBot(draw));
        Cp.Processing();
        }
    }

    
}
