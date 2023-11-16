package com.mycompany.unitestsample2;


import java.util.Scanner;
import com.mycompany.unitestsample2.*;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santi
 */
public class unitTestSample {
    
    public static void main(String[] args) {
        System.out.println("Select one option below");
        System.out.println("1. Add next number");
        System.out.println("3. Generate a random number and decrease his value by 15%");
        System.out.println("10. Based two numbers return devisible");
        System.out.println("11. Percentage of boys and girls in a group");
        
        Scanner sc = new Scanner(System.in);
        Random r1 = new Random();
        String userResult = sc.next();
        switch (userResult){
            case "1":
                System.out.println("Type an integer number");
                String userNumber = sc.next();
                int userNumberInt = Integer.parseInt(userNumber);
                int nextResult = Operations.NextNumber(userNumberInt);
                System.out.println(nextResult);
                break;
            
            case "3":
                /*Diseñar un algoritmo que genere un numero aleatorio del 10 al 50,
                lo muestre y luego calcule y muestre el mismo disminuido en un 15%*/
                int randomNum = r1.nextInt(41) + 10;
                double resultRandom = Operations.RandomNumberDecreased(randomNum);
                System.out.println("The random number generated was: " + randomNum);
                System.out.println("The result of " + randomNum + "decrease by 15% is: " + resultRandom);
                break;
            
            case "10":
                System.out.println("Type an integer number (denominator)");
                String firstDivisibleNumber = sc.next();
                System.out.println("Type a second integer number (numerartor)");
                String secondDivisibleNumber = sc.next();
                boolean result = Operations.IsDivisible(Integer.parseInt(firstDivisibleNumber), Integer.parseInt(secondDivisibleNumber));
                if(result){
                    System.out.println( secondDivisibleNumber  + " is divisible into " + firstDivisibleNumber);
                }
                else{
                    System.out.println(secondDivisibleNumber + " is not divisible into " + firstDivisibleNumber);
                }
                break;
                
             case "11":
                /*Diseñar un algoritmo para calcular el porcentaje de hombres y mujeres
                 que hay en un grupo dado los totales de hombres y mujeres.*/
                System.out.println("Type the number of girls in the group");
                int numGirls = sc.nextInt();
                System.out.println("Type the number of boys in the group");
                int numBoys = sc.nextInt();
                int totalGroup = Operations.TotalOfGroup(numBoys, numGirls);
                double percentageBoys = Operations.PercentageOfBoys(numBoys, totalGroup);
                double percentageGirls = Operations.PercentageOfGirls(numGirls, totalGroup);
                System.out.println("The total amount of people in the group is: " + totalGroup);
                System.out.println("The " + percentageBoys + "% of the group are boys");
                System.out.println("The " + percentageGirls + "% of the group are girls");
                break;
            
             case "12":
                 System.out.println("Commit in a new branch");
                 break;
        }
    }
}
