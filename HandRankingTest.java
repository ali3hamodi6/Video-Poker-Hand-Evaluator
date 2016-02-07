//Created by Ali Hamodi
// This class is only to test the HandRanking class

public class HandRankingTest {
    public static void main(String[] args) {

        HandRankings testing =  new HandRankings();

        // Ace   Jack   Queen    King           clubs   diamonds    hearts    spades


        // String [] str = {"Ace clubs","Queen clubs","King clubs","10 clubs","Jack clubs"};
        // String [] str = {"3 clubs","9 clubs","4 clubs","7 clubs","6 clubs"};
        // String [] str = {"Queen diamonds","Queen hearts","Queen clubs","10 clubs","Queen spades"};
        // String[] str = {"2 diamonds", "2 hearts", "2 clubs", "Ace clubs", "Ace spades"};
       // String [] str= {"2 diamonds", "2 hearts", "2 clubs", "Ace clubs", "7 spades"};
       // String [] str= {"5 clubs","5 diamonds","8 hearts","8 spades","Ace diamonds"};
        //String [] str= {"6 hearts","8 diamonds","8 hearts","9 clubs","5 clubs"}; // give true to straigt!!!!!
       // String [] str= {"Ace spades","Ace hearts","Ace clubs","Ace diamonds","3 clubs"}; //!!
       // String [] str = {"8 clubs","9 diamonds","10 clubs","Jack spades","Queen hearts"};

        String [] str = {"Jack hearts", "Jack spades","8 diamonds","6 spades","9 clubs"};





        boolean a = testing.isRoyalFlush(str);
                boolean b = testing.isStraightFlush(str);
                boolean c = testing.isFourOfKind(str);
                boolean d = testing.isFullHouse(str);
                boolean e = testing.isFlush(str);
                boolean f = testing.isStraight(str);
                boolean g = testing.isThreeOfKind(str);
                boolean x = testing.isTwoPair(str);
                boolean y = testing.isJacksOrBetter(str);
                boolean z = testing.isOnePair(str);

        System.out.println("RoyalFlush = " + a + "\n========================\n" +
                         "Straight Flush = " + b + "\n========================\n" +
                         "Four Of Kind = " + c + "\n========================\n" +
                         "Full House = " + d + "\n========================\n"+
                         "Flush = " + e + "\n========================\n" +
                         "Straight = " + f + "\n========================\n" +
                         "Three Of Kind = " + g + "\n========================\n" +
                         "Two Pair = " + x + "\n========================\n" +
                         "Jacks Or Better = " + y + "\n========================\n" +
                         "One Pair = " + z + "\n========================\n");
    }// end of main


}
