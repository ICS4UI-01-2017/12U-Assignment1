/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardGame;

/**
 *
 * @author lamon
 */
public class War {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create Deck of cards
        Deck deck = new Deck();
        // create some players
        Player p1 = new Player("Alice");
        Player p2 = new Player("Bob");
        
        // shuffle deck and deal cards
        deck.shuffle();
        for(int i = 0; i < 52; i++){
            // alternate card taking
            if(i % 2 == 0){
                p1.takeCard(deck.dealCard());
            }else{
                p2.takeCard(deck.dealCard());
            }
        }
        
        // game time!
        // as long as players have cards
        while(p1.getNumCards() > 0 
                && p2.getNumCards() > 0){
            
        }
    }
    
}
