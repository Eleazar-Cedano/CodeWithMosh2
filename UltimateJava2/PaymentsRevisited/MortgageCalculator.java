package UltimateJava2.PaymentsRevisited;

public class MortgageCalculator {
    private static final byte MONTHS_IN_YEAR = 12;
    private static final byte PERCENT = 100;
    static double period;
    static double monthlyRate;
    static double balance;
    static double answer;

    /*
    public double[] getRemainingBalance(){
    var balances= new double[setPeriod()]
    for (short month = 1; month <= setPeriod(); month++){
        double balanceResult =
        return new double[0];
    }
    */

    private static double setMonthlyRate() {
        return monthlyRate = Console._annual_Interest / PERCENT / MONTHS_IN_YEAR;
    }

    private static double setPeriod() {
        return period = Console._term * MONTHS_IN_YEAR;
    }

    private static double getAnswer() {
        return Console._principal * (monthlyRate * Math.pow(1 + monthlyRate, period))
                / (Math.pow(1 + monthlyRate, period) - 1);
    }

    static double setAnswer() {
        setPeriod();
        setMonthlyRate();
        return answer = getAnswer();
    }

    static void calculateMortgage() {
        setAnswer();
        MortgageReports.viewPayment();
        MortgageReports.viewRemainingBalance();


    } // end of calculate mortgage

}// end of MortgageCalculator Class


// FORMULA FOR THE REMAINING BALANCE "B":
// B=L[(1+c)raised to the power of total payments "n" - (1+c) raised to the power of made payments "p" / [(1+c) raised to the power of n - 1]

    /*
    public static double calculateBalance(int principal, float annualInterest, byte years, short numberOfPaymentsMade) {

        monthlyRate = annualInterest / PERCENT / MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR;

        double balance = principal * Math.pow(1 + monthlyRate, numberOfPayments) - Math.pow(1 + monthlyRate, numberOfPaymentsMade) / (Math.pow(1 + monthlyRate, numberOfPayments) - 1);
          return balance;

        for (short month = 1; month < period; month++ )
         }*/
