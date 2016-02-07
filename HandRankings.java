//Created by Ali Hamodi
import java.util.ArrayList;

public class HandRankings {

    
    boolean boolThreeOfKind;
    boolean boolOnePair;

    public HandRankings() {

    }

    public boolean isRoyalFlush(String[] theHand) {

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;

        for (String x : theHand) {
            if (x.contains("clubs")) {
                if (x.contains("10") || x.contains("Jack") || x.contains("Queen") || x.contains("King") || x.contains("Ace"))
                    counter1++;
            } else if (x.contains("diamonds")) {
                if (x.contains("10") || x.contains("Jack") || x.contains("Queen") || x.contains("King") || x.contains("Ace"))
                    counter2++;
            } else if (x.contains("hearts")) {
                if (x.contains("10") || x.contains("Jack") || x.contains("Queen") || x.contains("King") || x.contains("Ace"))
                    counter3++;
            } else if (x.contains("spades")) {
                if (x.contains("10") || x.contains("Jack") || x.contains("Queen") || x.contains("King") || x.contains("Ace"))
                    counter4++;
            }
        }

        if (counter1 == 5 || counter2 == 5 || counter3 == 5 || counter4 == 5)
            return true;
        else
            return false;
    }// end of method
    // ##############################################################################################################
    // ##############################################################################################################


    public boolean isStraightFlush(String[] theHand) {

        int cCounter1, cCounter2, cCounter3, cCounter4, cCounter5, cCounter6, cCounter7, cCounter8, cCounter9;
        int dCounter1, dCounter2, dCounter3, dCounter4, dCounter5, dCounter6, dCounter7, dCounter8, dCounter9;
        int hCounter1, hCounter2, hCounter3, hCounter4, hCounter5, hCounter6, hCounter7, hCounter8, hCounter9;
        int sCounter1, sCounter2, sCounter3, sCounter4, sCounter5, sCounter6, sCounter7, sCounter8, sCounter9;


        cCounter1 = cCounter2 = cCounter3 = cCounter4 = cCounter5 = cCounter6 = cCounter7 = cCounter8 = cCounter9 =
        dCounter1 = dCounter2 = dCounter3 = dCounter4 = dCounter5 = dCounter6 = dCounter7 = dCounter8 = dCounter9 =
        hCounter1 = hCounter2 = hCounter3 = hCounter4 = hCounter5 = hCounter6 = hCounter7 = hCounter8 = hCounter9 =
        sCounter1 = sCounter2 = sCounter3 = sCounter4 = sCounter5 = sCounter6 = sCounter7 = sCounter8 = sCounter9 = 0;

        for (String x : theHand) {
            if (x.contains("clubs")) {
                if (x.contains("Ace") || x.contains("2") || x.contains("3") || x.contains("4") || x.contains("5")) {
                    cCounter1++;
                }

                if (x.contains("2") || x.contains("3") || x.contains("4") || x.contains("5") || x.contains("6")) {
                    cCounter2++;
                }

                if (x.contains("3") || x.contains("4") || x.contains("5") || x.contains("6") || x.contains("7")) {
                    cCounter3++;
                }

                if (x.contains("4") || x.contains("5") || x.contains("6") || x.contains("7") || x.contains("8")) {
                    cCounter4++;
                }

                if (x.contains("5") || x.contains("6") || x.contains("7") || x.contains("8") || x.contains("9")) {
                    cCounter5++;
                }

                if (x.contains("6") || x.contains("7") || x.contains("8") || x.contains("9") || x.contains("10")) {
                    cCounter6++;
                }

                if (x.contains("7") || x.contains("8") || x.contains("9") || x.contains("10") || x.contains("Jack")) {
                    cCounter7++;
                }

                if (x.contains("8") || x.contains("9") || x.contains("10") || x.contains("Jack") || x.contains("Queen")) {
                    cCounter8++;
                }

                if (x.contains("9") || x.contains("10") || x.contains("Jack") || x.contains("Queen") || x.contains("King")) {
                    cCounter9++;
                }
            }

            // #######################

            else if (x.contains("diamonds")) {
                if (x.contains("Ace") || x.contains("2") || x.contains("3") || x.contains("4") || x.contains("5")) {
                    dCounter1++;
                }

                if (x.contains("2") || x.contains("3") || x.contains("4") || x.contains("5") || x.contains("6")) {
                    dCounter2++;
                }

                if (x.contains("3") || x.contains("4") || x.contains("5") || x.contains("6") || x.contains("7")) {
                    dCounter3++;
                }

                if (x.contains("4") || x.contains("5") || x.contains("6") || x.contains("7") || x.contains("8")) {
                    dCounter4++;
                }

                if (x.contains("5") || x.contains("6") || x.contains("7") || x.contains("8") || x.contains("9")) {
                    dCounter5++;
                }

                if (x.contains("6") || x.contains("7") || x.contains("8") || x.contains("9") || x.contains("10")) {
                    dCounter6++;
                }

                if (x.contains("7") || x.contains("8") || x.contains("9") || x.contains("10") || x.contains("Jack")) {
                    dCounter7++;
                }

                if (x.contains("8") || x.contains("9") || x.contains("10") || x.contains("Jack") || x.contains("Queen")) {
                    dCounter8++;
                }

                if (x.contains("9") || x.contains("10") || x.contains("Jack") || x.contains("Queen") || x.contains("King")) {
                    dCounter9++;
                }
            }
            //########################

            else if (x.contains("hearts")) {
                if (x.contains("Ace") || x.contains("2") || x.contains("3") || x.contains("4") || x.contains("5")) {
                    hCounter1++;
                }

                if (x.contains("2") || x.contains("3") || x.contains("4") || x.contains("5") || x.contains("6")) {
                    hCounter2++;
                }

                if (x.contains("3") || x.contains("4") || x.contains("5") || x.contains("6") || x.contains("7")) {
                    hCounter3++;
                }

                if (x.contains("4") || x.contains("5") || x.contains("6") || x.contains("7") || x.contains("8")) {
                    hCounter4++;
                }

                if (x.contains("5") || x.contains("6") || x.contains("7") || x.contains("8") || x.contains("9")) {
                    hCounter5++;
                }

                if (x.contains("6") || x.contains("7") || x.contains("8") || x.contains("9") || x.contains("10")) {
                    hCounter6++;
                }

                if (x.contains("7") || x.contains("8") || x.contains("9") || x.contains("10") || x.contains("Jack")) {
                    hCounter7++;
                }

                if (x.contains("8") || x.contains("9") || x.contains("10") || x.contains("Jack") || x.contains("Queen")) {
                    hCounter8++;
                }

                if (x.contains("9") || x.contains("10") || x.contains("Jack") || x.contains("Queen") || x.contains("King")) {
                    hCounter9++;
                }
            }
            // ##########################

            else if (x.contains("spades")) {
                if (x.contains("Ace") || x.contains("2") || x.contains("3") || x.contains("4") || x.contains("5")) {
                    sCounter1++;
                }

                if (x.contains("2") || x.contains("3") || x.contains("4") || x.contains("5") || x.contains("6")) {
                    sCounter2++;
                }

                if (x.contains("3") || x.contains("4") || x.contains("5") || x.contains("6") || x.contains("7")) {
                    sCounter3++;
                }

                if (x.contains("4") || x.contains("5") || x.contains("6") || x.contains("7") || x.contains("8")) {
                    sCounter4++;
                }

                if (x.contains("5") || x.contains("6") || x.contains("7") || x.contains("8") || x.contains("9")) {
                    sCounter5++;
                }

                if (x.contains("6") || x.contains("7") || x.contains("8") || x.contains("9") || x.contains("10")) {
                    sCounter6++;
                }

                if (x.contains("7") || x.contains("8") || x.contains("9") || x.contains("10") || x.contains("Jack")) {
                    sCounter7++;
                }

                if (x.contains("8") || x.contains("9") || x.contains("10") || x.contains("Jack") || x.contains("Queen")) {
                    sCounter8++;
                }

                if (x.contains("9") || x.contains("10") || x.contains("Jack") || x.contains("Queen") || x.contains("King")) {
                    sCounter9++;
                }
            }

        }// end of for loop

        if (cCounter1 == 5 || cCounter2 == 5 || cCounter3 == 5 || cCounter4 == 5 || cCounter5 == 5 ||
            cCounter6 == 5 || cCounter7 == 5 || cCounter8 == 5 || cCounter9 == 5 ||
            dCounter1 == 5 || dCounter2 == 5 || dCounter3 == 5 || dCounter4 == 5 || dCounter5 == 5 ||
            dCounter6 == 5 || dCounter7 == 5 || dCounter8 == 5 || dCounter9 == 5 ||
            hCounter1 == 5 || hCounter2 == 5 || hCounter3 == 5 || hCounter4 == 5 || hCounter5 == 5 ||
            hCounter6 == 5 || hCounter7 == 5 || hCounter8 == 5 || hCounter9 == 5 ||
            sCounter1 == 5 || sCounter2 == 5 || sCounter3 == 5 || sCounter4 == 5 || sCounter5 == 5 ||
            sCounter6 == 5 || sCounter7 == 5 || sCounter8 == 5 || sCounter9 == 5) {

            return true;
        } else {
            return false;
        }
    }// end of method
    // ##############################################################################################################
    // ##############################################################################################################


    public boolean isFourOfKind(String[] theHand) {

        int counter1, counter2, counter3, counter4, counter5, counter6, counter7, counter8, counter9, counter10;
        int counterJ, counterQ, counterK;

        counter1 = counter2 = counter3 = counter4 = counter5 = counter6 = counter7 = counter8 = counter9 = counter10 =
                counterJ = counterQ = counterK = 0;


        for (String x : theHand) {
            if (x.startsWith("Ace")) {
                    counter1++;
            } else if (x.startsWith("2")) {
                    counter2++;
            } else if (x.startsWith("3")) {
                    counter3++;
            } else if (x.startsWith("4")) {
                    counter4++;
            } else if (x.startsWith("5")) {
                    counter5++;
            } else if (x.startsWith("6")) {
                    counter6++;
            } else if (x.startsWith("7")) {
                    counter7++;
            } else if (x.startsWith("8")) {
                    counter8++;
            } else if (x.startsWith("9")) {
                    counter9++;
            } else if (x.startsWith("10")) {
                    counter10++;
            } else if (x.startsWith("Jack")) {
                    counterJ++;
            } else if (x.startsWith("Queen")) {
                    counterQ++;
            } else if (x.startsWith("King")) {
                    counterK++;
            }

        }


        // this is to check for one paid (which will be used when checking for a full house)
        if (counter1 ==2 || counter2 ==2 || counter3 ==2 || counter4 ==2 || counter5 ==2 || counter6 ==2 || counter7 ==2 ||
            counter8 ==2 || counter9 ==2 || counter10 ==2 || counterJ ==2 || counterQ ==2 || counterK ==2) {
            boolOnePair = true;
        } else {
            boolOnePair = false;
        }

        // this is to check for 3 of kind
        if (counter1 ==3 || counter2 ==3 || counter3 ==3 || counter4 ==3 || counter5 ==3 || counter6 ==3 || counter7 ==3 ||
            counter8 ==3 || counter9 ==3 || counter10 ==3 || counterJ ==3 || counterQ ==3 || counterK ==3) {
            boolThreeOfKind = true;
        } else {
            boolThreeOfKind = false;
        }

        // this is to check for 4 of kind
        if (counter1 == 4 || counter2 == 4 || counter3 == 4 || counter4 == 4 || counter5 == 4 || counter6 == 4 || counter7 == 4 ||
            counter8 == 4 || counter9 == 4 || counter10 == 4 || counterJ == 4 || counterQ == 4 || counterK == 4) {
            return true;
        } else {
            return false;
        }

    }// end of method
    // ##############################################################################################################
    // ##############################################################################################################
    public boolean isThreeOfKind(String[] theHand) {

     return boolThreeOfKind;


    }// end of method
    // ##############################################################################################################
    // ##############################################################################################################

    public boolean isFullHouse(String[] theHand) {


    if(isThreeOfKind(theHand) && isOnePair(theHand)){

        return true;
    }
    else {

          return false;
    }

    }// end of method
    // ##############################################################################################################
    // ##############################################################################################################

    public boolean isFlush(String[] theHand) {

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;

        for (String x : theHand) {

            if (x.contains("clubs")) {
                counter1++;
            } else if (x.contains("diamonds")) {
                counter2++;
            } else if (x.contains("hearts")) {
                counter3++;
            } else if (x.contains("spades")) {
                counter4++;
            }
        }

        if (counter1 == 5 || counter2 == 5 || counter3 == 5 || counter4 == 5) {
            return true;
        } else {
            return false;
        }
    }// end of method
    // ##############################################################################################################
    // ##############################################################################################################


    public boolean isStraight(String[] theHand) {

        int counter1, counter2, counter3, counter4, counter5, counter6, counter7, counter8, counter9, counter10;

        counter1 = counter2 = counter3 = counter4 = counter5 = counter6 = counter7 = counter8 = counter9 = counter10 = 0;


        ArrayList<String> list= new ArrayList<>();

        for (String x: theHand){

            list.add(x);
        }

        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i<list.size();i++){
            if(list.get(i).startsWith("Ace"))   {list2.add("Ace");}
            if(list.get(i).startsWith("Jack"))  {list2.add("Jack");}
            if(list.get(i).startsWith("Queen")) {list2.add("Queen");}
            if(list.get(i).startsWith("King"))  {list2.add("King");}
            if(list.get(i).startsWith("2"))     {list2.add("2");}
            if(list.get(i).startsWith("3"))     {list2.add("3");}
            if(list.get(i).startsWith("4"))     {list2.add("4");}
            if(list.get(i).startsWith("5"))     {list2.add("5");}
            if(list.get(i).startsWith("6"))     {list2.add("6");}
            if(list.get(i).startsWith("7"))     {list2.add("7");}
            if(list.get(i).startsWith("8"))     {list2.add("8");}
            if(list.get(i).startsWith("9"))     {list2.add("9");}
            if(list.get(i).startsWith("10"))    {list2.add("10");}
        }


        if (list2.contains("Ace") && list2.contains("2") && list2.contains("3") && list2.contains("4") && list2.contains("5")) {
                counter1++;
            }
            if (list2.contains("2") && list2.contains("3") && list2.contains("4") && list2.contains("5") && list2.contains("6")) {
                counter2++;
            }
            if (list2.contains("3") && list2.contains("4") && list2.contains("5") && list2.contains("6") && list2.contains("7")) {
                counter3++;
            }
            if (list2.contains("4") && list2.contains("5") && list2.contains("6") && list2.contains("7") && list2.contains("8")) {
                counter4++;
            }
            if (list2.contains("5") && list2.contains("6") && list2.contains("7") && list2.contains("8") && list2.contains("9")) {
                counter5++;
            }
            if (list2.contains("6") && list2.contains("7") && list2.contains("8") && list2.contains("9") && list2.contains("10")) {
                counter6++;
            }
            if (list2.contains("7") && list2.contains("8") && list2.contains("9") && list2.contains("10") && list2.contains("Jack")) {
                counter7++;
            }
            if (list2.contains("8") && list2.contains("9") && list2.contains("10") && list2.contains("Jack") && list2.contains("Queen")) {
                counter8++;
            }
            if (list2.contains("9") && list2.contains("10") && list2.contains("Jack") && list2.contains("Queen") && list2.contains("King")) {
                counter9++;
            }
            if (list2.contains("10") && list2.contains("Jack") && list2.contains("Queen") && list2.contains("King") && list2.contains("Ace")) {
                counter10++;
            }




        if (counter1 == 1 || counter2 == 1 || counter3 == 1 || counter4 == 1 || counter5 == 1 ||
            counter6 == 1 || counter7 == 1 || counter8 == 1 || counter9 == 1 || counter10 == 1) {
            return true;
        } else {
            return false;
        }
    }// end of method

    // ##############################################################################################################
    // ##############################################################################################################

    public boolean isTwoPair(String[] theHand) {

        // subString is used because suites doesn't matter and the first letter from the string is fair enough

        int counter = 0;
        int i = 0;

        // comparing the first card of the hand with the rest
        if (theHand[i].substring(0,1).equals(theHand[i + 1].substring(0,1)))   { counter++; }
        if (theHand[i].substring(0,1).equals(theHand[i + 2].substring(0,1)))   { counter++; }
        if (theHand[i].substring(0,1).equals(theHand[i + 3].substring(0,1)))   { counter++; }
        if (theHand[i].substring(0,1).equals(theHand[i + 4].substring(0,1)))   { counter++; }

        // comparing the second card of the hand with the rest
        if (theHand[i + 1].substring(0,1).equals(theHand[i + 2].substring(0,1)))   { counter++; }
        if (theHand[i + 1].substring(0,1).equals(theHand[i + 3].substring(0,1)))   { counter++; }
        if (theHand[i + 1].substring(0,1).equals(theHand[i + 4].substring(0,1)))   { counter++; }

        // comparing the 3rd card of the hand with the rest
        if (theHand[i + 2].substring(0,1).equals(theHand[i + 3].substring(0,1)))   { counter++; }
        if (theHand[i + 2].substring(0,1).equals(theHand[i + 4].substring(0,1)))   { counter++; }

        // comparing the 4th card of the hand with the rest(the fifth card)
        if (theHand[i + 3].substring(0,1).equals(theHand[i + 4].substring(0,1)))   { counter++; }


        if (counter == 2) {
            return true;
        } else {
            return false;
        }


    }//end of method
    // ##############################################################################################################
    // ##############################################################################################################
    public boolean isJacksOrBetter(String[] theHand) {

        int counter1=0;
        int counter2=0;
        int counter3=0;
        int counter4=0;

        for (int i =0; i<theHand.length; i++) {

            if (theHand[i].contains("Jack")) {
                counter1++;
            } else if (theHand[i].contains("Queen")) {
                counter2++;
            } else if (theHand[i].contains("King")) {
                counter3++;
            } else if (theHand[i].contains("Ace")) {
                counter4++;
            }

        }


        if(counter1==2 || counter2==2 || counter3==2 || counter4==2){
            return true;
        }else {

            return false;
        }

    }// end of method
    // ##############################################################################################################
    // ##############################################################################################################

    public boolean isOnePair(String[] theHand) {
    return boolOnePair;
    }//end of method

}


