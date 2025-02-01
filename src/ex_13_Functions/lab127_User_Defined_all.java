//package ex_13_Functions;
//
//import java.util.Scanner;
//
//public class lab127_User_Defined_all {
//    public static void main(String[] args) {
//
//        //User defined functions
//
//        //1. Without Parameters and without Return type
//        //2. Without Parameters and With Return type
//        //3. With Parameters and Without Return Type
//        //4. With Parameters and With Return Type
//
//        //1. Without Argument/Parameters and without return type
//        greet();
//
//        //2. Without Parameters but with return type
//        String s = greet_with_hello();
//        System.out.println(s);
//
//        int age_to_vote_person = age_to_vote();
//        System.out.println("Age to vote is -> " + age_to_vote_person);
//        greet_with_hello();
//    }
//
//    // 3. With parameters and without Return Type (90%)
//    greet_with_name("Abhishek");
//
//    greet_with_name("Kumar");
//
//    greet_with_name("Singh");
//
//    greet_with_full_name("Abhishek","Kumar");
//
//    greet_with_full_name("Abhi ","Coder");
//
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter your name");
//    String name = sc.next();
//    System.out.println("Enter your age");
//    int age = sc.nextInt();
//    System.out.println("Enter your salary");
//
//    double salary = sc.nextDouble();
//
//    greet_with_details(name, age, salary);
//
//    //4. With Parameters and with return type
//    int sum = sum_of_two_numbers(3, 4);
//    int sum2 = sum_of_two_numbers(190, 900);
//    int sum3 = sum_of_two_numbers(2345, 5432);
//    int sum4 = sum_of_three_numbers(2345, 5432, 5432);
//    System.out.println(sum);
//    System.out.println(sum2);
//    System.out.println(sum3);
//    System.out.println(sum4);
//
//    int result = Math.max(3, 4);
//}
//
//
//
//    //Function Declaration starts from here
//    //1. Without Parameters and without Return Type - Declaration
//    static void greet() {
//        System.out.println("Hey, How are you?");
//    }
//
//    //2. Without Parameters but with return type
//    static String greet_with_hello() {
//        return "Hi, How are you, example";
//    }
//
//    static void age_to_vote() {
//        System.out.println();
//    }
//
//    //3. With Paramters and without Retrun type (void)
//    static void greet_with_name(String name) {
//        System.out.println("Hi, Your name is " + name);
//    }
//
//    static void greet_with_full_name(String firstname, String lastname) {
//        System.out.println("Hi, Your name is " + firstname + lastname);
//    }
//
//    static void greet_with_details(String name, int age, double salary) {
//        System.out.println("Your name is ->" + name + "\n Your age is " + age + "\n Your salary is " + salary);
//    }
//
//  //4. With Parameters and with Return type
//  static int sum_of_two_numbers(int a, int b) {
//        return a+b;
//  }
//
//  static int sum_of_three_numbers(int a, int b, int c) {
//        return a+b=c;
//  }
//
//}
