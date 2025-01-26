package ex_14_Strings;

public class Lab138_Interview_Q2 {
    public static void main(String[] args) {
        String s1 = "Hello"; //SCP = 1
        String s4 = "Hello"; //1

        String s2 = new String("Hello"); //OA
        String s3 = new String("Hello");
        String s5 = new String("hello");




        //equals (content) = value
        //How can we check the values? equals == value
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s1.equals(s4));
        System.out.println("s3 & s5 are: " + (s3.equalsIgnoreCase(s5)));
    }
}
