package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Average Score

        //Prompt user for 10 exam scores
        //Get examScore
        //Calculate averageScore = (Sum(examScore)) / 10
        //Display averageScore


        // Roof Runoff

        //Prompt user for roofDimensions
        System.out.print("Enter roof dimension 1 in feet: ");
        //Get roofDimensionOne
        double roofDimensionOne = scanner.nextInt();
        //Prompt user for roofDimensions
        System.out.print("Enter roof dimension 2 in feet: ");
        //Get roofDimensionTwo
        double roofDimensionTwo = scanner.nextInt();
        //Prompt user for rainInches
        System.out.print("Enter inches of rain: ");
        //Get rainInches
        double rainInches = scanner.nextInt();
        //Calculate roofInches = (roofDimensions * 12)
        double roofInches = (roofDimensionOne * 12) * (roofDimensionTwo *12);
        //Calculate rainCubed = roofDimensions * rainInches
        double rainCubed = roofInches * rainInches;
        //Calculate gallonRain = rainCubed / 231
        double gallonRain = rainCubed / 231;
        //Display gallonRain
        System.out.print("The amount of rain was " + gallonRain + " gallons.");

    }
}
