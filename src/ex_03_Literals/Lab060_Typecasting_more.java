package ex_03_Literals;

public class Lab060_Typecasting_more {
    public static void main(String[] args) {
        long phone_no = 864758467;
        //short s = phone_no; //implicit not possible
        short s = (short)phone_no; //explicit possible
    }
}
