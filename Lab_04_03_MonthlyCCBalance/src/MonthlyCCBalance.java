public class MonthlyCCBalance {
    public static void main(String[] args) {
        double credBal = 5000.00;
        final double INT_RATE = 0.17;
        double monOneInt = 0.00;
        double monTwoInt = 0.00;
        monOneInt = credBal * INT_RATE;
        double totBal = monOneInt + credBal;
        monTwoInt = totBal * INT_RATE;
        System.out.println("The interest due for the first month is " + monOneInt);
        System.out.println("The interest due for the second month is " + monTwoInt);
    }
}