package ex_03_Literals;

public class Lab059_TypeCasetingNarrowing {
    public static void main(String[] args) {
        int val = 200;
        // byte b = val; //invalid --> Implicit type casting narrowing is not possible

        byte c = (byte)val; //Valid --> Explicit casting possible Here we will have data loss as we are putting larger bucket int in smaller bnucket byte

    }
}
