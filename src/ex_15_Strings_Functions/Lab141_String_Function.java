package ex_15_Strings_Functions;

public class Lab141_String_Function {
    public static void main(String[] args) {
        String name ="Sonal";
        System.out.println(name.length());

        //1.ChatAt()
        String name1 = "Abhishek";
        System.out.println(name1.charAt(4));
        // System.out.println(name.charAt(10)); //StringIndexOutOfBoundsException

        //2. concat()
        System.out.println(name.concat(" Patel"));

        //3. contains()
        System.out.println(name1.contains("s"));

        //4. equals()
        System.out.println(name.equals("Sonal"));

        //5. wqualsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sonal"));

        //6. indexOf() //sonal -> ? 0
        System.out.println(name.indexOf('o'));


        String s1 = "madam";
        //Returns the index within this string of the
        //first occurance of the specified substring
        System.out.println(s1.indexOf("m"));
    }
}
