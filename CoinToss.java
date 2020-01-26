
package cointoss;

import java.util.Random;

public class CoinToss {
    
    public String tossACoin() {
        Random Rand = new Random();
        int toss = Math.abs(Rand.nextInt()) % 2;
        if ( toss == 0) {
            return "Heads";
        } else { 
            return "Tails";
        }
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        CoinToss game = new CoinToss();
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
    }
    
}
