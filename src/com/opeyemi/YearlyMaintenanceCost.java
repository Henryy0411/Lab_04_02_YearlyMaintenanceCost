package com.opeyemi;

public class YearlyMaintenanceCost {

    public static void main(String[] args) {
        double springCost = 100.0;
        double summerCost = 75.55;
        double fallCost = 105.43;
        double winterCost = 99.99;
        double totalYearlyMaintenanceCost;


        totalYearlyMaintenanceCost = springCost + summerCost + fallCost + winterCost;
        System.out.println("Spring cost is :" + springCost);
        System.out.println("Summer cost is :" + summerCost);
        System.out.println("Fall cost is :" + fallCost);
        System.out.println("Winter cost is :" + winterCost);

        System.out.print("The total yearly maintenance cost is " + totalYearlyMaintenanceCost);

    }
}
