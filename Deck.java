//Created by Ali Hamodi
import java.util.Random;

public class Deck {
    private static String[] deckMinus5Cards; // This is the Deck after dealing five cards

    private static String[] deck=  {"Ace hearts","2 hearts","3 hearts","4 hearts","5 hearts","6 hearts","7 hearts","8 hearts",
            "9 hearts","10 hearts","Jack hearts","Queen hearts","King hearts",
            "Ace clubs","2 clubs","3 clubs","4 clubs","5 clubs","6 clubs","7 clubs",
            "8 clubs","9 clubs","10 clubs","Jack clubs","Queen clubs","King clubs",
            "Ace diamonds","2 diamonds","3 diamonds","4 diamonds","5 diamonds","6 diamonds","7 diamonds",
            "8 diamonds","9 diamonds","10 diamonds","Jack diamonds","Queen diamonds","King diamonds",
            "Ace spades","2 spades","3 spades","4 spades","5 spades","6 spades","7 spades","8 spades",
            "9 spades","10 spades","Jack spades","Queen spades","King spades"};


    public Deck (){

        deckMinus5Cards = new String[47];
    }

    // ##############################################################################################################
    public static String[] shuffle () {
        Random rand = new Random();
        int pointer = deck.length;
        String temp;

        while (--pointer > 0) {
            int x = rand.nextInt(pointer + 1);

            temp = deck[pointer];
            deck[pointer] = deck[x];
            deck[x] = temp;

        }

        generateDeckMinusFive();
        return deck;
    }

    // ##############################################################################################################
    public static void generateDeckMinusFive(){

        for(int i =0; i<deckMinus5Cards.length;i++ ){
            deckMinus5Cards[i] = deck[i+5];
        }

    }

    // ##############################################################################################################
    public static String[] getDeckMinus5Cards() {
        return deckMinus5Cards;
    }

    public static String[] getDeck() {
        return deck;
    }

}
