package ex_13_Functions;

public class Lab126_UserDefined {
    public static void main(String[] args) {

        //Step 2: We call the function
        main();
        greet();

        System.out.println("");
        System.out.print("");
        System.out.printf("");
    }

        //Step 1: We declare the function and we always declare function outside main fucntion
        public static void main() {
            System.out.println("Hi, another look like user definded function");
        }

        //Without Paraments and without return type
    //no argument and no return type
    static void greet() {
        System.out.println("Hey, this is another example of Fundtion");
    }

}
