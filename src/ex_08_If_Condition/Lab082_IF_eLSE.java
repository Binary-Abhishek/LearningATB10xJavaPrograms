package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_IF_eLSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //to initialze the input
        System.out.println("Enter the age in Integer"); //to tell the user what to input
        int age = sc.nextInt(); //to tell the system what value to take input as

        if(age>18) {
            System.out.println("You are allowed to vote");
        }
        else {
            System.out.println("You are a noob!");
        }

    }
}
