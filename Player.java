//Created by Ali Hamodi
// This class contain the initial hand (Randomly/unroandoly created by the player)


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class Player {
    private static String [] randomHand;    // Randomly created Hand
    private static String [] nonRandomHand; // Hand created by the Player


    private static String [] shuffledDeck;


    public Player(){

        System.out.println("An example for a hand would be   Ace diamonds,Queen spades,8 clubs,King hearts,Jack hearts");
        System.out.println("Please Choose and type 5 cards to generate a hand (separated by a comma without a space), or type r to generate a random hand");

        playerDecision();
    }

    // ##############################################################################################################

    public static void playerDecision(){
        Scanner theScan = new Scanner(System.in);
        String str = theScan.nextLine();

        if (str.equals("r")){
            randomHand = new String[5];

            shuffledDeck = Deck.shuffle();

            for(int i=0 ; i<5 ; i++){
               randomHand[i] = shuffledDeck[i];
            }

            System.out.println("The random generated hand is:  " + Arrays.toString(randomHand));
            System.out.println("Loading...PLease Wait\n");

            OptimalPlay op = new OptimalPlay(randomHand, Deck.getDeckMinus5Cards());

        }
        else {
            nonRandomHand = new String[5];
            nonRandomHand = str.split(",");
            System.out.println("The generated hand is:  " + Arrays.toString(nonRandomHand));

            OptimalPlay op = new OptimalPlay(nonRandomHand, generatingPartialDeck() );

        }
    }
    // ##############################################################################################################

    public static String [] generatingPartialDeck(){

        ArrayList<String> reducedDeckList=  new ArrayList<>(Arrays.asList(Deck.getDeck()));
        reducedDeckList.remove(nonRandomHand[0]);
        reducedDeckList.remove(nonRandomHand[1]);
        reducedDeckList.remove(nonRandomHand[2]);
        reducedDeckList.remove(nonRandomHand[3]);
        reducedDeckList.remove(nonRandomHand[4]);
        String [] str = new String[reducedDeckList.size()];
        reducedDeckList.toArray(str);

        return str;
    }

    // ##############################################################################################################
    public static String[] getRandomHand() {
        return randomHand;
    }

    public static String[] getNonRandomHand() {
        return nonRandomHand;
    }

    public static String[] getShuffledDeck() { return shuffledDeck; }

}
