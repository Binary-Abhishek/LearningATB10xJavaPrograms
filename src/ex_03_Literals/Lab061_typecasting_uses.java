package ex_03_Literals;

public class Lab061_typecasting_uses {
    public static void main(String[] args) {
        int course = 100;
        float gst = 18.45f;
        int total_int = course+(int)gst; //Narrow Explicit
        float total = course+gst; //Widening Explicit
        float total2 = (float) course+gst;//widening - explicit
        System.out.println(total);
    }
}
