package Assignment.One.LevelOne;

/*
 * Program 4: Calculate Profit and Profit Percentage.
 * Cost Price = 129, Selling Price = 191
 * Formula:
 *   Profit = Selling Price - Cost Price
 *   Profit Percentage = (Profit / Cost Price) * 100
 */
class ProfitCalculation {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercent = (profit / (double) costPrice) * 100;

        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +
                "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
    }
}
