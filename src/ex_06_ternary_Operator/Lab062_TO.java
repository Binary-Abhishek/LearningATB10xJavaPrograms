package ex_06_ternary_Operator;

public class Lab062_TO {
    public static void main(String[] args) {
        //result = condition ? expression1 : expression2;
        int age = 18;
        String canIVote = age >= 18 ? "Yes, You can vote" : "No, you cannot vote" ;
        System.out.println(canIVote);
    }
}
