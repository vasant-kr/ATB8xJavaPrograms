package tasks_18092024;

public class Task3 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(--a + a++ + a--); // Prints 28
        System.out.println(a);// Prints 9



        // Part A -> --a, Exp = 9, a =9
        // Part B -> a++, Exp = 9, a =10
        // Part C -> a--, Exp = 10, a =9


    }
}
