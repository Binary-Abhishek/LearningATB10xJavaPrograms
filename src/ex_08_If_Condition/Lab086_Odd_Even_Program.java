package ex_08_If_Condition;

import java.util.Scanner;

public class Lab086_Odd_Even_Program {
    public static void main(String[] args) {
        //create a program - take user input
        //check weather the input is even or odd number

        //Step 1- Figure out inputs and output
        // number (int) -> Scanner Class can be used to take input
        // String -> odd or eben -> o/p, println
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a int number ");
        int num = sc.nextInt();

        //Step: Logic button
        //num%2 == 0 -> even - modules - R == 0 -> even
        // num%2 !=0 -> odd ->

        // Step 3 : Logic write
        if (num%2 == 0){
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd Number");
        }
        sc.close();
    }
}
