package UltimateJava2.PaymentsRevisited;

import java.text.NumberFormat;

public class MortgageReports  {



    public MortgageReports(int principal, double term, float interest) {
        Console.readPrincipal(principal);
        Console.readTerm(term);
        Console.readInterestRate(interest);
    }

    static void viewPayment() {
        System.out.println();
        MortgageCalculator.setAnswer();
        String stringMortgage = formatCurrency(MortgageCalculator.answer);
        System.out.println("Your Monthly Mortgage Payment is: " + stringMortgage);

    }

    static void viewRemainingBalance(){

        MortgageCalculator.setAnswer();
        System.out.println("\nPAYMENT SCHEDULE \nNote: the following schedule reflects the first and consecutive monthly payments .\n----------------\n");
        for (int n = 1; n <= MortgageCalculator.period; n++) {
            MortgageCalculator.balance = getBalance(n);
            String stringBalance = formatCurrency(MortgageCalculator.balance);
            System.out.println(stringBalance + "\n");
        }
    }// end of viewRemainingBalance

    private static double getBalance(int n) {
        return Console._principal * (Math.pow(1 + MortgageCalculator.monthlyRate, MortgageCalculator.period)
                - Math.pow(1 + MortgageCalculator.monthlyRate, n)) / (Math.pow(1 + MortgageCalculator.monthlyRate, MortgageCalculator.period) - 1);
    }

    private static String formatCurrency(double balance) {
        return NumberFormat.getCurrencyInstance().format(balance);
    }

    void viewMortgageReport() {
        MortgageCalculator.calculateMortgage();
    }// end of viewMortgageReport()

}// end of MortgageReports Class

