package MortGage;

import java.text.NumberFormat;
import java.util.Scanner;

class MyMortgage2 {
    final static double MONTHS_IN_YEAR = 12;
    final static double PERCENT = 100;
    static double monthlyRate;
    static int principal;
    static double period;
    static Scanner scanner = new Scanner(System.in);

    static int setPrincipal(){
        do {
            System.out.print("Enter Principal($1k-$1MM): ");
             principal = scanner.nextInt();
            if (principal < 1000 || principal > 1000_000)
                System.out.println("Enter a value equal or greater than $1K and equal " +
                    "or greater than $1MM:"
                    );
        }while(principal < 1000 || principal > 1000_000);

        return principal;
    }

     static double setMonthlyInterestRate(){
        double annualInt;
       do {
           System.out.print("Enter Annual Interest Rate: ");
            annualInt = scanner.nextDouble();
           if(annualInt < 1 || annualInt > 30)
               System.out.println("Enter a value greater than 0 and equal or less " +
                       "than 30");


       }while(annualInt < 1 || annualInt > 30);

        monthlyRate = annualInt / PERCENT / MONTHS_IN_YEAR;
        return monthlyRate;
    }

     static double setTerm(){
        int term;
        do {
            System.out.print("Enter the Term (Years): ");
            term = scanner.nextInt();
            if (term < 1 || term > 30)
               System.out.println("Enter a value between 0 and 30");


        }while(term < 1 || term > 30);
        period = term * MONTHS_IN_YEAR;

        return period;
    }

     static void getMyMortgage(){
        setPrincipal();
        setMonthlyInterestRate();
        setTerm();

        double rateStep1 = monthlyRate*(Math.pow((1 + monthlyRate),period));
        double rateStep2 = (Math.pow((1 + monthlyRate),period))-1;
        double rateStep3 = rateStep1/rateStep2;
        double answer = principal*rateStep3;

        String stringMortgage = NumberFormat.getCurrencyInstance().format(answer);
        System.out.println("Mortgage: " + stringMortgage);
    }

    public static void main(String[] args){

        getMyMortgage();

    }

}