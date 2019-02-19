/** @author Nitin "Like a Sweater" Armstrong
 ** @version 4.20
 ** 1st HW assignment, does some toll collection shit
 **/
public class TrollToll
{
    static private int totalMoney;
    private int money;
    public void collect(double i) { // collect money
        money += i;
        totalMoney += i;
    }

    public double myMoney() {return money;}; // returns this troll's money

    public static double treasury() {return totalMoney;}; // returns total money collected by all trolls

    public static void emptyTreasury() {totalMoney = 0;}; // sets the total money collected by all trolls to 0

}