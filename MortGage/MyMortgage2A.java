package MortGage;

import java.text.NumberFormat;
import java.util.Scanner;

public class MyMortgage2A {
    static Scanner scanner = new Scanner(System.in);
    final static byte MONTHS_IN_YEAR = 12, PERCENT = 100;
    static double period, monthlyRate, value;

    static double readPrincipal(String prompt, double min, double max){

        do {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            else
                System.out.printf("Enter a value between $%,1.2f and $%,1.2f \n", min
                        ,max);

        }while(true);
        return value;
        }

    static float readInterestRate() {
        double min = 3.0, max = 6.0;
        do {
            System.out.print("Enter the Yearly Interest Rate");
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            else
                System.out.printf("Enter a value between %%d and %%d " +
                                "\n", min
                        , max);

        } while (true);
        return (float)value;
    }

    static byte readTerm() {
        double min = 10, max = 30;
        do {
            System.out.print("Enter the Term (in Years): ");
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            else
                System.out.print("Enter a value between 15yrs and 30yrs");

        } while (true);
        return (byte)value;
    }
    static void calculateMortgage(int principal, byte term,float interest){

        period = term * MONTHS_IN_YEAR;
        monthlyRate = interest / PERCENT / MONTHS_IN_YEAR;
        double answer =
                principal *(monthlyRate * Math.pow(1 + monthlyRate, period)) / (Math.pow(1 + monthlyRate,period)-1);

        String stringMortgage = NumberFormat.getCurrencyInstance().format(answer);

        System.out.println("Your Monthly Mortgage Payment is: " + stringMortgage);
    }

    public static void main(String[] args){

        int _principal = (int) readPrincipal("Enter the Principal: ",30_000,1000_000);
        byte _years = readTerm();
        float _interest = readInterestRate();

        calculateMortgage(_principal,_years,_interest );
    }
}