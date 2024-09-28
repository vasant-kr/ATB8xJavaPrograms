package ex_25092024;

public class Lab_091_ForLoop_WithContinue {
    public static void main(String[] args) {

        // using continue in for loop
        // it will not print line 14 when i ==5, it will go back in the loop and skip executing line 14

        for (int i=0; i<10; i++){
            System.out.println(i);// 0 to 9
            if (i==5){
                continue;
            }
            System.out.println("After");
        }




    }
}
