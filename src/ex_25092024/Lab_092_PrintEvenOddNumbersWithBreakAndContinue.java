package ex_25092024;

public class Lab_092_PrintEvenOddNumbersWithBreakAndContinue {
    public static void main(String[] args) {

        // print even and odd numbers between 0 to 50

        for (int i = 0; i <= 50; i++) { // 0 to 9
            if (i % 2 == 0) {
                System.out.println("Even number -> "+i);
                continue;
            }
            System.out.println("Odd  number -> "+i);

        }
    }
}

/*
when the loop satisfies condition in line 9 for even number it will print it
and as we have continue it will not print line 13 . So we get odd numbers separately
 */