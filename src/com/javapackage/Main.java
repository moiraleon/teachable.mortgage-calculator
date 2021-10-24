package com.javapackage;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static double readNumber(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextInt();
            if (value >= min && value <= max)
                break;
            else {
                System.out.println("Please enter a a value between "+min+ " and "+max);
            }
        }
        return calculateMortgage();
    };

    public static String  calculateMortgage(
            int principleInput,
            float AIRInput,
            int periodInput){

        double r = (AIRInput/100)/12;//monthly interest rate
        double n = periodInput * 12;//number of payments
        double mortgageResult = principleInput *(r * Math.pow(1+r,n)/Math.pow(1+r,n));
        System.out.println(mortgageResult);
        String mortgagePayment = NumberFormat.getCurrencyInstance().format(mortgageResult);
        //System.out.println("Mortgage:" + mortgagePayment);
        return ("Mortgage:" + mortgagePayment);
    }


}