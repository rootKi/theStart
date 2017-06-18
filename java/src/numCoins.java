/**
 * Created by root on 6/17/17.
 */
public class numCoins {

    public static void main(String[] args) {

        String money = "0.73";

        System.out.println(getThatChangeBitch(money));
    }

    public static int getThatChangeBitch(String money) {
        int coins = 0;
        double moneyI = Double.parseDouble(money);

        while (moneyI > 0.00) {
            while (moneyI >= 0.50) {
                double fifty = moneyI / 0.5;
                int numFifty = (int) fifty;
                coins += numFifty;
                moneyI = roundIt(moneyI);
                moneyI -= (numFifty * .5);
            }
            while (moneyI >= 0.25) {
                double twentyFive = moneyI / 0.25;
                coins += twentyFive;
                int numTwentyFive = (int) twentyFive;
                moneyI = roundIt(moneyI);
                moneyI -= (numTwentyFive * .25);
            }
            while (moneyI >= 0.10) {
                double dimes = moneyI / 0.10;
                int numDimes = (int) dimes;
                coins += numDimes;
                moneyI = roundIt(moneyI);
                moneyI -= (numDimes * .10);
            }
            while (moneyI >= 0.05) {
                double nickels = moneyI / 0.05;
                int numNickels = (int) nickels;
                coins += numNickels;
                moneyI = roundIt(moneyI);
                moneyI -= (numNickels * .05);
            }
            while (moneyI >= 0.01) {
                double pennies = moneyI / 0.01;
                int numPennies = (int) pennies;
                coins += numPennies;
                moneyI = roundIt(moneyI);
                moneyI -= (numPennies * 0.01);
            }
        }


        return coins;


    }

    public static double roundIt(double moneyI) {
        return Math.round(moneyI * 100.0) / 100.0;
    }
}
