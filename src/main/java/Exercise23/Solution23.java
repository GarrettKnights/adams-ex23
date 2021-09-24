/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Garrett Adams
 */

package Exercise23;

import java.util.Scanner;

public class Solution23 {
    public static void main(String[] args) {

        //Declares the variables that we will be using
        String carsilentturn;
        String batterycorrode = "";
        String slicking = "";
        String crank = "";
        String startdie = "";
        String fuelinj = "";

        //Initializes the scanner
        Scanner ScanWord = new Scanner(System.in);

        //Asks user for input
        System.out.println("Is the car silent when you turn the key? ");
        //Scans input to carsilentturn
        carsilentturn = ScanWord.next();

        //If carsilentturn is yes
        if (carsilentturn.equals("y")){
            //Asks question
            System.out.println("Are the battery terminals corroded? ");
            //Scans input to batterycorode
            batterycorrode = ScanWord.next();
        }
        //If carsilentturn is no
        else if (carsilentturn.equals("n")){
            //Asks question
            System.out.println("Does the car make a slicking noise?");
            //Scans input to slicking
            slicking = ScanWord.next();
        }
        //if batterycorode is yes
        if (batterycorrode.equals("y")){
            //Gives final output
            System.out.println("Clean terminals and try starting again ");
        }
        //Gives final otuput
        else if (batterycorrode.equals("n")){
            System.out.println("Replace cables and try again. ");
        }
        //If slicking is yes
        if (slicking.equals("y")){
            //Gives final output
            System.out.println("Replace the battery.");
        }
        //If slicking is no
        else if (slicking.equals("n")){
            //Asks question
            System.out.println("Does the car crank up but fail to start?");
            //Scans input
            crank = ScanWord.next();
        }
        //If crank is yes
        if (crank.equals("y")){
            //Gives final output
            System.out.println("Check the spark plug connections.");
        }
        //If crank is no
        else if (crank.equals("n")){
            //Asks question
            System.out.println("Does the engine start and then die?");
            //Scans input
            startdie = ScanWord.next();
        }
        //If startdie is yes
        if (startdie.equals("y")){
            //Asks question
            System.out.println("Does you car have fuel injection?");
            //Scans input
            fuelinj = ScanWord.next();
        }
        //If startdie is no
        else if (startdie.equals("n")){
            //Gives final output
            System.out.println("Check to ensure the choke is opening and closing.");
        }
        //If fuelinj is cyes
        if (fuelinj.equals("y")){
            //Gives final output
            System.out.println("Get it in for service");
        }
        //If fuelinj is no
        else if (fuelinj.equals("n")){
            //Gives final output
            System.out.println("This should not be possible");
        }
    }
}