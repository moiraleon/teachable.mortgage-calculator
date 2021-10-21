package com.javapackage;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //get principle
        Scanner principleScanner = new Scanner(System.in);
        System.out.print("Principle: ");
        int principleInput = principleScanner.nextInt();
       // System.out.println("Your Principle is "+ principleInput);

        //get annual interest rate
        Scanner AIRScanner = new Scanner(System.in);
        System.out.print("Annual Interest Rate: ");
        float AIRInput = AIRScanner.nextFloat();
       // System.out.println("Your Annual Interest Rate is "+ AIRInput);

        //get period in years
        Scanner periodScanner = new Scanner(System.in);
        System.out.print("Period (Years): ");
        int periodInput = periodScanner.nextInt();
       // System.out.println("Your Period in Years is "+ periodInput);


        //print Mortgage
        //formula for mortgage = principle * monthly interest rate(annual interest rate/100(to make it a percentage) then /12)
        //n = number of payments years period x 12
        //raising to power requires Math.pow

        //get all values

        double r = (AIRInput/100)/12;//monthly interest rate
        double n = periodInput * 12;//number of payments
       // double top = Math.pow(r*(1+r),n);
        //System.out.println(top);
        //double bottom = (Math.pow((1+r),n))-1;
        //System.out.println(bottom);

        //System.out.println(n);

        //formula for mortgage result
//        double mortgageResult = principleInput *(top/bottom);
        double mortgageResult = principleInput *(r * Math.pow(1+r,n)/Math.pow(1+r,n));

        System.out.println(mortgageResult);

        //convert input to currency input
        String mortgagePayment = NumberFormat.getCurrencyInstance().format(mortgageResult);

        System.out.println("Mortgage:" + mortgagePayment);

    }
}
