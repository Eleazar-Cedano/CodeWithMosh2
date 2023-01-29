package MortGage;

import java.text.NumberFormat;
import java.util.*;

 class MyMortgage {
    static void mortgage(){
        final double MONTHS_IN_YEAR = 12;
        final double PERCENT = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Enter Annual Interest Rate: ");
        double annualInt = scanner.nextDouble();
        double monthlyRate = annualInt/PERCENT/MONTHS_IN_YEAR;

        System.out.print("Enter the Term (Years): ");
        int  term = scanner.nextInt();
        double period = term * MONTHS_IN_YEAR;

        double rateStep1 = monthlyRate*(Math.pow((1 + monthlyRate),period));
        double rateStep2 = (Math.pow((1 + monthlyRate),period))-1;
        double rateStep3 = rateStep1/rateStep2;
        double answer = principal*rateStep3;

       String stringMortgage = NumberFormat.getCurrencyInstance().format(answer);
        System.out.println("Mortgage: " + stringMortgage);

    }
    public static void main(String[] args){
        mortgage();

            }
        }








