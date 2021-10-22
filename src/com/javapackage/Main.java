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

    public static double calculateMortgage(
            int principleInput,
            float AIRInput,
            int periodInput){

    }


}