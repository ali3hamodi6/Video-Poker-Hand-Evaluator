//Created by Ali Hamodi

public class PayoutTable {

//    default Payout Table
//    RoyalFlush = 250;
//    StraightFlush = 50;
//    FourOfKind = 25;
//    FullHouse = 8;
//    Flush = 5;
//    Straight = 4;
//    ThreeOfKind =3;
//    TwoPair = 2;
//    JacksOrBetter =1;

                                          //0  1  2  3 4 5 6 7 8
    private static double payoutTable[] = {250,50,25,8,5,4,3,2,1};

    public PayoutTable(){

    }

    public static void setPayoutTable(double[] payoutTable) {
        PayoutTable.payoutTable = payoutTable;
    }

    public static double[] getPayoutTable() {
        return payoutTable;
    }
}
