package com.javapackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //get principle
        Scanner principleScanner = new Scanner(System.in);
        System.out.print("Principle: ");
        int principleInput = principleScanner.nextInt();
        System.out.println("Your Principle is "+ principleInput);

        //get annual interest rate
        Scanner AIRScanner = new Scanner(System.in);
        System.out.print("Annual Interest Rate: ");
        float AIRInput = AIRScanner.nextFloat();
        System.out.println("Your Annual Interest Rate is "+ AIRInput);

        //get period in years
        Scanner periodScanner = new Scanner(System.in);
        System.out.print("Period (Years): ");
        int periodInput = periodScanner.nextInt();
        System.out.println("Your Period in Years is "+ periodInput);



    }
}
