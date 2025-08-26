package Assignment.One.LevelOne;

/*
 * Program 6: University charges fee = 125000, discount = 10%.
 * Find discounted amount and final fee.
 */
class UniversityFeeDiscount {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;

        double discountAmount = (discountPercent / 100) * fee;
        double finalFee = fee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount +
                " and final discounted fee is INR " + finalFee);
    }
}
