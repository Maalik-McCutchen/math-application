package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        double bobSalary = 85_000;
        double graySalary = 95_000;
        double highestSalary = Math.max(bobSalary, graySalary);
        System.out.println("The hightest salary is " + highestSalary);

        double carPrice = 50_000;
        double truckPrice = 65_000;
        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is " + lowestPrice);



        double squareRoot = 5.0;
        double rootIs = Math.sqrt(squareRoot);
        System.out.println("The square root is " + rootIs);




    }
}
