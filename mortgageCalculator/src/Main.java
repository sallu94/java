import java.text.NumberFormat;
import java.util.Scanner;

//Program for calculating simple Mortgage

public class Main {
    public static void main(String[] args) {

       final byte MONTHS_IN_YEAR = 12; //final value for months in a year
       final byte PERCENT = 100; //final value for the percentage

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt(); //Taking the Principal amount from the user

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat(); //Taking the Interest Rate from the user
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR; //Calculating the monthly interest using the formula

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();  //Taking the number of years from the user
        int numberOfPayments = years * MONTHS_IN_YEAR; //Calculating the number of Payments

        double mortgage = principal //Calculating the mortgage based on the input values received from the user
                * (monthlyInterest * Math.pow(1+ monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) -1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage); //formatting the output to get the currency
        System.out.println("Mortgage: " +mortgageFormatted); //Printing the mortgage
    }
}
