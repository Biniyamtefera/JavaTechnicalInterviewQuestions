package Array;

/**
 * Eg.
 * Input
 * ary = [55 68 72 99 30 124 235]
 * (7 days of trading)
 *
 * Sample output
 * Buy day 0, Sell day 3
 * Buy day 4, Sell day 6
 */

/**
 * In daily share trading, a buyer buys shares in the morning and sells them on the same day.
 * If the trader is allowed to make at most 2 transactions in a day, whereas the second transaction can
 * only start after the first one is complete (Buy->sell->Buy->sell). Given stock prices throughout the day,
 * find out the maximum profit that a share trader could have made.
 */
public class Profit {
    //Return maimum profit
    //with two transaction
    //given list of price
    //price [0.......n]


    public static int maxProf(int price[], int n) {
        //Creat profit array
        //and initialize it as 0
        int profit[] = new int[n];
        for (int i = 0; i < n; i++) {
            profit[i] = 0;
            /** Get the maximum profit
             with only one transaction
             allowed. After this loop,
             profit[i] contains
             maximum profit from
             price[i..n-1] using at most
             one trans. */


            int max_price = price[n - 1];

            for (int j = n - 2; j >= 0; j--) {
                // max_price has maximum of price[i..n-1]
                if (price[i] > max_price)
                    max_price = price[i];

                //we can get profit[i] by taking maximum of:
                // a) previous maximum,
                // i.e., profit[i+1]
                // b) profit by buying
                // at price[i] and selling
                // at
                //    max_price
                profit[i] = Math.max(profit[i + 1],
                        max_price - price[i]);
            }
        }
        return 0;
    }
}
