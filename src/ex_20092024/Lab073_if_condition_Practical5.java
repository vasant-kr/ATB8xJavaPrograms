package ex_20092024;

public class Lab073_if_condition_Practical5 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 20;
        if (num1 > num2) {
            System.out.println(num1);
        }
        else if(num2 > num1){
            System.out.println(num2);

        }else {
            System.out.println("Both are equal");
        }
    }
}
