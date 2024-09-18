package ex_18092024;

public class Lab052_TypeCastingPractical2 {
    public static void main(String[] args) {
        //GST = 18.45;
        int course_fee = 100;
        float GST = 18.45f;
//        int total_price = course_fee + GST;  // Narrowing - Implicit - JVM - Invalid

        float total_price = course_fee + GST;  // Widening - Implicit
        System.out.println(total_price);

        int total_price1 = course_fee + (int) GST; // Narrowing - Explicit - Loss
        System.out.println(total_price1);


    }
}
