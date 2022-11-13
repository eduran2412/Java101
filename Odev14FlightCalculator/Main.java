package Odev14FlightCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double sum, km, ageDiscount = 1, tariff = 0.1, roundTripDiscount = 1;
        int age, isReturn;

        System.out.print("Distance (km) : ");
        km = scanner.nextDouble();

        System.out.print("Age : ");
        age = scanner.nextInt();

        System.out.print("Please Select:\n 1 - One Way \n 2 - Round-Trip \n :");
        isReturn = scanner.nextInt();

        if(age<0 || km<0 || (isReturn!=1 && isReturn!=2)){
            System.out.println("Please check the information that you provided!");
        }else{
            if(age<12){
                ageDiscount = 0.5;
            }else if (12<age && age<24 ){
                ageDiscount = 0.9;
            }else if (age>65){
                ageDiscount = 0.7;
            }

            if (isReturn == 2){
                roundTripDiscount = 1.6; // multiply with 2 (round-trip)
            }

            sum = km * tariff * ageDiscount * roundTripDiscount;
            System.out.println("Total : " + sum);
        }

    }
}