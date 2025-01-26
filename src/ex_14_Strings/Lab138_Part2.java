package ex_14_Strings;

public class Lab138_Part2 {
    public static void main(String[] args) {
        String s1 = "Hello"; //SCP = 1
        String s4 = "Hello"; //1

        String s2 = new String("Hello"); //OA
        String s3 = new String("Hello");
        String s5 = new String("hello"); //OA - 3

        // == ? comparision -> Strings -> This check the location ref.
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        System.out.println(s1 == s4);
        System.out.println(s3 == s5);
    }
}
