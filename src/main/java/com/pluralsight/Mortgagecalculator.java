package com.pluralsight;

import java.util.Scanner;

public class Mortgagecalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("$53,000(loan): ");
        double loanAmount = scan.nextDouble();

        System.out.print("7.625%(interest rate): ");
        double interestRate = scan.nextDouble()/100;

        System.out.print("15(loan years): ");
        int loanlengthInyears = scan.nextInt();
        int numberofmonthofpayments = 12 *loanlengthInyears;

       double monthlyinterestrate = interestRate / 12;

       double monthlypayments = loanAmount *
               (
               monthlyinterestrate * Math.pow(1 +monthlyinterestrate , numberofmonthofpayments)
               /
               (
                       monthlyinterestrate * Math.pow(1 +monthlyinterestrate , numberofmonthofpayments) -1));

        double totalintesrest =  (monthlypayments * numberofmonthofpayments)-loanAmount;

        System.out.printf("Monthly Payment: %.2f, Total Interest: %.2f", monthlypayments,totalintesrest);
    }
}
