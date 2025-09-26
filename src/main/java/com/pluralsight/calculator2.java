package com.pluralsight;

import java.util.Scanner;

public class calculator2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("$1,000(depositAmount ): ");
        double depositAmount = scan.nextDouble();

        System.out.print("1.75% = (yearly interest rate): ");
        double interestRate = scan.nextDouble()/100;

        System.out.print("5(yearsinterestmatures ): ");
        int yearsinterestmatures = scan.nextInt();
        int numberofmonthofpayments = 12 *yearsinterestmatures;

        double yearlyinterestrate = interestRate / 12;

        double monthlyinterestinterestRate = depositAmount *yearlyinterestrate;



        yearlyinterestrate = depositAmount * yearlyinterestrate -depositAmount * (yearlyinterestrate * numberofmonthofpayments)- depositAmount;

        System.out.printf("depositAmount: %.2f, Total Interest: %.2f", depositAmount,yearlyinterestrate);

    }
}
