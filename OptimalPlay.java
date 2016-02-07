//Created by Ali Hamodi
// is a strategy that results in the highest expected return-on-investment (The nuts = Best possible hand)


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class OptimalPlay {

    private String[] initialHand;
    private HandRankings hr;
    private ArrayList<Double> listD;
    private ArrayList<String> listS;
    private String[] partialDeck;
    private double[] ptvalue;


    public OptimalPlay(String[] hnd, String[] TheDeck) { // THe Deck here is partial deck(random or non random)
        initialHand = hnd;
        partialDeck = TheDeck;
        hr = new HandRankings();
        listD = new ArrayList<>();
        listS = new ArrayList<>();
        ptvalue = PayoutTable.getPayoutTable();

        checkingForOptimal();
    }


    // ##############################################################################################################
    // ##############################################################################################################

    public void checkingForOptimal() {

        keepFive();
        keepFour();
        keepThree();
        keepTwo();
        keepOne();
        dircardAll();

        DecimalFormat dc = new DecimalFormat("###,###.#####");

        Double eOfx = Collections.max(listD);
        int index = listD.indexOf(eOfx);
        System.out.println("E(x) is " + dc.format(eOfx));
        String str = listS.get(index);
        System.out.println("The optimal play is to " + str);

        System.exit(0);
    }

    // ##############################################################################################################
    public double isItThat(String[] str) {

        if (hr.isRoyalFlush(str)) {
            return ptvalue[0];
        }
        if (hr.isStraightFlush(str)) {
            return ptvalue[1];
        }
        if (hr.isFourOfKind(str)) {
            return ptvalue[2];
        }
        if (hr.isFullHouse(str)) {
            return ptvalue[3];
        }
        if (hr.isFlush(str)) {
            return ptvalue[4];
        }
        if (hr.isStraight(str)) {
            return ptvalue[5];
        }
        if (hr.isThreeOfKind(str)) {
            return ptvalue[6];
        }
        if (hr.isTwoPair(str)) {
            return ptvalue[7];
        }
        if (hr.isJacksOrBetter(str)) {
            return ptvalue[8];
        }
        return 0.0;
    }

    // ##############################################################################################################
    // Keep All five cards
    public void keepFive() {


        if (hr.isRoyalFlush(initialHand)) {
            listD.add(ptvalue[0]);
            listS.add("keep Five cards");
            return;
        }

        if (hr.isStraightFlush(initialHand)) {
            listD.add(ptvalue[1]);
            listS.add("keep Five cards");

            return;
        }

        if (hr.isFourOfKind(initialHand)) {
            listD.add(ptvalue[2]);
            listS.add("keep Five cards");

            return;
        }

        if (hr.isFullHouse(initialHand)) {
            listD.add(ptvalue[3]);
            listS.add("keep Five cards");

            return;
        }

        if (hr.isFlush(initialHand)) {
            listD.add(ptvalue[4]);
            listS.add("keep Five cards");
            return;
        }

        if (hr.isStraight(initialHand)) {
            listD.add(ptvalue[5]);
            listS.add("keep Five cards");
            return;
        }

        if (hr.isThreeOfKind(initialHand)) {
            listD.add(ptvalue[6]);
            listS.add("keep Five cards");
            return;
        }

        if (hr.isTwoPair(initialHand)) {
            listD.add(ptvalue[7]);
            listS.add("keep Five cards");
            return;
        }

        if (hr.isJacksOrBetter(initialHand)) {
            listD.add(ptvalue[8]);
            listS.add("keep Five cards");
            return;
        }
    }

    // ##############################################################################################################
    // discard ( and iterate) 1 card

    public void keepFour() {
        for (int j = 0; j < 5; j++) {
            String temp = initialHand[j];    // this string is to store the value of the initial hand before it gets changed
            double x = 0;
            int counter = 0;
            for (int i = 0; i < partialDeck.length; i++) {
                initialHand[j] = partialDeck[i]; // now initialHand's first card is changed
                x += isItThat(initialHand); // checking what is this new initial hand is
                ++counter;
            }
            listD.add(x / counter);
            listS.add("discard card number " + (j + 1));
            initialHand[j] = temp;
        }
    }
    // ##############################################################################################################

    //change 2 cards
    public void keepThree() {
    // This is All cards possibilities that could result from keeping three cards

        keepThreeAlgorithm(3, 4);
        keepThreeAlgorithm(2, 4);
        keepThreeAlgorithm(2, 3);
        keepThreeAlgorithm(1, 4);
        keepThreeAlgorithm(1, 3);
        keepThreeAlgorithm(1, 2);
        keepThreeAlgorithm(0, 4);
        keepThreeAlgorithm(0, 3);
        keepThreeAlgorithm(0, 2);
        keepThreeAlgorithm(0, 1);

    }

    // ##############################################################################################################
    public void keepThreeAlgorithm(int m, int n) {

        String tempm = initialHand[m];
        String tempn = initialHand[n];
        // so, we are going to change m & n 10 times
        double x = 0;
        int counter = 0;
        for (int i = 0; i < partialDeck.length - 1; i++) {
            for (int j = i + 1; j < partialDeck.length; j++) {
                initialHand[m] = partialDeck[i];
                initialHand[n] = partialDeck[j];
                x += isItThat(initialHand);
                ++counter;
            }


        }

        listD.add(x / counter);
        //listS.add(Arrays.toString(initialHand));
        listS.add("discard cards number " + (m + 1) + " & " + (n + 1));

        initialHand[m] = tempm;
        initialHand[n] = tempn;
    }

    // ##############################################################################################################

    public void keepTwo() {
        // This is All cards possibilities that could result from keeping two cards
        // # # x x x
        keepTwoAlgorithm(2, 3, 4);
        keepTwoAlgorithm(1, 3, 4);
        keepTwoAlgorithm(1, 2, 4);
        keepTwoAlgorithm(1, 2, 3);
        keepTwoAlgorithm(0, 3, 4);
        keepTwoAlgorithm(0, 2, 4);
        keepTwoAlgorithm(0, 2, 3);
        keepTwoAlgorithm(0, 1, 4);
        keepTwoAlgorithm(0, 1, 3);
        keepTwoAlgorithm(0, 1, 2);

    }

    // ##############################################################################################################
    public void keepTwoAlgorithm(int m, int n, int p) {

        String tempm = initialHand[m];
        String tempn = initialHand[n];
        String tempp = initialHand[p];
        int counter = 0;
        double x = 0;
        for (int k = 0; k < partialDeck.length - 2; k++) {
            for (int i = k + 1; i < partialDeck.length - 1; i++) {
                for (int j = i + 1; j < partialDeck.length; j++) {

                    initialHand[m] = partialDeck[k];
                    initialHand[n] = partialDeck[i];
                    initialHand[p] = partialDeck[j];
                    x += isItThat(initialHand);
                    ++counter;
                }


            }

        }

        listD.add(x / counter);
        listS.add("discard cards number " + (m + 1) + " & " + (n + 1) + " & " + (p + 1));

        initialHand[m] = tempm;
        initialHand[n] = tempn;
        initialHand[p] = tempp;
    }

    // ##############################################################################################################
    // ##############################################################################################################
    public void keepOne() {
        // This is All cards possibilities that could result from keeping only one card
        keepOneAlgorithm(1, 2, 3, 4);
        keepOneAlgorithm(0, 2, 3, 4);
        keepOneAlgorithm(0, 1, 3, 4);
        keepOneAlgorithm(0, 1, 2, 4);
        keepOneAlgorithm(0, 1, 2, 3);

    }


    public void keepOneAlgorithm(int m, int n, int p, int q) {

        String tempm = initialHand[m];
        String tempn = initialHand[n];
        String tempp = initialHand[p];
        String tempq = initialHand[q];

        int counter = 0;
        double x = 0;

        // so, we are going to change m, n, and p 10 times
        for (int w = 0; w < partialDeck.length - 3; w++) {
            for (int k = w + 1; k < partialDeck.length - 2; k++) {
                for (int i = k + 1; i < partialDeck.length - 1; i++) {
                    for (int j = i + 1; j < partialDeck.length; j++) {

                        initialHand[m] = partialDeck[w];
                        initialHand[n] = partialDeck[k];
                        initialHand[p] = partialDeck[i];
                        initialHand[q] = partialDeck[j];
                        x += isItThat(initialHand);
                        ++counter;
                    }
                }
            }
        }

        listD.add(x / (0.0 + counter));
        listS.add("discard cards number " + (m + 1) + " & " + (n + 1) + " & " + (p + 1) + " & " + (q + 1));

        initialHand[m] = tempm;
        initialHand[n] = tempn;
        initialHand[p] = tempp;
        initialHand[q] = tempq;
    }


    // ##############################################################################################################
    // ##############################################################################################################
    public void dircardAll() {

        String tempm = initialHand[0];
        String tempn = initialHand[1];
        String tempp = initialHand[2];
        String tempq = initialHand[3];
        String tempr = initialHand[4];

        int counter = 0;
        double x = 0;

        for (int z = 0; z < partialDeck.length - 4; z++) {
            for (int w = z + 1; w < partialDeck.length - 3; w++) {
                for (int k = w + 1; k < partialDeck.length - 2; k++) {
                    for (int i = k + 1; i < partialDeck.length - 1; i++) {
                        for (int j = i + 1; j < partialDeck.length; j++) {

                            initialHand[0] = partialDeck[z];
                            initialHand[1] = partialDeck[w];
                            initialHand[2] = partialDeck[k];
                            initialHand[3] = partialDeck[i];
                            initialHand[4] = partialDeck[j];
                            x += isItThat(initialHand);
                            ++counter;
                        }

                    }

                }
            }
        }

            listD.add(x / counter);
            listS.add("Discard all cards");

            initialHand[0] = tempm;
            initialHand[1] = tempn;
            initialHand[2] = tempp;
            initialHand[3] = tempq;
            initialHand[4] = tempr;
    }
}
