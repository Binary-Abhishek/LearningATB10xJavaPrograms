package ex_15_Strings_Functions;

public class Lab140_String_Functions {
    public static void main(String[] args) {
        String str1 = "Hello";   // SCP -> // Crestes or resuses "Hello" in the string pool
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1 == str2);
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str3));
    }
}
