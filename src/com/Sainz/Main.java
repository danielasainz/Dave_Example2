package com.Sainz;

//Modified from Dave Example 1
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        String result = "";


        while (done == false) {
            System.out.println("In the loop");
            System.out.println("Do you want to go again? (Y/N)");
            result = keyboard.nextLine();
            // need to compare the result
            if (result.equalsIgnoreCase("Y")){
                done = false;
            }else{
                // if done = true; I exit the loop
                //if I want to leave the loop - set done = true
                done = true;
            }
        }
        System.out.println("The loop is over");
    }
}


