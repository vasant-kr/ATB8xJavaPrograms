package ex_27092024;

public class Lab_095_DoWHileLoop_Practical1 {
    public static void main(String[] args) {

        //In the case of do-while first block of statements will be executed and then condition will be verified.
        // We don't use do-while much, majorly we use for loop or while loop

        // Only used when we have to execute the code once even if the condition fails
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i > 10);

    }
}

/*
output:
1
 */

