import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Blackjack {


    private ArrayList<Card> deck;



    Blackjack()
    {
        deck = new ArrayList<Card>();
        for(int i=0; i<4; i++)
        {
            for(int j=1; j<=13; j++)
            {
                deck.add(new Card(i,j));
            }
        }
    }
public void shuffle(){
    int deck=52;
    System.out.println("\n Shuffling");
    ArrayList<Integer> cardsDeck= new ArrayList<>();
    for(int i=0; i<deck;i++){
        cardsDeck.add(i);
    }
    Collections.shuffle(cardsDeck);
    System.out.println("\n Shuffled");

}
    public Card drawCard()
    {
        return deck.remove(0);
    }

}
