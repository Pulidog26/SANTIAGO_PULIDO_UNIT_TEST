package com.mycompany.unitestsample2;


import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santi
 */
public class Operations {
    
    public static int NextNumber(int userNumber){
        return userNumber + 1;
    }
    
    public static boolean IsDivisible(int firstNumber, int secondNumber){
        int moduleResult = secondNumber % firstNumber;
        return moduleResult == 0;
    }
    
    public static double RandomNumberDecreased(int randomNum){
        double resultRandom = (double) randomNum;
        resultRandom -= (resultRandom*0.15);
        return resultRandom;
    }
    
    public static int TotalOfGroup(int numBoys, int numGirls){
        return numBoys + numGirls;
    }
    
    public static double PercentageOfBoys(int numBoys, int totalGroup){
        double percentageBoys = (numBoys * 100)/ totalGroup;
        return percentageBoys;
    }
    
    public static double PercentageOfGirls (int numGirls, int totalGroup){
        double percentageGirls = (numGirls * 100)/ totalGroup;
        return percentageGirls;
    }
}
